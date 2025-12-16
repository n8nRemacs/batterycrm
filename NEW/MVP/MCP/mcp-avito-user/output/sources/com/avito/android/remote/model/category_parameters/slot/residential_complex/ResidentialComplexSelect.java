package com.avito.android.remote.model.category_parameters.slot.residential_complex;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ResidentialComplexSlotConfig.kt */
@d
@s0
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0082\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020)HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020)HÖ\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001dR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010@R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bC\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bD\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bE\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010%¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "id", "title", "", "required", "updatesForm", "_value", "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "values", ChannelContext.Item.PLACEHOLDER, "type", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;)V", "getSelectedValue", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSelect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "Ljava/lang/Boolean;", "getUpdatesForm", "get_value", "set_value", "(Ljava/lang/String;)V", "Ljava/util/List;", "getValues", "getPlaceholder", "getType", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ResidentialComplexSelect extends EditableParameter<String> implements HasPlaceholder {

    @k
    public static final Parcelable.Creator<ResidentialComplexSelect> CREATOR = new Creator();

    @c("value")
    @l
    private String _value;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @l
    private final AttributedText motivation;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final String type;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @k
    private final List<SelectParameter.Value> values;

    /* compiled from: ResidentialComplexSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ResidentialComplexSelect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ResidentialComplexSelect createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = boolValueOf;
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(ResidentialComplexSelect.class, parcel, arrayList, iL2, 1);
            }
            return new ResidentialComplexSelect(string, string2, z12, bool, string3, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(ResidentialComplexSelect.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ResidentialComplexSelect[] newArray(int i12) {
            return new ResidentialComplexSelect[i12];
        }
    }

    public ResidentialComplexSelect(@k String str, @k String str2, boolean z12, @l Boolean bool, @l String str3, @k List<SelectParameter.Value> list, @l String str4, @k String str5, boolean z13, @l AttributedText attributedText) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.updatesForm = bool;
        this._value = str3;
        this.values = list;
        this.placeholder = str4;
        this.type = str5;
        this.immutable = z13;
        this.motivation = attributedText;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
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

    @l
    /* renamed from: component5, reason: from getter */
    public final String get_value() {
        return this._value;
    }

    @k
    public final List<SelectParameter.Value> component6() {
        return this.values;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @k
    public final ResidentialComplexSelect copy(@k String id2, @k String title, boolean required, @l Boolean updatesForm, @l String _value, @k List<SelectParameter.Value> values, @l String placeholder, @k String type, boolean immutable, @l AttributedText motivation) {
        return new ResidentialComplexSelect(id2, title, required, updatesForm, _value, values, placeholder, type, immutable, motivation);
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
        if (!(other instanceof ResidentialComplexSelect)) {
            return false;
        }
        ResidentialComplexSelect residentialComplexSelect = (ResidentialComplexSelect) other;
        return L.f(this.id, residentialComplexSelect.id) && L.f(this.title, residentialComplexSelect.title) && this.required == residentialComplexSelect.required && L.f(this.updatesForm, residentialComplexSelect.updatesForm) && L.f(this._value, residentialComplexSelect._value) && L.f(this.values, residentialComplexSelect.values) && L.f(this.placeholder, residentialComplexSelect.placeholder) && L.f(this.type, residentialComplexSelect.type) && this.immutable == residentialComplexSelect.immutable && L.f(this.motivation, residentialComplexSelect.motivation);
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

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final SelectParameter.Value getSelectedValue() {
        Object obj = null;
        if (getValue() == null) {
            return null;
        }
        Iterator<T> it = this.values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((SelectParameter.Value) next).getId(), getValue())) {
                obj = next;
                break;
            }
        }
        return (SelectParameter.Value) obj;
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
    public final List<SelectParameter.Value> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        String value = getValue();
        return !(value == null || value.length() == 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required);
        Boolean bool = this.updatesForm;
        int iHashCode = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this._value;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.values);
        String str2 = this.placeholder;
        int i13 = r.i(H.d((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.type), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        return i13 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResidentialComplexSelect(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        return a.w(sb2, this.motivation, ')');
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
        parcel.writeString(this._value);
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeString(this.placeholder);
        parcel.writeString(this.type);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
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

    public ResidentialComplexSelect(String str, String str2, boolean z12, Boolean bool, String str3, List list, String str4, String str5, boolean z13, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, str2, z12, bool, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? C42784z0.f406748b : list, (i12 & 64) != 0 ? null : str4, str5, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? null : attributedText);
    }
}
