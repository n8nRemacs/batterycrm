package io.noties.markwon.html.tag;

import io.noties.markwon.C;
import io.noties.markwon.html.p;
import io.noties.markwon.n;
import io.noties.markwon.y;
import j.N;
import j.P;

/* compiled from: SimpleTagHandler.java */
/* loaded from: classes8.dex */
public abstract class h extends p {
    @Override // io.noties.markwon.html.p
    public final void a(@N n nVar, @N io.noties.markwon.html.j jVar, @N io.noties.markwon.html.f fVar) {
        if (fVar.d()) {
            p.c(nVar, jVar, fVar.a());
        }
        Object objD = d(nVar.u(), nVar.f(), fVar);
        if (objD != null) {
            C.c(nVar.builder(), objD, fVar.start(), fVar.f());
        }
    }

    @P
    public abstract Object d(@N io.noties.markwon.g gVar, @N y yVar, @N io.noties.markwon.html.f fVar);
}
