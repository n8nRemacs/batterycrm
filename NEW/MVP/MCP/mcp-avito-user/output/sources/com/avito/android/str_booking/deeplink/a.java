package com.avito.android.str_booking.deeplink;

import android.content.Intent;
import com.avito.android.str_booking.StrBookingActivity;
import com.avito.android.str_core.OpenBuyerOrderBookingDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: OpenBuyerOrderBookingLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f285386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OpenBuyerOrderBookingDeepLink f285387m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, OpenBuyerOrderBookingDeepLink openBuyerOrderBookingDeepLink) {
        super(0);
        this.f285386l = bVar;
        this.f285387m = openBuyerOrderBookingDeepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        StrBookingActivity.a aVar = StrBookingActivity.f285378m;
        b bVar = this.f285386l;
        OpenBuyerOrderBookingDeepLink openBuyerOrderBookingDeepLink = this.f285387m;
        String str = openBuyerOrderBookingDeepLink.f288524b;
        aVar.getClass();
        Intent intent = new Intent(bVar.f285388f, (Class<?>) StrBookingActivity.class);
        intent.putExtra("order_id", str);
        intent.putExtra("screen_type", "BUYER_SCREEN");
        intent.putExtra("ux_feedback_event_name", openBuyerOrderBookingDeepLink.f288525c);
        intent.putExtra("start_animation", openBuyerOrderBookingDeepLink.f288526d);
        bVar.f285389g.J(intent, C48421d.a(bVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
