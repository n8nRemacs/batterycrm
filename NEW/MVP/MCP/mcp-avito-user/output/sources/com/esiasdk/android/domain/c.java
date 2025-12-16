package com.esiasdk.android.domain;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: AuthRepositoryBase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/esiasdk/android/domain/c;", "Lcom/esiasdk/android/domain/d;", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c implements d {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(com.esiasdk.android.domain.a r11, java.lang.String r12, com.esiasdk.android.data.network.model.ClientSessionInfo r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            boolean r0 = r15 instanceof com.esiasdk.android.domain.b
            if (r0 == 0) goto L13
            r0 = r15
            com.esiasdk.android.domain.b r0 = (com.esiasdk.android.domain.b) r0
            int r1 = r0.f339693t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f339693t = r1
            goto L18
        L13:
            com.esiasdk.android.domain.b r0 = new com.esiasdk.android.domain.b
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f339691r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f339693t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r14 = r0.f339690q
            kotlin.C42729a0.b(r15)
            goto L57
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.C42729a0.b(r15)
            java.lang.String r15 = "openid"
            java.util.List r10 = java.util.Collections.singletonList(r15)
            java.lang.String r5 = r13.f339683b
            com.esiasdk.android.data.network.model.ClientSessionInfo r15 = new com.esiasdk.android.data.network.model.ClientSessionInfo
            java.lang.String r6 = r13.f339684c
            java.lang.String r7 = r13.f339685d
            java.lang.String r8 = r13.f339686e
            java.lang.String r9 = r13.f339687f
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f339690q = r14
            r0.f339693t = r3
            java.lang.String r15 = r11.a(r12, r15)
            if (r15 != r1) goto L57
            return r1
        L57:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r11 = "&access_type=offline"
            java.lang.StringBuilder r11 = androidx.appcompat.app.r.z(r15, r11)
            java.nio.charset.Charset r12 = kotlin.text.C43047d.f410589b
            byte[] r13 = r14.getBytes(r12)
            r14 = 2
            java.lang.String r13 = android.util.Base64.encodeToString(r13, r14)
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = java.net.URLEncoder.encode(r13, r12)
            java.lang.String r13 = "&permissions="
            java.lang.String r12 = r13.concat(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esiasdk.android.domain.c.b(com.esiasdk.android.domain.a, java.lang.String, com.esiasdk.android.data.network.model.ClientSessionInfo, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @l
    public final String a(@k String str, @k ClientSessionInfo clientSessionInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str + "aas/delegate?");
        StringBuilder sb3 = new StringBuilder("client_id=");
        sb3.append(clientSessionInfo.f339683b);
        sb2.append(sb3.toString());
        sb2.append("&client_secret=" + clientSessionInfo.f339684c);
        sb2.append("&redirect_uri=" + Uri.encode(clientSessionInfo.f339687f));
        sb2.append("&scope=".concat(C42745f0.O(clientSessionInfo.f339688g, "+", null, null, null, 62)));
        sb2.append("&response_type=code");
        sb2.append("&state=" + clientSessionInfo.f339686e);
        sb2.append("&timestamp=".concat(C43066x.a0(C43066x.a0(clientSessionInfo.f339685d, "+", "%2B", false), " ", "+", false)));
        return sb2.toString();
    }
}
