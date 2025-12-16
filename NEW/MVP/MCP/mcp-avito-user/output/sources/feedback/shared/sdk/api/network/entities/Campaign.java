package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Campaign;", "", "campaignId", "", "priority", "campaignInfo", "Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "(IILfeedback/shared/sdk/api/network/entities/CampaignInfo;)V", "getCampaignId", "()I", "getCampaignInfo", "()Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "getPriority", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Campaign {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    private final int campaignId;

    @k
    private final CampaignInfo campaignInfo;
    private final int priority;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Campaign$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Campaign;", "campaignId", "", "priority", "payload", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Campaign parseJson(int campaignId, int priority, @k String payload) {
            return new Campaign(campaignId, priority, CampaignInfo.INSTANCE.parseJson(new JSONObject(payload), campaignId));
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Campaign(int i12, int i13, @k CampaignInfo campaignInfo) {
        this.campaignId = i12;
        this.priority = i13;
        this.campaignInfo = campaignInfo;
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, int i12, int i13, CampaignInfo campaignInfo, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = campaign.campaignId;
        }
        if ((i14 & 2) != 0) {
            i13 = campaign.priority;
        }
        if ((i14 & 4) != 0) {
            campaignInfo = campaign.campaignInfo;
        }
        return campaign.copy(i12, i13, campaignInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final CampaignInfo getCampaignInfo() {
        return this.campaignInfo;
    }

    @k
    public final Campaign copy(int campaignId, int priority, @k CampaignInfo campaignInfo) {
        return new Campaign(campaignId, priority, campaignInfo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Campaign)) {
            return false;
        }
        Campaign campaign = (Campaign) other;
        return this.campaignId == campaign.campaignId && this.priority == campaign.priority && L.f(this.campaignInfo, campaign.campaignInfo);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @k
    public final CampaignInfo getCampaignInfo() {
        return this.campaignInfo;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return this.campaignInfo.hashCode() + r.e(this.priority, Integer.hashCode(this.campaignId) * 31, 31);
    }

    @k
    public String toString() {
        return "Campaign(campaignId=" + this.campaignId + ", priority=" + this.priority + ", campaignInfo=" + this.campaignInfo + ')';
    }
}
