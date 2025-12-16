package com.avito.android.advert_core.pp_recall_promo.close_banners;

import Y61.k;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComfortableDealPromoBannerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/pp_recall_promo/close_banners/c;", "Lcom/avito/android/advert_core/pp_recall_promo/close_banners/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34401z0 f83959a;

    @Inject
    public c(@k InterfaceC34401z0 interfaceC34401z0) {
        this.f83959a = interfaceC34401z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.advert_core.pp_recall_promo.close_banners.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.advert_core.pp_recall_promo.close_banners.b
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.advert_core.pp_recall_promo.close_banners.b r0 = (com.avito.android.advert_core.pp_recall_promo.close_banners.b) r0
            int r1 = r0.f83958s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83958s = r1
            goto L18
        L13:
            com.avito.android.advert_core.pp_recall_promo.close_banners.b r0 = new com.avito.android.advert_core.pp_recall_promo.close_banners.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f83956q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f83958s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Exception -> L29
            goto L55
        L29:
            r5 = move-exception
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            com.avito.android.remote.z0 r8 = r4.f83959a     // Catch: java.lang.Exception -> L29
            r0.f83958s = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r8.c(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L55
            return r1
        L41:
            com.avito.android.util.V2 r6 = com.avito.android.util.V2.f318762a
            java.lang.Throwable r5 = r5.getCause()
            if (r5 != 0) goto L4e
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>()
        L4e:
            java.lang.String r7 = "RemoteCloseBannerInteractor"
            java.lang.String r8 = "Error closing banner"
            r6.a(r7, r8, r5)
        L55:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_core.pp_recall_promo.close_banners.c.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
