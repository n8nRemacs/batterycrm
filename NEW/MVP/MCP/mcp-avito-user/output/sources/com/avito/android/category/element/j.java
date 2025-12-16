package com.avito.android.category.element;

import com.avito.android.util.L0;
import kotlin.Metadata;

/* compiled from: CategoryWidgetElementItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/element/j;", "Lcom/avito/android/category/element/g;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category.widget.e f116611b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q f116612c;

    public j(@Y61.k com.avito.android.category.widget.e eVar, @Y61.k q qVar) {
        this.f116611b = eVar;
        this.f116612c = qVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        CategoryWidgetElementItem categoryWidgetElementItem = (CategoryWidgetElementItem) aVar;
        boolean z12 = categoryWidgetElementItem.f116603j;
        q qVar = this.f116612c;
        L0 l02 = qVar.f116628a;
        int iC2 = l02.c();
        int i13 = iC2 - (qVar.f116630c * 2);
        if (!z12) {
            i13 -= qVar.f116631d;
        }
        boolean z13 = i13 > 0;
        q.f116627e.getClass();
        if (l02.a() >= 768) {
            i13 /= 2;
        }
        if (z13) {
            iC2 = i13;
        } else {
            qVar.f116629b.getF125491k().getClass();
        }
        lVar.hA(categoryWidgetElementItem, iC2, new h(this, i12), new i(this));
    }
}
