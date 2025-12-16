package com.avito.android.str_booking.deeplink;

import android.content.Intent;
import com.avito.android.str_booking.StrBookingActivity;
import com.avito.android.str_core.OpenSellerOrderBookingDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: OpenSellerOrderBookingLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f285440l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OpenSellerOrderBookingDeepLink f285441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, OpenSellerOrderBookingDeepLink openSellerOrderBookingDeepLink) {
        super(0);
        this.f285440l = eVar;
        this.f285441m = openSellerOrderBookingDeepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        StrBookingActivity.a aVar = StrBookingActivity.f285378m;
        e eVar = this.f285440l;
        String str = this.f285441m.f288528b;
        aVar.getClass();
        Intent intent = new Intent(eVar.f285442f, (Class<?>) StrBookingActivity.class);
        intent.putExtra("order_id", str);
        intent.putExtra("screen_type", "SELLER_SCREEN");
        eVar.f285443g.J(intent, C48421d.a(eVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
