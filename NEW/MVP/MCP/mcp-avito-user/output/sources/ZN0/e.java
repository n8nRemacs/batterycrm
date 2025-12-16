package zN0;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.lib.beduin_v2.feature.launchclient.g;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import zN0.f;

/* compiled from: VDRClientAddDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LzN0/e;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_virtual-deal-room_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class e implements g {
    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof f.b) {
            f.b bVar2 = (f.b) bVar;
            Map mapG = P0.g(new Q("processId", bVar2.f444035b), new Q("processType", bVar2.f444036c), new Q("fromPage", bVar2.f444037d.f326104b));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapG.entrySet()) {
                arrayList.add(new com.avito.beduin.v2.interaction.launch.flow.k((String) entry.getKey(), (String) entry.getValue()));
            }
            kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof f.b ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
