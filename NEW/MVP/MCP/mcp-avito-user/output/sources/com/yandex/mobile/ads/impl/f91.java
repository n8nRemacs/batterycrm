package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class f91 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final gv0 f385229a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final InterfaceC39327g1 f385230b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final no f385231c;

    public f91(@Y61.k gv0 gv0Var, @Y61.k InterfaceC39327g1 interfaceC39327g1, @Y61.k no noVar) {
        this.f385229a = gv0Var;
        this.f385230b = interfaceC39327g1;
        this.f385231c = noVar;
    }

    @Y61.k
    public final InterfaceC39327g1 a() {
        return this.f385230b;
    }

    @Y61.k
    public final no b() {
        return this.f385231c;
    }

    @Y61.k
    public final gv0 c() {
        return this.f385229a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f91)) {
            return false;
        }
        f91 f91Var = (f91) obj;
        return kotlin.jvm.internal.L.f(this.f385229a, f91Var.f385229a) && kotlin.jvm.internal.L.f(this.f385230b, f91Var.f385230b) && kotlin.jvm.internal.L.f(this.f385231c, f91Var.f385231c);
    }

    public final int hashCode() {
        return this.f385231c.hashCode() + ((this.f385230b.hashCode() + (this.f385229a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("TimeProviderContainer(progressIncrementer=");
        sbA.append(this.f385229a);
        sbA.append(", adBlockDurationProvider=");
        sbA.append(this.f385230b);
        sbA.append(", defaultContentDelayProvider=");
        sbA.append(this.f385231c);
        sbA.append(')');
        return sbA.toString();
    }
}
