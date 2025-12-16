package com.avito.android.delivery_location_suggest.deeplink;

import Fv.C13838a;
import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.delivery_location_suggest.Coordinates;
import com.avito.android.delivery_location_suggest.deeplink.g;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryAddressSelectDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/delivery_location_suggest/deeplink/d;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "a", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes12.dex */
public final class d implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* compiled from: DeliveryAddressSelectDeeplinkResultConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/delivery_location_suggest/deeplink/d$a;", "", "<init>", "()V", "", "ADDRESS_KEY", "Ljava/lang/String;", "CITY_KEY", "LATITUDE_KEY", "LONGITUDE_KEY", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public d() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        String str;
        String str2;
        String string;
        Coordinates coordinates;
        String string2;
        Coordinates coordinates2;
        if (bVar instanceof g.a) {
            String str3 = "";
            C13838a c13838a = ((g.a) bVar).f135069b;
            if (c13838a == null || (str = c13838a.f6018b) == null) {
                str = "";
            }
            com.avito.beduin.v2.interaction.launch.flow.k kVar = new com.avito.beduin.v2.interaction.launch.flow.k(AddressParameter.TYPE, str);
            if (c13838a == null || (str2 = c13838a.f6017a) == null) {
                str2 = "";
            }
            com.avito.beduin.v2.interaction.launch.flow.k kVar2 = new com.avito.beduin.v2.interaction.launch.flow.k("city", str2);
            if (c13838a == null || (coordinates2 = c13838a.f6019c) == null || (string = Double.valueOf(coordinates2.f135016b).toString()) == null) {
                string = "";
            }
            com.avito.beduin.v2.interaction.launch.flow.k kVar3 = new com.avito.beduin.v2.interaction.launch.flow.k("lat", string);
            if (c13838a != null && (coordinates = c13838a.f6019c) != null && (string2 = Double.valueOf(coordinates.f135017c).toString()) != null) {
                str3 = string2;
            }
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{kVar, kVar2, kVar3, new com.avito.beduin.v2.interaction.launch.flow.k(MessageBody.Location.LONGITUDE, str3)};
        } else {
            kVarArr = null;
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof g.a ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
