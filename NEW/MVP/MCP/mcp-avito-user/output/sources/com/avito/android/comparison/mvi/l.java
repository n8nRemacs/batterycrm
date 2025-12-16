package com.avito.android.comparison.mvi;

import Rq.InterfaceC15071a;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ComparisonActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LRq/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comparison.mvi.ComparisonActor$process$9", f = "ComparisonActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Rq.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15071a f124139q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f124140r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC15071a interfaceC15071a, m mVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f124139q = interfaceC15071a;
        this.f124140r = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f124139q, this.f124140r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Rq.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC15071a.f fVar = (InterfaceC15071a.f) this.f124139q;
        com.avito.android.comparison.items.header_item.b bVar = fVar.f14666a;
        String str = bVar.f123952d;
        DeepLink deepLink = bVar.f123956h;
        AdvertDetailsLink advertDetailsLink = deepLink instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLink : null;
        String str2 = advertDetailsLink != null ? advertDetailsLink.f132948c : null;
        DeepLink deepLink2 = fVar.f14667b;
        boolean z12 = deepLink2 instanceof PhoneRequestLink;
        m mVar = this.f124140r;
        if (!z12 || str2 == null) {
            b.a.a(mVar.f124145e, deepLink2, null, null, 6);
        } else {
            PhoneRequestDeepLinkAnalyticsData.Comparison comparison = new PhoneRequestDeepLinkAnalyticsData.Comparison(str, str2, "co", null, 8, null);
            mVar.f124146f.b(str);
            b.a.a(mVar.f124145e, fVar.f14667b, null, PhoneRequestDeepLinkAnalyticsData.a.a(PhoneRequestDeepLinkAnalyticsData.f92253b, comparison), 2);
        }
        return G0.f406611a;
    }
}
