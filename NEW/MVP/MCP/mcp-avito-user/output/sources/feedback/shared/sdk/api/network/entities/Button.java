package feedback.shared.sdk.api.network.entities;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Button;", "", "id", "", "type", "Lfeedback/shared/sdk/api/network/entities/ButtonType;", "value", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/ButtonType;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "()Lfeedback/shared/sdk/api/network/entities/ButtonType;", "getValue", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Button {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String id;

    @k
    private final ButtonType type;

    @l
    private final String value;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Button$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Button;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Button parseJson(@k JSONObject json) {
            return new Button(json.getString("id"), ButtonType.INSTANCE.from(json.getString("type")), json.optString("value"));
        }

        @k
        public final List<Button> parseJsonArray(@k JSONArray jsonArray) {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(Button.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Button(@k String str, @k ButtonType buttonType, @l String str2) {
        this.id = str;
        this.type = buttonType;
        this.value = str2;
    }

    public static /* synthetic */ Button copy$default(Button button, String str, ButtonType buttonType, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = button.id;
        }
        if ((i12 & 2) != 0) {
            buttonType = button.type;
        }
        if ((i12 & 4) != 0) {
            str2 = button.value;
        }
        return button.copy(str, buttonType, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final ButtonType getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    public final Button copy(@k String id2, @k ButtonType type, @l String value) {
        return new Button(id2, type, value);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Button)) {
            return false;
        }
        Button button = (Button) other;
        return L.f(this.id, button.id) && this.type == button.type && L.f(this.value, button.value);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final ButtonType getType() {
        return this.type;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Button(id=");
        sb2.append(this.id);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}
