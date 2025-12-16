package com.avito.android.serp;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpNetworkErrorMessageHandler.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/k;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f273957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f273958b;

    /* JADX WARN: Illegal instructions before constructor call */
    public k() {
        boolean z12 = false;
        this(z12, z12, 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r0 instanceof com.avito.android.remote.error.ApiError.Forbidden) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return com.avito.android.printable_text.b.c(com.avito.android.R.string.network_unavailable_snack, new java.io.Serializable[0]);
     */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.printable_text.PrintableText a(@Y61.l java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r4.f273957a
            r1 = 2131955554(0x7f130f62, float:1.9547639E38)
            r2 = 0
            if (r0 != 0) goto Lf
            java.io.Serializable[] r5 = new java.io.Serializable[r2]
            com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.c(r1, r5)
            return r5
        Lf:
            boolean r0 = r4.f273958b
            if (r0 == 0) goto L34
            r0 = r5
        L14:
            if (r0 != 0) goto L17
            goto L28
        L17:
            boolean r3 = r0 instanceof com.avito.android.util.ApiException
            if (r3 == 0) goto L2f
            com.avito.android.util.ApiException r0 = (com.avito.android.util.ApiException) r0
            com.avito.android.remote.error.ApiError r0 = r0.f318522b
            boolean r3 = r0 instanceof com.avito.android.remote.error.ApiError.TooManyRequests
            if (r3 != 0) goto L34
            boolean r0 = r0 instanceof com.avito.android.remote.error.ApiError.Forbidden
            if (r0 == 0) goto L28
            goto L34
        L28:
            java.io.Serializable[] r5 = new java.io.Serializable[r2]
            com.avito.android.printable_text.PrintableText r5 = com.avito.android.printable_text.b.c(r1, r5)
            return r5
        L2f:
            java.lang.Throwable r0 = r0.getCause()
            goto L14
        L34:
            if (r5 == 0) goto L4d
            java.lang.String r5 = com.avito.android.error.z.j(r5)
            r0 = 0
            if (r5 == 0) goto L4b
            boolean r3 = kotlin.text.C43066x.K(r5)
            if (r3 != 0) goto L44
            goto L45
        L44:
            r5 = r0
        L45:
            if (r5 == 0) goto L4b
            com.avito.android.printable_text.PrintableText r0 = com.avito.android.printable_text.b.f(r5)
        L4b:
            if (r0 != 0) goto L53
        L4d:
            java.io.Serializable[] r5 = new java.io.Serializable[r2]
            com.avito.android.printable_text.PrintableText r0 = com.avito.android.printable_text.b.c(r1, r5)
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.k.a(java.lang.Throwable):com.avito.android.printable_text.PrintableText");
    }

    public k(boolean z12, boolean z13) {
        this.f273957a = z12;
        this.f273958b = z13;
    }

    public /* synthetic */ k(boolean z12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
    }
}
