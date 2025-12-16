package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.types.AbstractC42999y;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.I0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.V;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.n0;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes8.dex */
public final class i extends AbstractC42999y implements V {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y f408344c;

    public i(@Y61.k Y y12) {
        this.f408344c = y12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y, kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC42995u
    @Y61.k
    public final J0 N(@Y61.k O o12) {
        J0 j0K0 = o12.K0();
        if (!G0.g(j0K0) && !G0.f(j0K0)) {
            return j0K0;
        }
        if (j0K0 instanceof Y) {
            Y y12 = (Y) j0K0;
            Y yL02 = y12.L0(false);
            return !G0.g(y12) ? yL02 : new i(yL02);
        }
        if (!(j0K0 instanceof H)) {
            throw new IllegalStateException(("Incorrect type: " + j0K0).toString());
        }
        H h12 = (H) j0K0;
        Y y13 = h12.f410024c;
        Y yL03 = y13.L0(false);
        if (G0.g(y13)) {
            yL03 = new i(yL03);
        }
        Y y14 = h12.f410025d;
        Y yL04 = y14.L0(false);
        if (G0.g(y14)) {
            yL04 = new i(yL04);
        }
        return I0.b(P.c(yL03, yL04), I0.a(j0K0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 N0(n0 n0Var) {
        return new i(this.f408344c.N0(n0Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return z12 ? this.f408344c.L0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    /* renamed from: P0 */
    public final Y N0(n0 n0Var) {
        return new i(this.f408344c.N0(n0Var));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    @Y61.k
    public final Y Q0() {
        return this.f408344c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
    public final AbstractC42999y S0(Y y12) {
        return new i(y12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC42995u
    public final boolean U() {
        return true;
    }
}
