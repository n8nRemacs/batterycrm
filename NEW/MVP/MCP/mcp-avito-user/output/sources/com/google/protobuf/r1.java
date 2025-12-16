package com.google.protobuf;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* loaded from: classes7.dex */
final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f362944a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f362945b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f362946c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f362947d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f362948e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f362949f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f362950g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f362951h;

    /* compiled from: UnsafeUtil.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class b extends e {
        @Override // com.google.protobuf.r1.e
        public final void c(long j12, byte[] bArr, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final void d(byte[] bArr, long j12, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final boolean e(Object obj, long j12) {
            return r1.f362951h ? r1.i(obj, j12) != 0 : r1.j(obj, j12) != 0;
        }

        @Override // com.google.protobuf.r1.e
        public final byte f(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final byte g(Object obj, long j12) {
            return r1.f362951h ? r1.i(obj, j12) : r1.j(obj, j12);
        }

        @Override // com.google.protobuf.r1.e
        public final double h(Object obj, long j12) {
            return Double.longBitsToDouble(l(obj, j12));
        }

        @Override // com.google.protobuf.r1.e
        public final float i(Object obj, long j12) {
            return Float.intBitsToFloat(j(obj, j12));
        }

        @Override // com.google.protobuf.r1.e
        public final long k(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final void o(Object obj, long j12, boolean z12) {
            if (r1.f362951h) {
                r1.r(obj, j12, z12 ? (byte) 1 : (byte) 0);
            } else {
                r1.s(obj, j12, z12 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.r1.e
        public final void p(long j12, byte b12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final void q(Object obj, long j12, byte b12) {
            if (r1.f362951h) {
                r1.r(obj, j12, b12);
            } else {
                r1.s(obj, j12, b12);
            }
        }

        @Override // com.google.protobuf.r1.e
        public final void r(Object obj, long j12, double d12) {
            u(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // com.google.protobuf.r1.e
        public final void s(Object obj, long j12, float f12) {
            t(obj, j12, Float.floatToIntBits(f12));
        }

        @Override // com.google.protobuf.r1.e
        public final boolean x() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // com.google.protobuf.r1.e
        public final void c(long j12, byte[] bArr, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final void d(byte[] bArr, long j12, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final boolean e(Object obj, long j12) {
            return r1.f362951h ? r1.i(obj, j12) != 0 : r1.j(obj, j12) != 0;
        }

        @Override // com.google.protobuf.r1.e
        public final byte f(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final byte g(Object obj, long j12) {
            return r1.f362951h ? r1.i(obj, j12) : r1.j(obj, j12);
        }

        @Override // com.google.protobuf.r1.e
        public final double h(Object obj, long j12) {
            return Double.longBitsToDouble(l(obj, j12));
        }

        @Override // com.google.protobuf.r1.e
        public final float i(Object obj, long j12) {
            return Float.intBitsToFloat(j(obj, j12));
        }

        @Override // com.google.protobuf.r1.e
        public final long k(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final void o(Object obj, long j12, boolean z12) {
            if (r1.f362951h) {
                r1.r(obj, j12, z12 ? (byte) 1 : (byte) 0);
            } else {
                r1.s(obj, j12, z12 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.r1.e
        public final void p(long j12, byte b12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.r1.e
        public final void q(Object obj, long j12, byte b12) {
            if (r1.f362951h) {
                r1.r(obj, j12, b12);
            } else {
                r1.s(obj, j12, b12);
            }
        }

        @Override // com.google.protobuf.r1.e
        public final void r(Object obj, long j12, double d12) {
            u(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // com.google.protobuf.r1.e
        public final void s(Object obj, long j12, float f12) {
            t(obj, j12, Float.floatToIntBits(f12));
        }

        @Override // com.google.protobuf.r1.e
        public final boolean x() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // com.google.protobuf.r1.e
        public final void c(long j12, byte[] bArr, long j13, long j14) {
            this.f362952a.copyMemory((Object) null, j12, bArr, r1.f362949f + j13, j14);
        }

        @Override // com.google.protobuf.r1.e
        public final void d(byte[] bArr, long j12, long j13, long j14) {
            this.f362952a.copyMemory(bArr, r1.f362949f + j12, (Object) null, j13, j14);
        }

        @Override // com.google.protobuf.r1.e
        public final boolean e(Object obj, long j12) {
            return this.f362952a.getBoolean(obj, j12);
        }

        @Override // com.google.protobuf.r1.e
        public final byte f(long j12) {
            return this.f362952a.getByte(j12);
        }

        @Override // com.google.protobuf.r1.e
        public final byte g(Object obj, long j12) {
            return this.f362952a.getByte(obj, j12);
        }

        @Override // com.google.protobuf.r1.e
        public final double h(Object obj, long j12) {
            return this.f362952a.getDouble(obj, j12);
        }

        @Override // com.google.protobuf.r1.e
        public final float i(Object obj, long j12) {
            return this.f362952a.getFloat(obj, j12);
        }

        @Override // com.google.protobuf.r1.e
        public final long k(long j12) {
            return this.f362952a.getLong(j12);
        }

        @Override // com.google.protobuf.r1.e
        public final void o(Object obj, long j12, boolean z12) {
            this.f362952a.putBoolean(obj, j12, z12);
        }

        @Override // com.google.protobuf.r1.e
        public final void p(long j12, byte b12) {
            this.f362952a.putByte(j12, b12);
        }

        @Override // com.google.protobuf.r1.e
        public final void q(Object obj, long j12, byte b12) {
            this.f362952a.putByte(obj, j12, b12);
        }

        @Override // com.google.protobuf.r1.e
        public final void r(Object obj, long j12, double d12) {
            this.f362952a.putDouble(obj, j12, d12);
        }

        @Override // com.google.protobuf.r1.e
        public final void s(Object obj, long j12, float f12) {
            this.f362952a.putFloat(obj, j12, f12);
        }

        @Override // com.google.protobuf.r1.e
        public final boolean w() {
            if (!super.w()) {
                return false;
            }
            try {
                Class<?> cls = this.f362952a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                r1.a(th2);
                return false;
            }
        }

        @Override // com.google.protobuf.r1.e
        public final boolean x() {
            if (!super.x()) {
                return false;
            }
            try {
                Class<?> cls = this.f362952a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                r1.a(th2);
                return false;
            }
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f362952a;

        public e(Unsafe unsafe) {
            this.f362952a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f362952a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f362952a.arrayIndexScale(cls);
        }

        public abstract void c(long j12, byte[] bArr, long j13, long j14);

        public abstract void d(byte[] bArr, long j12, long j13, long j14);

        public abstract boolean e(Object obj, long j12);

        public abstract byte f(long j12);

        public abstract byte g(Object obj, long j12);

        public abstract double h(Object obj, long j12);

        public abstract float i(Object obj, long j12);

        public final int j(Object obj, long j12) {
            return this.f362952a.getInt(obj, j12);
        }

        public abstract long k(long j12);

        public final long l(Object obj, long j12) {
            return this.f362952a.getLong(obj, j12);
        }

        public final Object m(Object obj, long j12) {
            return this.f362952a.getObject(obj, j12);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f362952a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j12, boolean z12);

        public abstract void p(long j12, byte b12);

        public abstract void q(Object obj, long j12, byte b12);

        public abstract void r(Object obj, long j12, double d12);

        public abstract void s(Object obj, long j12, float f12);

        public final void t(Object obj, long j12, int i12) {
            this.f362952a.putInt(obj, j12, i12);
        }

        public final void u(Object obj, long j12, long j13) {
            this.f362952a.putLong(obj, j12, j13);
        }

        public final void v(Object obj, long j12, Object obj2) {
            this.f362952a.putObject(obj, j12, obj2);
        }

        public boolean w() {
            Unsafe unsafe = this.f362952a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                r1.a(th2);
                return false;
            }
        }

        public boolean x() {
            Unsafe unsafe = this.f362952a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return r1.f() != null;
            } catch (Throwable th2) {
                r1.a(th2);
                return false;
            }
        }
    }

    static {
        Unsafe unsafeN = n();
        f362944a = unsafeN;
        f362945b = C37675g.f362875a;
        boolean zG2 = g(Long.TYPE);
        boolean zG3 = g(Integer.TYPE);
        e dVar = null;
        if (unsafeN != null) {
            if (!C37675g.a()) {
                dVar = new d(unsafeN);
            } else if (zG2) {
                dVar = new c(unsafeN);
            } else if (zG3) {
                dVar = new b(unsafeN);
            }
        }
        f362946c = dVar;
        f362947d = dVar == null ? false : dVar.x();
        f362948e = dVar == null ? false : dVar.w();
        f362949f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        java.lang.reflect.Field fieldF = f();
        f362950g = (fieldF == null || dVar == null) ? -1L : dVar.n(fieldF);
        f362951h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(r1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f362946c.l(byteBuffer, f362950g);
    }

    public static <T> T c(Class<T> cls) {
        try {
            return (T) f362944a.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static int d(Class<?> cls) {
        if (f362948e) {
            return f362946c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f362948e) {
            f362946c.b(cls);
        }
    }

    public static java.lang.reflect.Field f() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (C37675g.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(AddressParameter.TYPE);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean g(Class<?> cls) {
        if (!C37675g.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f362945b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte h(byte[] bArr, long j12) {
        return f362946c.g(bArr, f362949f + j12);
    }

    public static byte i(Object obj, long j12) {
        return (byte) ((f362946c.j(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3))) & 255);
    }

    public static byte j(Object obj, long j12) {
        return (byte) ((f362946c.j(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3))) & 255);
    }

    public static int k(AbstractC37663a abstractC37663a, long j12) {
        return f362946c.j(abstractC37663a, j12);
    }

    public static long l(AbstractC37663a abstractC37663a, long j12) {
        return f362946c.l(abstractC37663a, j12);
    }

    public static Object m(AbstractC37663a abstractC37663a, long j12) {
        return f362946c.m(abstractC37663a, j12);
    }

    public static Unsafe n() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void o(Object obj, long j12, boolean z12) {
        f362946c.o(obj, j12, z12);
    }

    public static void p(long j12, byte b12) {
        f362946c.p(j12, b12);
    }

    public static void q(byte[] bArr, long j12, byte b12) {
        f362946c.q(bArr, f362949f + j12, b12);
    }

    public static void r(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int iJ2 = f362946c.j(obj, j13);
        int i12 = ((~((int) j12)) & 3) << 3;
        v(obj, j13, ((255 & b12) << i12) | (iJ2 & (~(255 << i12))));
    }

    public static void s(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int i12 = (((int) j12) & 3) << 3;
        v(obj, j13, ((255 & b12) << i12) | (f362946c.j(obj, j13) & (~(255 << i12))));
    }

    public static void t(Object obj, long j12, double d12) {
        f362946c.r(obj, j12, d12);
    }

    public static void u(Object obj, long j12, float f12) {
        f362946c.s(obj, j12, f12);
    }

    public static void v(Object obj, long j12, int i12) {
        f362946c.t(obj, j12, i12);
    }

    public static void w(Object obj, long j12, long j13) {
        f362946c.u(obj, j12, j13);
    }

    public static void x(Object obj, long j12, Object obj2) {
        f362946c.v(obj, j12, obj2);
    }
}
