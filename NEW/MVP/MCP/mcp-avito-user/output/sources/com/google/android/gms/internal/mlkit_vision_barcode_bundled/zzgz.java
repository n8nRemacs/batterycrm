package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzgz {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f352543a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f352544b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgy f352545c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f352546d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f352547e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f352548f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f352549g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[PHI: r0
  0x0165: PHI (r0v41 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x0153, B:49:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f352547e) {
            f352545c.zzi(cls);
        }
    }

    public static void b(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        zzgy zzgyVar = f352545c;
        int iZzj = zzgyVar.zzj(obj, j13);
        int i12 = ((~((int) j12)) & 3) << 3;
        zzgyVar.zzn(obj, j13, ((255 & b12) << i12) | (iZzj & (~(255 << i12))));
    }

    public static void c(Object obj, long j12, byte b12) {
        long j13 = (-4) & j12;
        zzgy zzgyVar = f352545c;
        int i12 = (((int) j12) & 3) << 3;
        zzgyVar.zzn(obj, j13, ((255 & b12) << i12) | (zzgyVar.zzj(obj, j13) & (~(255 << i12))));
    }

    public static double d(Object obj, long j12) {
        return f352545c.zza(obj, j12);
    }

    public static float e(Object obj, long j12) {
        return f352545c.zzb(obj, j12);
    }

    public static int f(long j12, Object obj) {
        return f352545c.zzj(obj, j12);
    }

    public static long g(long j12, Object obj) {
        return f352545c.zzk(obj, j12);
    }

    public static Object h(Class cls) {
        try {
            return f352543a.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static Object i(long j12, Object obj) {
        return f352545c.zzm(obj, j12);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j12, boolean z12) {
        f352545c.zzc(obj, j12, z12);
    }

    public static void l(Object obj, long j12, double d12) {
        f352545c.zze(obj, j12, d12);
    }

    public static void m(Object obj, long j12, float f12) {
        f352545c.zzf(obj, j12, f12);
    }

    public static void n(int i12, long j12, Object obj) {
        f352545c.zzn(obj, j12, i12);
    }

    public static void o(Object obj, long j12, Object obj2) {
        f352545c.zzp(obj, j12, obj2);
    }

    public static /* synthetic */ boolean p(long j12, Object obj) {
        return ((byte) ((f352545c.zzj(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean q(long j12, Object obj) {
        return ((byte) ((f352545c.zzj(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3))) & 255)) != 0;
    }

    public static boolean r(Class cls) {
        int i12 = zzcn.zza;
        try {
            Class cls2 = f352544b;
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

    public static boolean s(long j12, Object obj) {
        return f352545c.zzg(obj, j12);
    }

    public static int t(Class cls) {
        if (f352547e) {
            return f352545c.zzh(cls);
        }
        return -1;
    }
}
