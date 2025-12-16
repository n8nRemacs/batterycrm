package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum DoubleConstant implements StackManipulation {
    ZERO(14),
    ONE(15);


    /* renamed from: e, reason: collision with root package name */
    public static final StackManipulation.d f417983e = StackSize.DOUBLE.c();

    /* renamed from: b, reason: collision with root package name */
    public final int f417985b;

    @HashCodeAndEqualsPlugin.Enhance
    public static class a extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final double f417986b;

        public a(double d12) {
            this.f417986b = d12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return Double.compare(this.f417986b, ((a) obj).f417986b) == 0;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            long jDoubleToLongBits = Double.doubleToLongBits(this.f417986b);
            return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.t(Double.valueOf(this.f417986b));
            return DoubleConstant.f417983e;
        }
    }

    DoubleConstant(int i12) {
        this.f417985b = i12;
    }

    public static StackManipulation c(double d12) {
        return d12 == 0.0d ? ZERO : d12 == 1.0d ? ONE : new a(d12);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417985b);
        return f417983e;
    }
}
