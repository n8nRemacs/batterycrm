package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Messages;", "", "negative", "", "positive", "(Ljava/lang/String;Ljava/lang/String;)V", "getNegative", "()Ljava/lang/String;", "getPositive", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Messages {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String negative;

    @k
    private final String positive;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Messages$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Messages;", "json", "Lorg/json/JSONObject;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @l
        public final Messages parseJson(@l JSONObject json) {
            if (json != null) {
                return new Messages(json.getString("negative"), json.getString("positive"));
            }
            return null;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Messages(@k String str, @k String str2) {
        this.negative = str;
        this.positive = str2;
    }

    public static /* synthetic */ Messages copy$default(Messages messages, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = messages.negative;
        }
        if ((i12 & 2) != 0) {
            str2 = messages.positive;
        }
        return messages.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getNegative() {
        return this.negative;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getPositive() {
        return this.positive;
    }

    @k
    public final Messages copy(@k String negative, @k String positive) {
        return new Messages(negative, positive);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Messages)) {
            return false;
        }
        Messages messages = (Messages) other;
        return L.f(this.negative, messages.negative) && L.f(this.positive, messages.positive);
    }

    @k
    public final String getNegative() {
        return this.negative;
    }

    @k
    public final String getPositive() {
        return this.positive;
    }

    public int hashCode() {
        return this.positive.hashCode() + (this.negative.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Messages(negative=");
        sb2.append(this.negative);
        sb2.append(", positive=");
        return C22026a.c(sb2, this.positive, ')');
    }
}
