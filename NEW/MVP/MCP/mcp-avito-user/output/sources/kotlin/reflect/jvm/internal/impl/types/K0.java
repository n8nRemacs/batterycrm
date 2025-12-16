package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;

/* compiled from: KotlinType.kt */
/* loaded from: classes8.dex */
public abstract class K0 extends O {
    public K0() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final List<x0> F0() {
        return L0().F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final n0 G0() {
        return L0().G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final q0 H0() {
        return L0().H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return L0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final J0 K0() {
        O oL02 = L0();
        while (oL02 instanceof K0) {
            oL02 = ((K0) oL02).L0();
        }
        return (J0) oL02;
    }

    @Y61.k
    public abstract O L0();

    public boolean M0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return L0().n();
    }

    @Y61.k
    public final String toString() {
        return M0() ? L0().toString() : "<Not computed yet>";
    }
}
