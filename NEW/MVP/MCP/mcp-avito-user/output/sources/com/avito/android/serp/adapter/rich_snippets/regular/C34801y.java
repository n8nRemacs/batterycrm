package com.avito.android.serp.adapter.rich_snippets.regular;

import Q81.a;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.TravelInstallments;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.hotel.HotelRating;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h;
import com.avito.android.util.D6;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.PhoneLoadingState;
import ru.avito.component.serp.rating_and_reviews.RatingAndReviews;

/* compiled from: AdvertRichItemView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/y;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/x;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/serp_advert_card/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34801y extends com.avito.android.serp.c implements InterfaceC34800x, InterfaceC34849h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.serp_advert_card.j f271237b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f271238c;

    public C34801y(@Y61.k View view, @Y61.k RecyclerView.t tVar, @Y61.k com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, @Y61.k SellerInfoParams sellerInfoParams, @Y61.k com.avito.android.pinch_to_zoom.b bVar, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        super(view);
        this.f271237b = new com.avito.android.serp.adapter.serp_advert_card.j(view, tVar, mVar, sellerInfoParams, bVar, gVar, viewContext);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Bb(@Y61.l com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.b bVar) {
        this.f271237b.Bb(bVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void C(@Y61.l String str) {
        this.f271237b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f271237b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void E0(@Y61.l String str) {
        this.f271237b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H0() {
        this.f271237b.H0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H1(@Y61.l Parcelable parcelable) {
        this.f271237b.H1(parcelable);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H2(@Y61.l Y41.a<G0> aVar) {
        this.f271237b.H2(aVar);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        com.avito.android.serp.adapter.serp_advert_card.j jVar = this.f271237b;
        jVar.getClass();
        a.C0890a.a(jVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Ls(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f271237b.Ls(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void N30(@Y61.l String str, boolean z12) {
        this.f271237b.N30(str, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f271237b.O(kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void P1(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f271237b.f272028u0.f132081p = (kotlin.jvm.internal.N) lVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void P5(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f271237b.P5(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        this.f271237b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f271237b.R0(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Ro(@Y61.l TravelInstallments travelInstallments) {
        this.f271237b.Ro(travelInstallments);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Sc(@Y61.l String str) {
        this.f271237b.Sc(str);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34800x
    public final void Ty() throws Resources.NotFoundException {
        com.avito.android.serp.adapter.serp_advert_card.j jVar = this.f271237b;
        Resources resources = jVar.f272030v0;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mini_rich_snippet_horizontal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mini_rich_snippet_info_badge_horizontal_offset);
        D6.f(jVar.f272028u0.f132066a, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        LinearLayout linearLayout = jVar.f271997f;
        if (linearLayout != null) {
            D6.f(linearLayout, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        }
        D6.c(jVar.f271999g, Integer.valueOf(dimensionPixelSize2), null, null, null, 14);
        D6.c(jVar.f272001h, Integer.valueOf(dimensionPixelSize2), null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void U40() {
        this.f271237b.U40();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void UN(@Y61.l RealtorBonus realtorBonus) {
        this.f271237b.UN(realtorBonus);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void V(@Y61.l String str) {
        this.f271237b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void VH(@Y61.l Action action, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f271237b.VH(action, lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void W2() {
        this.f271237b.W2();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f271237b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Zr(@Y61.l String str, @Y61.l String str2) {
        this.f271237b.Zr(str, str2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f271237b.a1(rVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void aY(@Y61.l CharSequence charSequence) {
        this.f271237b.aY(charSequence);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void b0(@Y61.l String str) {
        this.f271237b.b0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void b00(@Y61.l String str) {
        this.f271237b.b00(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34800x
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f271238c = (kotlin.jvm.internal.N) aVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void d1(boolean z12) {
        this.f271237b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f271237b.d4(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void dC(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor, boolean z13, boolean z14) {
        this.f271237b.dC(str, z12, universalColor, z13, z14);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void dv(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f271237b.dv(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void e1(@Y61.k Badge badge) {
        this.f271237b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void f1(@Y61.l String str) {
        this.f271237b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void fY(@Y61.l RatingAndReviews ratingAndReviews) {
        this.f271237b.fY(ratingAndReviews);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void fr(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12, boolean z13) {
        this.f271237b.fr(str, discountIcon, z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void gs(@Y61.l String str, boolean z12) {
        this.f271237b.gs(str, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void h(@Y61.l String str) {
        this.f271237b.h(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list) {
        this.f271237b.i3(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ?? r02 = this.f271238c;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void k1(@Y61.l String str) {
        this.f271237b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    @Y61.l
    public final Parcelable k2() {
        return this.f271237b.f272028u0.c();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list) {
        this.f271237b.k4(list);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void ki(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f271237b.ki(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void l5(@Y61.l Y41.a<G0> aVar) {
        this.f271237b.l5(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void mB(boolean z12, boolean z13, boolean z14) {
        this.f271237b.mB(z12, z13, z14);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void nd(boolean z12, boolean z13) {
        this.f271237b.nd(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void nv(boolean z12) {
        this.f271237b.nv(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void o1(boolean z12) {
        this.f271237b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void o2(@Y61.l String str) {
        this.f271237b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void oH(@Y61.l HotelRating hotelRating) {
        this.f271237b.oH(hotelRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void p7(@Y61.l z80.e eVar) {
        this.f271237b.f271965D0 = eVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f271237b.q4(pVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void q7(boolean z12, boolean z13) {
        this.f271237b.q7(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void rG(@Y61.l String str, boolean z12) {
        this.f271237b.rG(str, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void rJ(@Y61.l String str) {
        this.f271237b.rJ(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void sa(@Y61.l String str, boolean z12) {
        this.f271237b.sa(str, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void setFavorite(boolean z12) {
        this.f271237b.setFavorite(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f271237b.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void setTitle(@Y61.k String str) {
        this.f271237b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void v5(boolean z12) {
        this.f271237b.f272028u0.f132082q = z12;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void vE(@Y61.l BuyerBonuses buyerBonuses) {
        this.f271237b.vE(buyerBonuses);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void vb(@Y61.l String str) {
        this.f271237b.vb(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w0() {
        this.f271237b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w1(boolean z12) {
        this.f271237b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w4() {
        this.f271237b.w4();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void wL(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f271237b.wL(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void wd(@Y61.k Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set) {
        this.f271237b.wd(set);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void z0(boolean z12) {
        this.f271237b.z0(z12);
    }

    public /* synthetic */ C34801y(View view, com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, RecyclerView.t tVar, SellerInfoParams sellerInfoParams, AsyncViewportTracker.ViewContext viewContext, com.avito.android.pinch_to_zoom.b bVar, com.avito.android.video_snippets.g gVar, int i12, C42822w c42822w) {
        this(view, tVar, mVar, sellerInfoParams, bVar, (i12 & 64) != 0 ? null : gVar, viewContext);
    }
}
