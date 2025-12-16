package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TargetingAttribute;", "", "rule", "Lfeedback/shared/sdk/api/network/entities/AttributeRule;", "value", "", "valueFrom", "valueTo", "attributeName", "(Lfeedback/shared/sdk/api/network/entities/AttributeRule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttributeName", "()Ljava/lang/String;", "getRule", "()Lfeedback/shared/sdk/api/network/entities/AttributeRule;", "getValue", "getValueFrom", "getValueTo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TargetingAttribute {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String attributeName;

    @k
    private final AttributeRule rule;

    @l
    private final String value;

    @l
    private final String valueFrom;

    @l
    private final String valueTo;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TargetingAttribute$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TargetingAttribute;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final TargetingAttribute parseJson(@k JSONObject json) {
            return new TargetingAttribute(AttributeRule.INSTANCE.from(json.getString("rule")), json.optString("value"), R7.b(json, "valueFrom"), R7.b(json, "valueTo"), json.getString("attributeName"));
        }

        @l
        public final List<TargetingAttribute> parseJsonArray(@l JSONArray jsonArray) {
            if (jsonArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(TargetingAttribute.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TargetingAttribute(@k AttributeRule attributeRule, @l String str, @l String str2, @l String str3, @k String str4) {
        this.rule = attributeRule;
        this.value = str;
        this.valueFrom = str2;
        this.valueTo = str3;
        this.attributeName = str4;
    }

    public static /* synthetic */ TargetingAttribute copy$default(TargetingAttribute targetingAttribute, AttributeRule attributeRule, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributeRule = targetingAttribute.rule;
        }
        if ((i12 & 2) != 0) {
            str = targetingAttribute.value;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = targetingAttribute.valueFrom;
        }
        String str6 = str2;
        if ((i12 & 8) != 0) {
            str3 = targetingAttribute.valueTo;
        }
        String str7 = str3;
        if ((i12 & 16) != 0) {
            str4 = targetingAttribute.attributeName;
        }
        return targetingAttribute.copy(attributeRule, str5, str6, str7, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributeRule getRule() {
        return this.rule;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getValueFrom() {
        return this.valueFrom;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getValueTo() {
        return this.valueTo;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getAttributeName() {
        return this.attributeName;
    }

    @k
    public final TargetingAttribute copy(@k AttributeRule rule, @l String value, @l String valueFrom, @l String valueTo, @k String attributeName) {
        return new TargetingAttribute(rule, value, valueFrom, valueTo, attributeName);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetingAttribute)) {
            return false;
        }
        TargetingAttribute targetingAttribute = (TargetingAttribute) other;
        return this.rule == targetingAttribute.rule && L.f(this.value, targetingAttribute.value) && L.f(this.valueFrom, targetingAttribute.valueFrom) && L.f(this.valueTo, targetingAttribute.valueTo) && L.f(this.attributeName, targetingAttribute.attributeName);
    }

    @k
    public final String getAttributeName() {
        return this.attributeName;
    }

    @k
    public final AttributeRule getRule() {
        return this.rule;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    @l
    public final String getValueFrom() {
        return this.valueFrom;
    }

    @l
    public final String getValueTo() {
        return this.valueTo;
    }

    public int hashCode() {
        int iHashCode = this.rule.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.valueFrom;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.valueTo;
        return this.attributeName.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TargetingAttribute(rule=");
        sb2.append(this.rule);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", valueFrom=");
        sb2.append(this.valueFrom);
        sb2.append(", valueTo=");
        sb2.append(this.valueTo);
        sb2.append(", attributeName=");
        return C22026a.c(sb2, this.attributeName, ')');
    }
}
