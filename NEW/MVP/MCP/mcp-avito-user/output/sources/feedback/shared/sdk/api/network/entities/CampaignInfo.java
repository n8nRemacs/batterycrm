package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0080\b\u0018\u0000 :2\u00020\u0001:\u0001:Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\"J\t\u00103\u001a\u00020\u0012HÆ\u0003J\u0088\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006;"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "", "campaignId", "", "type", "Lfeedback/shared/sdk/api/network/entities/CampaignType;", "autoclose", "privacy", "Lfeedback/shared/sdk/api/network/entities/Privacy;", "position", "", "projectId", "pages", "", "Lfeedback/shared/sdk/api/network/entities/Page;", "progress", "", "targeting", "Lfeedback/shared/sdk/api/network/entities/Targeting;", "transforms", "Lfeedback/shared/sdk/api/network/entities/Transform;", "(ILfeedback/shared/sdk/api/network/entities/CampaignType;Ljava/lang/Integer;Lfeedback/shared/sdk/api/network/entities/Privacy;Ljava/lang/String;ILjava/util/List;Ljava/lang/Boolean;Lfeedback/shared/sdk/api/network/entities/Targeting;Ljava/util/List;)V", "getAutoclose", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCampaignId", "()I", "getPages", "()Ljava/util/List;", "getPosition", "()Ljava/lang/String;", "getPrivacy", "()Lfeedback/shared/sdk/api/network/entities/Privacy;", "getProgress", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProjectId", "getTargeting", "()Lfeedback/shared/sdk/api/network/entities/Targeting;", "getTransforms", "getType", "()Lfeedback/shared/sdk/api/network/entities/CampaignType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILfeedback/shared/sdk/api/network/entities/CampaignType;Ljava/lang/Integer;Lfeedback/shared/sdk/api/network/entities/Privacy;Ljava/lang/String;ILjava/util/List;Ljava/lang/Boolean;Lfeedback/shared/sdk/api/network/entities/Targeting;Ljava/util/List;)Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "equals", PluralsKeys.OTHER, "hashCode", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CampaignInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final Integer autoclose;
    private final int campaignId;

    @k
    private final List<Page> pages;

    @l
    private final String position;

    @l
    private final Privacy privacy;

    @l
    private final Boolean progress;
    private final int projectId;

    @k
    private final Targeting targeting;

    @l
    private final List<Transform> transforms;

    @k
    private final CampaignType type;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/CampaignInfo$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/CampaignInfo;", "json", "Lorg/json/JSONObject;", "campaignId", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final CampaignInfo parseJson(@k JSONObject json, int campaignId) {
            return new CampaignInfo(campaignId, CampaignType.INSTANCE.from(json.getString("type")), json.isNull("autoclose") ? null : Integer.valueOf(json.getInt("autoclose")), Privacy.INSTANCE.parseJson(json.optJSONObject("privacy")), R7.b(json, "position"), json.getInt("projectId"), Page.INSTANCE.parseJsonArray(json.getJSONArray("pages")), json.isNull("progress") ? null : Boolean.valueOf(json.getBoolean("progress")), Targeting.INSTANCE.parseJson(json.getJSONObject("targeting")), Transform.INSTANCE.parseJsonArray(json.getJSONArray("transforms")));
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public CampaignInfo(int i12, @k CampaignType campaignType, @l Integer num, @l Privacy privacy, @l String str, int i13, @k List<Page> list, @l Boolean bool, @k Targeting targeting, @l List<Transform> list2) {
        this.campaignId = i12;
        this.type = campaignType;
        this.autoclose = num;
        this.privacy = privacy;
        this.position = str;
        this.projectId = i13;
        this.pages = list;
        this.progress = bool;
        this.targeting = targeting;
        this.transforms = list2;
    }

    /* renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    @l
    public final List<Transform> component10() {
        return this.transforms;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final CampaignType getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getAutoclose() {
        return this.autoclose;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Privacy getPrivacy() {
        return this.privacy;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    /* renamed from: component6, reason: from getter */
    public final int getProjectId() {
        return this.projectId;
    }

    @k
    public final List<Page> component7() {
        return this.pages;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getProgress() {
        return this.progress;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final Targeting getTargeting() {
        return this.targeting;
    }

    @k
    public final CampaignInfo copy(int campaignId, @k CampaignType type, @l Integer autoclose, @l Privacy privacy, @l String position, int projectId, @k List<Page> pages, @l Boolean progress, @k Targeting targeting, @l List<Transform> transforms) {
        return new CampaignInfo(campaignId, type, autoclose, privacy, position, projectId, pages, progress, targeting, transforms);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignInfo)) {
            return false;
        }
        CampaignInfo campaignInfo = (CampaignInfo) other;
        return this.campaignId == campaignInfo.campaignId && this.type == campaignInfo.type && L.f(this.autoclose, campaignInfo.autoclose) && L.f(this.privacy, campaignInfo.privacy) && L.f(this.position, campaignInfo.position) && this.projectId == campaignInfo.projectId && L.f(this.pages, campaignInfo.pages) && L.f(this.progress, campaignInfo.progress) && L.f(this.targeting, campaignInfo.targeting) && L.f(this.transforms, campaignInfo.transforms);
    }

    @l
    public final Integer getAutoclose() {
        return this.autoclose;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @k
    public final List<Page> getPages() {
        return this.pages;
    }

    @l
    public final String getPosition() {
        return this.position;
    }

    @l
    public final Privacy getPrivacy() {
        return this.privacy;
    }

    @l
    public final Boolean getProgress() {
        return this.progress;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    @k
    public final Targeting getTargeting() {
        return this.targeting;
    }

    @l
    public final List<Transform> getTransforms() {
        return this.transforms;
    }

    @k
    public final CampaignType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (Integer.hashCode(this.campaignId) * 31)) * 31;
        Integer num = this.autoclose;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Privacy privacy = this.privacy;
        int iHashCode3 = (iHashCode2 + (privacy == null ? 0 : privacy.hashCode())) * 31;
        String str = this.position;
        int iE2 = H.e(r.e(this.projectId, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.pages);
        Boolean bool = this.progress;
        int iHashCode4 = (this.targeting.hashCode() + ((iE2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        List<Transform> list = this.transforms;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignInfo(campaignId=");
        sb2.append(this.campaignId);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", autoclose=");
        sb2.append(this.autoclose);
        sb2.append(", privacy=");
        sb2.append(this.privacy);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", projectId=");
        sb2.append(this.projectId);
        sb2.append(", pages=");
        sb2.append(this.pages);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", targeting=");
        sb2.append(this.targeting);
        sb2.append(", transforms=");
        return H.p(sb2, this.transforms, ')');
    }
}
