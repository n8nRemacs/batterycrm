package com.avito.android.str_seller_orders.strsellerorders.mvi.items.banner;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48065c;
import yz0.InterfaceC50328b;

/* compiled from: BannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/banner/e;", "LTV0/d;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/banner/g;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/banner/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC50328b, G0> f289938b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC50328b, G0> lVar) {
        this.f289938b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        View view = gVar.itemView;
        view.setBackgroundTintList(C48065c.a(view.getContext(), aVar2.f289930e, g.f289940e));
        TextView textView = gVar.f289941b;
        textView.setText(aVar2.f289927b.k0(textView.getContext()));
        j.a(gVar.f289942c, aVar2.f289928c, null);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(aVar2.f289929d, com.avito.android.lib.util.darkTheme.c.b(gVar.itemView.getContext()));
        if (imageDependsOnTheme != null) {
            com.avito.android.advert.item.delivery_suggests.l.w(imageDependsOnTheme, new ImageRequest.a(new DM.a(gVar.f289943d)));
        }
        gVar.itemView.setOnClickListener(new h(16, new d(this, aVar2)));
    }
}
