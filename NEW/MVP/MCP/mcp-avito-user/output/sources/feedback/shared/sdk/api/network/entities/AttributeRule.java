package feedback.shared.sdk.api.network.entities;

import Y61.k;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/AttributeRule;", "", "(Ljava/lang/String;I)V", "EQUAL", "CONTAIN", "NUMBER_RANGE", "DATE_RANGE", "LIST", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AttributeRule {
    EQUAL,
    CONTAIN,
    NUMBER_RANGE,
    DATE_RANGE,
    LIST;


    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/AttributeRule$Companion;", "", "()V", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lfeedback/shared/sdk/api/network/entities/AttributeRule;", "value", "", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @k
        public final AttributeRule from(@k String value) {
            switch (value.hashCode()) {
                case -261425617:
                    if (value.equals(DateRangeParameter.TYPE)) {
                        return AttributeRule.DATE_RANGE;
                    }
                    break;
                case 3322014:
                    if (value.equals("list")) {
                        return AttributeRule.LIST;
                    }
                    break;
                case 96757556:
                    if (value.equals("equal")) {
                        return AttributeRule.EQUAL;
                    }
                    break;
                case 725291892:
                    if (value.equals("numberRange")) {
                        return AttributeRule.NUMBER_RANGE;
                    }
                    break;
                case 951526612:
                    if (value.equals("contain")) {
                        return AttributeRule.CONTAIN;
                    }
                    break;
            }
            throw null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }
}
