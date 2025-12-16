package io.noties.markwon.core;

import Q61.A;
import Q61.AbstractC14868b;
import Q61.B;
import Q61.C14869c;
import Q61.u;
import Q61.w;
import Q61.x;
import Q61.y;
import Q61.z;
import c41.C26938a;
import c41.C26939b;
import c41.C26940c;
import c41.C26941d;
import c41.C26942e;
import io.noties.markwon.AbstractC41740a;
import io.noties.markwon.C;
import io.noties.markwon.l;
import io.noties.markwon.n;
import j.N;
import j.P;
import j.k0;
import java.util.ArrayList;

/* compiled from: CorePlugin.java */
/* loaded from: classes8.dex */
public class p extends AbstractC41740a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f401663a = new ArrayList(0);

    /* compiled from: CorePlugin.java */
    public interface a {
        void a(@N io.noties.markwon.n nVar, @N String str, int i12);
    }

    @k0
    public static void a(@N io.noties.markwon.n nVar, @P String str, @N String str2, @N AbstractC14868b abstractC14868b) {
        nVar.t(abstractC14868b);
        int length = nVar.length();
        C cBuilder = nVar.builder();
        cBuilder.f401646b.append((char) 160);
        StringBuilder sb2 = cBuilder.f401646b;
        sb2.append('\n');
        nVar.u().f401713c.getClass();
        cBuilder.b(sb2.length(), str2);
        sb2.append((CharSequence) str2);
        nVar.w();
        nVar.builder().a((char) 160);
        nVar.f().a(CoreProps.f401658g, str);
        nVar.i(abstractC14868b, length);
        nVar.x(abstractC14868b);
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureSpansFactory(@N l.a aVar) {
        C26939b c26939b = new C26939b();
        l.a aVarA = aVar.a(z.class, new c41.h());
        aVarA.a(Q61.j.class, new C26941d());
        aVarA.a(C14869c.class, new C26938a());
        aVarA.a(Q61.e.class, new C26940c());
        aVarA.a(Q61.k.class, c26939b);
        aVarA.a(Q61.q.class, c26939b);
        aVarA.a(u.class, new c41.g());
        aVarA.a(Q61.m.class, new C26942e());
        aVarA.a(Q61.r.class, new c41.f());
        aVarA.a(B.class, new c41.i());
    }

    @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
    public final void configureVisitor(@N n.b bVar) {
        bVar.a(A.class, new g(this));
        bVar.a(z.class, new h());
        bVar.a(Q61.j.class, new i());
        bVar.a(C14869c.class, new j());
        bVar.a(Q61.e.class, new k());
        bVar.a(Q61.k.class, new l());
        bVar.a(Q61.q.class, new m());
        bVar.a(Q61.p.class, new n());
        bVar.a(Q61.d.class, new r());
        bVar.a(w.class, new r());
        bVar.a(u.class, new o());
        bVar.a(B.class, new io.noties.markwon.core.a());
        bVar.a(Q61.m.class, new b());
        bVar.a(y.class, new c());
        bVar.a(Q61.l.class, new d());
        bVar.a(x.class, new e());
        bVar.a(Q61.r.class, new f());
    }
}
