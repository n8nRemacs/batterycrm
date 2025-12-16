package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LocationParameter.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001DBa\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010\u001bJt\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020$HÖ\u0001¢\u0006\u0004\b+\u0010&J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020$HÖ\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u0019R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010>R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b?\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b@\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bA\u0010\u001bR\u0014\u0010C\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0014¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/LocationParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/Location;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "updatesForm", "required", "_value", "visible", "phantom", "immutable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/Location;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Ljava/lang/Boolean;", "component5", "()Z", "component6", "()Lcom/avito/android/remote/model/Location;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/Location;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lcom/avito/android/remote/model/category_parameters/LocationParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Z", "getRequired", "Lcom/avito/android/remote/model/Location;", "get_value", "set_value", "(Lcom/avito/android/remote/model/Location;)V", "getVisible", "getPhantom", "getImmutable", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LocationParameter extends EditableParameter<Location> implements Visibility, Phantom {

    @k
    public static final String TYPE = "location";

    @c("value")
    @l
    private Location _value;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<LocationParameter> CREATOR = new Creator();

    /* compiled from: LocationParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocationParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LocationParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(LocationParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z12 = parcel.readInt() != 0;
            Location locationCreateFromParcel = parcel.readInt() == 0 ? null : Location.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LocationParameter(string, string2, attributedText, boolValueOf, z12, locationCreateFromParcel, boolValueOf2, boolValueOf3, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LocationParameter[] newArray(int i12) {
            return new LocationParameter[i12];
        }
    }

    public /* synthetic */ LocationParameter(String str, String str2, AttributedText attributedText, Boolean bool, boolean z12, Location location, Boolean bool2, Boolean bool3, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, attributedText, bool, z12, (i12 & 32) != 0 ? null : location, (i12 & 64) != 0 ? Boolean.FALSE : bool2, (i12 & 128) != 0 ? Boolean.FALSE : bool3, (i12 & 256) != 0 ? false : z13);
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

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Location get_value() {
        return this._value;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @k
    public final LocationParameter copy(@k String id2, @k String title, @l AttributedText motivation, @l Boolean updatesForm, boolean required, @l Location _value, @l Boolean visible, @l Boolean phantom, boolean immutable) {
        return new LocationParameter(id2, title, motivation, updatesForm, required, _value, visible, phantom, immutable);
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
        if (!(other instanceof LocationParameter)) {
            return false;
        }
        LocationParameter locationParameter = (LocationParameter) other;
        return L.f(this.id, locationParameter.id) && L.f(this.title, locationParameter.title) && L.f(this.motivation, locationParameter.motivation) && L.f(this.updatesForm, locationParameter.updatesForm) && this.required == locationParameter.required && L.f(this._value, locationParameter._value) && L.f(this.visible, locationParameter.visible) && L.f(this.phantom, locationParameter.phantom) && this.immutable == locationParameter.immutable;
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return "location";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        AttributedText attributedText = this.motivation;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int i12 = r.i((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.required);
        Location location = this._value;
        int iHashCode2 = (i12 + (location == null ? 0 : location.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        return Boolean.hashCode(this.immutable) + ((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", immutable=");
        return r.x(sb2, this.immutable, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.required ? 1 : 0);
        Location location = this._value;
        if (location == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            location.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.visible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.phantom;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeInt(this.immutable ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Location get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Location location) {
        this._value = location;
    }

    public LocationParameter(@k String str, @k String str2, @l AttributedText attributedText, @l Boolean bool, boolean z12, @l Location location, @l Boolean bool2, @l Boolean bool3, boolean z13) {
        this.id = str;
        this.title = str2;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.required = z12;
        this._value = location;
        this.visible = bool2;
        this.phantom = bool3;
        this.immutable = z13;
    }
}
