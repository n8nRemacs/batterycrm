package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: ByFunctionOrdering.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class B<F, T> extends AbstractC37429w3<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC37276u<F, ? extends T> f359260b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37429w3<T> f359261c;

    public B(InterfaceC37276u<F, ? extends T> interfaceC37276u, AbstractC37429w3<T> abstractC37429w3) {
        interfaceC37276u.getClass();
        this.f359260b = interfaceC37276u;
        abstractC37429w3.getClass();
        this.f359261c = abstractC37429w3;
    }

    @Override // java.util.Comparator
    public final int compare(@InterfaceC37434x3 F f12, @InterfaceC37434x3 F f13) {
        InterfaceC37276u<F, ? extends T> interfaceC37276u = this.f359260b;
        return this.f359261c.compare(interfaceC37276u.apply(f12), interfaceC37276u.apply(f13));
    }

    @Override // java.util.Comparator
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b12 = (B) obj;
        return this.f359260b.equals(b12.f359260b) && this.f359261c.equals(b12.f359261c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f359260b, this.f359261c});
    }

    public final String toString() {
        return this.f359261c + ".onResultOf(" + this.f359260b + ")";
    }
}
