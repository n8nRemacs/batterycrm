package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerticalSearchFilterItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/i;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.b<?> f273490b;

    public i(@Y61.k com.avito.android.serp.adapter.vertical_main.b<?> bVar) {
        this.f273490b = bVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (e) aVar);
    }

    public final void k(@Y61.k j jVar, @Y61.k e eVar) {
        String title;
        Integer num = eVar.f273473j;
        boolean z12 = eVar.f273474k;
        jVar.xk(num, z12);
        Filter filter = eVar.f273466c;
        if (filter == null || (title = filter.getDisplayTitle()) == null) {
            Filter filter2 = eVar.f273466c;
            title = filter2 != null ? filter2.getTitle() : null;
            if (title == null) {
                title = "";
            }
        }
        Filter filter3 = eVar.f273466c;
        boolean z13 = false;
        jVar.r4(title, filter3 != null ? L.f(filter3.isHighlighted(), Boolean.TRUE) : false, eVar.f273468e);
        jVar.a(new h(eVar, this));
        if (eVar.f273468e && eVar.f273466c != null) {
            z13 = true;
        }
        jVar.I(z13);
        jVar.aU(eVar.f273470g);
        if (jVar instanceof a) {
            a aVar = (a) jVar;
            aVar.setSelected(eVar.f273469f);
            aVar.ks(eVar.f273472i);
            aVar.VD(num, z12);
        }
    }
}
