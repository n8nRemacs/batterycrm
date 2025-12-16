package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum LongConstant implements StackManipulation {
    ZERO(9),
    ONE(10);


    /* renamed from: e, reason: collision with root package name */
    public static final StackManipulation.d f418011e = StackSize.DOUBLE.c();

    /* renamed from: b, reason: collision with root package name */
    public final int f418013b;

    @HashCodeAndEqualsPlugin.Enhance
    public static class a extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final long f418014b;

        public a(long j12) {
            this.f418014b = j12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418014b == ((a) obj).f418014b;
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            long j12 = this.f418014b;
            return iHashCode + ((int) (j12 ^ (j12 >>> 32)));
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.t(Long.valueOf(this.f418014b));
            return LongConstant.f418011e;
        }
    }

    LongConstant(int i12) {
        this.f418013b = i12;
    }

    public static StackManipulation c(long j12) {
        return j12 == 0 ? ZERO : j12 == 1 ? ONE : new a(j12);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f418013b);
        return f418011e;
    }
}
