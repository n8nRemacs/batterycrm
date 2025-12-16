package com.avito.android.tariff_cpt.info.ui.items.feature;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_cpt.info.di.m;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptInfoFeatureItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/feature/f;", "Lcom/avito/android/tariff_cpt/info/ui/items/feature/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f298307b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k @m l<? super DeepLink, G0> lVar) {
        this.f298307b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f298294c);
        hVar.g(aVar2.f298295d);
        hVar.Q4(aVar2.f298296e);
        hVar.N0(aVar2.f298298g);
        DeepLink deepLink = aVar2.f298297f;
        hVar.c(deepLink != null ? new e(this, deepLink) : null);
    }
}
