package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformTo;", "", "action", "Lfeedback/shared/sdk/api/network/entities/TransformAction;", "value", "", "type", "Lfeedback/shared/sdk/api/network/entities/TransformType;", "queryParams", "Lfeedback/shared/sdk/api/network/entities/QueryParams;", "(Lfeedback/shared/sdk/api/network/entities/TransformAction;Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/TransformType;Lfeedback/shared/sdk/api/network/entities/QueryParams;)V", "getAction", "()Lfeedback/shared/sdk/api/network/entities/TransformAction;", "getQueryParams", "()Lfeedback/shared/sdk/api/network/entities/QueryParams;", "getType", "()Lfeedback/shared/sdk/api/network/entities/TransformType;", "getValue", "()Ljava/lang/String;", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransformTo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final TransformAction action;

    @l
    private final QueryParams queryParams;

    @k
    private final TransformType type;

    @k
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformTo$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TransformTo;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final TransformTo parseJson(@k JSONObject json) {
            return new TransformTo(TransformAction.INSTANCE.from(json.getString("action")), json.getString("value"), TransformType.INSTANCE.from(json.getString("type")), QueryParams.INSTANCE.parseJson(json.optJSONObject("queryParams")));
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TransformTo(@k TransformAction transformAction, @k String str, @k TransformType transformType, @l QueryParams queryParams) {
        this.action = transformAction;
        this.value = str;
        this.type = transformType;
        this.queryParams = queryParams;
    }

    @k
    public final TransformAction getAction() {
        return this.action;
    }

    @l
    public final QueryParams getQueryParams() {
        return this.queryParams;
    }

    @k
    public final TransformType getType() {
        return this.type;
    }

    @k
    public final String getValue() {
        return this.value;
    }
}
