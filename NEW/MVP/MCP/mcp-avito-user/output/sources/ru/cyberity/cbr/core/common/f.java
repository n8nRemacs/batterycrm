package ru.cyberity.cbr.core.common;

import android.os.Build;
import kotlin.Metadata;

/* compiled from: BuildInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/common/f;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "buildTags", "", "f", "()Ljava/lang/Boolean;", "isEmulator$annotations", "isEmulator", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f {
    @Y61.l
    public final String a() {
        return Build.TAGS;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean f() {
        /*
            r4 = this;
            java.lang.String r0 = "google_sdk"
            java.lang.String r1 = "generic"
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L16
            r3 = 0
            boolean r2 = kotlin.text.C43066x.h0(r2, r1, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L19
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L16
            boolean r2 = kotlin.text.C43066x.h0(r2, r1, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L95
            goto L19
        L16:
            r0 = move-exception
            goto L9b
        L19:
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L16
            boolean r1 = kotlin.text.C43066x.h0(r2, r1, r3)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L95
            java.lang.String r1 = "unknown"
            boolean r1 = kotlin.text.C43066x.h0(r2, r1, r3)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "goldfish"
            boolean r2 = kotlin.text.C43066x.q(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L95
            java.lang.String r2 = "ranchu"
            boolean r1 = kotlin.text.C43066x.q(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L16
            boolean r2 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L95
            java.lang.String r2 = "Emulator"
            boolean r2 = kotlin.text.C43066x.q(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L95
            java.lang.String r2 = "Android SDK built for x86"
            boolean r1 = kotlin.text.C43066x.q(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "Genymotion"
            boolean r1 = kotlin.text.C43066x.q(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L95
            java.lang.String r1 = android.os.Build.PRODUCT     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "sdk_google"
            boolean r2 = kotlin.text.C43066x.q(r1, r2, r3)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L95
            boolean r0 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L95
            java.lang.String r0 = "sdk"
            boolean r0 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L95
            java.lang.String r0 = "sdk_x86"
            boolean r0 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L95
            java.lang.String r0 = "vbox86p"
            boolean r0 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L95
            java.lang.String r0 = "emulator"
            boolean r0 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L95
            java.lang.String r0 = "simulator"
            boolean r0 = kotlin.text.C43066x.q(r1, r0, r3)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L96
        L95:
            r3 = 1
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            goto La7
        L9b:
            ru.cyberity.log.a r1 = ru.cyberity.log.a.f436064a
            java.lang.String r2 = ru.cyberity.log.c.a(r4)
            java.lang.String r3 = "Error checking whether application is running in an emulator."
            r1.e(r2, r3, r0)
            r0 = 0
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.f.f():java.lang.Boolean");
    }
}
