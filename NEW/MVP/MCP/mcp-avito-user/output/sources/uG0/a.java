package UG0;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.lib.beduin_v2.feature.launchclient.g;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressSuggestScreenResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUG0/a;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f16323a = new a();

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr = null;
        if (bVar instanceof UserAddressLink.Result.Success.Added) {
            UserAddressLink.Result.Success.Added added = (UserAddressLink.Result.Success.Added) bVar;
            Q q12 = new Q("needToShow", String.valueOf(added.f133808b));
            Q q13 = new Q(AddressParameter.TYPE, added.f133811e);
            Q q14 = new Q("addressId", String.valueOf(added.f133809c));
            Q q15 = new Q("addressType", added.f133812f);
            Q q16 = new Q(AddressParameter.Value.JSON_WEB_TOKEN, added.f133813g);
            Double d12 = added.f133814h;
            Q q17 = new Q("longitude", d12 != null ? d12.toString() : null);
            Double d13 = added.f133815i;
            Map mapG = P0.g(q12, q13, q14, q15, q16, q17, new Q("latitude", d13 != null ? d13.toString() : null));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapG.entrySet()) {
                String str = (String) entry.getValue();
                com.avito.beduin.v2.interaction.launch.flow.k kVar = str != null ? new com.avito.beduin.v2.interaction.launch.flow.k((String) entry.getKey(), str) : null;
                if (kVar != null) {
                    arrayList.add(kVar);
                }
            }
            kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof UserAddressLink.Result.Success ? ResultStatus.f337439c : bVar instanceof UserAddressLink.Result.Failure ? ResultStatus.f337441e : ResultStatus.f337440d;
    }
}
