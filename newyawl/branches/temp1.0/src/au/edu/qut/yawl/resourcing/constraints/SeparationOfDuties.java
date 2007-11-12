/*
 * This file is made available under the terms of the LGPL licence.
 * This licence can be retreived from http://www.gnu.org/copyleft/lesser.html.
 * The source remains the property of the YAWL Foundation.  The YAWL Foundation is a
 * collaboration of individuals and organisations who are commited to improving
 * workflow technology.
 */

package au.edu.qut.yawl.resourcing.constraints;

import au.edu.qut.yawl.resourcing.ResourceManager;
import au.edu.qut.yawl.resourcing.resource.Participant;
import au.edu.qut.yawl.worklist.model.WorkItemRecord;

import java.util.Set;

/**
 * Separation of Duties - a constraint that disallows a participant who has completed a
 * 'familiar task' in the current case from being allocated a task applying this
 * constraint.
 *
 *  Create Date: 03/08/2007. Last Date: 12/11/2007
 *
 *  @author Michael Adams (BPM Group, QUT Australia)
 *  @version 1.0
 */

public class SeparationOfDuties extends AbstractConstraint {


    public SeparationOfDuties() {
        super();
        setName(this.getClass().getSimpleName());
        addKey("familiarTask");
        setDisplayName("Separation of Duties") ;
        setDescription("The Separation of Duties constraint ensures that a " +
                       "distribution set for a task will not include any " +
                       "participant who completed a work item of the " +
                       "'familiar task' in the current case.");        
    }

    /**
     * Ensures that any participants who completed the 'familiar task' in the current
     * case are removed from the distribution set
     * @param resources the distribution set of participants
     * @param wir the workitem to be resourced
     * @return the constrained distribution set
     */
    public Set<Participant> performConstraint(Set<Participant> resources,
                                              WorkItemRecord wir) {
        String famTaskID = getParamValue("familiarTask") ;
        if (famTaskID != null) {
            Set<Participant> pSet = ResourceManager.getInstance()
                                                   .getWhoCompletedTask(famTaskID, wir);
            for (Participant p : pSet) resources.remove(p);
        }
        return resources ;
    }



}
