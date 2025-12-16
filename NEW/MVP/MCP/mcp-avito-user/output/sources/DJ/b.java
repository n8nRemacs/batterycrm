package DJ;

import com.avito.android.iac_avcalls.public_module.models.AvCallsCallMetaInfo;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import kotlin.Metadata;

/* compiled from: AvCallsCallMetaInfo.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-avcalls_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {
    @Y61.k
    public static final AvCallsCallMetaInfo a(@Y61.k CallMetaInfo callMetaInfo) {
        CallMetaInfo.a aVar = callMetaInfo.f331541c;
        AvCallsCallMetaInfo.Item item = aVar == null ? null : new AvCallsCallMetaInfo.Item(aVar.f331546a, aVar.f331547b, aVar.f331548c, aVar.f331549d, aVar.f331550e);
        CallMetaInfo.b bVar = callMetaInfo.f331540b;
        return new AvCallsCallMetaInfo(callMetaInfo.f331539a, item, bVar != null ? new AvCallsCallMetaInfo.User(bVar.f331551a, bVar.f331552b) : null, callMetaInfo.f331542d, callMetaInfo.f331543e, callMetaInfo.f331544f, callMetaInfo.f331545g);
    }
}
