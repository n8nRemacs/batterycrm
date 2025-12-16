package com.avito.android.serp.adapter;

import android.net.Uri;
import android.view.View;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.C34844c;
import com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: RdsAdvertItemView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/u0;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/t0;", "Lcom/avito/android/serp/adapter/serp_advert_card/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34862u0 extends com.avito.android.serp.c implements InterfaceC34860t0, InterfaceC34842a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34844c f272510b;

    public C34862u0(@Y61.k View view, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        super(view);
        this.f272510b = new C34844c(view, aVar, hVar, locale, viewContext);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void B1(long j12) {
        this.f272510b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void C(@Y61.l String str) {
        this.f272510b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f272510b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void E0(@Y61.l String str) {
        this.f272510b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void F0(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f272510b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void M1(@Y61.l String str) {
        this.f272510b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void Ny(@Y61.k List list) {
        this.f272510b.Ny(list);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f272510b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void Ol(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        this.f272510b.Ol(str, discountIcon, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void PT(boolean z12) {
        this.f272510b.PT(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        this.f272510b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void S0(@Y61.l String str) {
        this.f272510b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void V(@Y61.l String str) {
        this.f272510b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void V8(@Y61.l List<SerpBadge> list) {
        this.f272510b.V8(list);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, kotlin.G0> qVar) {
        this.f272510b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void b2(@Y61.l String str) {
        this.f272510b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void c(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f272510b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void d1(boolean z12) {
        this.f272510b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void e1(@Y61.k Badge badge) {
        this.f272510b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void f1(@Y61.l String str) {
        this.f272510b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void i1(@Y61.l String str) {
        this.f272510b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void k1(@Y61.l String str) {
        this.f272510b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void k10(@Y61.l String str, boolean z12) {
        this.f272510b.k10(str, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void l3(@Y61.l String str) {
        this.f272510b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void o3(@Y61.l String str) {
        this.f272510b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void q50(@Y61.l AttributedText attributedText) {
        this.f272510b.q50(attributedText);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setActive(boolean z12) {
        this.f272510b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setFavorite(boolean z12) {
        this.f272510b.setFavorite(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setTitle(@Y61.k String str) {
        this.f272510b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void setViewed(boolean z12) {
        this.f272510b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void w0() {
        this.f272510b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34842a
    public final void z0(boolean z12) {
        this.f272510b.z0(z12);
    }
}
