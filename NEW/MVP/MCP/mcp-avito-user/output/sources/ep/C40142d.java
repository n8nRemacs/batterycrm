package ep;

import Y61.k;
import Y61.l;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ClientRoomAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ep.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40142d {
    @l
    public static final Q<String, String> a(@k PartnerStatus partnerStatus) {
        PartnerStatus.Agent agent;
        boolean z12 = partnerStatus instanceof PartnerStatus.Agency;
        if (z12 && (agent = ((PartnerStatus.Agency) partnerStatus).f119874e) != null) {
            return new Q<>("agent_user_id", agent.f119875b);
        }
        if (z12) {
            PartnerStatus.Agency agency = (PartnerStatus.Agency) partnerStatus;
            if (agency.f119874e == null) {
                return new Q<>("agency_user_id", agency.f119871b);
            }
        }
        if (partnerStatus instanceof PartnerStatus.Agent) {
            return new Q<>("realtor_user_id", ((PartnerStatus.Agent) partnerStatus).f119875b);
        }
        return null;
    }

    @l
    public static final Q<String, String> b(@k PartnerStatus partnerStatus) {
        boolean z12 = partnerStatus instanceof PartnerStatus.Agency;
        if (z12 && ((PartnerStatus.Agency) partnerStatus).f119874e != null) {
            return new Q<>("entity_type", "agent");
        }
        if (z12 && ((PartnerStatus.Agency) partnerStatus).f119874e == null) {
            return new Q<>("entity_type", "agency");
        }
        if (partnerStatus instanceof PartnerStatus.Agent) {
            return new Q<>("entity_type", "realtor");
        }
        return null;
    }
}
