package io.noties.markwon.html.tag;

import Q61.u;
import io.noties.markwon.B;
import io.noties.markwon.C;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.html.f;
import io.noties.markwon.html.p;
import io.noties.markwon.n;
import io.noties.markwon.v;
import io.noties.markwon.y;
import j.N;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: ListHandler.java */
/* loaded from: classes8.dex */
public class g extends p {
    @Override // io.noties.markwon.html.p
    public final void a(@N n nVar, @N io.noties.markwon.html.j jVar, @N io.noties.markwon.html.f fVar) {
        if (fVar.d()) {
            f.a aVarA = fVar.a();
            boolean zEquals = "ol".equals(aVarA.name());
            boolean zEquals2 = "ul".equals(aVarA.name());
            if (zEquals || zEquals2) {
                io.noties.markwon.g gVarU = nVar.u();
                y yVarF = nVar.f();
                B bA2 = gVarU.f401717g.a(u.class);
                int i12 = 0;
                f.a aVarC = aVarA;
                while (true) {
                    aVarC = aVarC.c();
                    if (aVarC == null) {
                        break;
                    } else if ("ul".equals(aVarC.name()) || "ol".equals(aVarC.name())) {
                        i12++;
                    }
                }
                int i13 = 1;
                for (f.a aVar : aVarA.e()) {
                    p.c(nVar, jVar, aVar);
                    if (bA2 != null && "li".equals(aVar.name())) {
                        v<CoreProps.ListItemType> vVar = CoreProps.f401652a;
                        if (zEquals) {
                            yVarF.a(vVar, CoreProps.ListItemType.f401660c);
                            yVarF.a(CoreProps.f401654c, Integer.valueOf(i13));
                            i13++;
                        } else {
                            yVarF.a(vVar, CoreProps.ListItemType.f401659b);
                            yVarF.a(CoreProps.f401653b, Integer.valueOf(i12));
                        }
                        C.c(nVar.builder(), bA2.a(gVarU, yVarF), aVar.start(), aVar.f());
                    }
                }
            }
        }
    }

    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Arrays.asList("ol", "ul");
    }
}
