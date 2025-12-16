package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public abstract class kve {
    public static final Symbol a = new Symbol("NO_VALUE");

    public static final jve a(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(ho7.f(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(xc0.o(i3)).toString());
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new jve(i, i4, i3);
    }

    public static /* synthetic */ jve b(int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i, i2, (i3 & 4) != 0 ? 1 : 2);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final x26 e(fve fveVar, x74 x74Var, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? fveVar : new ba2(i, i2, x74Var, fveVar);
    }
}
