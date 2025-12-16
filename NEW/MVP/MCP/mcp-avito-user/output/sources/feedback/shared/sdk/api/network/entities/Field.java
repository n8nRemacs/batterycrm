package feedback.shared.sdk.api.network.entities;

import Fc1.R7;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0080\b\u0018\u0000 ?2\u00020\u0001:\u0001?B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u00108\u001a\u00020\u0011HÆ\u0003J\u009e\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0011HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001b¨\u0006@"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Field;", "", "id", "", "type", "Lfeedback/shared/sdk/api/network/entities/FieldType;", "value", "mode", "Lfeedback/shared/sdk/api/network/entities/ModeType;", ChannelContext.Item.PLACEHOLDER, "required", "", ConstraintKt.WARNING, "options", "", "Lfeedback/shared/sdk/api/network/entities/Option;", "ratingCount", "", "messages", "Lfeedback/shared/sdk/api/network/entities/Messages;", "imageUrl", "buttons", "Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons;", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/FieldType;Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/ModeType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;ILfeedback/shared/sdk/api/network/entities/Messages;Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons;)V", "getButtons", "()Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons;", "getId", "()Ljava/lang/String;", "getImageUrl", "getMessages", "()Lfeedback/shared/sdk/api/network/entities/Messages;", "getMode", "()Lfeedback/shared/sdk/api/network/entities/ModeType;", "getOptions", "()Ljava/util/List;", "getPlaceholder", "getRatingCount", "()I", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Lfeedback/shared/sdk/api/network/entities/FieldType;", "getValue", "getWarning", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/FieldType;Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/ModeType;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;ILfeedback/shared/sdk/api/network/entities/Messages;Ljava/lang/String;Lfeedback/shared/sdk/api/network/entities/ScreenshotButtons;)Lfeedback/shared/sdk/api/network/entities/Field;", "equals", PluralsKeys.OTHER, "hashCode", "toString", "Companion", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Field {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private final ScreenshotButtons buttons;

    @k
    private final String id;

    @l
    private final String imageUrl;

    @l
    private final Messages messages;

    @l
    private final ModeType mode;

    @l
    private final List<Option> options;

    @l
    private final String placeholder;
    private final int ratingCount;

    @l
    private final Boolean required;

    @k
    private final FieldType type;

    @l
    private final String value;

    @l
    private final String warning;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lfeedback/shared/sdk/api/network/entities/Field$Companion;", "", "()V", "parseJson", "Lfeedback/shared/sdk/api/network/entities/Field;", "json", "Lorg/json/JSONObject;", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "uxfeedback-sdk_uxfeedbackRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @k
        public final Field parseJson(@k JSONObject json) throws JSONException {
            String string = json.getString("id");
            FieldType fieldTypeFrom = FieldType.INSTANCE.from(json.getString("type"));
            String strB = R7.b(json, "value");
            ModeType modeTypeFrom = ModeType.INSTANCE.from(json.optString("mode"));
            String strB2 = R7.b(json, ChannelContext.Item.PLACEHOLDER);
            Boolean boolValueOf = json.isNull("required") ? null : Boolean.valueOf(json.getBoolean("required"));
            String strB3 = R7.b(json, ConstraintKt.WARNING);
            List<Option> jsonArray = Option.INSTANCE.parseJsonArray(json.optJSONArray("options"));
            int iOptInt = json.optInt("ratingCount");
            Messages json2 = Messages.INSTANCE.parseJson(json.optJSONObject("messages"));
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("image");
            return new Field(string, fieldTypeFrom, strB, modeTypeFrom, strB2, boolValueOf, strB3, jsonArray, iOptInt, json2, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getString("3x") : null, ScreenshotButtons.INSTANCE.parseJson(json.optJSONObject("buttons")));
        }

        @k
        public final List<Field> parseJsonArray(@k JSONArray jsonArray) {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                arrayList.add(Field.INSTANCE.parseJson(jsonArray.getJSONObject(i12)));
            }
            return arrayList;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Field(@k String str, @k FieldType fieldType, @l String str2, @l ModeType modeType, @l String str3, @l Boolean bool, @l String str4, @l List<Option> list, int i12, @l Messages messages, @l String str5, @l ScreenshotButtons screenshotButtons) {
        this.id = str;
        this.type = fieldType;
        this.value = str2;
        this.mode = modeType;
        this.placeholder = str3;
        this.required = bool;
        this.warning = str4;
        this.options = list;
        this.ratingCount = i12;
        this.messages = messages;
        this.imageUrl = str5;
        this.buttons = screenshotButtons;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Messages getMessages() {
        return this.messages;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final ScreenshotButtons getButtons() {
        return this.buttons;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final FieldType getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ModeType getMode() {
        return this.mode;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getWarning() {
        return this.warning;
    }

    @l
    public final List<Option> component8() {
        return this.options;
    }

    /* renamed from: component9, reason: from getter */
    public final int getRatingCount() {
        return this.ratingCount;
    }

    @k
    public final Field copy(@k String id2, @k FieldType type, @l String value, @l ModeType mode, @l String placeholder, @l Boolean required, @l String warning, @l List<Option> options, int ratingCount, @l Messages messages, @l String imageUrl, @l ScreenshotButtons buttons) {
        return new Field(id2, type, value, mode, placeholder, required, warning, options, ratingCount, messages, imageUrl, buttons);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Field)) {
            return false;
        }
        Field field = (Field) other;
        return L.f(this.id, field.id) && this.type == field.type && L.f(this.value, field.value) && this.mode == field.mode && L.f(this.placeholder, field.placeholder) && L.f(this.required, field.required) && L.f(this.warning, field.warning) && L.f(this.options, field.options) && this.ratingCount == field.ratingCount && L.f(this.messages, field.messages) && L.f(this.imageUrl, field.imageUrl) && L.f(this.buttons, field.buttons);
    }

    @l
    public final ScreenshotButtons getButtons() {
        return this.buttons;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @l
    public final Messages getMessages() {
        return this.messages;
    }

    @l
    public final ModeType getMode() {
        return this.mode;
    }

    @l
    public final List<Option> getOptions() {
        return this.options;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final int getRatingCount() {
        return this.ratingCount;
    }

    @l
    public final Boolean getRequired() {
        return this.required;
    }

    @k
    public final FieldType getType() {
        return this.type;
    }

    @l
    public final String getValue() {
        return this.value;
    }

    @l
    public final String getWarning() {
        return this.warning;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ModeType modeType = this.mode;
        int iHashCode3 = (iHashCode2 + (modeType == null ? 0 : modeType.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.warning;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Option> list = this.options;
        int iE2 = r.e(this.ratingCount, (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Messages messages = this.messages;
        int iHashCode7 = (iE2 + (messages == null ? 0 : messages.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ScreenshotButtons screenshotButtons = this.buttons;
        return iHashCode8 + (screenshotButtons != null ? screenshotButtons.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Field(id=" + this.id + ", type=" + this.type + ", value=" + this.value + ", mode=" + this.mode + ", placeholder=" + this.placeholder + ", required=" + this.required + ", warning=" + this.warning + ", options=" + this.options + ", ratingCount=" + this.ratingCount + ", messages=" + this.messages + ", imageUrl=" + this.imageUrl + ", buttons=" + this.buttons + ')';
    }
}
