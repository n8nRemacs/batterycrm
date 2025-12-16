package com.avito.android.tariff_cpt.levels.ui.items.business_tool;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCptLevelsBusinessToolItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/ui/items/business_tool/f;", "Lcom/avito/android/tariff_cpt/levels/ui/items/business_tool/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f298683b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super DeepLink, G0> lVar) {
        this.f298683b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        iC0.f fVar;
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f298669c);
        iC0.f fVar2 = aVar2.f298670d;
        boolean z12 = aVar2.f298673g;
        if (!z12 && (fVar = aVar2.f298671e) != null) {
            fVar2 = fVar;
        }
        hVar.Q4(fVar2);
        hVar.g(aVar2.f298674h);
        hVar.N0(z12);
        if (aVar2.f298672f == null) {
            hVar.c(null);
        } else {
            hVar.c(new e(this, aVar2));
        }
    }
}
