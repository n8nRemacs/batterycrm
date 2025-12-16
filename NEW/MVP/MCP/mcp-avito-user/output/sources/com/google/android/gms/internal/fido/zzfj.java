package com.google.android.gms.internal.fido;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzfj {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f350373a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* renamed from: b, reason: collision with root package name */
    public static final zzfn f350374b;

    static {
        zzfn zzfoVar;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                zzfoVar = new zzfo();
                break;
            }
            try {
                zzfoVar = (zzfn) Class.forName(f350373a[i12]).asSubclass(zzfn.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzfoVar = null;
            }
            if (zzfoVar != null) {
                break;
            } else {
                i12++;
            }
        }
        f350374b = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i12) {
        zzfk.zza(cls, "target");
        return f350374b.zza(cls, 2);
    }
}
