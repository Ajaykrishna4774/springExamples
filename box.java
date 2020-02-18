class box
{
	double boxlen;
	double boxbre;
	double boxhei;
	public box()
	{
	boxlen=0.0;
	boxbre=0.0;
	boxhei=0.0;
         System.out.print("volume of cube is="+boxlen*boxbre*boxhei);
	}
	 void box(double boxlen,double boxbre,double boxhei)
	{
	this.boxlen=boxlen;
	this.boxbre=boxbre;
	this.boxhei=boxhei;
	System.out.print("volume of cube is="+boxlen*boxbre*boxhei);
	}
	void boxset(double boxlen,double boxbre,double boxhei)
	{
	this.boxlen=boxlen;
	this.boxbre=boxbre;
	this.boxhei=boxhei;
	System.out.print("volume of cube is="+boxlen*boxbre*boxhei);

	}
	void boxgetvol()
	{
	System.out.print("\nvolume of cube is="+boxlen*boxbre*boxhei);
	}
	void volume(double boxlen,double boxbre,double boxhei)
	{
	this.boxlen=boxlen;
	this.boxbre=boxbre;
	this.boxhei=boxhei;
	System.out.print("volume of cube is="+boxlen*boxbre*boxhei);

	}
	
}