package com.avito.android.remote.model.category_parameters.slot.car_body_condition;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.PointWithPosition;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarBodyConditionSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;", "Lcom/avito/android/deep_linking/links/PointWithPosition;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/Position;", "position", "", "paramsTitle", "", "params", "<init>", "(Lcom/avito/android/deep_linking/links/Position;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/avito/android/deep_linking/links/Position;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/avito/android/deep_linking/links/Position;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySidePoint;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/Position;", "getPosition", "Ljava/lang/String;", "getParamsTitle", "Ljava/util/List;", "getParams", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarBodySidePoint implements PointWithPosition, Parcelable {

    @k
    public static final Parcelable.Creator<CarBodySidePoint> CREATOR = new Creator();

    @c("params")
    @k
    private final List<String> params;

    @c("paramsTitle")
    @l
    private final String paramsTitle;

    @c("position")
    @k
    private final com.avito.android.deep_linking.links.Position position;

    /* compiled from: CarBodyConditionSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CarBodySidePoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarBodySidePoint createFromParcel(@k Parcel parcel) {
            return new CarBodySidePoint((com.avito.android.deep_linking.links.Position) parcel.readParcelable(CarBodySidePoint.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarBodySidePoint[] newArray(int i12) {
            return new CarBodySidePoint[i12];
        }
    }

    public CarBodySidePoint(@k com.avito.android.deep_linking.links.Position position, @l String str, @k List<String> list) {
        this.position = position;
        this.paramsTitle = str;
        this.params = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarBodySidePoint copy$default(CarBodySidePoint carBodySidePoint, com.avito.android.deep_linking.links.Position position, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            position = carBodySidePoint.position;
        }
        if ((i12 & 2) != 0) {
            str = carBodySidePoint.paramsTitle;
        }
        if ((i12 & 4) != 0) {
            list = carBodySidePoint.params;
        }
        return carBodySidePoint.copy(position, str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final com.avito.android.deep_linking.links.Position getPosition() {
        return this.position;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getParamsTitle() {
        return this.paramsTitle;
    }

    @k
    public final List<String> component3() {
        return this.params;
    }

    @k
    public final CarBodySidePoint copy(@k com.avito.android.deep_linking.links.Position position, @l String paramsTitle, @k List<String> params) {
        return new CarBodySidePoint(position, paramsTitle, params);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarBodySidePoint)) {
            return false;
        }
        CarBodySidePoint carBodySidePoint = (CarBodySidePoint) other;
        return L.f(this.position, carBodySidePoint.position) && L.f(this.paramsTitle, carBodySidePoint.paramsTitle) && L.f(this.params, carBodySidePoint.params);
    }

    @k
    public final List<String> getParams() {
        return this.params;
    }

    @l
    public final String getParamsTitle() {
        return this.paramsTitle;
    }

    @Override // com.avito.android.deep_linking.links.PointWithPosition
    @k
    public com.avito.android.deep_linking.links.Position getPosition() {
        return this.position;
    }

    public int hashCode() {
        int iHashCode = this.position.hashCode() * 31;
        String str = this.paramsTitle;
        return this.params.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarBodySidePoint(position=");
        sb2.append(this.position);
        sb2.append(", paramsTitle=");
        sb2.append(this.paramsTitle);
        sb2.append(", params=");
        return H.p(sb2, this.params, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.position, flags);
        parcel.writeString(this.paramsTitle);
        parcel.writeStringList(this.params);
    }
}
