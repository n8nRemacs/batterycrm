package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.Date;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003JM\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00061"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/PostCampaignAnswersRequest;", "", "uid", "", "campaignId", "", "createdAtClient", "Ljava/util/Date;", "pages", "", "Lfeedback/shared/sdk/api/network/entities/PageResult;", RequestReviewResultKt.INFO_TYPE, "Lfeedback/shared/sdk/api/network/entities/DeviceInfo;", "properties", "(Ljava/lang/String;ILjava/util/Date;Ljava/util/List;Lfeedback/shared/sdk/api/network/entities/DeviceInfo;Ljava/lang/Object;)V", "getCampaignId", "()I", "setCampaignId", "(I)V", "getCreatedAtClient", "()Ljava/util/Date;", "setCreatedAtClient", "(Ljava/util/Date;)V", "getInfo", "()Lfeedback/shared/sdk/api/network/entities/DeviceInfo;", "getPages", "()Ljava/util/List;", "setPages", "(Ljava/util/List;)V", "getProperties", "()Ljava/lang/Object;", "setProperties", "(Ljava/lang/Object;)V", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes8.dex */
public final /* data */ class PostCampaignAnswersRequest {
    private int campaignId;

    @k
    private Date createdAtClient;

    @k
    private final DeviceInfo info;

    @k
    private List<PageResult> pages;

    @l
    private Object properties;

    @k
    private String uid;

    public PostCampaignAnswersRequest(@k String str, int i12, @k Date date, @k List<PageResult> list, @k DeviceInfo deviceInfo, @l Object obj) {
        this.uid = str;
        this.campaignId = i12;
        this.createdAtClient = date;
        this.pages = list;
        this.info = deviceInfo;
        this.properties = obj;
    }

    public static /* synthetic */ PostCampaignAnswersRequest copy$default(PostCampaignAnswersRequest postCampaignAnswersRequest, String str, int i12, Date date, List list, DeviceInfo deviceInfo, Object obj, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            str = postCampaignAnswersRequest.uid;
        }
        if ((i13 & 2) != 0) {
            i12 = postCampaignAnswersRequest.campaignId;
        }
        int i14 = i12;
        if ((i13 & 4) != 0) {
            date = postCampaignAnswersRequest.createdAtClient;
        }
        Date date2 = date;
        if ((i13 & 8) != 0) {
            list = postCampaignAnswersRequest.pages;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            deviceInfo = postCampaignAnswersRequest.info;
        }
        DeviceInfo deviceInfo2 = deviceInfo;
        if ((i13 & 32) != 0) {
            obj = postCampaignAnswersRequest.properties;
        }
        return postCampaignAnswersRequest.copy(str, i14, date2, list2, deviceInfo2, obj);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Date getCreatedAtClient() {
        return this.createdAtClient;
    }

    @k
    public final List<PageResult> component4() {
        return this.pages;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DeviceInfo getInfo() {
        return this.info;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Object getProperties() {
        return this.properties;
    }

    @k
    public final PostCampaignAnswersRequest copy(@k String uid, int campaignId, @k Date createdAtClient, @k List<PageResult> pages, @k DeviceInfo info, @l Object properties) {
        return new PostCampaignAnswersRequest(uid, campaignId, createdAtClient, pages, info, properties);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostCampaignAnswersRequest)) {
            return false;
        }
        PostCampaignAnswersRequest postCampaignAnswersRequest = (PostCampaignAnswersRequest) other;
        return L.f(this.uid, postCampaignAnswersRequest.uid) && this.campaignId == postCampaignAnswersRequest.campaignId && L.f(this.createdAtClient, postCampaignAnswersRequest.createdAtClient) && L.f(this.pages, postCampaignAnswersRequest.pages) && L.f(this.info, postCampaignAnswersRequest.info) && L.f(this.properties, postCampaignAnswersRequest.properties);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @k
    public final Date getCreatedAtClient() {
        return this.createdAtClient;
    }

    @k
    public final DeviceInfo getInfo() {
        return this.info;
    }

    @k
    public final List<PageResult> getPages() {
        return this.pages;
    }

    @l
    public final Object getProperties() {
        return this.properties;
    }

    @k
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iHashCode = (this.info.hashCode() + H.e(m.f(this.createdAtClient, r.e(this.campaignId, this.uid.hashCode() * 31, 31), 31), 31, this.pages)) * 31;
        Object obj = this.properties;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final void setCampaignId(int i12) {
        this.campaignId = i12;
    }

    public final void setCreatedAtClient(@k Date date) {
        this.createdAtClient = date;
    }

    public final void setPages(@k List<PageResult> list) {
        this.pages = list;
    }

    public final void setProperties(@l Object obj) {
        this.properties = obj;
    }

    public final void setUid(@k String str) {
        this.uid = str;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostCampaignAnswersRequest(uid=");
        sb2.append(this.uid);
        sb2.append(", campaignId=");
        sb2.append(this.campaignId);
        sb2.append(", createdAtClient=");
        sb2.append(this.createdAtClient);
        sb2.append(", pages=");
        sb2.append(this.pages);
        sb2.append(", info=");
        sb2.append(this.info);
        sb2.append(", properties=");
        return H.n(sb2, this.properties, ')');
    }

    public /* synthetic */ PostCampaignAnswersRequest(String str, int i12, Date date, List list, DeviceInfo deviceInfo, Object obj, int i13, C42822w c42822w) {
        this(str, i12, date, list, deviceInfo, (i13 & 32) != 0 ? null : obj);
    }
}
