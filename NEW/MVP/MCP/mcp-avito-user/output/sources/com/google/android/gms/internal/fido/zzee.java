package com.google.android.gms.internal.fido;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzee {

    /* renamed from: a, reason: collision with root package name */
    public static final zzeg f350331a;

    static {
        zzeg zzegVarZza;
        String[] strArr = zzeg.f350332a;
        try {
            zzegVarZza = zzeh.zza();
        } catch (NoClassDefFoundError unused) {
            zzegVarZza = null;
        }
        if (zzegVarZza == null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < 3; i12++) {
                String str = strArr[i12];
                try {
                    zzegVarZza = (zzeg) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(th);
                }
            }
            throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
        }
        f350331a = zzegVarZza;
    }
}
