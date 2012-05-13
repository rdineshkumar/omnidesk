package omniDesk.net.rdp;

public class ColorModel256 {

        private final static int [] colors;
        
        static {
                colors = new int[256];
                getColors()[0]=0xff000000;
                getColors()[1]=0xff240000;
                getColors()[2]=0xff490000;
                getColors()[3]=0xff6d0000;
                getColors()[4]=0xff920000;
                getColors()[5]=0xffb60000;
                getColors()[6]=0xffdb0000;
                getColors()[7]=0xffff0000;
                getColors()[8]=0xff002400;
                getColors()[9]=0xff242400;
                getColors()[10]=0xff492400;
                getColors()[11]=0xff6d2400;
                getColors()[12]=0xff922400;
                getColors()[13]=0xffb62400;
                getColors()[14]=0xffdb2400;
                getColors()[15]=0xffff2400;
                getColors()[16]=0xff004900;
                getColors()[17]=0xff244900;
                getColors()[18]=0xff494900;
                getColors()[19]=0xff6d4900;
                getColors()[20]=0xff924900;
                getColors()[21]=0xffb64900;
                getColors()[22]=0xffdb4900;
                getColors()[23]=0xffff4900;
                getColors()[24]=0xff006d00;
                getColors()[25]=0xff246d00;
                getColors()[26]=0xff496d00;
                getColors()[27]=0xff6d6d00;
                getColors()[28]=0xff926d00;
                getColors()[29]=0xffb66d00;
                getColors()[30]=0xffdb6d00;
                getColors()[31]=0xffff6d00;
                getColors()[32]=0xff009200;
                getColors()[33]=0xff249200;
                getColors()[34]=0xff499200;
                getColors()[35]=0xff6d9200;
                getColors()[36]=0xff929200;
                getColors()[37]=0xffb69200;
                getColors()[38]=0xffdb9200;
                getColors()[39]=0xffff9200;
                getColors()[40]=0xff00b600;
                getColors()[41]=0xff24b600;
                getColors()[42]=0xff49b600;
                getColors()[43]=0xff6db600;
                getColors()[44]=0xff92b600;
                getColors()[45]=0xffb6b600;
                getColors()[46]=0xffdbb600;
                getColors()[47]=0xffffb600;
                getColors()[48]=0xff00db00;
                getColors()[49]=0xff24db00;
                getColors()[50]=0xff49db00;
                getColors()[51]=0xff6ddb00;
                getColors()[52]=0xff92db00;
                getColors()[53]=0xffb6db00;
                getColors()[54]=0xffdbdb00;
                getColors()[55]=0xffffdb00;
                getColors()[56]=0xff00ff00;
                getColors()[57]=0xff24ff00;
                getColors()[58]=0xff49ff00;
                getColors()[59]=0xff6dff00;
                getColors()[60]=0xff92ff00;
                getColors()[61]=0xffb6ff00;
                getColors()[62]=0xffdbff00;
                getColors()[63]=0xffffff00;
                getColors()[64]=0xff000055;
                getColors()[65]=0xff240055;
                getColors()[66]=0xff490055;
                getColors()[67]=0xff6d0055;
                getColors()[68]=0xff920055;
                getColors()[69]=0xffb60055;
                getColors()[70]=0xffdb0055;
                getColors()[71]=0xffff0055;
                getColors()[72]=0xff002455;
                getColors()[73]=0xff242455;
                getColors()[74]=0xff492455;
                getColors()[75]=0xff6d2455;
                getColors()[76]=0xff922455;
                getColors()[77]=0xffb62455;
                getColors()[78]=0xffdb2455;
                getColors()[79]=0xffff2455;
                getColors()[80]=0xff004955;
                getColors()[81]=0xff244955;
                getColors()[82]=0xff494955;
                getColors()[83]=0xff6d4955;
                getColors()[84]=0xff924955;
                getColors()[85]=0xffb64955;
                getColors()[86]=0xffdb4955;
                getColors()[87]=0xffff4955;
                getColors()[88]=0xff006d55;
                getColors()[89]=0xff246d55;
                getColors()[90]=0xff496d55;
                getColors()[91]=0xff6d6d55;
                getColors()[92]=0xff926d55;
                getColors()[93]=0xffb66d55;
                getColors()[94]=0xffdb6d55;
                getColors()[95]=0xffff6d55;
                getColors()[96]=0xff009255;
                getColors()[97]=0xff249255;
                getColors()[98]=0xff499255;
                getColors()[99]=0xff6d9255;
                getColors()[100]=0xff929255;
                getColors()[101]=0xffb69255;
                getColors()[102]=0xffdb9255;
                getColors()[103]=0xffff9255;
                getColors()[104]=0xff00b655;
                getColors()[105]=0xff24b655;
                getColors()[106]=0xff49b655;
                getColors()[107]=0xff6db655;
                getColors()[108]=0xff92b655;
                getColors()[109]=0xffb6b655;
                getColors()[110]=0xffdbb655;
                getColors()[111]=0xffffb655;
                getColors()[112]=0xff00db55;
                getColors()[113]=0xff24db55;
                getColors()[114]=0xff49db55;
                getColors()[115]=0xff6ddb55;
                getColors()[116]=0xff92db55;
                getColors()[117]=0xffb6db55;
                getColors()[118]=0xffdbdb55;
                getColors()[119]=0xffffdb55;
                getColors()[120]=0xff00ff55;
                getColors()[121]=0xff24ff55;
                getColors()[122]=0xff49ff55;
                getColors()[123]=0xff6dff55;
                getColors()[124]=0xff92ff55;
                getColors()[125]=0xffb6ff55;
                getColors()[126]=0xffdbff55;
                getColors()[127]=0xffffff55;
                getColors()[128]=0xff0000aa;
                getColors()[129]=0xff2400aa;
                getColors()[130]=0xff4900aa;
                getColors()[131]=0xff6d00aa;
                getColors()[132]=0xff9200aa;
                getColors()[133]=0xffb600aa;
                getColors()[134]=0xffdb00aa;
                getColors()[135]=0xffff00aa;
                getColors()[136]=0xff0024aa;
                getColors()[137]=0xff2424aa;
                getColors()[138]=0xff4924aa;
                getColors()[139]=0xff6d24aa;
                getColors()[140]=0xff9224aa;
                getColors()[141]=0xffb624aa;
                getColors()[142]=0xffdb24aa;
                getColors()[143]=0xffff24aa;
                getColors()[144]=0xff0049aa;
                getColors()[145]=0xff2449aa;
                getColors()[146]=0xff4949aa;
                getColors()[147]=0xff6d49aa;
                getColors()[148]=0xff9249aa;
                getColors()[149]=0xffb649aa;
                getColors()[150]=0xffdb49aa;
                getColors()[151]=0xffff49aa;
                getColors()[152]=0xff006daa;
                getColors()[153]=0xff246daa;
                getColors()[154]=0xff496daa;
                getColors()[155]=0xff6d6daa;
                getColors()[156]=0xff926daa;
                getColors()[157]=0xffb66daa;
                getColors()[158]=0xffdb6daa;
                getColors()[159]=0xffff6daa;
                getColors()[160]=0xff0092aa;
                getColors()[161]=0xff2492aa;
                getColors()[162]=0xff4992aa;
                getColors()[163]=0xff6d92aa;
                getColors()[164]=0xff9292aa;
                getColors()[165]=0xffb692aa;
                getColors()[166]=0xffdb92aa;
                getColors()[167]=0xffff92aa;
                getColors()[168]=0xff00b6aa;
                getColors()[169]=0xff24b6aa;
                getColors()[170]=0xff49b6aa;
                getColors()[171]=0xff6db6aa;
                getColors()[172]=0xff92b6aa;
                getColors()[173]=0xffb6b6aa;
                getColors()[174]=0xffdbb6aa;
                getColors()[175]=0xffffb6aa;
                getColors()[176]=0xff00dbaa;
                getColors()[177]=0xff24dbaa;
                getColors()[178]=0xff49dbaa;
                getColors()[179]=0xff6ddbaa;
                getColors()[180]=0xff92dbaa;
                getColors()[181]=0xffb6dbaa;
                getColors()[182]=0xffdbdbaa;
                getColors()[183]=0xffffdbaa;
                getColors()[184]=0xff00ffaa;
                getColors()[185]=0xff24ffaa;
                getColors()[186]=0xff49ffaa;
                getColors()[187]=0xff6dffaa;
                getColors()[188]=0xff92ffaa;
                getColors()[189]=0xffb6ffaa;
                getColors()[190]=0xffdbffaa;
                getColors()[191]=0xffffffaa;
                getColors()[192]=0xff0000ff;
                getColors()[193]=0xff2400ff;
                getColors()[194]=0xff4900ff;
                getColors()[195]=0xff6d00ff;
                getColors()[196]=0xff9200ff;
                getColors()[197]=0xffb600ff;
                getColors()[198]=0xffdb00ff;
                getColors()[199]=0xffff00ff;
                getColors()[200]=0xff0024ff;
                getColors()[201]=0xff2424ff;
                getColors()[202]=0xff4924ff;
                getColors()[203]=0xff6d24ff;
                getColors()[204]=0xff9224ff;
                getColors()[205]=0xffb624ff;
                getColors()[206]=0xffdb24ff;
                getColors()[207]=0xffff24ff;
                getColors()[208]=0xff0049ff;
                getColors()[209]=0xff2449ff;
                getColors()[210]=0xff4949ff;
                getColors()[211]=0xff6d49ff;
                getColors()[212]=0xff9249ff;
                getColors()[213]=0xffb649ff;
                getColors()[214]=0xffdb49ff;
                getColors()[215]=0xffff49ff;
                getColors()[216]=0xff006dff;
                getColors()[217]=0xff246dff;
                getColors()[218]=0xff496dff;
                getColors()[219]=0xff6d6dff;
                getColors()[220]=0xff926dff;
                getColors()[221]=0xffb66dff;
                getColors()[222]=0xffdb6dff;
                getColors()[223]=0xffff6dff;
                getColors()[224]=0xff0092ff;
                getColors()[225]=0xff2492ff;
                getColors()[226]=0xff4992ff;
                getColors()[227]=0xff6d92ff;
                getColors()[228]=0xff9292ff;
                getColors()[229]=0xffb692ff;
                getColors()[230]=0xffdb92ff;
                getColors()[231]=0xffff92ff;
                getColors()[232]=0xff00b6ff;
                getColors()[233]=0xff24b6ff;
                getColors()[234]=0xff49b6ff;
                getColors()[235]=0xff6db6ff;
                getColors()[236]=0xff92b6ff;
                getColors()[237]=0xffb6b6ff;
                getColors()[238]=0xffdbb6ff;
                getColors()[239]=0xffffb6ff;
                getColors()[240]=0xff00dbff;
                getColors()[241]=0xff24dbff;
                getColors()[242]=0xff49dbff;
                getColors()[243]=0xff6ddbff;
                getColors()[244]=0xff92dbff;
                getColors()[245]=0xffb6dbff;
                getColors()[246]=0xffdbdbff;
                getColors()[247]=0xffffdbff;
                getColors()[248]=0xff00ffff;
                getColors()[249]=0xff24ffff;
                getColors()[250]=0xff49ffff;
                getColors()[251]=0xff6dffff;
                getColors()[252]=0xff92ffff;
                getColors()[253]=0xffb6ffff;
                getColors()[254]=0xffdbffff;
                getColors()[255]=0xffffffff;
        }

		public static int [] getColors() {
			return colors;
		}
}