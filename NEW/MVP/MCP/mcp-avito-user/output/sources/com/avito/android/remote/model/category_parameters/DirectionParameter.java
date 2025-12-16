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
import com.avito.android.remote.model.Direction;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DirectionParameter.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 G2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001GBS\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJd\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0017R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010\u001dR \u0010>\u001a\u00020\t8\u0016X\u0096D¢\u0006\u0012\n\u0004\b>\u0010<\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001dR \u0010B\u001a\u00020\t8\u0016X\u0096D¢\u0006\u0012\n\u0004\bB\u0010<\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010\u001dR\u0014\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0012¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DirectionParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/Direction;", "", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "updatesForm", "_value", "Lcom/avito/android/remote/model/category_parameters/Displaying;", Navigation.DISPLAYING, "resetAreaOnChange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/Displaying;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/category_parameters/Displaying;", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/Displaying;Z)Lcom/avito/android/remote/model/category_parameters/DirectionParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Lcom/avito/android/remote/model/category_parameters/Displaying;", "getDisplaying", "Z", "getResetAreaOnChange", "required", "getRequired", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DirectionParameter extends EditableParameter<List<? extends Direction>> {

    @k
    public static final String TYPE = "direction";

    @c("value")
    @l
    private List<Direction> _value;

    @c(Navigation.DISPLAYING)
    @l
    private final Displaying displaying;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;
    private final boolean required;

    @c("resetAreaOnChange")
    private final boolean resetAreaOnChange;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @k
    public static final Parcelable.Creator<DirectionParameter> CREATOR = new Creator();

    /* compiled from: DirectionParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DirectionParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DirectionParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DirectionParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Direction.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new DirectionParameter(string, string2, attributedText, boolValueOf, arrayList, parcel.readInt() != 0 ? Displaying.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DirectionParameter[] newArray(int i12) {
            return new DirectionParameter[i12];
        }
    }

    public /* synthetic */ DirectionParameter(String str, String str2, AttributedText attributedText, Boolean bool, List list, Displaying displaying, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, attributedText, bool, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : displaying, (i12 & 64) != 0 ? false : z12);
    }

    public static /* synthetic */ DirectionParameter copy$default(DirectionParameter directionParameter, String str, String str2, AttributedText attributedText, Boolean bool, List list, Displaying displaying, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = directionParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = directionParameter.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            attributedText = directionParameter.motivation;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 8) != 0) {
            bool = directionParameter.updatesForm;
        }
        Boolean bool2 = bool;
        if ((i12 & 16) != 0) {
            list = directionParameter._value;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            displaying = directionParameter.displaying;
        }
        Displaying displaying2 = displaying;
        if ((i12 & 64) != 0) {
            z12 = directionParameter.resetAreaOnChange;
        }
        return directionParameter.copy(str, str3, attributedText2, bool2, list2, displaying2, z12);
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

    @l
    public final List<Direction> component5() {
        return this._value;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Displaying getDisplaying() {
        return this.displaying;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @k
    public final DirectionParameter copy(@k String id2, @k String title, @l AttributedText motivation, @l Boolean updatesForm, @l List<Direction> _value, @l Displaying displaying, boolean resetAreaOnChange) {
        return new DirectionParameter(id2, title, motivation, updatesForm, _value, displaying, resetAreaOnChange);
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
        if (!(other instanceof DirectionParameter)) {
            return false;
        }
        DirectionParameter directionParameter = (DirectionParameter) other;
        return L.f(this.id, directionParameter.id) && L.f(this.title, directionParameter.title) && L.f(this.motivation, directionParameter.motivation) && L.f(this.updatesForm, directionParameter.updatesForm) && L.f(this._value, directionParameter._value) && L.f(this.displaying, directionParameter.displaying) && this.resetAreaOnChange == directionParameter.resetAreaOnChange;
    }

    @l
    public final Displaying getDisplaying() {
        return this.displaying;
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

    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return "direction";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        AttributedText attributedText = this.motivation;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Direction> list = this._value;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Displaying displaying = this.displaying;
        return Boolean.hashCode(this.resetAreaOnChange) + ((iHashCode3 + (displaying != null ? displaying.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public /* bridge */ /* synthetic */ void set_value(List<? extends Direction> list) {
        set_value2((List<Direction>) list);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DirectionParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", displaying=");
        sb2.append(this.displaying);
        sb2.append(", resetAreaOnChange=");
        return r.x(sb2, this.resetAreaOnChange, ')');
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
        List<Direction> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Direction) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
    }

    public DirectionParameter(@k String str, @k String str2, @l AttributedText attributedText, @l Boolean bool, @l List<Direction> list, @l Displaying displaying, boolean z12) {
        this.id = str;
        this.title = str2;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this._value = list;
        this.displaying = displaying;
        this.resetAreaOnChange = z12;
        this.required = true;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends Direction> get_value() {
        return this._value;
    }

    /* renamed from: set_value, reason: avoid collision after fix types in other method */
    public void set_value2(@l List<Direction> list) {
        this._value = list;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}
