package com.google.common.hash;

import com.google.common.hash.z;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: LittleEndianByteArray.java */
@InterfaceC37497l
/* loaded from: classes6.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Enum f360287a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LittleEndianByteArray.java */
    public static abstract class b implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360288b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f360289c;

        /* compiled from: LittleEndianByteArray.java */
        public enum a extends b {
            @Override // com.google.common.hash.z.c
            public final long a(int i12, byte[] bArr) {
                return com.google.common.primitives.n.a(bArr[i12 + 7], bArr[i12 + 6], bArr[i12 + 5], bArr[i12 + 4], bArr[i12 + 3], bArr[i12 + 2], bArr[i12 + 1], bArr[i12]);
            }
        }

        static {
            a aVar = new a("INSTANCE", 0, null);
            f360288b = aVar;
            f360289c = new b[]{aVar};
        }

        public b() {
            throw null;
        }

        public b(String str, int i12, a aVar) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f360289c.clone();
        }
    }

    /* compiled from: LittleEndianByteArray.java */
    public interface c {
        long a(int i12, byte[] bArr);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LittleEndianByteArray.java */
    public static abstract class d implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360290b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f360291c;

        /* renamed from: d, reason: collision with root package name */
        public static final Unsafe f360292d;

        /* renamed from: e, reason: collision with root package name */
        public static final int f360293e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f360294f;

        /* compiled from: LittleEndianByteArray.java */
        public enum a extends d {
            public a() {
                super("UNSAFE_LITTLE_ENDIAN", 0, null);
            }

            @Override // com.google.common.hash.z.c
            public final long a(int i12, byte[] bArr) {
                return d.f360292d.getLong(bArr, i12 + d.f360293e);
            }
        }

        /* compiled from: LittleEndianByteArray.java */
        public enum b extends d {
            public b() {
                super("UNSAFE_BIG_ENDIAN", 1, null);
            }

            @Override // com.google.common.hash.z.c
            public final long a(int i12, byte[] bArr) {
                return Long.reverseBytes(d.f360292d.getLong(bArr, i12 + d.f360293e));
            }
        }

        static {
            a aVar = new a();
            f360290b = aVar;
            b bVar = new b();
            f360291c = bVar;
            f360294f = new d[]{aVar, bVar};
            Unsafe unsafeD = d();
            f360292d = unsafeD;
            f360293e = unsafeD.arrayBaseOffset(byte[].class);
            if (unsafeD.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        public d() {
            throw null;
        }

        public d(String str, int i12, a aVar) {
        }

        public static Unsafe d() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e12) {
                    throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.common.hash.A
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        return z.d.e();
                    }
                });
            }
        }

        public static /* synthetic */ Unsafe e() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f360294f.clone();
        }
    }

    static {
        Enum r02 = b.f360288b;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                r02 = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? d.f360290b : d.f360291c;
            }
        } catch (Throwable unused) {
        }
        f360287a = r02;
    }

    public static int a(int i12, byte[] bArr) {
        return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
    }
}
