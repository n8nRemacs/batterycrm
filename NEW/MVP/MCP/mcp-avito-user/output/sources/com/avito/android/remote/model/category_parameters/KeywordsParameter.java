package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: KeywordsParameter.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 _2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001_Bw\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u008e\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b1\u0010,J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b;\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001cR*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010AR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010\"R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bF\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bI\u0010%R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u00108\u001a\u0004\bJ\u0010\u0018\"\u0004\bK\u0010LR \u0010M\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\bM\u0010B\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010 R \u0010Q\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\bQ\u0010B\u0012\u0004\bS\u0010P\u001a\u0004\bR\u0010 R\"\u0010U\u001a\u0004\u0018\u00010T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010P\u001a\u0004\bW\u0010XR \u0010Z\u001a\u00020\r8\u0016X\u0096D¢\u0006\u0012\n\u0004\bZ\u0010B\u0012\u0004\b\\\u0010P\u001a\u0004\b[\u0010\"R\u0014\u0010^\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0018¨\u0006`"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/KeywordsParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "id", "title", "attrId", "Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;", Navigation.DISPLAYING, "_value", "", "visible", "phantom", "hasSuggest", "", "maxCharCount", "maxOptionsCount", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;Ljava/util/List;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;", "component5", "()Ljava/util/List;", "component6", "()Z", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;Ljava/util/List;ZLjava/lang/Boolean;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/KeywordsParameter;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getAttrId", "Lcom/avito/android/remote/model/category_parameters/KeywordDisplaying;", "getDisplaying", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Z", "getVisible", "Ljava/lang/Boolean;", "getPhantom", "getHasSuggest", "Ljava/lang/Integer;", "getMaxCharCount", "getMaxOptionsCount", "getText", "setText", "(Ljava/lang/String;)V", "required", "getRequired", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "updatesForm", "getUpdatesForm", "getUpdatesForm$annotations", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class KeywordsParameter extends EditableParameter<List<? extends String>> implements Visibility, Parcelable, Phantom {

    @k
    public static final String TYPE = "keywords";

    @c("value")
    @l
    private List<String> _value;

    @c("attrId")
    @k
    private final String attrId;

    @c(Navigation.DISPLAYING)
    @k
    private final KeywordDisplaying displaying;

    @c("hasSuggest")
    private final boolean hasSuggest;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @c("maxCharactersCount")
    @l
    private final Integer maxCharCount;

    @c("maxOptionsCount")
    @l
    private final Integer maxOptionsCount;

    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final boolean required;

    @c("text")
    @l
    private String text;

    @c("title")
    @k
    private final String title;
    private final boolean updatesForm;

    @c("visible")
    private final boolean visible;

    @k
    public static final Parcelable.Creator<KeywordsParameter> CREATOR = new Creator();

    /* compiled from: KeywordsParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<KeywordsParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final KeywordsParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            KeywordDisplaying keywordDisplayingCreateFromParcel = KeywordDisplaying.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new KeywordsParameter(string, string2, string3, keywordDisplayingCreateFromParcel, arrayListCreateStringArrayList, z12, boolValueOf, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final KeywordsParameter[] newArray(int i12) {
            return new KeywordsParameter[i12];
        }
    }

    public /* synthetic */ KeywordsParameter(String str, String str2, String str3, KeywordDisplaying keywordDisplaying, List list, boolean z12, Boolean bool, boolean z13, Integer num, Integer num2, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, keywordDisplaying, list, z12, (i12 & 64) != 0 ? Boolean.FALSE : bool, z13, (i12 & 256) != 0 ? null : num, (i12 & 512) != 0 ? null : num2, (i12 & 1024) != 0 ? null : str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Integer getMaxOptionsCount() {
        return this.maxOptionsCount;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getAttrId() {
        return this.attrId;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final KeywordDisplaying getDisplaying() {
        return this.displaying;
    }

    @l
    public final List<String> component5() {
        return this._value;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Integer getMaxCharCount() {
        return this.maxCharCount;
    }

    @k
    public final KeywordsParameter copy(@k String id2, @k String title, @k String attrId, @k KeywordDisplaying displaying, @l List<String> _value, boolean visible, @l Boolean phantom, boolean hasSuggest, @l Integer maxCharCount, @l Integer maxOptionsCount, @l String text) {
        return new KeywordsParameter(id2, title, attrId, displaying, _value, visible, phantom, hasSuggest, maxCharCount, maxOptionsCount, text);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeywordsParameter)) {
            return false;
        }
        KeywordsParameter keywordsParameter = (KeywordsParameter) other;
        return L.f(this.id, keywordsParameter.id) && L.f(this.title, keywordsParameter.title) && L.f(this.attrId, keywordsParameter.attrId) && L.f(this.displaying, keywordsParameter.displaying) && L.f(this._value, keywordsParameter._value) && this.visible == keywordsParameter.visible && L.f(this.phantom, keywordsParameter.phantom) && this.hasSuggest == keywordsParameter.hasSuggest && L.f(this.maxCharCount, keywordsParameter.maxCharCount) && L.f(this.maxOptionsCount, keywordsParameter.maxOptionsCount) && L.f(this.text, keywordsParameter.text);
    }

    @k
    public final String getAttrId() {
        return this.attrId;
    }

    @k
    public final KeywordDisplaying getDisplaying() {
        return this.displaying;
    }

    public final boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @l
    public final Integer getMaxCharCount() {
        return this.maxCharCount;
    }

    @l
    public final Integer getMaxOptionsCount() {
        return this.maxOptionsCount;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @k
    public Boolean getUpdatesForm() {
        return Boolean.valueOf(this.updatesForm);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @k
    public Boolean getVisible() {
        return Boolean.valueOf(this.visible);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iHashCode = (this.displaying.hashCode() + H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.attrId)) * 31;
        List<String> list = this._value;
        int i12 = r.i((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.visible);
        Boolean bool = this.phantom;
        int i13 = r.i((i12 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.hasSuggest);
        Integer num = this.maxCharCount;
        int iHashCode2 = (i13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxOptionsCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.text;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setText(@l String str) {
        this.text = str;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends String> list) {
        set_value2((List<String>) list);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("KeywordsParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", attrId=");
        sb2.append(this.attrId);
        sb2.append(", displaying=");
        sb2.append(this.displaying);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", hasSuggest=");
        sb2.append(this.hasSuggest);
        sb2.append(", maxCharCount=");
        sb2.append(this.maxCharCount);
        sb2.append(", maxOptionsCount=");
        sb2.append(this.maxOptionsCount);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.attrId);
        this.displaying.writeToParcel(parcel, flags);
        parcel.writeStringList(this._value);
        parcel.writeInt(this.visible ? 1 : 0);
        Boolean bool = this.phantom;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.hasSuggest ? 1 : 0);
        Integer num = this.maxCharCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.maxOptionsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeString(this.text);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends String> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<String> list) {
        this._value = list;
    }

    public KeywordsParameter(@k String str, @k String str2, @k String str3, @k KeywordDisplaying keywordDisplaying, @l List<String> list, boolean z12, @l Boolean bool, boolean z13, @l Integer num, @l Integer num2, @l String str4) {
        this.id = str;
        this.title = str2;
        this.attrId = str3;
        this.displaying = keywordDisplaying;
        this._value = list;
        this.visible = z12;
        this.phantom = bool;
        this.hasSuggest = z13;
        this.maxCharCount = num;
        this.maxOptionsCount = num2;
        this.text = str4;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }

    public static /* synthetic */ void getUpdatesForm$annotations() {
    }
}
