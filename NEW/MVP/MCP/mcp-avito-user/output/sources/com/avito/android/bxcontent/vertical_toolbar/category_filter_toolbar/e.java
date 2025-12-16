package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.b;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f113078l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar) {
        super(0);
        this.f113078l = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f113078l;
        b.C3319b c3319b = bVar.f113066k;
        Filter filter = c3319b != null ? c3319b.f113073d : null;
        if (filter != null) {
            bVar.f113059d.j(filter);
        }
        return G0.f406611a;
    }
}
