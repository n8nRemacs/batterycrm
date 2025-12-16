package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/CampaignRecord;", "", "campaignId", "", "priority", "eventName", "", "data", "(IILjava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()I", "getData", "()Ljava/lang/String;", "getEventName", "getPriority", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CampaignRecord {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    private final int campaignId;

    @l
    private final String data;

    @l
    private final String eventName;
    private final int priority;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/CampaignRecord$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/CampaignRecord;", "json", "Lorg/json/JSONObject;", "parseJsonList", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final CampaignRecord parseJson(@k JSONObject json) throws JSONException {
            JSONObject jSONObject;
            JSONObject jSONObjectOptJSONObject;
            int i12 = json.getInt("campaignId");
            int i13 = json.getInt("priority");
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("data");
            return new CampaignRecord(i12, i13, (jSONObjectOptJSONObject2 == null || (jSONObject = jSONObjectOptJSONObject2.getJSONObject("targeting")) == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("trigger")) == null) ? null : jSONObjectOptJSONObject.getString("value"), json.optString("data"));
        }

        @k
        public final List<CampaignRecord> parseJsonList(@k JSONArray jsonArray) {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(CampaignRecord.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public CampaignRecord(int i12, int i13, @l String str, @l String str2) {
        this.campaignId = i12;
        this.priority = i13;
        this.eventName = str;
        this.data = str2;
    }

    public static /* synthetic */ CampaignRecord copy$default(CampaignRecord campaignRecord, int i12, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = campaignRecord.campaignId;
        }
        if ((i14 & 2) != 0) {
            i13 = campaignRecord.priority;
        }
        if ((i14 & 4) != 0) {
            str = campaignRecord.eventName;
        }
        if ((i14 & 8) != 0) {
            str2 = campaignRecord.data;
        }
        return campaignRecord.copy(i12, i13, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @k
    public final CampaignRecord copy(int campaignId, int priority, @l String eventName, @l String data) {
        return new CampaignRecord(campaignId, priority, eventName, data);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignRecord)) {
            return false;
        }
        CampaignRecord campaignRecord = (CampaignRecord) other;
        return this.campaignId == campaignRecord.campaignId && this.priority == campaignRecord.priority && L.f(this.eventName, campaignRecord.eventName) && L.f(this.data, campaignRecord.data);
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    @l
    public final String getData() {
        return this.data;
    }

    @l
    public final String getEventName() {
        return this.eventName;
    }

    public final int getPriority() {
        return this.priority;
    }

    public int hashCode() {
        int iE2 = r.e(this.priority, Integer.hashCode(this.campaignId) * 31, 31);
        String str = this.eventName;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignRecord(campaignId=");
        sb2.append(this.campaignId);
        sb2.append(", priority=");
        sb2.append(this.priority);
        sb2.append(", eventName=");
        sb2.append(this.eventName);
        sb2.append(", data=");
        return C22026a.c(sb2, this.data, ')');
    }
}
