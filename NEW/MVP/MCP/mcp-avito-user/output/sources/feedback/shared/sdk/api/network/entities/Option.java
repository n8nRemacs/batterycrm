package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Option;", "", "id", "", "value", PluralsKeys.OTHER, "", "exceptional", "isLocked", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "getExceptional", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()Ljava/lang/String;", "getOther", "()Z", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lfeedback/shared/sdk/api/network/entities/Option;", "equals", "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Option {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final Boolean exceptional;

    @k
    private final String id;

    @l
    private final Boolean isLocked;
    private final boolean other;

    @k
    private final String value;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Option$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Option;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Option parseJson(@k JSONObject json) {
            return new Option(json.getString("id"), json.getString("value"), json.optBoolean(PluralsKeys.OTHER), Boolean.valueOf(json.optBoolean("exceptional")), Boolean.valueOf(json.optBoolean("isLocked")));
        }

        @l
        public final List<Option> parseJsonArray(@l JSONArray jsonArray) {
            if (jsonArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(Option.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Option(@k String str, @k String str2, boolean z12, @l Boolean bool, @l Boolean bool2) {
        this.id = str;
        this.value = str2;
        this.other = z12;
        this.exceptional = bool;
        this.isLocked = bool2;
    }

    public static /* synthetic */ Option copy$default(Option option, String str, String str2, boolean z12, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = option.id;
        }
        if ((i12 & 2) != 0) {
            str2 = option.value;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            z12 = option.other;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            bool = option.exceptional;
        }
        Boolean bool3 = bool;
        if ((i12 & 16) != 0) {
            bool2 = option.isLocked;
        }
        return option.copy(str, str3, z13, bool3, bool2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOther() {
        return this.other;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getExceptional() {
        return this.exceptional;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsLocked() {
        return this.isLocked;
    }

    @k
    public final Option copy(@k String id2, @k String value, boolean other, @l Boolean exceptional, @l Boolean isLocked) {
        return new Option(id2, value, other, exceptional, isLocked);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Option)) {
            return false;
        }
        Option option = (Option) other;
        return L.f(this.id, option.id) && L.f(this.value, option.value) && this.other == option.other && L.f(this.exceptional, option.exceptional) && L.f(this.isLocked, option.isLocked);
    }

    @l
    public final Boolean getExceptional() {
        return this.exceptional;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final boolean getOther() {
        return this.other;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.value);
        boolean z12 = this.other;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iD2 + i12) * 31;
        Boolean bool = this.exceptional;
        int iHashCode = (i13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLocked;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    public final Boolean isLocked() {
        return this.isLocked;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Option(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", other=");
        sb2.append(this.other);
        sb2.append(", exceptional=");
        sb2.append(this.exceptional);
        sb2.append(", isLocked=");
        return C0.g(sb2, this.isLocked, ')');
    }

    public /* synthetic */ Option(String str, String str2, boolean z12, Boolean bool, Boolean bool2, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12, bool, bool2);
    }
}
