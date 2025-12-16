package com.avito.android.vas_union.ui.items.vas_performance_click;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasUnionV2PerformanceClickItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_performance_click/f;", "Lcom/avito/android/vas_union/ui/items/vas_performance_click/d;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f323330b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@com.avito.android.vas_union.di.f @k l<? super DeepLink, G0> lVar) {
        this.f323330b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.L(aVar2.f323317d);
        hVar.e(aVar2.f323318e);
        hVar.i(aVar2.f323319f);
        hVar.c(new e(aVar2, this));
    }
}
