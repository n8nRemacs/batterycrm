package com.avito.android.extended_profile_widgets.adapter.search.search_button;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchButtonItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_button/e;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_button/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154775b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super oB.k, G0> lVar) {
        this.f154775b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SearchButtonItem searchButtonItem = (SearchButtonItem) aVar;
        d dVar = new d(this, searchButtonItem);
        boolean z12 = searchButtonItem.f154765e;
        if (z12) {
            dVar = null;
        }
        gVar.fe(dVar, z12);
        String str = searchButtonItem.f154764d;
        if (str != null) {
            gVar.setTitle(str);
        }
    }
}
