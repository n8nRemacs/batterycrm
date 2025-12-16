package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.s;

/* loaded from: classes7.dex */
public enum IntegerConstant implements StackManipulation {
    MINUS_ONE(2),
    ZERO(3),
    ONE(4),
    TWO(5),
    THREE(6),
    FOUR(7),
    FIVE(8);


    /* renamed from: j, reason: collision with root package name */
    public static final StackManipulation.d f418001j = StackSize.SINGLE.c();

    /* renamed from: b, reason: collision with root package name */
    public final int f418003b;

    @HashCodeAndEqualsPlugin.Enhance
    public static class a extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f418004b;

        public a(int i12) {
            this.f418004b = i12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418004b == ((a) obj).f418004b;
            }
            return false;
        }

        public final int hashCode() {
            return (getClass().hashCode() * 31) + this.f418004b;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.t(Integer.valueOf(this.f418004b));
            return IntegerConstant.f418001j;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final byte f418005b;

        public b(byte b12) {
            this.f418005b = b12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418005b == ((b) obj).f418005b;
            }
            return false;
        }

        public final int hashCode() {
            return (getClass().hashCode() * 31) + this.f418005b;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.o(16, this.f418005b);
            return IntegerConstant.f418001j;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c extends StackManipulation.a {

        /* renamed from: b, reason: collision with root package name */
        public final short f418006b;

        public c(short s5) {
            this.f418006b = s5;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418006b == ((c) obj).f418006b;
            }
            return false;
        }

        public final int hashCode() {
            return (getClass().hashCode() * 31) + this.f418006b;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public final StackManipulation.d n(s sVar, Implementation.Context context) {
            sVar.o(17, this.f418006b);
            return IntegerConstant.f418001j;
        }
    }

    IntegerConstant(int i12) {
        this.f418003b = i12;
    }

    public static StackManipulation c(int i12) {
        switch (i12) {
            case -1:
                return MINUS_ONE;
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            default:
                return (i12 < -128 || i12 > 127) ? (i12 < -32768 || i12 > 32767) ? new a(i12) : new c((short) i12) : new b((byte) i12);
        }
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final boolean isValid() {
        return true;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public final StackManipulation.d n(s sVar, Implementation.Context context) {
        sVar.m(this.f418003b);
        return f418001j;
    }
}
