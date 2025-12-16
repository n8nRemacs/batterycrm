package com.avito.android.travel_seller_banners;

import Y61.k;
import com.avito.android.travel_seller_banners.models.PageForBanner;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yF0.InterfaceC50108b;
import zF0.InterfaceC50455a;

/* compiled from: TravelSellerBannersInteractorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_seller_banners/b;", "LyF0/b;", "_avito_travel-seller-banners_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements InterfaceC50108b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f303289a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC50455a f303290b;

    /* compiled from: TravelSellerBannersInteractorImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PageForBanner.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PageForBanner pageForBanner = PageForBanner.f303306b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public b(@k R0 r02, @k InterfaceC50455a interfaceC50455a) {
        this.f303289a = r02;
        this.f303290b = interfaceC50455a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yF0.InterfaceC50108b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.travel_seller_banners.models.PageForBanner r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.travel_seller_banners.c
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.travel_seller_banners.c r0 = (com.avito.android.travel_seller_banners.c) r0
            int r1 = r0.f303293s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303293s = r1
            goto L18
        L13:
            com.avito.android.travel_seller_banners.c r0 = new com.avito.android.travel_seller_banners.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f303291q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f303293s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L45
            if (r5 != r3) goto L3f
            com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get.Page r5 = com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get.Page.SellerOrdersCalendar
            goto L47
        L3f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L45:
            com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get.Page r5 = com.avito.android.travel_seller_banners.generated.api.api_1_str_seller_banners_get.Page.SellerOrdersList
        L47:
            r0.f303293s = r3
            zF0.a r6 = r4.f303290b
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L6a
            com.avito.android.travel_seller_banners.i r5 = com.avito.android.travel_seller_banners.i.f303305a
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            AF0.a r6 = (AF0.a) r6
            r5.getClass()
            BF0.a r5 = com.avito.android.travel_seller_banners.i.a(r6)
            goto L7c
        L6a:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L7d
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            java.lang.Throwable r5 = r6.getCause()
            if (r5 == 0) goto L7b
            com.avito.android.util.V2 r6 = com.avito.android.util.V2.f318762a
            r6.f(r5)
        L7b:
            r5 = 0
        L7c:
            return r5
        L7d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_seller_banners.b.a(com.avito.android.travel_seller_banners.models.PageForBanner, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // yF0.InterfaceC50108b
    @k
    public final InterfaceC43160i b() {
        PageForBanner pageForBanner = PageForBanner.f303306b;
        return C43175k.I(this.f303289a.a(), new C43152f0(C43175k.n(new C43137a0(new e(2, null), C43175k.G(new d(this, null))), 300L), new f(3, null)));
    }
}
