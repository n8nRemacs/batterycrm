package com.avito.android.suggest_locations.di;

import Ju.InterfaceC14249c;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.suggest_locations.deeplink.SuggestLocationsAddressLink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsAddressLinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_locations/di/n;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "a", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes4.dex */
public final class n implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* compiled from: SuggestLocationsAddressLinkResultConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/suggest_locations/di/n$a;", "", "<init>", "()V", "", "ADDRESS_KEY", "Ljava/lang/String;", "LAT_KEY", "LNG_KEY", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public n() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof SuggestLocationsAddressLink.c.C8861c) {
            SuggestLocationsAddressLink.c.C8861c c8861c = (SuggestLocationsAddressLink.c.C8861c) bVar;
            String str = c8861c.f292275b;
            if (str == null) {
                str = "";
            }
            com.avito.beduin.v2.interaction.launch.flow.k kVar = new com.avito.beduin.v2.interaction.launch.flow.k(AddressParameter.TYPE, str);
            String str2 = c8861c.f292276c;
            if (str2 == null) {
                str2 = "";
            }
            com.avito.beduin.v2.interaction.launch.flow.k kVar2 = new com.avito.beduin.v2.interaction.launch.flow.k("lat", str2);
            String str3 = c8861c.f292277d;
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{kVar, kVar2, new com.avito.beduin.v2.interaction.launch.flow.k(AddressParameter.Value.LNG, str3 != null ? str3 : "")};
        } else {
            kVarArr = null;
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return bVar instanceof SuggestLocationsAddressLink.c.C8861c ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
