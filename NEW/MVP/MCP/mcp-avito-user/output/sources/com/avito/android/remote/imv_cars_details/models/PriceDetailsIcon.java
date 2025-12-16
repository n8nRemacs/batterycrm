package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsIcon;", "Landroid/os/Parcelable;", "", "name", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceDetailsIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceDetailsIcon> CREATOR = new a();

    @c("color")
    @l
    private final String color;

    @c("name")
    @k
    private final String name;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceDetailsIcon> {
        @Override // android.os.Parcelable.Creator
        public final PriceDetailsIcon createFromParcel(Parcel parcel) {
            return new PriceDetailsIcon(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceDetailsIcon[] newArray(int i12) {
            return new PriceDetailsIcon[i12];
        }
    }

    public PriceDetailsIcon(@k String str, @l String str2) {
        this.name = str;
        this.color = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDetailsIcon)) {
            return false;
        }
        PriceDetailsIcon priceDetailsIcon = (PriceDetailsIcon) obj;
        return L.f(this.name, priceDetailsIcon.name) && L.f(this.color, priceDetailsIcon.color);
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.color;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceDetailsIcon(name=");
        sb2.append(this.name);
        sb2.append(", color=");
        return C22026a.c(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        parcel.writeString(this.color);
    }
}
