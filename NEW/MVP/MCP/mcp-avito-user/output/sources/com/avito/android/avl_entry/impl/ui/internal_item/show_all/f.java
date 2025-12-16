package com.avito.android.avl_entry.impl.ui.internal_item.show_all;

import Fg.InterfaceC13800a;
import Lg.InterfaceC14392c;
import Y61.k;
import com.avito.android.avl_entry.impl.ui.internal_item.ShortVideosWidgetCarouselItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortVideosShowAllWidgetCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/f;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/show_all/d;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC13800a f98571b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC14392c f98572c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.avl_analytics.a f98573d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f98574e;

    @Inject
    public f(@k InterfaceC13800a interfaceC13800a, @k InterfaceC14392c interfaceC14392c, @k com.avito.android.avl_analytics.a aVar, @k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f98571b = interfaceC13800a;
        this.f98572c = interfaceC14392c;
        this.f98573d = aVar;
        this.f98574e = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        InterfaceC13800a interfaceC13800a = this.f98571b;
        hVar.setTitle(interfaceC13800a.getF5952b());
        hVar.setIcon(interfaceC13800a.a());
        hVar.l0(new e((ShortVideosWidgetCarouselItem.ShowAllItem) aVar, this, i12));
    }
}
