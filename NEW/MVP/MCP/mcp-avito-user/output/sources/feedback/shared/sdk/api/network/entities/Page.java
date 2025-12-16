package feedback.shared.sdk.api.network.entities;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Page;", "", "id", "", "type", "Lfeedback/shared/sdk/api/network/entities/PageType;", LocalPublishState.FIELDS, "", "Lfeedback/shared/sdk/api/network/entities/Field;", "buttons", "Lfeedback/shared/sdk/api/network/entities/Button;", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/PageType;Ljava/util/List;Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "getFields", "getId", "()Ljava/lang/String;", "getType", "()Lfeedback/shared/sdk/api/network/entities/PageType;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Page {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final List<Button> buttons;

    @k
    private final List<Field> fields;

    @k
    private final String id;

    @k
    private final PageType type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Page$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Page;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Page parseJson(@k JSONObject json) {
            return new Page(json.getString("id"), PageType.INSTANCE.from(json.getString("type")), Field.INSTANCE.parseJsonArray(json.getJSONArray(LocalPublishState.FIELDS)), Button.INSTANCE.parseJsonArray(json.getJSONArray("buttons")));
        }

        @k
        public final List<Page> parseJsonArray(@k JSONArray jsonArray) {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(Page.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Page(@k String str, @k PageType pageType, @k List<Field> list, @k List<Button> list2) {
        this.id = str;
        this.type = pageType;
        this.fields = list;
        this.buttons = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Page copy$default(Page page, String str, PageType pageType, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = page.id;
        }
        if ((i12 & 2) != 0) {
            pageType = page.type;
        }
        if ((i12 & 4) != 0) {
            list = page.fields;
        }
        if ((i12 & 8) != 0) {
            list2 = page.buttons;
        }
        return page.copy(str, pageType, list, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final PageType getType() {
        return this.type;
    }

    @k
    public final List<Field> component3() {
        return this.fields;
    }

    @k
    public final List<Button> component4() {
        return this.buttons;
    }

    @k
    public final Page copy(@k String id2, @k PageType type, @k List<Field> fields, @k List<Button> buttons) {
        return new Page(id2, type, fields, buttons);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Page)) {
            return false;
        }
        Page page = (Page) other;
        return L.f(this.id, page.id) && this.type == page.type && L.f(this.fields, page.fields) && L.f(this.buttons, page.buttons);
    }

    @k
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @k
    public final List<Field> getFields() {
        return this.fields;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final PageType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.buttons.hashCode() + H.e((this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.fields);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Page(id=");
        sb2.append(this.id);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", fields=");
        sb2.append(this.fields);
        sb2.append(", buttons=");
        return H.p(sb2, this.buttons, ')');
    }
}
