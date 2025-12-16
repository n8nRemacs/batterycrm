package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: AdvertDetailsHotelOfferPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.AdvertDetailsHotelOfferPresenterImpl$observeOnDeeplinkResult$2", f = "AdvertDetailsHotelOfferPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class k extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f76132q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f76133r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f76133r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f76133r, continuation);
        kVar.f76132q = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((k) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f76132q
            kv.a r11 = (kv.C43501a) r11
            com.avito.android.deeplink_handler.handler.bundle.a r0 = r11.f413260a
            android.os.Bundle r0 = r0.f134522c
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r2 = "should_refresh_offers_key"
            boolean r0 = r0.getBoolean(r2)
            r2 = 1
            if (r0 != r2) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            Ju.c r11 = r11.f413261b
            boolean r0 = r11 instanceof com.avito.android.deep_linking.links.CalendarLink.b.C3988b
            com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.h r9 = r10.f76133r
            if (r0 == 0) goto L47
            java.text.SimpleDateFormat r0 = r9.f76104k
            com.avito.android.deep_linking.links.CalendarLink$b$b r11 = (com.avito.android.deep_linking.links.CalendarLink.b.C3988b) r11
            java.util.Date r1 = r11.f133080b
            java.lang.String r6 = r0.format(r1)
            java.text.SimpleDateFormat r0 = r9.f76104k
            java.util.Date r11 = r11.f133081c
            java.lang.String r7 = r0.format(r11)
            r4 = 0
            r5 = 0
            r8 = 3
            r3 = r9
            com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.h.g0(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L9e
            com.avito.android.hotel.model.HotelOfferRequestParams r11 = r9.k()
            r9.V(r11)
            goto L9e
        L47:
            boolean r0 = r11 instanceof com.avito.android.guests_selector.b.C4726b
            if (r0 == 0) goto La1
            com.avito.android.guests_selector.b$b r11 = (com.avito.android.guests_selector.b.C4726b) r11
            com.avito.android.guests_selector.io.GuestsSelectorOutput r0 = r11.f161391b
            int r0 = r0.f161448b
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            com.avito.android.guests_selector.io.GuestsSelectorOutput r11 = r11.f161391b
            java.util.List<com.avito.android.guests_selector.io.GuestsSelectorChildOutput> r11 = r11.f161449c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C42745f0.q(r11, r0)
            r5.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L6a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r11.next()
            com.avito.android.guests_selector.io.GuestsSelectorChildOutput r0 = (com.avito.android.guests_selector.io.GuestsSelectorChildOutput) r0
            java.lang.String r0 = r0.f161446b
            java.lang.Integer r0 = kotlin.text.C43066x.y0(r0)
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            goto L84
        L83:
            r0 = r1
        L84:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r5.add(r0)
            goto L6a
        L8c:
            r6 = 0
            r7 = 0
            com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.h r3 = r10.f76133r
            r8 = 12
            com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.h.g0(r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L9e
            com.avito.android.hotel.model.HotelOfferRequestParams r11 = r9.k()
            r9.V(r11)
        L9e:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        La1:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
