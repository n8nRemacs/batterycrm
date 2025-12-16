package feedback.shared.sdk.api.network.entities;

import Fc1.C13688o1;
import Fc1.D6;
import Fc1.F7;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/PostVisitsRequest;", "", "campaignId", "", "(I)V", "uid", "", "(Ljava/lang/String;I)V", "getCampaignId", "()I", "setCampaignId", "getUid", "()Ljava/lang/String;", "setUid", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PostVisitsRequest {
    private int campaignId;

    @k
    private String uid;

    /* JADX WARN: Illegal instructions before constructor call */
    public PostVisitsRequest(int i12) {
        D6 d62 = F7.a.f4960a;
        this(C13688o1.a((d62 == null ? null : d62).f4863b), i12);
    }

    public static /* synthetic */ PostVisitsRequest copy$default(PostVisitsRequest postVisitsRequest, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = postVisitsRequest.uid;
        }
        if ((i13 & 2) != 0) {
            i12 = postVisitsRequest.campaignId;
        }
        return postVisitsRequest.copy(str, i12);
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
    public final PostVisitsRequest copy(@k String uid, int campaignId) {
        return new PostVisitsRequest(uid, campaignId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostVisitsRequest)) {
            return false;
        }
        PostVisitsRequest postVisitsRequest = (PostVisitsRequest) other;
        return L.f(this.uid, postVisitsRequest.uid) && this.campaignId == postVisitsRequest.campaignId;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @k
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return Integer.hashCode(this.campaignId) + (this.uid.hashCode() * 31);
    }

    public final void setCampaignId(int i12) {
        this.campaignId = i12;
    }

    public final void setUid(@k String str) {
        this.uid = str;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PostVisitsRequest(uid=");
        sb2.append(this.uid);
        sb2.append(", campaignId=");
        return r.t(sb2, this.campaignId, ')');
    }

    public PostVisitsRequest(@k String str, int i12) {
        this.uid = str;
        this.campaignId = i12;
    }
}
