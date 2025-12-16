package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzfo implements zzfn {
    @Override // com.google.android.gms.internal.fido.zzfn
    public final StackTraceElement zza(Class cls, int i12) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i13 = 3;
        boolean z12 = false;
        while (true) {
            if (i13 >= stackTrace.length) {
                i13 = -1;
                break;
            }
            if (stackTrace[i13].getClassName().equals(name)) {
                z12 = true;
            } else {
                if (z12) {
                    break;
                }
                z12 = false;
            }
            i13++;
        }
        if (i13 != -1) {
            return stackTrace[i13];
        }
        return null;
    }
}
