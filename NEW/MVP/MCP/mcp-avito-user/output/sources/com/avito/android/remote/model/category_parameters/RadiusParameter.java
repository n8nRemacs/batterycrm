package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RadiusParameter.kt */
@d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001VBu\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020,HÖ\u0001¢\u0006\u0004\b3\u0010.J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020,HÖ\u0001¢\u0006\u0004\b8\u00109R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b<\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\u001eR\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010 R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010\"\"\u0004\bE\u0010FR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bH\u0010\u001eR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010(R \u0010M\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\u0012\n\u0004\bM\u0010A\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010 R\u0014\u0010R\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0019R\u001a\u0010U\u001a\u00020\u00068VX\u0096\u0004¢\u0006\f\u0012\u0004\bT\u0010P\u001a\u0004\bS\u0010\u0019¨\u0006W"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/RadiusParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/Radius;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "updatesForm", "required", "_value", "visible", "phantom", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "values", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/Radius;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Ljava/lang/Boolean;", "component5", "()Z", "component6", "()Lcom/avito/android/remote/model/Radius;", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;ZLcom/avito/android/remote/model/Radius;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)Lcom/avito/android/remote/model/category_parameters/RadiusParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Z", "getRequired", "Lcom/avito/android/remote/model/Radius;", "get_value", "set_value", "(Lcom/avito/android/remote/model/Radius;)V", "getVisible", "getPhantom", "Ljava/util/List;", "getValues", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "immutable", "getImmutable", "getImmutable$annotations", "()V", "getType", "type", "getPlaceholder", "getPlaceholder$annotations", ChannelContext.Item.PLACEHOLDER, "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RadiusParameter extends EditableParameter<Radius> implements Visibility, HasPlaceholder, Phantom {

    @k
    public static final String LEGACY_TYPE = "searchRadius";

    @k
    public static final String TYPE = "radius";

    @c("value")
    @l
    private Radius _value;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("id")
    @k
    private final String id;
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

    @c("values")
    @l
    private final List<SelectParameter.Value> values;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<RadiusParameter> CREATOR = new Creator();

    /* compiled from: RadiusParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RadiusParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RadiusParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(RadiusParameter.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z12 = parcel.readInt() != 0;
            Radius radiusCreateFromParcel = parcel.readInt() == 0 ? null : Radius.CREATOR.createFromParcel(parcel);
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
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(SelectParameter.Value.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new RadiusParameter(string, string2, attributedText, boolValueOf, z12, radiusCreateFromParcel, boolValueOf2, boolValueOf3, arrayList, parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RadiusParameter[] newArray(int i12) {
            return new RadiusParameter[i12];
        }
    }

    public /* synthetic */ RadiusParameter(String str, String str2, AttributedText attributedText, Boolean bool, boolean z12, Radius radius, Boolean bool2, Boolean bool3, List list, DisplayingOptions displayingOptions, int i12, C42822w c42822w) {
        this(str, str2, attributedText, bool, z12, (i12 & 32) != 0 ? null : radius, (i12 & 64) != 0 ? Boolean.FALSE : bool2, (i12 & 128) != 0 ? Boolean.FALSE : bool3, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : displayingOptions);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
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
    public final Radius get_value() {
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

    @l
    public final List<SelectParameter.Value> component9() {
        return this.values;
    }

    @k
    public final RadiusParameter copy(@k String id2, @k String title, @l AttributedText motivation, @l Boolean updatesForm, boolean required, @l Radius _value, @l Boolean visible, @l Boolean phantom, @l List<SelectParameter.Value> values, @l DisplayingOptions displayingOptions) {
        return new RadiusParameter(id2, title, motivation, updatesForm, required, _value, visible, phantom, values, displayingOptions);
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
        if (!(other instanceof RadiusParameter)) {
            return false;
        }
        RadiusParameter radiusParameter = (RadiusParameter) other;
        return L.f(this.id, radiusParameter.id) && L.f(this.title, radiusParameter.title) && L.f(this.motivation, radiusParameter.motivation) && L.f(this.updatesForm, radiusParameter.updatesForm) && this.required == radiusParameter.required && L.f(this._value, radiusParameter._value) && L.f(this.visible, radiusParameter.visible) && L.f(this.phantom, radiusParameter.phantom) && L.f(this.values, radiusParameter.values) && L.f(this.displayingOptions, radiusParameter.displayingOptions);
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

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @k
    public String getPlaceholder() {
        return "Радиус";
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
        return "radius";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final List<SelectParameter.Value> getValues() {
        return this.values;
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
        Radius radius = this._value;
        int iHashCode2 = (i12 + (radius == null ? 0 : radius.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<SelectParameter.Value> list = this.values;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        return iHashCode5 + (displayingOptions != null ? displayingOptions.hashCode() : 0);
    }

    @k
    public String toString() {
        return "RadiusParameter(id=" + this.id + ", title=" + this.title + ", motivation=" + this.motivation + ", updatesForm=" + this.updatesForm + ", required=" + this.required + ", _value=" + this._value + ", visible=" + this.visible + ", phantom=" + this.phantom + ", values=" + this.values + ", displayingOptions=" + this.displayingOptions + ')';
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
        Radius radius = this._value;
        if (radius == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            radius.writeToParcel(parcel, flags);
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
        List<SelectParameter.Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SelectParameter.Value) itA.next()).writeToParcel(parcel, flags);
            }
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Radius get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Radius radius) {
        this._value = radius;
    }

    public RadiusParameter(@k String str, @k String str2, @l AttributedText attributedText, @l Boolean bool, boolean z12, @l Radius radius, @l Boolean bool2, @l Boolean bool3, @l List<SelectParameter.Value> list, @l DisplayingOptions displayingOptions) {
        this.id = str;
        this.title = str2;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.required = z12;
        this._value = radius;
        this.visible = bool2;
        this.phantom = bool3;
        this.values = list;
        this.displayingOptions = displayingOptions;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getPlaceholder$annotations() {
    }
}
