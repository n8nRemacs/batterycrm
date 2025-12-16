package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C42822w;
import u51.InterfaceC48806h;

/* compiled from: KotlinType.kt */
/* loaded from: classes8.dex */
public abstract class O implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, InterfaceC48806h {

    /* renamed from: b, reason: collision with root package name */
    public int f410038b;

    public /* synthetic */ O(C42822w c42822w) {
        this();
    }

    @Y61.k
    public abstract List<x0> F0();

    @Y61.k
    public abstract n0 G0();

    @Y61.k
    public abstract q0 H0();

    public abstract boolean I0();

    @Y61.k
    public abstract O J0(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar);

    @Y61.k
    public abstract J0 K0();

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o12 = (O) obj;
        if (I0() == o12.I0()) {
            kotlin.reflect.jvm.internal.impl.types.checker.v vVar = kotlin.reflect.jvm.internal.impl.types.checker.v.f410125a;
            J0 j0K0 = K0();
            J0 j0K02 = o12.K0();
            vVar.getClass();
            C42971d c42971d = C42971d.f410128a;
            kotlin.reflect.jvm.internal.impl.types.checker.u uVar = kotlin.reflect.jvm.internal.impl.types.checker.u.f410124a;
            c42971d.getClass();
            if (C42971d.b(uVar, j0K0, j0K02)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return r.a(G0());
    }

    public final int hashCode() {
        int iHashCode;
        int i12 = this.f410038b;
        if (i12 != 0) {
            return i12;
        }
        if (Q.a(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (I0() ? 1 : 0) + ((F0().hashCode() + (H0().hashCode() * 31)) * 31);
        }
        this.f410038b = iHashCode;
        return iHashCode;
    }

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.j n();

    public O() {
    }
}
