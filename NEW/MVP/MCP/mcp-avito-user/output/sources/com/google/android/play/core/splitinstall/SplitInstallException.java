package com.google.android.play.core.splitinstall;

import com.google.android.gms.common.api.ApiException;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public class SplitInstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SplitInstallException(@PY0.a int r7) {
        /*
            r6 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r2 = PY0.c.f13132a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L30
            java.util.HashMap r4 = PY0.c.f13133b
            boolean r5 = r4.containsKey(r3)
            if (r5 != 0) goto L1b
            goto L30
        L1b:
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#"
            java.lang.String r5 = ")"
            java.lang.String r2 = androidx.media3.exoplayer.analytics.m.l(r2, r4, r3, r5)
            goto L32
        L30:
            java.lang.String r2 = ""
        L32:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Split Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 0
            r0.<init>(r7, r1, r2, r2)
            r6.<init>(r0)
            if (r7 == 0) goto L46
            return
        L46:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.SplitInstallException.<init>(int):void");
    }
}
