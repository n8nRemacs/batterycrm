package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TriggerTargeting;", "", "value", "", "counts", "", "enabled", "", "isMultiVisited", "seconds", Navigation.ATTRIBUTES, "", "Lfeedback/shared/sdk/api/network/entities/TargetingAttribute;", "(Ljava/lang/String;IZZLjava/lang/Integer;Ljava/util/List;)V", "getAttributes", "()Ljava/util/List;", "getCounts", "()I", "getEnabled", "()Z", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IZZLjava/lang/Integer;Ljava/util/List;)Lfeedback/shared/sdk/api/network/entities/TriggerTargeting;", "equals", PluralsKeys.OTHER, "hashCode", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TriggerTargeting {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final List<TargetingAttribute> attributes;
    private final int counts;
    private final boolean enabled;
    private final boolean isMultiVisited;

    @l
    private final Integer seconds;

    @k
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/TriggerTargeting$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/TriggerTargeting;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final TriggerTargeting parseJson(@l JSONObject json) {
            if (json != null) {
                return new TriggerTargeting(json.getString("value"), json.getInt("counts"), json.getBoolean("enabled"), json.getBoolean("isMultiVisited"), Integer.valueOf(json.optInt("seconds")), TargetingAttribute.INSTANCE.parseJsonArray(json.optJSONArray(Navigation.ATTRIBUTES)));
            }
            return null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public TriggerTargeting(@k String str, int i12, boolean z12, boolean z13, @l Integer num, @l List<TargetingAttribute> list) {
        this.value = str;
        this.counts = i12;
        this.enabled = z12;
        this.isMultiVisited = z13;
        this.seconds = num;
        this.attributes = list;
    }

    public static /* synthetic */ TriggerTargeting copy$default(TriggerTargeting triggerTargeting, String str, int i12, boolean z12, boolean z13, Integer num, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = triggerTargeting.value;
        }
        if ((i13 & 2) != 0) {
            i12 = triggerTargeting.counts;
        }
        int i14 = i12;
        if ((i13 & 4) != 0) {
            z12 = triggerTargeting.enabled;
        }
        boolean z14 = z12;
        if ((i13 & 8) != 0) {
            z13 = triggerTargeting.isMultiVisited;
        }
        boolean z15 = z13;
        if ((i13 & 16) != 0) {
            num = triggerTargeting.seconds;
        }
        Integer num2 = num;
        if ((i13 & 32) != 0) {
            list = triggerTargeting.attributes;
        }
        return triggerTargeting.copy(str, i14, z14, z15, num2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCounts() {
        return this.counts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsMultiVisited() {
        return this.isMultiVisited;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getSeconds() {
        return this.seconds;
    }

    @l
    public final List<TargetingAttribute> component6() {
        return this.attributes;
    }

    @k
    public final TriggerTargeting copy(@k String value, int counts, boolean enabled, boolean isMultiVisited, @l Integer seconds, @l List<TargetingAttribute> attributes) {
        return new TriggerTargeting(value, counts, enabled, isMultiVisited, seconds, attributes);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerTargeting)) {
            return false;
        }
        TriggerTargeting triggerTargeting = (TriggerTargeting) other;
        return L.f(this.value, triggerTargeting.value) && this.counts == triggerTargeting.counts && this.enabled == triggerTargeting.enabled && this.isMultiVisited == triggerTargeting.isMultiVisited && L.f(this.seconds, triggerTargeting.seconds) && L.f(this.attributes, triggerTargeting.attributes);
    }

    @l
    public final List<TargetingAttribute> getAttributes() {
        return this.attributes;
    }

    public final int getCounts() {
        return this.counts;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final Integer getSeconds() {
        return this.seconds;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iE2 = r.e(this.counts, this.value.hashCode() * 31, 31);
        boolean z12 = this.enabled;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iE2 + i12) * 31;
        boolean z13 = this.isMultiVisited;
        int i14 = (i13 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
        Integer num = this.seconds;
        int iHashCode = (i14 + (num == null ? 0 : num.hashCode())) * 31;
        List<TargetingAttribute> list = this.attributes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean isMultiVisited() {
        return this.isMultiVisited;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TriggerTargeting(value=");
        sb2.append(this.value);
        sb2.append(", counts=");
        sb2.append(this.counts);
        sb2.append(", enabled=");
        sb2.append(this.enabled);
        sb2.append(", isMultiVisited=");
        sb2.append(this.isMultiVisited);
        sb2.append(", seconds=");
        sb2.append(this.seconds);
        sb2.append(", attributes=");
        return H.p(sb2, this.attributes, ')');
    }
}
