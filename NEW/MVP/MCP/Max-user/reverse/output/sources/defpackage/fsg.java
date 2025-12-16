package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public enum fsg {
    ;

    public static final long X;
    public static final int Y;
    public static final Unsafe a;
    public static final long b;
    public static final int c;
    public static final long d;
    public static final int o;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Unsafe unsafe = (Unsafe) declaredField.get(null);
            a = unsafe;
            b = unsafe.arrayBaseOffset(byte[].class);
            c = unsafe.arrayIndexScale(byte[].class);
            d = unsafe.arrayBaseOffset(int[].class);
            o = unsafe.arrayIndexScale(int[].class);
            X = unsafe.arrayBaseOffset(short[].class);
            Y = unsafe.arrayIndexScale(short[].class);
        } catch (IllegalAccessException unused) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (NoSuchFieldException unused2) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (SecurityException unused3) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        }
    }

    public static byte a(int i, byte[] bArr) {
        return a.getByte(bArr, b + (c * i));
    }

    public static int c(int i, byte[] bArr) {
        return a.getInt(bArr, b + i);
    }

    public static int d(int i, int[] iArr) {
        return a.getInt(iArr, d + (o * i));
    }

    public static long e(int i, byte[] bArr) {
        return a.getLong(bArr, b + i);
    }

    public static int g(short[] sArr, int i) {
        return a.getShort(sArr, X + (Y * i)) & 65535;
    }

    public static short h(int i, byte[] bArr) {
        return a.getShort(bArr, b + i);
    }

    public static void i(byte[] bArr, int i, byte b2) {
        a.putByte(bArr, b + (c * i), b2);
    }

    public static void j(int i, int i2, int[] iArr) {
        a.putInt(iArr, d + (o * i), i2);
    }

    public static void k(int i, byte[] bArr, int i2) {
        a.putInt(bArr, b + i, i2);
    }

    public static void l(byte[] bArr, int i, long j) {
        a.putLong(bArr, b + i, j);
    }

    public static void m(byte[] bArr, int i, short s) {
        a.putShort(bArr, b + i, s);
    }

    public static void n(short[] sArr, int i, int i2) {
        a.putShort(sArr, X + (Y * i), (short) i2);
    }

    public static fsg valueOf(String str) {
        u45.r(Enum.valueOf(fsg.class, str));
        throw null;
    }
}
