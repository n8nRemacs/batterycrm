package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformData;", "", "rule", "Lfeedback/shared/sdk/api/network/entities/TransformRule;", "value", "", "", "(Lfeedback/shared/sdk/api/network/entities/TransformRule;Ljava/util/List;)V", "getRule", "()Lfeedback/shared/sdk/api/network/entities/TransformRule;", "getValue", "()Ljava/util/List;", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransformData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final TransformRule rule;

    @k
    private final List<String> value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformData$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TransformData;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final TransformData parseJson(@l JSONObject json) {
            if (json != null) {
                return new TransformData(TransformRule.INSTANCE.from(json.getString("rule")), R7.a("value", json));
            }
            return null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TransformData(@k TransformRule transformRule, @k List<String> list) {
        this.rule = transformRule;
        this.value = list;
    }

    @k
    public final TransformRule getRule() {
        return this.rule;
    }

    @k
    public final List<String> getValue() {
        return this.value;
    }
}
