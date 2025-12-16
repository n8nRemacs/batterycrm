package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import Ju.AbstractC14250d;
import com.avito.android.R;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.error.z;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: DeliveryOrderCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "loadingState", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f256110b;

    public c(d dVar) {
        this.f256110b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        d dVar = this.f256110b;
        a.g gVar = dVar.f256114i;
        if (z12) {
            gVar.g(dVar.d(), false);
            dVar.j(AbstractC14250d.c.f9171c);
        } else if (p22 instanceof P2.c) {
            gVar.g(dVar.d(), true);
        } else if (p22 instanceof P2.a) {
            gVar.g(dVar.d(), false);
            dVar.f256113h.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new f(dVar, z.k(((P2.a) p22).f318719a)));
            dVar.j(AbstractC14250d.b.f9170c);
        }
    }
}
