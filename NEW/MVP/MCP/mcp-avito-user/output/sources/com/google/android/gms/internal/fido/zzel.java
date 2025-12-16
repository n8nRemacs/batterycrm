package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzel extends zzeg {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f350335b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f350336c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzef f350337d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    final class zza {
    }

    static {
        boolean zEquals;
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            zEquals = zza.class.getName().equals(e());
        } catch (Throwable unused) {
            zEquals = false;
        }
        f350335b = zEquals;
        String str = Build.FINGERPRINT;
        f350336c = str == null || "robolectric".equals(str);
        f350337d = new zzef() { // from class: com.google.android.gms.internal.fido.zzel.1
            @Override // com.google.android.gms.internal.fido.zzef
            public zzdj zza(Class<?> cls, int i12) {
                return zzdj.zza;
            }

            @Override // com.google.android.gms.internal.fido.zzef
            public String zzb(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzel.f350335b) {
                    try {
                        if (cls.equals(zzel.d())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (!zzel.f350336c || (stackTraceElementZza = zzfj.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }
        };
    }

    public static Class<?> d() {
        return VMStack.getStackClass2();
    }

    public static String e() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public final zzdp a(String str) {
        return zzeo.zzb(str);
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public final zzef b() {
        return f350337d;
    }

    @Override // com.google.android.gms.internal.fido.zzeg
    public final zzev c() {
        return zzep.zzb();
    }
}
