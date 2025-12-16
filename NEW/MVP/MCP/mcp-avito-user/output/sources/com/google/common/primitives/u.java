package com.google.common.primitives;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: UnsignedBytes.java */
@XY0.c
@f
@XY0.d
/* loaded from: classes6.dex */
public final class u {

    /* compiled from: UnsignedBytes.java */
    @XY0.e
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Comparator<byte[]> f360414a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UnsignedBytes.java */
        /* renamed from: com.google.common.primitives.u$a$a, reason: collision with other inner class name */
        public static final class EnumC10686a implements Comparator<byte[]> {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC10686a f360415b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ EnumC10686a[] f360416c;

            static {
                EnumC10686a enumC10686a = new EnumC10686a("INSTANCE", 0);
                f360415b = enumC10686a;
                f360416c = new EnumC10686a[]{enumC10686a};
            }

            public EnumC10686a() {
                throw null;
            }

            public static EnumC10686a valueOf(String str) {
                return (EnumC10686a) Enum.valueOf(EnumC10686a.class, str);
            }

            public static EnumC10686a[] values() {
                return (EnumC10686a[]) f360416c.clone();
            }

            @Override // java.util.Comparator
            public final int compare(byte[] bArr, byte[] bArr2) {
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                int iMin = Math.min(bArr3.length, bArr4.length);
                for (int i12 = 0; i12 < iMin; i12++) {
                    int iA2 = u.a(bArr3[i12], bArr4[i12]);
                    if (iA2 != 0) {
                        return iA2;
                    }
                }
                return bArr3.length - bArr4.length;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UnsignedBytes.java */
        @XY0.e
        public static final class b implements Comparator<byte[]> {

            /* renamed from: c, reason: collision with root package name */
            public static final Unsafe f360418c;

            /* renamed from: d, reason: collision with root package name */
            public static final int f360419d;

            /* JADX INFO: Fake field, exist only in values array */
            b EF5;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ b[] f360420e = {new b("INSTANCE", 0)};

            /* renamed from: b, reason: collision with root package name */
            public static final boolean f360417b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* compiled from: UnsignedBytes.java */
            /* renamed from: com.google.common.primitives.u$a$b$a, reason: collision with other inner class name */
            public class C10687a implements PrivilegedExceptionAction<Unsafe> {
                public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }

                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Unsafe run() {
                    return a();
                }
            }

            static {
                Unsafe unsafeB = b();
                f360418c = unsafeB;
                int iArrayBaseOffset = unsafeB.arrayBaseOffset(byte[].class);
                f360419d = iArrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || iArrayBaseOffset % 8 != 0 || unsafeB.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            public b() {
                throw null;
            }

            public static int a(byte[] bArr, byte[] bArr2) {
                int iMin = Math.min(bArr.length, bArr2.length);
                int i12 = iMin & (-8);
                int i13 = 0;
                while (i13 < i12) {
                    Unsafe unsafe = f360418c;
                    long j12 = f360419d + i13;
                    long j13 = unsafe.getLong(bArr, j12);
                    long j14 = unsafe.getLong(bArr2, j12);
                    if (j13 != j14) {
                        if (f360417b) {
                            return y.a(j13, j14);
                        }
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13 ^ j14) & (-8);
                        return ((int) ((j13 >>> iNumberOfTrailingZeros) & 255)) - ((int) ((j14 >>> iNumberOfTrailingZeros) & 255));
                    }
                    i13 += 8;
                }
                while (i13 < iMin) {
                    int iA2 = u.a(bArr[i13], bArr2[i13]);
                    if (iA2 != 0) {
                        return iA2;
                    }
                    i13++;
                }
                return bArr.length - bArr2.length;
            }

            public static Unsafe b() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e12) {
                        throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new C10687a());
                }
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f360420e.clone();
            }

            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
                return a(bArr, bArr2);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        static {
            Comparator<byte[]> comparator;
            try {
                Object[] enumConstants = Class.forName(a.class.getName().concat("$UnsafeComparator")).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                comparator = (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                comparator = EnumC10686a.f360415b;
            }
            f360414a = comparator;
        }
    }

    public static int a(byte b12, byte b13) {
        return (b12 & 255) - (b13 & 255);
    }
}
