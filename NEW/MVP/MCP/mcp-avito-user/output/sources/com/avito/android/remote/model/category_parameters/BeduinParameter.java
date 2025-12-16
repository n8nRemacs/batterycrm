package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinParameter.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jt\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020$HÖ\u0001¢\u0006\u0004\b+\u0010&J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020$HÖ\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u00106R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b;\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010 R\u0014\u0010E\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0013¨\u0006G"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BeduinParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "id", "title", "", "required", "updatesForm", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "_value", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "universalPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Lcom/avito/android/beduin_models/BeduinUniversalPageContent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "component8", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component9", "()Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Lcom/avito/android/beduin_models/BeduinUniversalPageContent;)Lcom/avito/android/remote/model/category_parameters/BeduinParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "setTitle", "(Ljava/lang/String;)V", "Z", "getRequired", "Ljava/lang/Boolean;", "getUpdatesForm", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "get_value", "set_value", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "getUniversalPage", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BeduinParameter extends EditableParameter<String> {

    @k
    public static final String TYPE = "beduin";

    @c("value")
    @l
    private String _value;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private String title;

    @c("universalPage")
    @l
    private final BeduinUniversalPageContent universalPage;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @k
    public static final Parcelable.Creator<BeduinParameter> CREATOR = new Creator();

    /* compiled from: BeduinParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BeduinParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BeduinParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinParameter(string, string2, z12, boolValueOf, parcel.readInt() != 0, (AttributedText) parcel.readParcelable(BeduinParameter.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null, (BeduinUniversalPageContent) parcel.readParcelable(BeduinParameter.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BeduinParameter[] newArray(int i12) {
            return new BeduinParameter[i12];
        }
    }

    public /* synthetic */ BeduinParameter(String str, String str2, boolean z12, Boolean bool, boolean z13, AttributedText attributedText, String str3, DisplayingOptions displayingOptions, BeduinUniversalPageContent beduinUniversalPageContent, int i12, C42822w c42822w) {
        this(str, str2, z12, bool, z13, attributedText, str3, (i12 & 128) != 0 ? null : displayingOptions, (i12 & 256) != 0 ? null : beduinUniversalPageContent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String get_value() {
        return this._value;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinUniversalPageContent getUniversalPage() {
        return this.universalPage;
    }

    @k
    public final BeduinParameter copy(@k String id2, @k String title, boolean required, @l Boolean updatesForm, boolean immutable, @l AttributedText motivation, @l String _value, @l DisplayingOptions displayingOptions, @l BeduinUniversalPageContent universalPage) {
        return new BeduinParameter(id2, title, required, updatesForm, immutable, motivation, _value, displayingOptions, universalPage);
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
        if (!(other instanceof BeduinParameter)) {
            return false;
        }
        BeduinParameter beduinParameter = (BeduinParameter) other;
        return L.f(this.id, beduinParameter.id) && L.f(this.title, beduinParameter.title) && this.required == beduinParameter.required && L.f(this.updatesForm, beduinParameter.updatesForm) && this.immutable == beduinParameter.immutable && L.f(this.motivation, beduinParameter.motivation) && L.f(this._value, beduinParameter._value) && L.f(this.displayingOptions, beduinParameter.displayingOptions) && L.f(this.universalPage, beduinParameter.universalPage);
    }

    @l
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
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

    @l
    public final BeduinUniversalPageContent getUniversalPage() {
        return this.universalPage;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required);
        Boolean bool = this.updatesForm;
        int i13 = r.i((i12 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i13 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this._value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode3 = (iHashCode2 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        BeduinUniversalPageContent beduinUniversalPageContent = this.universalPage;
        return iHashCode3 + (beduinUniversalPageContent != null ? beduinUniversalPageContent.hashCode() : 0);
    }

    public void setTitle(@k String str) {
        this.title = str;
    }

    @k
    public String toString() {
        return "BeduinParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", updatesForm=" + this.updatesForm + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", _value=" + this._value + ", displayingOptions=" + this.displayingOptions + ", universalPage=" + this.universalPage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        parcel.writeString(this._value);
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.universalPage, flags);
    }

    public BeduinParameter(@k String str, @k String str2, boolean z12, @l Boolean bool, boolean z13, @l AttributedText attributedText, @l String str3, @l DisplayingOptions displayingOptions, @l BeduinUniversalPageContent beduinUniversalPageContent) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.updatesForm = bool;
        this.immutable = z13;
        this.motivation = attributedText;
        this._value = str3;
        this.displayingOptions = displayingOptions;
        this.universalPage = beduinUniversalPageContent;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public String get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l String str) {
        this._value = str;
    }
}
