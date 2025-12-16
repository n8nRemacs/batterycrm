package com.avito.android.serp.adapter.advert_xl;

import Q81.a;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.price_list.PriceList;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertXlItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/y;", "Lcom/avito/android/serp/adapter/advert_xl/x;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/serp_advert_card/E;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y extends com.avito.android.serp.c implements x, com.avito.android.serp.adapter.serp_advert_card.E {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.serp_advert_card.F f268895b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f268896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@Y61.k View view, @Y61.l com.avito.android.video_snippets.g gVar) {
        super(view);
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430414d;
        this.f268895b = new com.avito.android.serp.adapter.serp_advert_card.F(view, viewContext, gVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void C(@Y61.l String str) {
        this.f268895b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f268895b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f268895b.D1(aVar, aVar2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void E0(@Y61.l String str) {
        this.f268895b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void F0(@Y61.l Y41.a<G0> aVar) {
        this.f268895b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void F30(@Y61.k ArrayList arrayList) {
        this.f268895b.F30(arrayList);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        com.avito.android.serp.adapter.serp_advert_card.F f12 = this.f268895b;
        f12.getClass();
        a.C0890a.a(f12, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void M1(@Y61.l String str) {
        this.f268895b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void N5(@Y61.l SellerRating sellerRating) {
        this.f268895b.N5(sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f268895b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void O70(int i12, int i13) {
        this.f268895b.O70(i12, i13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        this.f268895b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Q3(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f268895b.Q3(pVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f268895b.R0(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void S0(@Y61.l String str) {
        this.f268895b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Sc(@Y61.l String str) {
        this.f268895b.Sc(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void Tu(int i12) {
        this.f268895b.Tu(i12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void V(@Y61.l String str) {
        this.f268895b.V(str);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f268895b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f268895b.a1(rVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void b0(@Y61.l String str) {
        this.f268895b.b0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void c(@Y61.l Y41.a<G0> aVar) {
        this.f268895b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.advert_xl.x
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f268896c = aVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void d1(boolean z12) {
        this.f268895b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f268895b.d4(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void e1(@Y61.k Badge badge) {
        this.f268895b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void ee(@Y61.l PriceList priceList) {
        this.f268895b.ee(priceList);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void f1(@Y61.l String str) {
        this.f268895b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void h(@Y61.l String str) {
        this.f268895b.h(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void i1(@Y61.l String str) {
        this.f268895b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void i3(@Y61.k List<? extends Q<? extends com.avito.android.image_loader.k, Boolean>> list) {
        this.f268895b.i3(list);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f268896c;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f268895b.f271807S.e();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void k1(@Y61.l String str) {
        this.f268895b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void m1(@Y61.l String str) {
        this.f268895b.m1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void o1(boolean z12) {
        this.f268895b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void oC(@Y61.l Y41.a<G0> aVar) {
        this.f268895b.oC(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void sa(@Y61.l String str, boolean z12) {
        this.f268895b.sa(str, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setActive(boolean z12) {
        this.f268895b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setFavorite(boolean z12) {
        this.f268895b.setFavorite(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f268895b.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setTitle(@Y61.k String str) {
        this.f268895b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void setViewed(boolean z12) {
        this.f268895b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void so(@Y61.l String str, @Y61.l DiscountIcon discountIcon) {
        this.f268895b.so(str, discountIcon);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void vb(@Y61.l String str) {
        this.f268895b.vb(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void w0() {
        this.f268895b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void w1(boolean z12) {
        this.f268895b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void w4() {
        this.f268895b.w4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void x7(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f268895b.f271808T.f17470g = (N) lVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void z0(boolean z12) {
        this.f268895b.z0(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.E
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f268895b.z3(str, z12, universalColor);
    }
}
