package io.noties.markwon.core;

import Q61.A;
import Q61.v;
import io.noties.markwon.core.p;
import io.noties.markwon.n;
import j.N;
import java.util.Iterator;

/* compiled from: CorePlugin.java */
/* loaded from: classes8.dex */
class g implements n.c<A> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f401662a;

    public g(p pVar) {
        this.f401662a = pVar;
    }

    @Override // io.noties.markwon.n.c
    public final void a(@N v vVar, @N io.noties.markwon.n nVar) {
        String str = ((A) vVar).f13480f;
        nVar.builder().f401646b.append(str);
        p pVar = this.f401662a;
        if (pVar.f401663a.isEmpty()) {
            return;
        }
        int length = nVar.length() - str.length();
        Iterator it = pVar.f401663a.iterator();
        while (it.hasNext()) {
            ((p.a) it.next()).a(nVar, str, length);
        }
    }
}
