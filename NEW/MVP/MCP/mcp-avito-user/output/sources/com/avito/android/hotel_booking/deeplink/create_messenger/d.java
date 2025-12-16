package com.avito.android.hotel_booking.deeplink.create_messenger;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.hotel_booking.HotelCreateMessengerDeeplink;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;

/* compiled from: HotelCreateMessengerDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/create_messenger/d;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/hotel_booking/HotelCreateMessengerDeeplink;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends com.avito.android.deeplink_handler.handler.base.coroutines.a<HotelCreateMessengerDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ZI.a f163291g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f163292h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f163293i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC35741a1 f163294j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f163295k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final R0 f163296l;

    @Inject
    public d(@k ZI.a aVar, @k a.g gVar, @k a.i iVar, @k InterfaceC35741a1 interfaceC35741a1, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k R0 r02) {
        super(r02);
        this.f163291g = aVar;
        this.f163292h = gVar;
        this.f163293i = iVar;
        this.f163294j = interfaceC35741a1;
        this.f163295k = aVar2;
        this.f163296l = r02;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final /* bridge */ /* synthetic */ Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        return o((HotelCreateMessengerDeeplink) deepLink, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(@Y61.k com.avito.android.hotel_booking.HotelCreateMessengerDeeplink r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.avito.android.hotel_booking.deeplink.create_messenger.a
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.android.hotel_booking.deeplink.create_messenger.a r2 = (com.avito.android.hotel_booking.deeplink.create_messenger.a) r2
            int r3 = r2.f163286t
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f163286t = r3
            goto L1c
        L17:
            com.avito.android.hotel_booking.deeplink.create_messenger.a r2 = new com.avito.android.hotel_booking.deeplink.create_messenger.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f163284r
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f163286t
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L38
            if (r4 != r6) goto L30
            com.avito.android.hotel_booking.deeplink.create_messenger.d r2 = r2.f163283q
            kotlin.C42729a0.b(r1)
            goto L59
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.C42729a0.b(r1)
            com.avito.android.deeplink_handler.view.a$g r1 = r0.f163292h
            r1.g(r5, r6)
            com.avito.android.util.R0 r1 = r0.f163296l
            kotlinx.coroutines.scheduling.b r1 = r1.a()
            com.avito.android.hotel_booking.deeplink.create_messenger.b r4 = new com.avito.android.hotel_booking.deeplink.create_messenger.b
            r7 = r18
            r4.<init>(r0, r7, r5)
            r2.f163283q = r0
            r2.f163286t = r6
            java.lang.Object r1 = kotlinx.coroutines.C43259k.g(r1, r4, r2)
            if (r1 != r3) goto L58
            return r3
        L58:
            r2 = r0
        L59:
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            boolean r3 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r3 == 0) goto L77
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            dJ.a r1 = (dJ.C39588a) r1
            com.avito.android.hotel_booking.HotelCreateMessengerDeeplink$b$b r3 = com.avito.android.hotel_booking.HotelCreateMessengerDeeplink.b.C4777b.f163266b
            com.avito.android.deeplink_handler.handler.composite.a r4 = r2.f163295k
            com.avito.android.deep_linking.links.DeepLink r1 = r1.getRedirect()
            com.avito.android.deep_linking.links.DeepLink[] r1 = new com.avito.android.deep_linking.links.DeepLink[]{r1}
            r2.i(r3, r4, r1)
            goto Lae
        L77:
            boolean r3 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto Lb7
            com.avito.android.remote.model.TypedResult$Error r1 = (com.avito.android.remote.model.TypedResult.Error) r1
            com.avito.android.remote.error.ApiError r3 = r1.getError()
            java.lang.Throwable r1 = r1.getCause()
            com.avito.android.util.ApiException r1 = com.avito.android.util.C35936s.a(r3, r1)
            com.avito.android.util.a1 r3 = r2.f163294j
            com.avito.android.hotel_booking.deeplink.create_messenger.c r4 = com.avito.android.hotel_booking.deeplink.create_messenger.c.f163290l
            r6 = 2
            com.avito.android.printable_text.PrintableText r8 = com.avito.android.util.InterfaceC35741a1.a.a(r3, r1, r5, r4, r6)
            com.avito.android.component.toast.f$c$a r1 = com.avito.android.component.toast.f.c.f125255c
            r1.getClass()
            com.avito.android.component.toast.f$c r11 = com.avito.android.component.toast.f.c.a.b()
            com.avito.android.lib.design.toast_bar.ToastBarPosition r13 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181046d
            r14 = 0
            r15 = 0
            com.avito.android.deeplink_handler.view.a$i r7 = r2.f163293i
            r9 = 0
            r10 = 0
            r12 = 0
            r16 = 1966(0x7ae, float:2.755E-42)
            com.avito.android.deeplink_handler.view.a.i.C4057a.d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.avito.android.hotel_booking.HotelCreateMessengerDeeplink$b$a r1 = com.avito.android.hotel_booking.HotelCreateMessengerDeeplink.b.a.f163265b
            r2.j(r1)
        Lae:
            com.avito.android.deeplink_handler.view.a$g r1 = r2.f163292h
            r2 = 0
            r1.g(r5, r2)
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        Lb7:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.deeplink.create_messenger.d.o(com.avito.android.hotel_booking.HotelCreateMessengerDeeplink, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
