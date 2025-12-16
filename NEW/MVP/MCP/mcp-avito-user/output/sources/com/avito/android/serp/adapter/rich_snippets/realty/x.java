package com.avito.android.serp.adapter.rich_snippets.realty;

import Q81.a;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: DevelopmentRichItemView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/x;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/w;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/serp_advert_card/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x extends com.avito.android.serp.c implements InterfaceC34777w, InterfaceC34849h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.serp_advert_card.j f271015b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f271016c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f271017d;

    public x(@Y61.k View view, @Y61.k com.avito.android.cyclic_gallery_widget.image_carousel.m mVar, @Y61.k RecyclerView.t tVar, @Y61.k SellerInfoParams sellerInfoParams, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        super(view);
        this.f271015b = new com.avito.android.serp.adapter.serp_advert_card.j(view, mVar, tVar, sellerInfoParams, viewContext, null, bVar, 32, null);
        View viewFindViewById = view.findViewById(R.id.metro);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f271016c = (LinearLayout) viewFindViewById;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void FR(@Y61.l Y41.l lVar, @Y61.l DeveloperProfile developerProfile) {
        this.f271015b.FR(lVar, developerProfile);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H0() {
        this.f271015b.H0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void H1(@Y61.l Parcelable parcelable) {
        this.f271015b.H1(parcelable);
    }

    @Override // Q81.a
    public final void Ii(boolean z12) {
        com.avito.android.serp.adapter.serp_advert_card.j jVar = this.f271015b;
        jVar.getClass();
        a.C0890a.a(jVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void Ls(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f271015b.Ls(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void N30(@Y61.l String str, boolean z12) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void P1(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f271015b.f272028u0.f132081p = (kotlin.jvm.internal.N) lVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void P5(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f271015b.P5(lVar);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.realty.InterfaceC34777w
    public final void Q5(@Y61.l GeoReference geoReference) {
        LinearLayout linearLayout = this.f271016c;
        linearLayout.removeAllViews();
        if (geoReference == null) {
            return;
        }
        new os0.e(linearLayout, false, 2, null).b(geoReference);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void U40() {
        this.f271015b.U40();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void W2() {
        this.f271015b.W2();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f271015b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void aY(@Y61.l CharSequence charSequence) {
        this.f271015b.aY(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.rich_snippets.realty.InterfaceC34777w
    public final void d(@Y61.l Y41.a<G0> aVar) {
        this.f271017d = (kotlin.jvm.internal.N) aVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void d4(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f271015b.d4(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void dC(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor, boolean z13, boolean z14) {
        this.f271015b.dC(str, z12, universalColor, false, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void dv(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f271015b.dv(lVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void fr(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12, boolean z13) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void i3(@Y61.k List<? extends com.avito.android.image_loader.k> list) {
        this.f271015b.i3(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        ?? r02 = this.f271017d;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    @Y61.l
    public final Parcelable k2() {
        return this.f271015b.f272028u0.c();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void l5(@Y61.l Y41.a<G0> aVar) {
        this.f271015b.l5(null);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void mB(boolean z12, boolean z13, boolean z14) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void nd(boolean z12, boolean z13) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.realty.InterfaceC34777w
    public final void p(@Y61.l String str) {
        dC(str, false, null, false, false);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void p7(@Y61.l z80.e eVar) {
        this.f271015b.f271965D0 = eVar;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void q7(boolean z12, boolean z13) {
        throw null;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void rG(@Y61.l String str, boolean z12) {
        this.f271015b.rG(str, false);
    }

    @Override // Q81.a
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f271015b.setPhoneLoadingState(phoneLoadingState);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void setTitle(@Y61.k String str) {
        this.f271015b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void vb(@Y61.l String str) {
        this.f271015b.vb(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void w4() {
        this.f271015b.w4();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34849h
    public final void wd(@Y61.k Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> set) {
        this.f271015b.wd(set);
    }
}
