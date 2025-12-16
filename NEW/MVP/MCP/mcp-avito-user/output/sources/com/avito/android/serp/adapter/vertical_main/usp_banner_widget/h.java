package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItem;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItemAnalytics;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UspBannersWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;", "uspBannerItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/banner/UspBannerItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<UspBannerItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f273351l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f273352m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ UspBannersWidgetItem f273353n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i12, UspBannersWidgetItem uspBannersWidgetItem) {
        super(1);
        this.f273351l = iVar;
        this.f273352m = i12;
        this.f273353n = uspBannersWidgetItem;
    }

    @Override // Y41.l
    public final G0 invoke(UspBannerItem uspBannerItem) {
        String str;
        UspBannerItem uspBannerItem2 = uspBannerItem;
        DeepLink deepLink = uspBannerItem2.f273315g;
        i iVar = this.f273351l;
        if (deepLink != null) {
            b.a.a(iVar.f273355c, deepLink, null, null, 6);
        }
        Integer numValueOf = Integer.valueOf(this.f273352m);
        UspBannerItemAnalytics uspBannerItemAnalytics = uspBannerItem2.f273317i;
        if (uspBannerItemAnalytics == null || (str = uspBannerItemAnalytics.f273319b) == null) {
            str = "usp_banner_widget";
        }
        d.a.a(iVar.f273354b, numValueOf, str, uspBannerItemAnalytics != null ? uspBannerItemAnalytics.f273320c : null, null, null, null, null, this.f273353n.f273285f, 120);
        return G0.f406611a;
    }
}
