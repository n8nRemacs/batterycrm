package yc1;

import e.InterfaceC39835a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final uc1.a f443372a;

    /* renamed from: b, reason: collision with root package name */
    public final qc1.a f443373b;

    /* renamed from: c, reason: collision with root package name */
    public final D31.a f443374c;

    /* renamed from: d, reason: collision with root package name */
    public final T51.c f443375d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC39835a f443376e;

    /* renamed from: f, reason: collision with root package name */
    public final B81.a f443377f;

    public b(uc1.a aVar, qc1.a aVar2, D31.a aVar3, T51.c cVar, InterfaceC39835a interfaceC39835a, B81.a aVar4) {
        this.f443372a = aVar;
        this.f443373b = aVar2;
        this.f443374c = aVar3;
        this.f443375d = cVar;
        this.f443376e = interfaceC39835a;
        this.f443377f = aVar4;
    }

    public final N0 a(Zb1.b bVar, boolean z12) {
        return C43259k.d((T) ((D31.g) this.f443374c).f2880a.getValue(), null, null, new a(z12, this, bVar, null), 3);
    }

    public final void b(Zb1.b bVar) {
        N41.j jVarA;
        X51.j jVar = ((O51.d) this.f443375d.f15377a).a().f18608f;
        N41.j jVarA2 = jVar == null ? N41.h.f11198a : Ic1.a.a(jVar.f18629a);
        String str = bVar.f20273d;
        if (str != null && (jVarA = Ic1.a.a(str)) != null) {
            jVarA2 = jVarA;
        }
        ((B81.e) this.f443377f).b(new lc1.d(bVar.f20270a, bVar.f20271b, bVar.f20272c, jVarA2));
    }
}
