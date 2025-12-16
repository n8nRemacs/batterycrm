package io.noties.markwon.html;

import io.noties.markwon.html.f;
import j.N;
import java.util.Collection;

/* compiled from: TagHandler.java */
/* loaded from: classes8.dex */
public abstract class p {
    public static void c(@N io.noties.markwon.n nVar, @N j jVar, @N f.a aVar) {
        for (f.a aVar2 : aVar.e()) {
            if (aVar2.isClosed()) {
                p pVarB = jVar.b(aVar2.name());
                if (pVarB != null) {
                    pVarB.a(nVar, jVar, aVar2);
                } else {
                    c(nVar, jVar, aVar2);
                }
            }
        }
    }

    public abstract void a(@N io.noties.markwon.n nVar, @N j jVar, @N f fVar);

    @N
    public abstract Collection<String> b();
}
