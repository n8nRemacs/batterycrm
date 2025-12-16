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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/NeighborParameter;", "Landroid/os/Parcelable;", "", "value", "details", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "c", "getTitle", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NeighborParameter implements Parcelable {

    @k
    public static final Parcelable.Creator<NeighborParameter> CREATOR = new a();

    @c("details")
    @l
    private final String details;

    @c("title")
    @k
    private final String title;

    @c("value")
    @k
    private final String value;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NeighborParameter> {
        @Override // android.os.Parcelable.Creator
        public final NeighborParameter createFromParcel(Parcel parcel) {
            return new NeighborParameter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NeighborParameter[] newArray(int i12) {
            return new NeighborParameter[i12];
        }
    }

    public NeighborParameter(@k String str, @l String str2, @k String str3) {
        this.value = str;
        this.details = str2;
        this.title = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NeighborParameter)) {
            return false;
        }
        NeighborParameter neighborParameter = (NeighborParameter) obj;
        return L.f(this.value, neighborParameter.value) && L.f(this.details, neighborParameter.details) && L.f(this.title, neighborParameter.title);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.details;
        return this.title.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NeighborParameter(value=");
        sb2.append(this.value);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.value);
        parcel.writeString(this.details);
        parcel.writeString(this.title);
    }
}
