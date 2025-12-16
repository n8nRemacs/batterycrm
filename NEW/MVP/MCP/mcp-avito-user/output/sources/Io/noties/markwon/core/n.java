package io.noties.markwon.core;

import Q61.v;
import io.noties.markwon.B;
import io.noties.markwon.n;
import io.noties.markwon.y;
import j.N;

/* compiled from: CorePlugin.java */
/* loaded from: classes8.dex */
class n implements n.c<Q61.p> {
    @Override // io.noties.markwon.n.c
    public final void a(@N v vVar, @N io.noties.markwon.n nVar) {
        Q61.p pVar = (Q61.p) vVar;
        B bA2 = nVar.u().f401717g.a(Q61.p.class);
        if (bA2 == null) {
            nVar.F(pVar);
            return;
        }
        int length = nVar.length();
        nVar.F(pVar);
        if (length == nVar.length()) {
            nVar.builder().a((char) 65532);
        }
        io.noties.markwon.g gVarU = nVar.u();
        boolean z12 = pVar.f13500a instanceof Q61.r;
        io.noties.markwon.image.destination.a aVar = gVarU.f401715e;
        String str = pVar.f13491f;
        aVar.getClass();
        y yVarF = nVar.f();
        yVarF.a(io.noties.markwon.image.h.f401911a, str);
        yVarF.a(io.noties.markwon.image.h.f401912b, Boolean.valueOf(z12));
        yVarF.a(io.noties.markwon.image.h.f401913c, null);
        nVar.a(length, bA2.a(gVarU, yVarF));
    }
}
