package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectParameter.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameterValue;", "Landroid/os/Parcelable;", "", "version", "totalCount", "adultsCount", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/GuestsSelectParameterValue;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getVersion", "getTotalCount", "getAdultsCount", "Ljava/util/List;", "getChildren", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GuestsSelectParameterValue implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsSelectParameterValue> CREATOR = new Creator();

    @c("adultsCount")
    @l
    private final Integer adultsCount;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<String> children;

    @c("totalCount")
    @l
    private final Integer totalCount;

    @c("version")
    @l
    private final Integer version;

    /* compiled from: GuestsSelectParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GuestsSelectParameterValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestsSelectParameterValue createFromParcel(@k Parcel parcel) {
            return new GuestsSelectParameterValue(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GuestsSelectParameterValue[] newArray(int i12) {
            return new GuestsSelectParameterValue[i12];
        }
    }

    public GuestsSelectParameterValue(@l Integer num, @l Integer num2, @l Integer num3, @l List<String> list) {
        this.version = num;
        this.totalCount = num2;
        this.adultsCount = num3;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuestsSelectParameterValue copy$default(GuestsSelectParameterValue guestsSelectParameterValue, Integer num, Integer num2, Integer num3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = guestsSelectParameterValue.version;
        }
        if ((i12 & 2) != 0) {
            num2 = guestsSelectParameterValue.totalCount;
        }
        if ((i12 & 4) != 0) {
            num3 = guestsSelectParameterValue.adultsCount;
        }
        if ((i12 & 8) != 0) {
            list = guestsSelectParameterValue.children;
        }
        return guestsSelectParameterValue.copy(num, num2, num3, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getAdultsCount() {
        return this.adultsCount;
    }

    @l
    public final List<String> component4() {
        return this.children;
    }

    @k
    public final GuestsSelectParameterValue copy(@l Integer version, @l Integer totalCount, @l Integer adultsCount, @l List<String> children) {
        return new GuestsSelectParameterValue(version, totalCount, adultsCount, children);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestsSelectParameterValue)) {
            return false;
        }
        GuestsSelectParameterValue guestsSelectParameterValue = (GuestsSelectParameterValue) other;
        return L.f(this.version, guestsSelectParameterValue.version) && L.f(this.totalCount, guestsSelectParameterValue.totalCount) && L.f(this.adultsCount, guestsSelectParameterValue.adultsCount) && L.f(this.children, guestsSelectParameterValue.children);
    }

    @l
    public final Integer getAdultsCount() {
        return this.adultsCount;
    }

    @l
    public final List<String> getChildren() {
        return this.children;
    }

    @l
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @l
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.adultsCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.children;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectParameterValue(version=");
        sb2.append(this.version);
        sb2.append(", totalCount=");
        sb2.append(this.totalCount);
        sb2.append(", adultsCount=");
        sb2.append(this.adultsCount);
        sb2.append(", children=");
        return H.p(sb2, this.children, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.adultsCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        parcel.writeStringList(this.children);
    }
}
