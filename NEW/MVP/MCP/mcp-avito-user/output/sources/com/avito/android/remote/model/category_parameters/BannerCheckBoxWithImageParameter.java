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
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BannerCheckBoxWithImageParameter.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002HIB_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jz\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001dR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010AR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010#R\u0014\u0010G\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0015¨\u0006J"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BannerCheckBoxWithImageParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "_value", "", "Lcom/avito/android/remote/model/category_parameters/BannerCheckBoxWithImageParameter$Value;", "values", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/util/List;", "component9", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;)Lcom/avito/android/remote/model/category_parameters/BannerCheckBoxWithImageParameter;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Ljava/lang/Integer;", "get_value", "set_value", "(Ljava/lang/Integer;)V", "Ljava/util/List;", "getValues", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "getType", "type", "Companion", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BannerCheckBoxWithImageParameter extends EditableParameter<Integer> {

    @k
    public static final String TYPE = "bannerCheckBoxWithImage";

    @c("value")
    @l
    private Integer _value;

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
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @l
    private final List<Value> values;

    @k
    public static final Parcelable.Creator<BannerCheckBoxWithImageParameter> CREATOR = new Creator();

    /* compiled from: BannerCheckBoxWithImageParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BannerCheckBoxWithImageParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerCheckBoxWithImageParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BannerCheckBoxWithImageParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(Value.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new BannerCheckBoxWithImageParameter(string, string2, z12, z13, attributedText, boolValueOf, numValueOf, arrayList, parcel.readInt() != 0 ? DisplayingOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BannerCheckBoxWithImageParameter[] newArray(int i12) {
            return new BannerCheckBoxWithImageParameter[i12];
        }
    }

    /* compiled from: BannerCheckBoxWithImageParameter.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/BannerCheckBoxWithImageParameter$Value;", "Landroid/os/Parcelable;", "", "id", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("title")
        @k
        private final String title;

        /* compiled from: BannerCheckBoxWithImageParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @k String str2) {
            this.id = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
        }
    }

    public BannerCheckBoxWithImageParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l Integer num, @l List<Value> list, @l DisplayingOptions displayingOptions) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this._value = num;
        this.values = list;
        this.displayingOptions = displayingOptions;
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

    /* renamed from: component4, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer get_value() {
        return this._value;
    }

    @l
    public final List<Value> component8() {
        return this.values;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @k
    public final BannerCheckBoxWithImageParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l Integer _value, @l List<Value> values, @l DisplayingOptions displayingOptions) {
        return new BannerCheckBoxWithImageParameter(id2, title, required, immutable, motivation, updatesForm, _value, values, displayingOptions);
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
        if (!(other instanceof BannerCheckBoxWithImageParameter)) {
            return false;
        }
        BannerCheckBoxWithImageParameter bannerCheckBoxWithImageParameter = (BannerCheckBoxWithImageParameter) other;
        return L.f(this.id, bannerCheckBoxWithImageParameter.id) && L.f(this.title, bannerCheckBoxWithImageParameter.title) && this.required == bannerCheckBoxWithImageParameter.required && this.immutable == bannerCheckBoxWithImageParameter.immutable && L.f(this.motivation, bannerCheckBoxWithImageParameter.motivation) && L.f(this.updatesForm, bannerCheckBoxWithImageParameter.updatesForm) && L.f(this._value, bannerCheckBoxWithImageParameter._value) && L.f(this.values, bannerCheckBoxWithImageParameter.values) && L.f(this.displayingOptions, bannerCheckBoxWithImageParameter.displayingOptions);
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final List<Value> getValues() {
        return this.values;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this._value;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Value> list = this.values;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        return iHashCode4 + (displayingOptions != null ? displayingOptions.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BannerCheckBoxWithImageParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", updatesForm=" + this.updatesForm + ", _value=" + this._value + ", values=" + this.values + ", displayingOptions=" + this.displayingOptions + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this._value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        List<Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Value) itA.next()).writeToParcel(parcel, flags);
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
    public Integer get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Integer num) {
        this._value = num;
    }
}
