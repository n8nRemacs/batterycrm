package com.avito.android.category.widget;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.category.element.CategoryWidgetElementItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import js0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: CategoryWidgetItemPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/widget/f;", "Lcom/avito/android/category/widget/e;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f116748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f116749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f116750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Bundle f116751e;

    /* renamed from: f, reason: collision with root package name */
    public int f116752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Analytics f116753g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Map<String, String> f116754h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f116755i;

    public f(@Y61.l Bundle bundle, @Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f116748b = eVar;
        this.f116749c = gVar;
        this.f116750d = interfaceC28373a;
        this.f116751e = bundle == null ? new Bundle() : bundle;
        this.f116755i = new LinkedHashMap();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        CategoryWidgetItem categoryWidgetItem = (CategoryWidgetItem) aVar;
        this.f116752f = i12;
        this.f116753g = categoryWidgetItem.getF116732h();
        this.f116754h = categoryWidgetItem.b0();
        this.f116755i.put(categoryWidgetItem.getF77924b(), categoryWidgetItem);
        hVar.s(categoryWidgetItem.getF77924b());
        hVar.x40(categoryWidgetItem.getF116726b(), new com.avito.android.body_condition.h(13, categoryWidgetItem, this));
        hVar.s1(categoryWidgetItem.getItems());
        hVar.W0(this.f116751e.getInt(categoryWidgetItem.getF77924b(), 0));
    }

    @Override // com.avito.android.category.widget.e
    public final void Q0(int i12, @Y61.k String str) {
        List<CategoryWidgetElementItem> items;
        CategoryWidgetElementItem categoryWidgetElementItem;
        if (i12 < 0) {
            return;
        }
        this.f116751e.putInt(str, i12);
        CategoryWidgetItem categoryWidgetItem = (CategoryWidgetItem) this.f116755i.get(str);
        String str2 = (categoryWidgetItem == null || (items = categoryWidgetItem.getItems()) == null || (categoryWidgetElementItem = items.get(i12)) == null) ? null : categoryWidgetElementItem.f116596c;
        this.f116749c.j("vertical_category", str2 != null ? str2.concat(", image") : null);
    }

    @Override // XQ.a
    @Y61.k
    public final XQ.b d0() {
        return new XQ.b(this.f116751e);
    }

    @Override // com.avito.android.category.widget.e
    public final void g4(@Y61.l DeepLink deepLink) {
        this.f116750d.c(new com.avito.android.category.element.k());
        if (deepLink != null) {
            InterfaceC47691c.a.b(this.f116748b.get(), deepLink, 6);
        }
    }

    @Override // com.avito.android.category.widget.e
    public final void p7(int i12, @Y61.l DeepLink deepLink, @Y61.k String str) {
        int i13 = this.f116752f;
        Analytics analytics = this.f116753g;
        Map<String, String> map = this.f116754h;
        d.a.a(this.f116749c, Integer.valueOf(i13), "vertical_category", str, null, Integer.valueOf(i12), null, map, analytics, 40);
        if (deepLink != null) {
            InterfaceC47691c.a.b(this.f116748b.get(), deepLink, 6);
        }
    }
}
