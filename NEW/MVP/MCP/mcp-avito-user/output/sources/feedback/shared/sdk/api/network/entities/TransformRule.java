package feedback.shared.sdk.api.network.entities;

import Y61.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformRule;", "", "(Ljava/lang/String;I)V", "EQUAL", "FILLED", "UNFILLED", "CONTAIN", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TransformRule {
    EQUAL,
    FILLED,
    UNFILLED,
    CONTAIN;


    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TransformRule$Companion;", "", "()V", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lfeedback/shared/sdk/api/network/entities/TransformRule;", "value", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final TransformRule from(@k String value) {
            int iHashCode = value.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode != -387996357) {
                    if (iHashCode != 96757556) {
                        if (iHashCode == 951526612 && value.equals("contain")) {
                            return TransformRule.CONTAIN;
                        }
                    } else if (value.equals("equal")) {
                        return TransformRule.EQUAL;
                    }
                } else if (value.equals("unfilled")) {
                    return TransformRule.UNFILLED;
                }
            } else if (value.equals("filled")) {
                return TransformRule.FILLED;
            }
            throw null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }
}
