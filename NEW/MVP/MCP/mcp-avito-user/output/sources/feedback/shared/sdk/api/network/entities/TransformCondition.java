package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformCondition;", "", "id", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lfeedback/shared/sdk/api/network/entities/TransformFrom;", "transformData", "Lfeedback/shared/sdk/api/network/entities/TransformData;", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/TransformFrom;Lfeedback/shared/sdk/api/network/entities/TransformData;)V", "getFrom", "()Lfeedback/shared/sdk/api/network/entities/TransformFrom;", "getId", "()Ljava/lang/String;", "getTransformData", "()Lfeedback/shared/sdk/api/network/entities/TransformData;", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransformCondition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final TransformFrom from;

    @k
    private final String id;

    @l
    private final TransformData transformData;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformCondition$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TransformCondition;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final TransformCondition parseJson(@k JSONObject json) {
            return new TransformCondition(json.getString("id"), TransformFrom.INSTANCE.parseJson(json.getJSONObject(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)), TransformData.INSTANCE.parseJson(json.optJSONObject("condition")));
        }

        @k
        public final List<TransformCondition> parseJsonArray(@k JSONArray jsonArray) {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(TransformCondition.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TransformCondition(@k String str, @k TransformFrom transformFrom, @l TransformData transformData) {
        this.id = str;
        this.from = transformFrom;
        this.transformData = transformData;
    }

    @k
    public final TransformFrom getFrom() {
        return this.from;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final TransformData getTransformData() {
        return this.transformData;
    }
}
