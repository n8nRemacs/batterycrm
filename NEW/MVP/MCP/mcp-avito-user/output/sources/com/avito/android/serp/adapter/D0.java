package com.avito.android.serp.adapter;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.From;
import com.avito.android.lib.deprecated_design.badge_bar.CompactFlexibleLayout;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: SerpAdvertListWithExtraInfoView.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/D0;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/C0;", "Lcom/avito/android/serp/adapter/E;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D0 extends com.avito.android.serp.c implements C0, E {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f268494b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TextView f268495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f268496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final CompactFlexibleLayout f268497e;

    public D0(@Y61.k View view, @Y61.k F f12) {
        super(view);
        this.f268494b = f12;
        this.f268495c = (TextView) view.findViewById(R.id.extra_info);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f268496d = (SimpleDraweeView) viewFindViewById;
        this.f268497e = (CompactFlexibleLayout) view.findViewById(R.id.badge_bar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B1(long j12) {
        this.f268494b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B3(@Y61.k com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.k From from) {
        this.f268494b.B3(aVar, null, from);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f268494b.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void C(@Y61.l String str) {
        this.f268494b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void C9(@Y61.k String str) {
        this.f268494b.C9(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void Cd(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12) {
        this.f268494b.Cd(str, discountIcon, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f268494b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void E0(@Y61.l String str) {
        this.f268494b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.C0
    public final void EZ(@Y61.l AttributedText attributedText) {
        TextView textView = this.f268495c;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
        CompactFlexibleLayout compactFlexibleLayout = this.f268497e;
        if (compactFlexibleLayout == null || !D6.y(compactFlexibleLayout)) {
            if (textView != null) {
                D6.c(textView, null, 4, null, null, 13);
            }
        } else if (textView != null) {
            D6.c(textView, null, 0, null, null, 13);
        }
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void F0(@Y61.l Y41.a<kotlin.G0> aVar) {
        this.f268494b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void H2(@Y61.l Y41.a<kotlin.G0> aVar) {
        this.f268494b.H2(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void M1(@Y61.l String str) {
        this.f268494b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f268494b.f268499b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void O5(boolean z12, boolean z13) {
        this.f268494b.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void Q0(@Y61.l DeliveryTerms deliveryTerms) {
        this.f268494b.Q0(deliveryTerms);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void S0(@Y61.l String str) {
        this.f268494b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void V(@Y61.l String str) {
        this.f268494b.V(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void X3(@Y61.l String str) {
        this.f268494b.X3(str);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, kotlin.G0> qVar) {
        this.f268494b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void ai(@Y61.l String str) {
        this.f268494b.ai(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void b2(@Y61.l String str) {
        this.f268494b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void c(@Y61.l Y41.a<kotlin.G0> aVar) {
        this.f268494b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void d1(boolean z12) {
        this.f268494b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f268494b.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void e1(@Y61.k Badge badge) {
        this.f268494b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void ew(boolean z12) {
        this.f268494b.ew(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void f1(@Y61.l String str) {
        this.f268494b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void i1(@Y61.l String str) {
        this.f268494b.i1(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f268494b.getClass();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void l3(@Y61.l String str) {
        this.f268494b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o1(boolean z12) {
        this.f268494b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o2(@Y61.l String str) {
        this.f268494b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void o3(@Y61.l String str) {
        this.f268494b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setActive(boolean z12) {
        this.f268494b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setFavorite(boolean z12) {
        this.f268494b.setFavorite(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setTitle(@Y61.k String str) {
        this.f268494b.setTitle(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void setViewed(boolean z12) {
        this.f268494b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void vd(@Y61.l ru.avito.component.snippet_badge_bar.d dVar) {
        this.f268494b.vd(dVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void w0() {
        this.f268494b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void w1(boolean z12) {
        this.f268494b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z0(boolean z12) {
        this.f268494b.z0(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.InterfaceC34846e
    public final void z3(@Y61.l String str, boolean z12, @Y61.l UniversalColor universalColor) {
        this.f268494b.z3(str, z12, universalColor);
    }
}
