package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/Location;", "Landroid/os/Parcelable;", "", AddressParameter.TYPE, "Lcom/avito/user_stats/model/extended_user_stats/Metro;", MetroParameter.TYPE, "<init>", "(Ljava/lang/String;Lcom/avito/user_stats/model/extended_user_stats/Metro;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/user_stats/model/extended_user_stats/Metro;", "d", "()Lcom/avito/user_stats/model/extended_user_stats/Metro;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Location implements Parcelable {

    @k
    public static final Parcelable.Creator<Location> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c(MetroParameter.TYPE)
    @l
    private final Metro metro;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Location> {
        @Override // android.os.Parcelable.Creator
        public final Location createFromParcel(Parcel parcel) {
            return new Location(parcel.readString(), parcel.readInt() == 0 ? null : Metro.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Location[] newArray(int i12) {
            return new Location[i12];
        }
    }

    public Location(@k String str, @l Metro metro) {
        this.address = str;
        this.metro = metro;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Metro getMetro() {
        return this.metro;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return L.f(this.address, location.address) && L.f(this.metro, location.metro);
    }

    public final int hashCode() {
        int iHashCode = this.address.hashCode() * 31;
        Metro metro = this.metro;
        return iHashCode + (metro == null ? 0 : metro.hashCode());
    }

    @k
    public final String toString() {
        return "Location(address=" + this.address + ", metro=" + this.metro + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.address);
        Metro metro = this.metro;
        if (metro == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metro.writeToParcel(parcel, i12);
        }
    }
}
