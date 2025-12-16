package com.google.android.gms.internal.measurement;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzmo {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f350996a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f350997b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzc f350998c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f350999d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f351000e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f351001f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f351002g;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zza extends zzc {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final double zza(Object obj, long j12) {
            return Double.longBitsToDouble(zze(obj, j12));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final float zzb(Object obj, long j12) {
            return Float.intBitsToFloat(zzd(obj, j12));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final boolean zzc(Object obj, long j12) {
            if (zzmo.f351002g) {
                return ((byte) (zzmo.f350998c.zzd(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3)))) != 0;
            }
            return ((byte) (zzmo.f350998c.zzd(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3)))) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, boolean z12) {
            if (zzmo.f351002g) {
                zzmo.m(obj, j12, z12 ? (byte) 1 : (byte) 0);
            } else {
                zzmo.p(obj, j12, z12 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, byte b12) {
            if (zzmo.f351002g) {
                zzmo.m(obj, j12, b12);
            } else {
                zzmo.p(obj, j12, b12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, double d12) {
            zza(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, float f12) {
            zza(obj, j12, Float.floatToIntBits(f12));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zzb extends zzc {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final double zza(Object obj, long j12) {
            return Double.longBitsToDouble(zze(obj, j12));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final float zzb(Object obj, long j12) {
            return Float.intBitsToFloat(zzd(obj, j12));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final boolean zzc(Object obj, long j12) {
            if (zzmo.f351002g) {
                return ((byte) (zzmo.f350998c.zzd(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3)))) != 0;
            }
            return ((byte) (zzmo.f350998c.zzd(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3)))) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, boolean z12) {
            if (zzmo.f351002g) {
                zzmo.m(obj, j12, z12 ? (byte) 1 : (byte) 0);
            } else {
                zzmo.p(obj, j12, z12 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, byte b12) {
            if (zzmo.f351002g) {
                zzmo.m(obj, j12, b12);
            } else {
                zzmo.p(obj, j12, b12);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, double d12) {
            zza(obj, j12, Double.doubleToLongBits(d12));
        }

        @Override // com.google.android.gms.internal.measurement.zzmo.zzc
        public final void zza(Object obj, long j12, float f12) {
            zza(obj, j12, Float.floatToIntBits(f12));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static abstract class zzc {

        /* renamed from: a, reason: collision with root package name */
        public final Unsafe f351003a;

        public zzc(Unsafe unsafe) {
            this.f351003a = unsafe;
        }

        public abstract double zza(Object obj, long j12);

        public abstract void zza(Object obj, long j12, byte b12);

        public abstract void zza(Object obj, long j12, double d12);

        public abstract void zza(Object obj, long j12, float f12);

        public final void zza(Object obj, long j12, int i12) {
            this.f351003a.putInt(obj, j12, i12);
        }

        public abstract void zza(Object obj, long j12, boolean z12);

        public abstract float zzb(Object obj, long j12);

        public final boolean zzb() {
            Field declaredField;
            Field declaredField2;
            Unsafe unsafe = this.f351003a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                Unsafe unsafe2 = zzmo.f350996a;
                Field field = null;
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField != null) {
                    field = declaredField;
                } else {
                    try {
                        declaredField2 = Buffer.class.getDeclaredField(AddressParameter.TYPE);
                    } catch (Throwable unused2) {
                        declaredField2 = null;
                    }
                    if (declaredField2 != null) {
                        if (declaredField2.getType() == Long.TYPE) {
                            field = declaredField2;
                        }
                    }
                }
                return field != null;
            } catch (Throwable th2) {
                Unsafe unsafe3 = zzmo.f350996a;
                Logger.getLogger(zzmo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j12);

        public final int zzd(Object obj, long j12) {
            return this.f351003a.getInt(obj, j12);
        }

        public final long zze(Object obj, long j12) {
            return this.f351003a.getLong(obj, j12);
        }

        public final void zza(Object obj, long j12, long j13) {
            this.f351003a.putLong(obj, j12, j13);
        }

        public final boolean zza() {
            Unsafe unsafe = this.f351003a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
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
                Unsafe unsafe2 = zzmo.f350996a;
                Logger.getLogger(zzmo.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    static {
        /*
            sun.misc.Unsafe r0 = j()
            com.google.android.gms.internal.measurement.zzmo.f350996a = r0
            java.lang.Class<?> r1 = com.google.android.gms.internal.measurement.zzhr.f350834a
            com.google.android.gms.internal.measurement.zzmo.f350997b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = q(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = q(r2)
            r3 = 0
            if (r0 == 0) goto L29
            if (r1 == 0) goto L21
            com.google.android.gms.internal.measurement.zzmo$zza r1 = new com.google.android.gms.internal.measurement.zzmo$zza
            r1.<init>(r0)
            goto L2a
        L21:
            if (r2 == 0) goto L29
            com.google.android.gms.internal.measurement.zzmo$zzb r1 = new com.google.android.gms.internal.measurement.zzmo$zzb
            r1.<init>(r0)
            goto L2a
        L29:
            r1 = r3
        L2a:
            com.google.android.gms.internal.measurement.zzmo.f350998c = r1
            r0 = 0
            if (r1 != 0) goto L31
            r2 = r0
            goto L35
        L31:
            boolean r2 = r1.zzb()
        L35:
            com.google.android.gms.internal.measurement.zzmo.f350999d = r2
            if (r1 != 0) goto L3b
            r2 = r0
            goto L3f
        L3b:
            boolean r2 = r1.zza()
        L3f:
            com.google.android.gms.internal.measurement.zzmo.f351000e = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = i(r2)
            long r4 = (long) r2
            com.google.android.gms.internal.measurement.zzmo.f351001f = r4
            java.lang.Class<boolean[]> r2 = boolean[].class
            i(r2)
            l(r2)
            java.lang.Class<int[]> r2 = int[].class
            i(r2)
            l(r2)
            java.lang.Class<long[]> r2 = long[].class
            i(r2)
            l(r2)
            java.lang.Class<float[]> r2 = float[].class
            i(r2)
            l(r2)
            java.lang.Class<double[]> r2 = double[].class
            i(r2)
            l(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            i(r2)
            l(r2)
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L83
            goto L84
        L83:
            r4 = r3
        L84:
            if (r4 == 0) goto L88
            r3 = r4
            goto L9b
        L88:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L8f
            goto L90
        L8f:
            r2 = r3
        L90:
            if (r2 == 0) goto L9b
            java.lang.Class r4 = r2.getType()
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r4 != r5) goto L9b
            r3 = r2
        L9b:
            if (r3 == 0) goto La5
            if (r1 != 0) goto La0
            goto La5
        La0:
            sun.misc.Unsafe r1 = r1.f351003a
            r1.objectFieldOffset(r3)
        La5:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Lae
            r0 = 1
        Lae:
            com.google.android.gms.internal.measurement.zzmo.f351002g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmo.<clinit>():void");
    }

    public static double a(Object obj, long j12) {
        return f350998c.zza(obj, j12);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return (T) f350996a.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static void c(Object obj, long j12, double d12) {
        f350998c.zza(obj, j12, d12);
    }

    public static void d(Object obj, long j12, float f12) {
        f350998c.zza(obj, j12, f12);
    }

    public static void e(Object obj, long j12, int i12) {
        f350998c.zza(obj, j12, i12);
    }

    public static void f(Object obj, long j12, long j13) {
        f350998c.zza(obj, j12, j13);
    }

    public static void g(Object obj, long j12, Object obj2) {
        f350998c.f351003a.putObject(obj, j12, obj2);
    }

    public static float h(Object obj, long j12) {
        return f350998c.zzb(obj, j12);
    }

    public static int i(Class<?> cls) {
        if (f351000e) {
            return f350998c.f351003a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int k(long j12, Object obj) {
        return f350998c.zzd(obj, j12);
    }

    public static void l(Class cls) {
        if (f351000e) {
            f350998c.f351003a.arrayIndexScale(cls);
        }
    }

    public static void m(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int iZzd = f350998c.zzd(obj, j13);
        int i12 = ((~((int) j12)) & 3) << 3;
        e(obj, j13, ((255 & b12) << i12) | (iZzd & (~(255 << i12))));
    }

    public static void n(Object obj, long j12, boolean z12) {
        f350998c.zza(obj, j12, z12);
    }

    public static long o(long j12, Object obj) {
        return f350998c.zze(obj, j12);
    }

    public static void p(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        int i12 = (((int) j12) & 3) << 3;
        e(obj, j13, ((255 & b12) << i12) | (f350998c.zzd(obj, j13) & (~(255 << i12))));
    }

    public static boolean q(Class<?> cls) {
        try {
            Class<?> cls2 = f350997b;
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

    public static Object r(long j12, Object obj) {
        return f350998c.f351003a.getObject(obj, j12);
    }

    public static boolean s(long j12, Object obj) {
        return f350998c.zzc(obj, j12);
    }
}
