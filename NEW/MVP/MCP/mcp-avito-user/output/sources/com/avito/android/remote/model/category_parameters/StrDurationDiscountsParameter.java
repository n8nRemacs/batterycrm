package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
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
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrDurationDiscountsParameter.kt */
@d
@s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b4\u0010\u0018R\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00078F¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0014¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/StrDurationDiscountsParameter;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/remote/model/category_parameters/StrPayload;", "payload", "", "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/StrPayload;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/category_parameters/StrPayload;", "component5", "()Ljava/lang/Boolean;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/StrPayload;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/StrDurationDiscountsParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "getParameters", "Lcom/avito/android/remote/model/category_parameters/StrPayload;", "getPayload", "Ljava/lang/Boolean;", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/StrDurationDiscountsSelect;", "getDiscountSelectParameters", "getDiscountSelectParameters$annotations", "()V", "discountSelectParameters", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrDurationDiscountsParameter implements ParameterSlot, Visibility, Phantom {

    @k
    public static final String TYPE = "durationDiscountsParameter";

    @c("id")
    @k
    private final String id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<ParameterSlot> parameters;

    @c("payload")
    @l
    private final StrPayload payload;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c("title")
    @k
    private final String title;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<StrDurationDiscountsParameter> CREATOR = new Creator();

    /* compiled from: StrDurationDiscountsParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrDurationDiscountsParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrDurationDiscountsParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(StrDurationDiscountsParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            StrPayload strPayloadCreateFromParcel = parcel.readInt() == 0 ? null : StrPayload.CREATOR.createFromParcel(parcel);
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
            return new StrDurationDiscountsParameter(string, string2, arrayList, strPayloadCreateFromParcel, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrDurationDiscountsParameter[] newArray(int i12) {
            return new StrDurationDiscountsParameter[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrDurationDiscountsParameter(@k String str, @k String str2, @l List<? extends ParameterSlot> list, @l StrPayload strPayload, @l Boolean bool, @l Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.parameters = list;
        this.payload = strPayload;
        this.visible = bool;
        this.phantom = bool2;
    }

    public static /* synthetic */ StrDurationDiscountsParameter copy$default(StrDurationDiscountsParameter strDurationDiscountsParameter, String str, String str2, List list, StrPayload strPayload, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strDurationDiscountsParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = strDurationDiscountsParameter.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            list = strDurationDiscountsParameter.parameters;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            strPayload = strDurationDiscountsParameter.payload;
        }
        StrPayload strPayload2 = strPayload;
        if ((i12 & 16) != 0) {
            bool = strDurationDiscountsParameter.visible;
        }
        Boolean bool3 = bool;
        if ((i12 & 32) != 0) {
            bool2 = strDurationDiscountsParameter.phantom;
        }
        return strDurationDiscountsParameter.copy(str, str3, list2, strPayload2, bool3, bool2);
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
    public final List<ParameterSlot> component3() {
        return this.parameters;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final StrPayload getPayload() {
        return this.payload;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final StrDurationDiscountsParameter copy(@k String id2, @k String title, @l List<? extends ParameterSlot> parameters, @l StrPayload payload, @l Boolean visible, @l Boolean phantom) {
        return new StrDurationDiscountsParameter(id2, title, parameters, payload, visible, phantom);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrDurationDiscountsParameter)) {
            return false;
        }
        StrDurationDiscountsParameter strDurationDiscountsParameter = (StrDurationDiscountsParameter) other;
        return L.f(this.id, strDurationDiscountsParameter.id) && L.f(this.title, strDurationDiscountsParameter.title) && L.f(this.parameters, strDurationDiscountsParameter.parameters) && L.f(this.payload, strDurationDiscountsParameter.payload) && L.f(this.visible, strDurationDiscountsParameter.visible) && L.f(this.phantom, strDurationDiscountsParameter.phantom);
    }

    @k
    public final List<StrDurationDiscountsSelect> getDiscountSelectParameters() {
        ArrayList arrayList;
        List<ParameterSlot> list = this.parameters;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof StrDurationDiscountsSelect) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C42784z0.f406748b : arrayList;
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
    public final StrPayload getPayload() {
        return this.payload;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        List<ParameterSlot> list = this.parameters;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        StrPayload strPayload = this.payload;
        int iHashCode2 = (iHashCode + (strPayload == null ? 0 : strPayload.hashCode())) * 31;
        Boolean bool = this.visible;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phantom;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrDurationDiscountsParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", payload=");
        sb2.append(this.payload);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        return C0.g(sb2, this.phantom, ')');
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
        StrPayload strPayload = this.payload;
        if (strPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strPayload.writeToParcel(parcel, flags);
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
    }

    public /* synthetic */ StrDurationDiscountsParameter(String str, String str2, List list, StrPayload strPayload, Boolean bool, Boolean bool2, int i12, C42822w c42822w) {
        this(str, str2, list, strPayload, (i12 & 16) != 0 ? Boolean.TRUE : bool, (i12 & 32) != 0 ? Boolean.FALSE : bool2);
    }

    public static /* synthetic */ void getDiscountSelectParameters$annotations() {
    }
}
