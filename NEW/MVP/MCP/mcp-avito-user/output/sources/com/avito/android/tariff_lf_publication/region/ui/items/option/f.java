package com.avito.android.tariff_lf_publication.region.ui.items.option;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationRegionOptionPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/ui/items/option/f;", "Lcom/avito/android/tariff_lf_publication/region/ui/items/option/d;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f301129b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super String, G0> lVar) {
        this.f301129b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f301125d);
        hVar.setChecked(cVar.f301126e);
        hVar.w7(new e(this, cVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle != null && bundle.getBoolean("tariff_lf_publication_region_selection_change")) {
            hVar.setChecked(cVar.f301126e);
            return;
        }
        hVar.setTitle(cVar.f301125d);
        hVar.setChecked(cVar.f301126e);
        hVar.w7(new e(this, cVar));
    }
}
