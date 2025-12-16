package com.avito.android.profile.deep_linking;

import android.os.Bundle;
import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CloseInternalBannerRotationDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/deep_linking/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/active_orders_common/items/comfortable_deal/deeplink/CloseInternalBannerRotationDeepLink;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.deep_linking.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33310b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<CloseInternalBannerRotationDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f221894g;

    @Inject
    public C33310b(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k R0 r02) {
        super(r02);
        this.f221894g = interfaceC34401z0;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((CloseInternalBannerRotationDeepLink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.profile.deep_linking.C33309a
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.profile.deep_linking.a r0 = (com.avito.android.profile.deep_linking.C33309a) r0
            int r1 = r0.f221893t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221893t = r1
            goto L18
        L13:
            com.avito.android.profile.deep_linking.a r0 = new com.avito.android.profile.deep_linking.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f221891r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f221893t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.profile.deep_linking.b r6 = r0.f221890q
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2b
            goto L4c
        L2b:
            r7 = move-exception
            goto L54
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.C42729a0.b(r7)
            com.avito.android.remote.z0 r7 = r5.f221894g     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r6.f68333b     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r6.f68334c     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.f68335d     // Catch: java.lang.Throwable -> L52
            r0.f221890q = r5     // Catch: java.lang.Throwable -> L52
            r0.f221893t = r3     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r7.c(r2, r4, r6, r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r6 = r5
        L4c:
            Ju.d$c r7 = Ju.AbstractC14250d.c.f9171c     // Catch: java.lang.Throwable -> L2b
            r6.j(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L52:
            r7 = move-exception
            r6 = r5
        L54:
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            r0.f(r7)
            Ju.d$b r7 = Ju.AbstractC14250d.b.f9170c
            r6.j(r7)
        L5e:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.deep_linking.C33310b.o(com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
