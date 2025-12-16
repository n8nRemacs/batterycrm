package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Targeting;", "", "trigger", "Lfeedback/shared/sdk/api/network/entities/TriggerTargeting;", "(Lfeedback/shared/sdk/api/network/entities/TriggerTargeting;)V", "getTrigger", "()Lfeedback/shared/sdk/api/network/entities/TriggerTargeting;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Targeting {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final TriggerTargeting trigger;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Targeting$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Targeting;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Targeting parseJson(@k JSONObject json) {
            return new Targeting(TriggerTargeting.INSTANCE.parseJson(json.optJSONObject("trigger")));
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Targeting(@l TriggerTargeting triggerTargeting) {
        this.trigger = triggerTargeting;
    }

    public static /* synthetic */ Targeting copy$default(Targeting targeting, TriggerTargeting triggerTargeting, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            triggerTargeting = targeting.trigger;
        }
        return targeting.copy(triggerTargeting);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final TriggerTargeting getTrigger() {
        return this.trigger;
    }

    @k
    public final Targeting copy(@l TriggerTargeting trigger) {
        return new Targeting(trigger);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Targeting) && L.f(this.trigger, ((Targeting) other).trigger);
    }

    @l
    public final TriggerTargeting getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        TriggerTargeting triggerTargeting = this.trigger;
        if (triggerTargeting == null) {
            return 0;
        }
        return triggerTargeting.hashCode();
    }

    @k
    public String toString() {
        return "Targeting(trigger=" + this.trigger + ')';
    }
}
