package com.avito.android.serp.adapter;

import android.net.Uri;
import android.view.View;
import com.avito.android.remote.model.BuyWithDeliveryButton;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.adapter.serp_advert_card.ShownItemsAbTestGroup;
import j.InterfaceC42161q;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.component.serp.AsyncViewportTracker;
import ru.avito.component.serp.DeliveryTerms;

/* compiled from: AdvertGridItemView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/f;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/e;", "Lcom/avito/android/serp/adapter/serp_advert_card/w;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C34731f extends com.avito.android.serp.c implements InterfaceC34729e, com.avito.android.serp.adapter.serp_advert_card.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.serp_advert_card.B f269948b;

    public C34731f(@Y61.k View view, @Y61.k com.avito.android.server_time.h hVar, @Y61.k Locale locale, @Y61.k AsyncViewportTracker.ViewContext viewContext, @Y61.l com.avito.android.video_snippets.g gVar, @InterfaceC42161q @Y61.l Integer num) {
        super(view);
        this.f269948b = new com.avito.android.serp.adapter.serp_advert_card.B(view, hVar, locale, viewContext, gVar, num);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void B1(long j12) {
        this.f269948b.B1(j12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void B5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f269948b.B5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void C(@Y61.l String str) {
        this.f269948b.C(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void D0(@Y61.l QuorumFilterInfo quorumFilterInfo) {
        this.f269948b.D0(quorumFilterInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void E0(@Y61.l String str) {
        this.f269948b.E0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Ed(@Y61.k SerpDisplayType serpDisplayType, boolean z12) {
        this.f269948b.Ed(serpDisplayType, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void F0(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f269948b.F0(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Fc(@Y61.l String str, @Y61.l UniversalColor universalColor, boolean z12, @Y61.l UniversalColor universalColor2) {
        this.f269948b.Fc(str, universalColor, z12, universalColor2);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Fd(int i12, @Y61.k List list) {
        this.f269948b.Fd(0, list);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void GZ(@Y61.l String str, boolean z12, @Y61.l Boolean bool) {
        this.f269948b.GZ(str, z12, bool);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void H2(@Y61.l Y41.a<kotlin.G0> aVar) {
        this.f269948b.H2(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Id(boolean z12) {
        this.f269948b.Id(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void K9(@Y61.l BadgeSticker badgeSticker, boolean z12) {
        this.f269948b.K9(badgeSticker, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Kl(@Y61.l DeliveryTerms deliveryTerms, @Y61.l String str) {
        this.f269948b.Kl(deliveryTerms, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void L6(@Y61.k Y41.l lVar, @Y61.l BuyWithDeliveryButton buyWithDeliveryButton) {
        this.f269948b.L6(lVar, buyWithDeliveryButton);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void M1(@Y61.l String str) {
        this.f269948b.M1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void N5(@Y61.l SellerRating sellerRating) {
        this.f269948b.N5(sellerRating);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    @Y61.k
    public final Uri O(@Y61.k com.avito.android.image_loader.k kVar) {
        return this.f269948b.O(kVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void O5(boolean z12, boolean z13) {
        this.f269948b.O5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void S0(@Y61.l String str) {
        this.f269948b.S0(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void W9(@Y61.k ShownItemsAbTestGroup shownItemsAbTestGroup) {
        this.f269948b.f271760f0 = shownItemsAbTestGroup;
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void X2(@Y61.l UniversalColor universalColor, @Y61.k String str) {
        this.f269948b.X2(universalColor, str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void X3(@Y61.l String str) {
        this.f269948b.X3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Y4() {
        this.f269948b.Y4();
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k Y41.q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, kotlin.G0> qVar) {
        this.f269948b.Z70(qVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void Zc(int i12, int i13, @Y61.k AsyncViewportTracker.ViewContext viewContext) {
        this.f269948b.Zc(i12, i13, viewContext);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void a7() {
        this.f269948b.a7();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void b2(@Y61.l String str) {
        this.f269948b.b2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void c(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.f269948b.c(aVar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void cJ(@Y61.l String str, @Y61.l DiscountIcon discountIcon, boolean z12, boolean z13) {
        this.f269948b.cJ(str, discountIcon, z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void d1(boolean z12) {
        this.f269948b.d1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void d5(@Y61.l String str, @Y61.k RadiusInfo radiusInfo) {
        this.f269948b.d5(str, radiusInfo);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void e1(@Y61.k Badge badge) {
        this.f269948b.e1(badge);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void e7(@Y61.l String str) {
        this.f269948b.e7(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void f1(@Y61.l String str) {
        this.f269948b.f1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void i1(@Y61.l String str) {
        this.f269948b.i1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void k1(@Y61.l String str) {
        this.f269948b.k1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void k5(boolean z12, boolean z13) {
        this.f269948b.k5(z12, z13);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void ka(@Y61.k Y41.a aVar, boolean z12) {
        this.f269948b.ka(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void l3(@Y61.l String str) {
        this.f269948b.l3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void l6(@Y61.k Y41.a aVar, boolean z12) {
        this.f269948b.l6(aVar, z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void m1(@Y61.l String str) {
        this.f269948b.m1(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o1(boolean z12) {
        this.f269948b.o1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o2(@Y61.l String str) {
        this.f269948b.o2(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o3(@Y61.l String str) {
        this.f269948b.o3(str);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void o5(@Y61.l SerpBadgeBar serpBadgeBar) {
        this.f269948b.o5(serpBadgeBar);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void setActive(boolean z12) {
        this.f269948b.setActive(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void setViewed(boolean z12) {
        this.f269948b.setViewed(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w0() {
        this.f269948b.w0();
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w1(boolean z12) {
        this.f269948b.w1(z12);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void w8(boolean z12) {
        this.f269948b.w8(true);
    }

    @Override // com.avito.android.serp.adapter.serp_advert_card.w
    public final void z0(boolean z12) {
        this.f269948b.z0(z12);
    }

    public /* synthetic */ C34731f(View view, com.avito.android.server_time.h hVar, Locale locale, AsyncViewportTracker.ViewContext viewContext, com.avito.android.video_snippets.g gVar, Integer num, int i12, C42822w c42822w) {
        this(view, hVar, locale, viewContext, gVar, (i12 & 32) != 0 ? null : num);
    }
}
