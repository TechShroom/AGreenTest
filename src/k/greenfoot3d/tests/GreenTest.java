package k.greenfoot3d.tests;

import k.greenfoot3d.ui.Inform;
import k.greenfoot3d.world.World;

public class GreenTest extends World {
	public GreenTest() {
		super(600, 800, 1);
		System.out.println("YAY! The world constructor was invoked!");
		
		Inform.userOf("----");
	}
}
