package com.avito.android.inline_filters.category_nodes;

import Y61.k;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.InterfaceC30996c;
import com.avito.android.remote.model.search.WidgetType;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryTreeLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/category_nodes/c;", "Lev/a;", "Lcom/avito/android/inline_filters/category_nodes/CategoryTreeLink;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40161a<CategoryTreeLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC30996c f171073f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.i f171074g = new io.reactivex.rxjava3.disposables.i(0);

    @Inject
    public c(@k InterfaceC30996c interfaceC30996c) {
        this.f171073f = interfaceC30996c;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        WidgetType widgetType;
        CategoryTreeLink categoryTreeLink = (CategoryTreeLink) deepLink;
        if (bundle != null) {
            widgetType = (WidgetType) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("category_nodes_widget_type", WidgetType.class) : bundle.getParcelable("category_nodes_widget_type"));
        } else {
            widgetType = null;
        }
        this.f171074g.a(this.f171073f.a(categoryTreeLink.f171068b, widgetType != null ? widgetType : null, categoryTreeLink.f171069c, categoryTreeLink.f171070d).v0(new a(this), new b(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f171074g.a(null);
    }
}
