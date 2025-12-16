package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0013\u001a\u00020\bHÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/GetCampaignsResponseOld;", "", "campaignInfos", "", "Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "showCampaignsInterval", "", "copyright", "Lfeedback/shared/sdk/api/network/entities/Copyright;", "(Ljava/util/List;Ljava/lang/Integer;Lfeedback/shared/sdk/api/network/entities/Copyright;)V", "getCampaignInfos", "()Ljava/util/List;", "getCopyright", "()Lfeedback/shared/sdk/api/network/entities/Copyright;", "getShowCampaignsInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lfeedback/shared/sdk/api/network/entities/Copyright;)Lfeedback/shared/sdk/api/network/entities/GetCampaignsResponseOld;", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GetCampaignsResponseOld {

    @k
    private final List<CampaignInfo> campaignInfos;

    @k
    private final Copyright copyright;

    @l
    private final Integer showCampaignsInterval;

    public GetCampaignsResponseOld(@k List<CampaignInfo> list, @l Integer num, @k Copyright copyright) {
        this.campaignInfos = list;
        this.showCampaignsInterval = num;
        this.copyright = copyright;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCampaignsResponseOld copy$default(GetCampaignsResponseOld getCampaignsResponseOld, List list, Integer num, Copyright copyright, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getCampaignsResponseOld.campaignInfos;
        }
        if ((i12 & 2) != 0) {
            num = getCampaignsResponseOld.showCampaignsInterval;
        }
        if ((i12 & 4) != 0) {
            copyright = getCampaignsResponseOld.copyright;
        }
        return getCampaignsResponseOld.copy(list, num, copyright);
    }

    @k
    public final List<CampaignInfo> component1() {
        return this.campaignInfos;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getShowCampaignsInterval() {
        return this.showCampaignsInterval;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Copyright getCopyright() {
        return this.copyright;
    }

    @k
    public final GetCampaignsResponseOld copy(@k List<CampaignInfo> campaignInfos, @l Integer showCampaignsInterval, @k Copyright copyright) {
        return new GetCampaignsResponseOld(campaignInfos, showCampaignsInterval, copyright);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCampaignsResponseOld)) {
            return false;
        }
        GetCampaignsResponseOld getCampaignsResponseOld = (GetCampaignsResponseOld) other;
        return L.f(this.campaignInfos, getCampaignsResponseOld.campaignInfos) && L.f(this.showCampaignsInterval, getCampaignsResponseOld.showCampaignsInterval) && L.f(this.copyright, getCampaignsResponseOld.copyright);
    }

    @k
    public final List<CampaignInfo> getCampaignInfos() {
        return this.campaignInfos;
    }

    @k
    public final Copyright getCopyright() {
        return this.copyright;
    }

    @l
    public final Integer getShowCampaignsInterval() {
        return this.showCampaignsInterval;
    }

    public int hashCode() {
        int iHashCode = this.campaignInfos.hashCode() * 31;
        Integer num = this.showCampaignsInterval;
        return this.copyright.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "GetCampaignsResponseOld(campaignInfos=" + this.campaignInfos + ", showCampaignsInterval=" + this.showCampaignsInterval + ", copyright=" + this.copyright + ')';
    }
}
