package Q51;

import java.util.Timer;
import sc1.h;
import z31.C50370a;
import z31.c;

/* loaded from: classes8.dex */
public abstract class a {
    public static void a(b bVar, long j12) {
        c cVar = (c) bVar;
        z31.b bVar2 = new z31.b(cVar, h.f437926a);
        Timer timer = new Timer(false);
        timer.schedule(new C50370a(bVar2), j12, j12);
        cVar.f443831a = timer.toString();
    }
}
