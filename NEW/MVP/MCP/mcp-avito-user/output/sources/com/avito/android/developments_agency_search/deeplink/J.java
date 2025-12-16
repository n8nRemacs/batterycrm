package com.avito.android.developments_agency_search.deeplink;

import Ju.InterfaceC14249c;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.deeplink.TariffCardRegionSelectorLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCardRegionSelectorLinkResultConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/J;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes13.dex */
public final class J implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public J() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof TariffCardRegionSelectorLink.b.a) {
            TariffCardRegionSelectorLink.b.a aVar = (TariffCardRegionSelectorLink.b.a) bVar;
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k(SearchParamsConverterKt.LOCATION_ID, aVar.f136395b), new com.avito.beduin.v2.interaction.launch.flow.k("name", aVar.f136396c)};
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return bVar instanceof TariffCardRegionSelectorLink.b.a ? ResultStatus.f337439c : ResultStatus.f337441e;
    }
}
