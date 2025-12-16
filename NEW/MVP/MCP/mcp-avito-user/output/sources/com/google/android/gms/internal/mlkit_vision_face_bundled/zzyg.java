package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzyg {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f354147a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f354148b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzyf f354149c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f354150d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f354151e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f354152f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f354153g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[PHI: r0
  0x0165: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x0153, B:49:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzyg.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f354151e) {
            f354149c.f354146a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j12, byte b12) {
        zzyf zzyfVar = f354149c;
        long j13 = (-4) & j12;
        int i12 = zzyfVar.f354146a.getInt(obj, j13);
        int i13 = ((~((int) j12)) & 3) << 3;
        zzyfVar.f354146a.putInt(obj, j13, ((255 & b12) << i13) | (i12 & (~(255 << i13))));
    }

    public static void c(Object obj, long j12, byte b12) {
        zzyf zzyfVar = f354149c;
        long j13 = (-4) & j12;
        int i12 = (((int) j12) & 3) << 3;
        zzyfVar.f354146a.putInt(obj, j13, ((255 & b12) << i12) | (zzyfVar.f354146a.getInt(obj, j13) & (~(255 << i12))));
    }

    public static double d(Object obj, long j12) {
        return f354149c.zza(obj, j12);
    }

    public static float e(Object obj, long j12) {
        return f354149c.zzb(obj, j12);
    }

    public static int f(long j12, Object obj) {
        return f354149c.f354146a.getInt(obj, j12);
    }

    public static long g(long j12, Object obj) {
        return f354149c.f354146a.getLong(obj, j12);
    }

    public static Object h(Class cls) {
        try {
            return f354147a.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static Object i(long j12, Object obj) {
        return f354149c.f354146a.getObject(obj, j12);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzyc());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j12, boolean z12) {
        f354149c.zzc(obj, j12, z12);
    }

    public static void l(Object obj, long j12, double d12) {
        f354149c.zze(obj, j12, d12);
    }

    public static void m(Object obj, long j12, float f12) {
        f354149c.zzf(obj, j12, f12);
    }

    public static void n(int i12, long j12, Object obj) {
        f354149c.f354146a.putInt(obj, j12, i12);
    }

    public static void o(Object obj, long j12, long j13) {
        f354149c.f354146a.putLong(obj, j12, j13);
    }

    public static void p(Object obj, long j12, Object obj2) {
        f354149c.f354146a.putObject(obj, j12, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j12, Object obj) {
        return ((byte) ((f354149c.f354146a.getInt(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j12, Object obj) {
        return ((byte) ((f354149c.f354146a.getInt(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3))) & 255)) != 0;
    }

    public static boolean s(Class cls) {
        int i12 = zztx.zza;
        try {
            Class cls2 = f354148b;
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

    public static boolean t(long j12, Object obj) {
        return f354149c.zzg(obj, j12);
    }

    public static int u(Class cls) {
        if (f354151e) {
            return f354149c.f354146a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
