package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import Y61.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.E;
import kotlin.reflect.jvm.internal.impl.types.F;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.u0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: RawProjectionComputer.kt */
/* loaded from: classes8.dex */
public final class f extends E {

    /* compiled from: RawProjectionComputer.kt */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                JavaTypeFlexibility javaTypeFlexibility = JavaTypeFlexibility.f408266b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                JavaTypeFlexibility javaTypeFlexibility2 = JavaTypeFlexibility.f408266b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.E
    @k
    public final x0 a(@k g0 g0Var, @k F f12, @k u0 u0Var, @k O o12) {
        if (!(f12 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a)) {
            return super.a(g0Var, f12, u0Var, o12);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarF = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a) f12;
        if (!aVarF.f408273f) {
            aVarF = aVarF.f(JavaTypeFlexibility.f408266b);
        }
        int iOrdinal = aVarF.f408272e.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (g0Var.o().f410075c) {
                return !o12.H0().getParameters().isEmpty() ? new z0(o12, Variance.f410071f) : G0.l(g0Var, aVarF);
            }
            return new z0(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(g0Var).m(), Variance.f410069d);
        }
        if (iOrdinal == 2) {
            return new z0(o12, Variance.f410069d);
        }
        throw new NoWhenBranchMatchedException();
    }
}
