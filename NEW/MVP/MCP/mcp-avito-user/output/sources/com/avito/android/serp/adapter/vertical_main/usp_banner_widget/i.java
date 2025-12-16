package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UspBannersWidgetPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/i;", "Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f273355c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Kundle f273356d;

    @Inject
    public i(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l @ds0.b Kundle kundle) {
        this.f273354b = gVar;
        this.f273355c = aVar;
        this.f273356d = kundle == null ? new Kundle() : kundle;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        UspBannersWidgetItem uspBannersWidgetItem = (UspBannersWidgetItem) aVar;
        int iHashCode = uspBannersWidgetItem.hashCode();
        lVar.tH(uspBannersWidgetItem.f273283d, iHashCode, new h(this, i12, uspBannersWidgetItem));
        Integer numB = this.f273356d.b("USP_WIDGETS_SCROLL_POSITION_KEY " + iHashCode);
        if (numB != null) {
            lVar.NR(numB.intValue());
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.usp_banner_widget.g
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final Kundle getF273356d() {
        return this.f273356d;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.usp_banner_widget.g
    public final void l1(int i12, int i13) {
        String strG = AK.c.g(i12, "USP_WIDGETS_SCROLL_POSITION_KEY ");
        this.f273356d.i(Integer.valueOf(i13), strG);
    }

    public /* synthetic */ i(com.avito.android.serp.analytics.widgets_tracker.g gVar, com.avito.android.deeplink_handler.handler.composite.a aVar, Kundle kundle, int i12, C42822w c42822w) {
        this(gVar, aVar, (i12 & 4) != 0 ? null : kundle);
    }
}
