package com.avito.android.serp.adapter.rich_snippets.service;

import Q81.a;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.price_list.PriceList;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertRichServiceItemView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/w;", "Lcom/avito/android/serp/adapter/rich_snippets/service/v;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/serp_advert_card/m;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w extends com.avito.android.serp.c implements v, com.avito.android.serp.adapter.serp_advert_card.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.serp_advert_card.n f271391b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f271392c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View view, AsyncViewportTracker.ViewContext viewContext, com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, RecyclerView.t tVar, boolean z12, com.avito.android.video_snippets.g gVar, int i12, C42822w c42822w) {
        super(view);
        com.avito.android.cyclic_gallery_widget.image_carousel.m mVar2 = (i12 & 4) != 0 ? null : mVar;
        RecyclerView.t tVar2 = (i12 & 8) != 0 ? null : tVar;
        boolean z13 = (i12 & 16) != 0 ? false : z12;
        com.avito.android.video_snippets.g gVar2 = (i12 & 32) != 0 ? null : gVar;
        this.f271391b = new com.avito.android.serp.adapter.serp_advert_card.n(view, z13, mVar2, tVar2, viewContext, gVar2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void Bt(@Y61.k Y41.a<G0> aVar) {
        this.f271391b.Bt(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void C(@Y61.l String str) {
        this.f271391b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f271391b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void E0(@Y61.l String str) {
        this.f271391b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void Fo(@Y61.k Y41.a<G0> aVar) {
        this.f271391b.Fo(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void H0() {
        this.f271391b.H0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void H1(@Y61.l Parcelable parcelable) {
        this.f271391b.H1(parcelable);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        com.avito.android.serp.adapter.serp_advert_card.n nVar = this.f271391b;
        nVar.getClass();
        a.C0890a.a(nVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f271391b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void P5(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f271391b.P5(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void R0(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f271391b.R0(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void RF() {
        this.f271391b.RF();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void S0(@Y61.l String str) {
        this.f271391b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void W2() {
        this.f271391b.W2();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f271391b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar) {
        this.f271391b.a1(rVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void cw(@Y61.k Y41.a<G0> aVar) {
        this.f271391b.cw(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.rich_snippets.service.v
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f271392c = (kotlin.jvm.internal.N) aVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void ee(@Y61.l PriceList priceList) {
        this.f271391b.ee(priceList);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void h(@Y61.l String str) {
        this.f271391b.h(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void h2(@Y61.k List<? extends AdvertAction> list) {
        this.f271391b.h2(list);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list) {
        this.f271391b.i3(list);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void iu(@Y61.k Y41.a<G0> aVar) {
        this.f271391b.iu(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ?? r02 = this.f271392c;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void jb(boolean z12, boolean z13) {
        this.f271391b.jb(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void k4(@Y61.k List<com.avito.android.cyclic_gallery_widget.image_carousel.native_video.b> list) {
        this.f271391b.k4(list);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void kq(@Y61.k String str, @Y61.l com.avito.android.image_loader.a aVar, @Y61.l SerpBadgeBar serpBadgeBar, boolean z12, @Y61.l SellerRating sellerRating) {
        this.f271391b.kq(str, aVar, serpBadgeBar, z12, sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void l5(@Y61.l Y41.a<G0> aVar) {
        this.f271391b.l5(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void q4(@Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        this.f271391b.q4(pVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void q7(boolean z12, boolean z13) {
        this.f271391b.q7(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void sR(@Y61.k Y41.a<G0> aVar) {
        this.f271391b.sR(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void setActive(boolean z12) {
        this.f271391b.setActive(z12);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f271391b.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void setTitle(@Y61.k String str) {
        this.f271391b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void t80(@Y61.l String str, @Y61.l ArrayList arrayList) {
        this.f271391b.t80(str, arrayList);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f271391b.vd(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void w4() {
        this.f271391b.w4();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void y30() {
        this.f271391b.y30();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.m
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f271391b.z3(str, z12, universalColor);
    }
}
