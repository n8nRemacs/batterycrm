package com.avito.android.lf_levels.ui.items.business_tool;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LfBusinessToolItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/ui/items/business_tool/f;", "Lcom/avito/android/lf_levels/ui/items/business_tool/d;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f175415b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super DeepLink, G0> lVar) {
        this.f175415b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        UniversalImage universalImage;
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f175401d);
        boolean z12 = aVar2.f175405h;
        UniversalImage universalImage2 = aVar2.f175402e;
        if (!z12 && (universalImage = aVar2.f175403f) != null) {
            universalImage2 = universalImage;
        }
        hVar.i(universalImage2);
        hVar.g(aVar2.f175406i);
        hVar.N0(z12);
        DeepLink deepLink = aVar2.f175404g;
        hVar.c(deepLink != null ? new e(this, deepLink) : null);
    }
}
