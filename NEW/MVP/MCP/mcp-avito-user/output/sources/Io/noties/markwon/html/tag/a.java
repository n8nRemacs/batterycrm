package io.noties.markwon.html.tag;

import Q61.C14869c;
import io.noties.markwon.B;
import io.noties.markwon.C;
import io.noties.markwon.html.p;
import io.noties.markwon.n;
import j.N;
import java.util.Collection;
import java.util.Collections;

/* compiled from: BlockquoteHandler.java */
/* loaded from: classes8.dex */
public class a extends p {
    @Override // io.noties.markwon.html.p
    public final void a(@N n nVar, @N io.noties.markwon.html.j jVar, @N io.noties.markwon.html.f fVar) {
        if (fVar.d()) {
            p.c(nVar, jVar, fVar.a());
        }
        io.noties.markwon.g gVarU = nVar.u();
        B bA2 = gVarU.f401717g.a(C14869c.class);
        if (bA2 != null) {
            C.c(nVar.builder(), bA2.a(gVarU, nVar.f()), fVar.start(), fVar.f());
        }
    }

    @Override // io.noties.markwon.html.p
    @N
    public final Collection<String> b() {
        return Collections.singleton("blockquote");
    }
}
