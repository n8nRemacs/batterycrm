package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrDurationDiscountsParameter.kt */
@d
@s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000bR\u0019\u0010'\u001a\u0004\u0018\u00010\"8F¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0019\u0010*\u001a\u0004\u0018\u00010\"8F¢\u0006\f\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010$¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/StrDurationDiscountsSelect;", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "id", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/StrDurationDiscountsSelect;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getParameters", "Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getDaysParameter", "()Lcom/avito/android/remote/model/category_parameters/IntParameter;", "getDaysParameter$annotations", "()V", "daysParameter", "getPercentParameter", "getPercentParameter$annotations", "percentParameter", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrDurationDiscountsSelect implements ParameterSlot {

    @k
    public static final String TYPE = "durationDiscountSelect";

    @c("id")
    @k
    private final String id;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<ParameterSlot> parameters;

    @k
    public static final Parcelable.Creator<StrDurationDiscountsSelect> CREATOR = new Creator();

    /* compiled from: StrDurationDiscountsParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrDurationDiscountsSelect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrDurationDiscountsSelect createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(StrDurationDiscountsSelect.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new StrDurationDiscountsSelect(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrDurationDiscountsSelect[] newArray(int i12) {
            return new StrDurationDiscountsSelect[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrDurationDiscountsSelect(@k String str, @l List<? extends ParameterSlot> list) {
        this.id = str;
        this.parameters = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrDurationDiscountsSelect copy$default(StrDurationDiscountsSelect strDurationDiscountsSelect, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strDurationDiscountsSelect.id;
        }
        if ((i12 & 2) != 0) {
            list = strDurationDiscountsSelect.parameters;
        }
        return strDurationDiscountsSelect.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<ParameterSlot> component2() {
        return this.parameters;
    }

    @k
    public final StrDurationDiscountsSelect copy(@k String id2, @l List<? extends ParameterSlot> parameters) {
        return new StrDurationDiscountsSelect(id2, parameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrDurationDiscountsSelect)) {
            return false;
        }
        StrDurationDiscountsSelect strDurationDiscountsSelect = (StrDurationDiscountsSelect) other;
        return L.f(this.id, strDurationDiscountsSelect.id) && L.f(this.parameters, strDurationDiscountsSelect.parameters);
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

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<ParameterSlot> list = this.parameters;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrDurationDiscountsSelect(id=");
        sb2.append(this.id);
        sb2.append(", parameters=");
        return H.p(sb2, this.parameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        List<ParameterSlot> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public static /* synthetic */ void getDaysParameter$annotations() {
    }

    public static /* synthetic */ void getPercentParameter$annotations() {
    }
}
