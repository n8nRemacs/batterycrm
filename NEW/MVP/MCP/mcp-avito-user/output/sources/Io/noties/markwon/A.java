package io.noties.markwon;

import io.noties.markwon.n;
import j.N;

/* compiled from: SoftBreakAddsNewLinePlugin.java */
/* loaded from: classes8.dex */
public class A extends AbstractC41740a {

    /* compiled from: SoftBreakAddsNewLinePlugin.java */
    public class a implements n.c<Q61.y> {
        @Override // io.noties.markwon.n.c
        public final void a(@N Q61.v vVar, @N n nVar) {
            ((q) nVar).w();
        }
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureVisitor(@N n.b bVar) {
        bVar.a(Q61.y.class, new a());
    }
}
