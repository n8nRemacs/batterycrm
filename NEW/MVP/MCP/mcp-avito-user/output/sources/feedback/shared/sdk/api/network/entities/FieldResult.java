package feedback.shared.sdk.api.network.entities;

import Fc1.C13602e5;
import Fc1.C13714r1;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 *2\u00020\u0001:\u0001*BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014Jd\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b'\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010\u0014R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010\u0014¨\u0006+"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/FieldResult;", "", "", "fieldId", "Lfeedback/shared/sdk/api/network/entities/FieldType;", "type", "", "scenarios", "values", "LFc1/e5;", "screenshots", "", "positions", "<init>", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lfeedback/shared/sdk/api/network/entities/FieldType;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/FieldType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lfeedback/shared/sdk/api/network/entities/FieldResult;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldId", "Lfeedback/shared/sdk/api/network/entities/FieldType;", "getType", "Ljava/util/List;", "getScenarios", "getValues", "getScreenshots", "getPositions", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final /* data */ class FieldResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String fieldId;

    @k
    private final List<Integer> positions;

    @k
    private final List<String> scenarios;

    @k
    private final List<C13602e5> screenshots;

    @k
    private final FieldType type;

    @k
    private final List<String> values;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/FieldResult$Companion;", "", "<init>", "()V", "LFc1/r1;", "feedbackFieldResult", "Lfeedback/shared/sdk/api/network/entities/FieldResult;", "fromFeedbackFieldResult", "(LFc1/r1;)Lfeedback/shared/sdk/api/network/entities/FieldResult;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        @k
        public final FieldResult fromFeedbackFieldResult(@k C13714r1 feedbackFieldResult) {
            return new FieldResult(feedbackFieldResult.f5776a, FieldType.INSTANCE.fromFeedbackFieldType(feedbackFieldResult.f5777b), feedbackFieldResult.f5778c, feedbackFieldResult.f5779d, feedbackFieldResult.f5781f, feedbackFieldResult.f5780e);
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public FieldResult(@k String str, @k FieldType fieldType, @k List<String> list, @k List<String> list2, @k List<C13602e5> list3, @k List<Integer> list4) {
        this.fieldId = str;
        this.type = fieldType;
        this.scenarios = list;
        this.values = list2;
        this.screenshots = list3;
        this.positions = list4;
    }

    public static /* synthetic */ FieldResult copy$default(FieldResult fieldResult, String str, FieldType fieldType, List list, List list2, List list3, List list4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = fieldResult.fieldId;
        }
        if ((i12 & 2) != 0) {
            fieldType = fieldResult.type;
        }
        FieldType fieldType2 = fieldType;
        if ((i12 & 4) != 0) {
            list = fieldResult.scenarios;
        }
        List list5 = list;
        if ((i12 & 8) != 0) {
            list2 = fieldResult.values;
        }
        List list6 = list2;
        if ((i12 & 16) != 0) {
            list3 = fieldResult.screenshots;
        }
        List list7 = list3;
        if ((i12 & 32) != 0) {
            list4 = fieldResult.positions;
        }
        return fieldResult.copy(str, fieldType2, list5, list6, list7, list4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getFieldId() {
        return this.fieldId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final FieldType getType() {
        return this.type;
    }

    @k
    public final List<String> component3() {
        return this.scenarios;
    }

    @k
    public final List<String> component4() {
        return this.values;
    }

    @k
    public final List<C13602e5> component5() {
        return this.screenshots;
    }

    @k
    public final List<Integer> component6() {
        return this.positions;
    }

    @k
    public final FieldResult copy(@k String fieldId, @k FieldType type, @k List<String> scenarios, @k List<String> values, @k List<C13602e5> screenshots, @k List<Integer> positions) {
        return new FieldResult(fieldId, type, scenarios, values, screenshots, positions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldResult)) {
            return false;
        }
        FieldResult fieldResult = (FieldResult) other;
        return L.f(this.fieldId, fieldResult.fieldId) && this.type == fieldResult.type && L.f(this.scenarios, fieldResult.scenarios) && L.f(this.values, fieldResult.values) && L.f(this.screenshots, fieldResult.screenshots) && L.f(this.positions, fieldResult.positions);
    }

    @k
    public final String getFieldId() {
        return this.fieldId;
    }

    @k
    public final List<Integer> getPositions() {
        return this.positions;
    }

    @k
    public final List<String> getScenarios() {
        return this.scenarios;
    }

    @k
    public final List<C13602e5> getScreenshots() {
        return this.screenshots;
    }

    @k
    public final FieldType getType() {
        return this.type;
    }

    @k
    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.positions.hashCode() + H.e(H.e(H.e((this.type.hashCode() + (this.fieldId.hashCode() * 31)) * 31, 31, this.scenarios), 31, this.values), 31, this.screenshots);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FieldResult(fieldId=");
        sb2.append(this.fieldId);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", scenarios=");
        sb2.append(this.scenarios);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", screenshots=");
        sb2.append(this.screenshots);
        sb2.append(", positions=");
        return H.p(sb2, this.positions, ')');
    }
}
