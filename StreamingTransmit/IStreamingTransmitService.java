package net.floodlightcontroller.StreamingTransmit;

import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.devicemanager.IDevice;

public interface IStreamingTransmitService extends IFloodlightService {
	public void StreamTransmitMain(IDevice deviceSrc,IDevice deviceDst,String IPS, String IPD);//Add Service to controller.
}
