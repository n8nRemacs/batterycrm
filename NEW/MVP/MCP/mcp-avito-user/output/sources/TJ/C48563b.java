package tJ;

import com.avito.android.iac_avcalls.public_module.models.AvCallsCallMetaInfo;
import com.avito.avcalls.call.models.CallMetaInfo;
import kotlin.Metadata;

/* compiled from: AvCallsCallMetaInfo.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-avcalls_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: tJ.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48563b {
    @Y61.k
    public static final AvCallsCallMetaInfo a(@Y61.k CallMetaInfo callMetaInfo) {
        String scenario = callMetaInfo.getScenario();
        CallMetaInfo.a item = callMetaInfo.getItem();
        AvCallsCallMetaInfo.Item item2 = item == null ? null : new AvCallsCallMetaInfo.Item(item.f332710a, item.f332711b, item.f332712c, item.f332713d, item.f332714e);
        CallMetaInfo.b peer = callMetaInfo.getPeer();
        return new AvCallsCallMetaInfo(scenario, item2, peer != null ? new AvCallsCallMetaInfo.User(peer.f332715a, peer.f332716b) : null, callMetaInfo.getGsmLink(), callMetaInfo.getMsgLink(), callMetaInfo.getStartCallDelayMs(), callMetaInfo.getExtraInfo());
    }
}
