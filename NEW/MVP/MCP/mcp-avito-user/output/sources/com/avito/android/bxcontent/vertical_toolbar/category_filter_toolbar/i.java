package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.b;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;

/* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f113083b;

    public i(b bVar) {
        this.f113083b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        b bVar = this.f113083b;
        b.C3319b c3319b = bVar.f113066k;
        Filter filter = c3319b != null ? c3319b.f113070a : null;
        if (filter != null) {
            bVar.f113059d.j(filter);
        }
    }
}
