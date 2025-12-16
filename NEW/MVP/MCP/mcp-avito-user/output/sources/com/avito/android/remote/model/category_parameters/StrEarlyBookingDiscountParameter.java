package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrEarlyBookingDiscountParameter.kt */
@d
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\\\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b0\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b1\u0010\u0015R\u0017\u00102\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\u0019\u0010:\u001a\u0004\u0018\u0001068F¢\u0006\f\u0012\u0004\b9\u00105\u001a\u0004\b7\u00108R\u0019\u0010=\u001a\u0004\u0018\u0001068F¢\u0006\f\u0012\u0004\b<\u00105\u001a\u0004\b;\u00108¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/StrEarlyBookingDiscountParameter;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "visible", "phantom", "_isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/StrEarlyBookingDiscountParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "getParameters", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "get_isEnabled", "isEnabled", "()Z", "isEnabled$annotations", "()V", "Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getDaysParameter", "()Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getDaysParameter$annotations", "daysParameter", "getPercentParameter", "getPercentParameter$annotations", "percentParameter", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrEarlyBookingDiscountParameter implements ParameterSlot, Visibility, Phantom {

    @k
    public static final String TYPE = "earlyBookingParameter";

    @c("isEnabled")
    @l
    private final transient Boolean _isEnabled;

    @c("id")
    @k
    private final String id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<ParameterSlot> parameters;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("title")
    @l
    private final String title;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<StrEarlyBookingDiscountParameter> CREATOR = new Creator();

    /* compiled from: StrEarlyBookingDiscountParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrEarlyBookingDiscountParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrEarlyBookingDiscountParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(StrEarlyBookingDiscountParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            return new StrEarlyBookingDiscountParameter(string, string2, arrayList, boolValueOf, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrEarlyBookingDiscountParameter[] newArray(int i12) {
            return new StrEarlyBookingDiscountParameter[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrEarlyBookingDiscountParameter(@k String str, @l String str2, @l List<? extends ParameterSlot> list, @l Boolean bool, @l Boolean bool2, @l Boolean bool3) {
        this.id = str;
        this.title = str2;
        this.parameters = list;
        this.visible = bool;
        this.phantom = bool2;
        this._isEnabled = bool3;
    }

    public static /* synthetic */ StrEarlyBookingDiscountParameter copy$default(StrEarlyBookingDiscountParameter strEarlyBookingDiscountParameter, String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strEarlyBookingDiscountParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = strEarlyBookingDiscountParameter.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            list = strEarlyBookingDiscountParameter.parameters;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            bool = strEarlyBookingDiscountParameter.visible;
        }
        Boolean bool4 = bool;
        if ((i12 & 16) != 0) {
            bool2 = strEarlyBookingDiscountParameter.phantom;
        }
        Boolean bool5 = bool2;
        if ((i12 & 32) != 0) {
            bool3 = strEarlyBookingDiscountParameter._isEnabled;
        }
        return strEarlyBookingDiscountParameter.copy(str, str3, list2, bool4, bool5, bool3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<ParameterSlot> component3() {
        return this.parameters;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    @k
    public final StrEarlyBookingDiscountParameter copy(@k String id2, @l String title, @l List<? extends ParameterSlot> parameters, @l Boolean visible, @l Boolean phantom, @l Boolean _isEnabled) {
        return new StrEarlyBookingDiscountParameter(id2, title, parameters, visible, phantom, _isEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrEarlyBookingDiscountParameter)) {
            return false;
        }
        StrEarlyBookingDiscountParameter strEarlyBookingDiscountParameter = (StrEarlyBookingDiscountParameter) other;
        return L.f(this.id, strEarlyBookingDiscountParameter.id) && L.f(this.title, strEarlyBookingDiscountParameter.title) && L.f(this.parameters, strEarlyBookingDiscountParameter.parameters) && L.f(this.visible, strEarlyBookingDiscountParameter.visible) && L.f(this.phantom, strEarlyBookingDiscountParameter.phantom) && L.f(this._isEnabled, strEarlyBookingDiscountParameter._isEnabled);
    }

    @l
    public final IntParameter getDaysParameter() {
        List arrayList;
        List<ParameterSlot> list = this.parameters;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof IntParameter) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = C42784z0.f406748b;
        }
        return (IntParameter) C42745f0.G(arrayList);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final List<ParameterSlot> getParameters() {
        return this.parameters;
    }

    @l
    public final IntParameter getPercentParameter() {
        List arrayList;
        List<ParameterSlot> list = this.parameters;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof IntParameter) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = C42784z0.f406748b;
        }
        return (IntParameter) C42745f0.K(1, arrayList);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @l
    public final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ParameterSlot> list = this.parameters;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this._isEnabled;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final boolean isEnabled() {
        Boolean bool = this._isEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrEarlyBookingDiscountParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", _isEnabled=");
        return C0.g(sb2, this._isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        List<ParameterSlot> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
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
        Boolean bool3 = this._isEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
    }

    public /* synthetic */ StrEarlyBookingDiscountParameter(String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? Boolean.TRUE : bool, (i12 & 16) != 0 ? Boolean.FALSE : bool2, bool3);
    }

    public static /* synthetic */ void getDaysParameter$annotations() {
    }

    public static /* synthetic */ void getPercentParameter$annotations() {
    }

    public static /* synthetic */ void isEnabled$annotations() {
    }
}
