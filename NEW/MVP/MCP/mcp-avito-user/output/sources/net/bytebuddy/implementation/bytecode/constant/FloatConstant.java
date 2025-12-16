package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum FloatConstant implements StackManipulation {
    ZERO(11),
    ONE(12),
    TWO(13);


    /* renamed from: f, reason: collision with root package name */
    public static final StackManipulation.d f417990f = StackSize.SINGLE.c();

    /* renamed from: b, reason: collision with root package name */
    public final int f417992b;

    @HashCodeAndEqualsPlugin.Enhance
    public static class a extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final float f417993b;

        public a(float f12) {
            this.f417993b = f12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return Float.compare(this.f417993b, ((a) obj).f417993b) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f417993b) + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.t(Float.valueOf(this.f417993b));
            return FloatConstant.f417990f;
        }
    }

    FloatConstant(int i12) {
        this.f417992b = i12;
    }

    public static StackManipulation c(float f12) {
        return f12 == 0.0f ? ZERO : f12 == 1.0f ? ONE : f12 == 2.0f ? TWO : new a(f12);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f417992b);
        return f417990f;
    }
}
