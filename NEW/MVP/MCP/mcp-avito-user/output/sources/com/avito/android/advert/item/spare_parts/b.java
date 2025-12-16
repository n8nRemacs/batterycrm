package com.avito.android.advert.item.spare_parts;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.j;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.remote.model.SparePartsParameters;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.P2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SparePartsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/b;", "Lcom/avito/android/advert/item/spare_parts/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f80401a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f80402b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f80403c = true;

    @Inject
    public b(@k d dVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f80401a = dVar;
        this.f80402b = aVar;
    }

    @Override // com.avito.android.advert.item.spare_parts.a
    @k
    public final InterfaceC43160i<P2<SparePartsV2Response>> a(@k SparePartsParameters sparePartsParameters, @k String str) {
        return this.f80401a.a(sparePartsParameters, str);
    }

    @Override // com.avito.android.advert.item.spare_parts.a
    public final void b(@l DeepLink deepLink) {
        if (!this.f80403c || deepLink == null) {
            return;
        }
        b.a.a(this.f80402b, deepLink, null, null, 6);
        this.f80403c = false;
    }

    @Override // com.avito.android.advert.item.spare_parts.a
    @k
    public final InterfaceC43160i<P2<com.avito.android.advert.item.spare_parts.data.a>> c(@l SparePartsFilters sparePartsFilters, @l Map<String, String> map, @k String str) {
        d dVar = this.f80401a;
        return map != null ? dVar.b(str, map) : sparePartsFilters != null ? dVar.c(sparePartsFilters, str) : new C43210w(new P2.a(j.b()));
    }

    @Override // com.avito.android.advert.item.spare_parts.a
    public final void m0() {
        this.f80401a.m0();
        this.f80403c = true;
    }
}
