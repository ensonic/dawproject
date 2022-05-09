package com.bitwig.dawproject;

import com.bitwig.dawproject.timeline.Lanes;
import com.bitwig.dawproject.timeline.Markers;
import com.bitwig.dawproject.timeline.Points;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Arrangement")
public class Arrangement extends Referenceable
{
   /** Automation data for time-signature inside this Arrangement */
   @XmlElement(required = false, name = "TimeSignatureAutomation", type = Points.class)
   public Points timeSignatureAutomation;

   /** Automation data for tempo inside this Arrangement, which will define the conversion between seconds and beats
    * at the root level. */
   @XmlElement(required = false, name = "TempoAutomation", type = Points.class)
   public Points tempoAutomation;

   /** Cue markers inside this arrangement */
   @XmlElement(required = false, name = "Markers", type = Markers.class)
   public Markers markers;

   @XmlElement(name = "Lanes", type = Lanes.class)
   public Lanes lanes;
}
