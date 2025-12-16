package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zw0.InterfaceC50637a;

/* compiled from: HorizontalChipsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/i;", "LTV0/b;", "Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/t;", "Lcom/avito/android/shortcut_navigation_bar/adapter/InlineFilterNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements TV0.b<t, InlineFilterNavigationItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f283300a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50637a f283301b;

    /* compiled from: HorizontalChipsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/u;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, u> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final u invoke(ViewGroup viewGroup, View view) {
            return new u(view, i.this.f283301b);
        }
    }

    public i(@Y61.k m mVar, @Y61.k InterfaceC50637a interfaceC50637a) {
        this.f283300a = mVar;
        this.f283301b = interfaceC50637a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f283300a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.horizontal_chips_item, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        Filter.Widget widget;
        Filter.Widget widget2;
        Filter.Widget widget3;
        if (aVar instanceof InlineFilterNavigationItem) {
            WidgetType type = null;
            Filter filter = ((InlineFilterNavigationItem) aVar).f283232g;
            if (((filter == null || (widget3 = filter.getWidget()) == null) ? null : widget3.getType()) != WidgetType.CategoryNodes) {
                if (((filter == null || (widget2 = filter.getWidget()) == null) ? null : widget2.getType()) != WidgetType.AvitoBlackCategoryNodes) {
                    if (filter != null && (widget = filter.getWidget()) != null) {
                        type = widget.getType();
                    }
                    if (type != WidgetType.ProfileCategoryNodes) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
