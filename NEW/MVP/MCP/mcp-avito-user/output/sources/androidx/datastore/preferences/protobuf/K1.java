package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
final class K1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f45717a = Logger.getLogger(K1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f45718b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f45719c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f45720d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f45721e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f45722f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f45723g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f45724h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f45725i;

    /* compiled from: UnsafeUtil.java */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
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
        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void c(long j12, byte[] bArr, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void d(byte[] bArr, long j12, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final boolean e(Object obj, long j12) {
            return K1.f45725i ? K1.h(obj, j12) != 0 : K1.i(obj, j12) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final byte f(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final byte g(Object obj, long j12) {
            return K1.f45725i ? K1.h(obj, j12) : K1.i(obj, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final double h(Object obj, long j12) {
            return Double.longBitsToDouble(l(obj, j12));
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final float i(Object obj, long j12) {
            return Float.intBitsToFloat(j(obj, j12));
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final long k(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void o(Object obj, long j12, boolean z12) {
            if (K1.f45725i) {
                K1.q(obj, j12, z12 ? (byte) 1 : (byte) 0);
            } else {
                K1.r(obj, j12, z12 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void p(long j12, byte b12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void q(Object obj, long j12, byte b12) {
            if (K1.f45725i) {
                K1.q(obj, j12, b12);
            } else {
                K1.r(obj, j12, b12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void r(Object obj, long j12, double d12) {
            u(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void s(Object obj, long j12, float f12) {
            t(obj, j12, Float.floatToIntBits(f12));
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void c(long j12, byte[] bArr, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void d(byte[] bArr, long j12, long j13, long j14) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final boolean e(Object obj, long j12) {
            return K1.f45725i ? K1.h(obj, j12) != 0 : K1.i(obj, j12) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final byte f(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final byte g(Object obj, long j12) {
            return K1.f45725i ? K1.h(obj, j12) : K1.i(obj, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final double h(Object obj, long j12) {
            return Double.longBitsToDouble(l(obj, j12));
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final float i(Object obj, long j12) {
            return Float.intBitsToFloat(j(obj, j12));
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final long k(long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void o(Object obj, long j12, boolean z12) {
            if (K1.f45725i) {
                K1.q(obj, j12, z12 ? (byte) 1 : (byte) 0);
            } else {
                K1.r(obj, j12, z12 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void p(long j12, byte b12) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void q(Object obj, long j12, byte b12) {
            if (K1.f45725i) {
                K1.q(obj, j12, b12);
            } else {
                K1.r(obj, j12, b12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void r(Object obj, long j12, double d12) {
            u(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void s(Object obj, long j12, float f12) {
            t(obj, j12, Float.floatToIntBits(f12));
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static final class d extends e {
        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void c(long j12, byte[] bArr, long j13, long j14) {
            this.f45726a.copyMemory((Object) null, j12, bArr, K1.f45723g + j13, j14);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void d(byte[] bArr, long j12, long j13, long j14) {
            this.f45726a.copyMemory(bArr, K1.f45723g + j12, (Object) null, j13, j14);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final boolean e(Object obj, long j12) {
            return this.f45726a.getBoolean(obj, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final byte f(long j12) {
            return this.f45726a.getByte(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final byte g(Object obj, long j12) {
            return this.f45726a.getByte(obj, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final double h(Object obj, long j12) {
            return this.f45726a.getDouble(obj, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final float i(Object obj, long j12) {
            return this.f45726a.getFloat(obj, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final long k(long j12) {
            return this.f45726a.getLong(j12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void o(Object obj, long j12, boolean z12) {
            this.f45726a.putBoolean(obj, j12, z12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void p(long j12, byte b12) {
            this.f45726a.putByte(j12, b12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void q(Object obj, long j12, byte b12) {
            this.f45726a.putByte(obj, j12, b12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void r(Object obj, long j12, double d12) {
            this.f45726a.putDouble(obj, j12, d12);
        }

        @Override // androidx.datastore.preferences.protobuf.K1.e
        public final void s(Object obj, long j12, float f12) {
            this.f45726a.putFloat(obj, j12, f12);
        }
    }

    /* compiled from: UnsafeUtil.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f45726a;

        public e(Unsafe unsafe) {
            this.f45726a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f45726a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f45726a.arrayIndexScale(cls);
        }

        public abstract void c(long j12, byte[] bArr, long j13, long j14);

        public abstract void d(byte[] bArr, long j12, long j13, long j14);

        public abstract boolean e(Object obj, long j12);

        public abstract byte f(long j12);

        public abstract byte g(Object obj, long j12);

        public abstract double h(Object obj, long j12);

        public abstract float i(Object obj, long j12);

        public final int j(Object obj, long j12) {
            return this.f45726a.getInt(obj, j12);
        }

        public abstract long k(long j12);

        public final long l(Object obj, long j12) {
            return this.f45726a.getLong(obj, j12);
        }

        public final Object m(Object obj, long j12) {
            return this.f45726a.getObject(obj, j12);
        }

        public final long n(java.lang.reflect.Field field) {
            return this.f45726a.objectFieldOffset(field);
        }

        public abstract void o(Object obj, long j12, boolean z12);

        public abstract void p(long j12, byte b12);

        public abstract void q(Object obj, long j12, byte b12);

        public abstract void r(Object obj, long j12, double d12);

        public abstract void s(Object obj, long j12, float f12);

        public final void t(Object obj, long j12, int i12) {
            this.f45726a.putInt(obj, j12, i12);
        }

        public final void u(Object obj, long j12, long j13) {
            this.f45726a.putLong(obj, j12, j13);
        }

        public final void v(Object obj, long j12, Object obj2) {
            this.f45726a.putObject(obj, j12, obj2);
        }
    }

    static {
        Class<?> cls;
        boolean z12;
        boolean z13;
        e eVar;
        Unsafe unsafeM = m();
        f45718b = unsafeM;
        f45719c = C22895g.f45838a;
        Class cls2 = Long.TYPE;
        boolean zF2 = f(cls2);
        Class cls3 = Integer.TYPE;
        boolean zF3 = f(cls3);
        e dVar = null;
        if (unsafeM != null) {
            if (!C22895g.a()) {
                dVar = new d(unsafeM);
            } else if (zF2) {
                dVar = new c(unsafeM);
            } else if (zF3) {
                dVar = new b(unsafeM);
            }
        }
        f45720d = dVar;
        if (unsafeM == null) {
            z12 = false;
        } else {
            try {
                cls = unsafeM.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, cls2);
            } catch (Throwable th2) {
                f45717a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            }
            if (e() == null) {
                z12 = false;
            } else {
                if (!C22895g.a()) {
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, cls3);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                }
                z12 = true;
            }
        }
        f45721e = z12;
        Unsafe unsafe = f45718b;
        if (unsafe == null) {
            z13 = false;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
                cls4.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                Class cls5 = Long.TYPE;
                cls4.getMethod("getInt", Object.class, cls5);
                cls4.getMethod("putInt", Object.class, cls5, Integer.TYPE);
                cls4.getMethod("getLong", Object.class, cls5);
                cls4.getMethod("putLong", Object.class, cls5, cls5);
                cls4.getMethod("getObject", Object.class, cls5);
                cls4.getMethod("putObject", Object.class, cls5, Object.class);
                if (!C22895g.a()) {
                    cls4.getMethod("getByte", Object.class, cls5);
                    cls4.getMethod("putByte", Object.class, cls5, Byte.TYPE);
                    cls4.getMethod("getBoolean", Object.class, cls5);
                    cls4.getMethod("putBoolean", Object.class, cls5, Boolean.TYPE);
                    cls4.getMethod("getFloat", Object.class, cls5);
                    cls4.getMethod("putFloat", Object.class, cls5, Float.TYPE);
                    cls4.getMethod("getDouble", Object.class, cls5);
                    cls4.getMethod("putDouble", Object.class, cls5, Double.TYPE);
                }
                z13 = true;
            } catch (Throwable th3) {
                f45717a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
            }
        }
        f45722f = z13;
        f45723g = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        java.lang.reflect.Field fieldE = e();
        f45724h = (fieldE == null || (eVar = f45720d) == null) ? -1L : eVar.n(fieldE);
        f45725i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long a(ByteBuffer byteBuffer) {
        return f45720d.l(byteBuffer, f45724h);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f45718b.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static int c(Class<?> cls) {
        if (f45722f) {
            return f45720d.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f45722f) {
            f45720d.b(cls);
        }
    }

    public static java.lang.reflect.Field e() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (C22895g.a()) {
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

    public static boolean f(Class<?> cls) {
        if (!C22895g.a()) {
            return false;
        }
        try {
            Class<?> cls2 = f45719c;
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

    public static byte g(byte[] bArr, long j12) {
        return f45720d.g(bArr, f45723g + j12);
    }

    public static byte h(Object obj, long j12) {
        return (byte) ((f45720d.j(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j12) {
        return (byte) ((f45720d.j(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3))) & 255);
    }

    public static int j(AbstractC22877a abstractC22877a, long j12) {
        return f45720d.j(abstractC22877a, j12);
    }

    public static long k(AbstractC22877a abstractC22877a, long j12) {
        return f45720d.l(abstractC22877a, j12);
    }

    public static Object l(Object obj, long j12) {
        return f45720d.m(obj, j12);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j12, boolean z12) {
        f45720d.o(obj, j12, z12);
    }

    public static void o(long j12, byte b12) {
        f45720d.p(j12, b12);
    }

    public static void p(byte[] bArr, long j12, byte b12) {
        f45720d.q(bArr, f45723g + j12, b12);
    }

    public static void q(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int iJ2 = f45720d.j(obj, j13);
        int i12 = ((~((int) j12)) & 3) << 3;
        u(obj, j13, ((255 & b12) << i12) | (iJ2 & (~(255 << i12))));
    }

    public static void r(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int i12 = (((int) j12) & 3) << 3;
        u(obj, j13, ((255 & b12) << i12) | (f45720d.j(obj, j13) & (~(255 << i12))));
    }

    public static void s(Object obj, long j12, double d12) {
        f45720d.r(obj, j12, d12);
    }

    public static void t(Object obj, long j12, float f12) {
        f45720d.s(obj, j12, f12);
    }

    public static void u(Object obj, long j12, int i12) {
        f45720d.t(obj, j12, i12);
    }

    public static void v(Object obj, long j12, long j13) {
        f45720d.u(obj, j12, j13);
    }

    public static void w(Object obj, long j12, Object obj2) {
        f45720d.v(obj, j12, obj2);
    }
}
