package lu.uni.lassy.excalibur.examples.icrash.dev.web.java.system.types.primary;

import java.io.Serializable;

import lu.uni.lassy.excalibur.examples.icrash.dev.web.java.types.stdlib.PtBoolean;

public class CtMedia implements Serializable{

	private static final long serialVersionUID = -7823275041734117838L;
	
	/** The id of the media. */
	public DtMediaID id;
	
	/** The category of media. An example... */
	public EtMediaCategory category;
	
	public DtMediaName name;
	
	public DtEmail email;
	
	public PtBoolean init(DtMediaID id, EtMediaCategory category, DtMediaName name, DtEmail email){
		this.id = id;
		this.category = category;
		this.name = name;
		this.email = email;
		
		return new PtBoolean(true);
	}
	
}
