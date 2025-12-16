package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgk {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f350146a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgz f350147b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzhb f350148c;
    public static final /* synthetic */ int zza = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgz zzgzVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f350146a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgzVar = (zzgz) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f350147b = zzgzVar;
        f350148c = new zzhb();
    }

    public static Object a(Object obj, int i12, int i13, Object obj2, zzgz zzgzVar) {
        if (obj2 == null) {
            obj2 = zzgzVar.a(obj);
        }
        zzgzVar.d(i12, i13, obj2);
        return obj2;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static zzgz zza() {
        return f350147b;
    }

    public static zzgz zzb() {
        return f350148c;
    }

    public static void zze(Class cls) {
        Class cls2;
        if (!zzev.class.isAssignableFrom(cls) && (cls2 = f350146a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }
}
