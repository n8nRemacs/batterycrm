package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C42907z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.J;
import n51.C44200c;

/* compiled from: ModuleDescriptorImpl.kt */
@s0
/* loaded from: classes8.dex */
public final class G extends AbstractC42870n implements kotlin.reflect.jvm.internal.impl.descriptors.E {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p f407552d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k f407553e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.descriptors.D<?>, Object> f407554f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final J f407555g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public D f407556h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public kotlin.reflect.jvm.internal.impl.descriptors.L f407557i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f407558j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.P> f407559k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f407560l;

    @X41.j
    public G() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.storage.p pVar, kotlin.reflect.jvm.internal.impl.builtins.k kVar, C44200c c44200c, Map map, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i12, C42822w c42822w) {
        super(g.a.f407524b, fVar);
        map = (i12 & 16) != 0 ? P0.c() : map;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        this.f407552d = pVar;
        this.f407553e = kVar;
        if (!fVar.f409253c) {
            throw new IllegalArgumentException("Module name must be special: " + fVar);
        }
        this.f407554f = map;
        J.f407570a.getClass();
        J j12 = (J) o0(J.a.f407572b);
        this.f407555g = j12 == null ? J.b.f407573b : j12;
        this.f407558j = true;
        this.f407559k = pVar.c(new F(this));
        this.f407560l = C42727D.c(new E(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.l
    public final <R, D> R A(@Y61.k InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.e(d12, this);
    }

    public final void U() {
        G0 g02;
        if (this.f407558j) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.A a12 = (kotlin.reflect.jvm.internal.impl.descriptors.A) o0(C42907z.f407883a);
        if (a12 != null) {
            a12.a();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    public final boolean b0(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E e12) {
        if (equals(e12) || C42745f0.r(this.f407556h.f407548b, e12)) {
            return true;
        }
        ((C42784z0) y()).getClass();
        boolean z12 = e12 instanceof Void;
        return e12.y().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.l
    public final InterfaceC42882k f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.P i0(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        U();
        return this.f407559k.invoke(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.name.c> j(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        U();
        U();
        return ((C42869m) this.f407560l.getValue()).j(cVar, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return this.f407553e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @Y61.l
    public final <T> T o0(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.D<T> d12) {
        T t12 = (T) this.f407554f.get(d12);
        if (t12 == null) {
            return null;
        }
        return t12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC42870n.N(this));
        if (!this.f407558j) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        kotlin.reflect.jvm.internal.impl.descriptors.L l12 = this.f407557i;
        sb2.append(l12 != null ? l12.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.E
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.E> y() {
        D d12 = this.f407556h;
        if (d12 != null) {
            return d12.f407549c;
        }
        throw new AssertionError(AK.c.s(new StringBuilder("Dependencies of module "), getName().f409252b, " were not set"));
    }
}
