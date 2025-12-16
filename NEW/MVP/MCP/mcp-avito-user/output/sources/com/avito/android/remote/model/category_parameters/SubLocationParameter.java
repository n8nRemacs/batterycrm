package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Sublocation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SubLocationParameter.kt */
@d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B_\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u0017Jn\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020%HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020%HÖ\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010<R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bA\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bB\u0010\u0017R \u0010C\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bC\u00105\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\u0017R \u0010G\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010F\u001a\u0004\bI\u0010JR \u0010L\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\u0012\n\u0004\bL\u0010H\u0012\u0004\bN\u0010F\u001a\u0004\bM\u0010JR\"\u0010O\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096D¢\u0006\u0012\n\u0004\bO\u0010?\u0012\u0004\bQ\u0010F\u001a\u0004\bP\u0010\u001f¨\u0006R"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SubLocationParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/Sublocation;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "Lcom/avito/android/remote/model/Sublocation$Type;", "sublocationType", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "_value", "", "values", "", "visible", "phantom", "type", "<init>", "(Lcom/avito/android/remote/model/Sublocation$Type;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Sublocation;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/Sublocation$Type;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Lcom/avito/android/remote/model/Sublocation;", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "copy", "(Lcom/avito/android/remote/model/Sublocation$Type;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/Sublocation;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/SubLocationParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Sublocation$Type;", "getSublocationType", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Lcom/avito/android/remote/model/Sublocation;", "get_value", "set_value", "(Lcom/avito/android/remote/model/Sublocation;)V", "Ljava/util/List;", "getValues", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "getType", "id", "getId", "getId$annotations", "()V", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "immutable", "getImmutable", "getImmutable$annotations", "updatesForm", "getUpdatesForm", "getUpdatesForm$annotations", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SubLocationParameter extends EditableParameter<Sublocation> implements Visibility, Phantom {

    @k
    public static final Parcelable.Creator<SubLocationParameter> CREATOR = new Creator();

    @c("value")
    @l
    private Sublocation _value;

    @k
    private final String id;
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final boolean required;

    @k
    private final Sublocation.Type sublocationType;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    @l
    private final Boolean updatesForm;

    @k
    private final List<Sublocation> values;

    @c("visible")
    @l
    private final Boolean visible;

    /* compiled from: SubLocationParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubLocationParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SubLocationParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Sublocation.Type type = (Sublocation.Type) parcel.readParcelable(SubLocationParameter.class.getClassLoader());
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SubLocationParameter.class.getClassLoader());
            Sublocation sublocation = (Sublocation) parcel.readParcelable(SubLocationParameter.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(SubLocationParameter.class, parcel, arrayList, iL2, 1);
            }
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SubLocationParameter(type, string, attributedText, sublocation, arrayList, boolValueOf, boolValueOf2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SubLocationParameter[] newArray(int i12) {
            return new SubLocationParameter[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubLocationParameter(@k Sublocation.Type type, @k String str, @l AttributedText attributedText, @l Sublocation sublocation, @k List<? extends Sublocation> list, @l Boolean bool, @l Boolean bool2, @k String str2) {
        this.sublocationType = type;
        this.title = str;
        this.motivation = attributedText;
        this._value = sublocation;
        this.values = list;
        this.visible = bool;
        this.phantom = bool2;
        this.type = str2;
        this.id = type.getIdParam();
        this.required = true;
        this.updatesForm = Boolean.FALSE;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Sublocation.Type getSublocationType() {
        return this.sublocationType;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Sublocation get_value() {
        return this._value;
    }

    @k
    public final List<Sublocation> component5() {
        return this.values;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    public final SubLocationParameter copy(@k Sublocation.Type sublocationType, @k String title, @l AttributedText motivation, @l Sublocation _value, @k List<? extends Sublocation> values, @l Boolean visible, @l Boolean phantom, @k String type) {
        return new SubLocationParameter(sublocationType, title, motivation, _value, values, visible, phantom, type);
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
        if (!(other instanceof SubLocationParameter)) {
            return false;
        }
        SubLocationParameter subLocationParameter = (SubLocationParameter) other;
        return L.f(this.sublocationType, subLocationParameter.sublocationType) && L.f(this.title, subLocationParameter.title) && L.f(this.motivation, subLocationParameter.motivation) && L.f(this._value, subLocationParameter._value) && L.f(this.values, subLocationParameter.values) && L.f(this.visible, subLocationParameter.visible) && L.f(this.phantom, subLocationParameter.phantom) && L.f(this.type, subLocationParameter.type);
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

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @k
    public final Sublocation.Type getSublocationType() {
        return this.sublocationType;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return this.type;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @k
    public final List<Sublocation> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.sublocationType.hashCode() * 31, 31, this.title);
        AttributedText attributedText = this.motivation;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Sublocation sublocation = this._value;
        int iE2 = H.e((iHashCode + (sublocation == null ? 0 : sublocation.hashCode())) * 31, 31, this.values);
        Boolean bool = this.visible;
        int iHashCode2 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        return this.type.hashCode() + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SubLocationParameter(sublocationType=");
        sb2.append(this.sublocationType);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.sublocationType, flags);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.motivation, flags);
        parcel.writeParcelable(this._value, flags);
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        Boolean bool = this.visible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.phantom;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.type);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Sublocation get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Sublocation sublocation) {
        this._value = sublocation;
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }

    public static /* synthetic */ void getUpdatesForm$annotations() {
    }

    public SubLocationParameter(Sublocation.Type type, String str, AttributedText attributedText, Sublocation sublocation, List list, Boolean bool, Boolean bool2, String str2, int i12, C42822w c42822w) {
        this(type, str, attributedText, (i12 & 8) != 0 ? null : sublocation, (i12 & 16) != 0 ? C42784z0.f406748b : list, (i12 & 32) != 0 ? Boolean.FALSE : bool, (i12 & 64) != 0 ? Boolean.FALSE : bool2, (i12 & 128) != 0 ? "" : str2);
    }
}
