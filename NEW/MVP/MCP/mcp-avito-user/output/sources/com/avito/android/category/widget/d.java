package com.avito.android.category.widget;

import Oi0.C14699c;
import Oi0.C14700d;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryWidgetItemBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/widget/d;", "Lcom/avito/android/category/widget/c;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f116741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f116742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14699c f116743c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C f116744d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L0 f116745e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category.element.e f116746f;

    /* compiled from: CategoryWidgetItemBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/category/widget/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/category/widget/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            d dVar = d.this;
            com.avito.konveyor.a aVar = dVar.f116742b;
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            return new i(view2, hVar, new C14700d(hVar, dVar.f116743c, dVar.f116744d), dVar.f116741a, dVar.f116745e, dVar.f116746f);
        }
    }

    public d(@Y61.k e eVar, @Y61.k com.avito.konveyor.a aVar, @Y61.k C14699c c14699c, @Y61.k C c12, @Y61.k L0 l02, @Y61.k com.avito.android.category.element.e eVar2) {
        this.f116741a = eVar;
        this.f116742b = aVar;
        this.f116743c = c14699c;
        this.f116744d = c12;
        this.f116745e = l02;
        this.f116746f = eVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f116741a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.bx_content_widget_category_item_layout, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CategoryWidgetItem;
    }
}
