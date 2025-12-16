package com.google.android.gms.internal.auth;

import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzhj {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f350175a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f350176b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzhi f350177c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f350178d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f350179e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f350180f;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161 A[PHI: r0
  0x0161: PHI (r0v40 java.lang.reflect.Field) = (r0v33 java.lang.reflect.Field), (r0v35 java.lang.reflect.Field) binds: [B:43:0x014f, B:49:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhj.<clinit>():void");
    }

    public static int a(long j12, Object obj) {
        return f350177c.f350174a.getInt(obj, j12);
    }

    public static long b(long j12, Object obj) {
        return f350177c.f350174a.getLong(obj, j12);
    }

    public static Object c(Class cls) {
        try {
            return f350175a.allocateInstance(cls);
        } catch (InstantiationException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public static Object d(long j12, Object obj) {
        return f350177c.f350174a.getObject(obj, j12);
    }

    public static Unsafe e() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j12, boolean z12) {
        zzhi zzhiVar = f350177c;
        long j13 = (-4) & j12;
        int i12 = zzhiVar.f350174a.getInt(obj, j13);
        int i13 = ((~((int) j12)) & 3) << 3;
        zzhiVar.f350174a.putInt(obj, j13, ((z12 ? 1 : 0) << i13) | ((~(255 << i13)) & i12));
    }

    public static /* synthetic */ void g(Object obj, long j12, boolean z12) {
        zzhi zzhiVar = f350177c;
        long j13 = (-4) & j12;
        int i12 = (((int) j12) & 3) << 3;
        zzhiVar.f350174a.putInt(obj, j13, ((z12 ? 1 : 0) << i12) | ((~(255 << i12)) & zzhiVar.f350174a.getInt(obj, j13)));
    }

    public static void h(Object obj, long j12, boolean z12) {
        f350177c.zzc(obj, j12, z12);
    }

    public static void i(Object obj, long j12, double d12) {
        f350177c.zzd(obj, j12, d12);
    }

    public static void j(Object obj, long j12, float f12) {
        f350177c.zze(obj, j12, f12);
    }

    public static void k(Object obj, long j12, int i12) {
        f350177c.f350174a.putInt(obj, j12, i12);
    }

    public static void l(Object obj, long j12, long j13) {
        f350177c.f350174a.putLong(obj, j12, j13);
    }

    public static void m(Object obj, long j12, Object obj2) {
        f350177c.f350174a.putObject(obj, j12, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean n(long j12, Object obj) {
        return ((byte) ((f350177c.f350174a.getInt(obj, (-4) & j12) >>> ((int) (((~j12) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean o(long j12, Object obj) {
        return ((byte) ((f350177c.f350174a.getInt(obj, (-4) & j12) >>> ((int) ((j12 & 3) << 3))) & 255)) != 0;
    }

    public static boolean p(Class cls) {
        int i12 = zzds.zza;
        try {
            Class cls2 = f350176b;
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

    public static void q(Class cls) {
        if (f350179e) {
            f350177c.f350174a.arrayBaseOffset(cls);
        }
    }

    public static void r(Class cls) {
        if (f350179e) {
            f350177c.f350174a.arrayIndexScale(cls);
        }
    }
}
