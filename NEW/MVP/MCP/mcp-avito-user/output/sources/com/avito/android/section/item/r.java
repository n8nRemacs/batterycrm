package com.avito.android.section.item;

import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.image_loader.From;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.serp.adapter.E;
import com.avito.android.serp.adapter.F;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: SectionAdvertItemView.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/item/r;", "Lcom/avito/android/section/item/q;", "Lcom/avito/android/serp/adapter/E;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends com.avito.konveyor.adapter.b implements q, E {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f264756b;

    public r(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        super(view);
        this.f264756b = new F(view, aVar, hVar, locale, viewContext);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B1(long j12) {
        this.f264756b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from) {
        this.f264756b.B3(aVar, null, from);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f264756b.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void C(@Y61.l String str) {
        this.f264756b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void C9(@Y61.k String str) {
        this.f264756b.C9(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void Cd(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        this.f264756b.Cd(str, discountIcon, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f264756b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void E0(@Y61.l String str) {
        this.f264756b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void F0(@Y61.l Y41.a<G0> aVar) {
        this.f264756b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void H2(@Y61.l Y41.a<G0> aVar) {
        this.f264756b.H2(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void M1(@Y61.l String str) {
        this.f264756b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f264756b.f268499b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void O5(boolean z12, boolean z13) {
        this.f264756b.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        this.f264756b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void S0(@Y61.l String str) {
        this.f264756b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void V(@Y61.l String str) {
        this.f264756b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void X3(@Y61.l String str) {
        this.f264756b.X3(str);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        this.f264756b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void ai(@Y61.l String str) {
        this.f264756b.ai(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void b2(@Y61.l String str) {
        this.f264756b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void c(@Y61.l Y41.a<G0> aVar) {
        this.f264756b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void d1(boolean z12) {
        this.f264756b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f264756b.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void e1(@Y61.k Badge badge) {
        this.f264756b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void ew(boolean z12) {
        this.f264756b.ew(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void f1(@Y61.l String str) {
        this.f264756b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void f5(int i12) {
        this.f264756b.f5(i12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void i1(@Y61.l String str) {
        this.f264756b.i1(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f264756b.getClass();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void k60(@Y61.l String str, @Y61.l RadiusInfo radiusInfo) {
        this.f264756b.k60(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void l3(@Y61.l String str) {
        this.f264756b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o1(boolean z12) {
        this.f264756b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o2(@Y61.l String str) {
        this.f264756b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o3(@Y61.l String str) {
        this.f264756b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setActive(boolean z12) {
        this.f264756b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setFavorite(boolean z12) {
        this.f264756b.setFavorite(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setTitle(@Y61.k String str) {
        this.f264756b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setViewed(boolean z12) {
        this.f264756b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f264756b.vd(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void w0() {
        this.f264756b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void w1(boolean z12) {
        this.f264756b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z0(boolean z12) {
        this.f264756b.z0(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f264756b.z3(str, z12, universalColor);
    }
}
