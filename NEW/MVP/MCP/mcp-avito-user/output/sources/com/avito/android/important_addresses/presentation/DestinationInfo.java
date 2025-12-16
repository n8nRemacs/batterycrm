package com.avito.android.important_addresses.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesState.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses/presentation/DestinationInfo;", "Landroid/os/Parcelable;", "Coords", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DestinationInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DestinationInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f169586b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Coords f169587c;

    /* renamed from: d, reason: collision with root package name */
    public final int f169588d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f169589e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f169590f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f169591g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f169592h;

    /* compiled from: ImportantAddressesState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/DestinationInfo$Coords;", "Landroid/os/Parcelable;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Coords implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Coords> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final double f169593b;

        /* renamed from: c, reason: collision with root package name */
        public final double f169594c;

        /* compiled from: ImportantAddressesState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Coords> {
            @Override // android.os.Parcelable.Creator
            public final Coords createFromParcel(Parcel parcel) {
                return new Coords(parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Coords[] newArray(int i12) {
                return new Coords[i12];
            }
        }

        public Coords(double d12, double d13) {
            this.f169593b = d12;
            this.f169594c = d13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coords)) {
                return false;
            }
            Coords coords = (Coords) obj;
            return Double.compare(this.f169593b, coords.f169593b) == 0 && Double.compare(this.f169594c, coords.f169594c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f169594c) + (Double.hashCode(this.f169593b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Coords(lat=");
            sb2.append(this.f169593b);
            sb2.append(", lng=");
            return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f169594c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeDouble(this.f169593b);
            parcel.writeDouble(this.f169594c);
        }
    }

    /* compiled from: ImportantAddressesState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DestinationInfo> {
        @Override // android.os.Parcelable.Creator
        public final DestinationInfo createFromParcel(Parcel parcel) {
            return new DestinationInfo(parcel.readInt(), Coords.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DestinationInfo[] newArray(int i12) {
            return new DestinationInfo[i12];
        }
    }

    public DestinationInfo(int i12, @Y61.k Coords coords, @InterfaceC42150f int i13, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f169586b = i12;
        this.f169587c = coords;
        this.f169588d = i13;
        this.f169589e = str;
        this.f169590f = str2;
        this.f169591g = str3;
        this.f169592h = str4;
    }

    public static DestinationInfo a(DestinationInfo destinationInfo, String str, String str2, String str3, int i12) {
        if ((i12 & 16) != 0) {
            str = destinationInfo.f169590f;
        }
        String str4 = str;
        if ((i12 & 32) != 0) {
            str2 = destinationInfo.f169591g;
        }
        String str5 = str2;
        if ((i12 & 64) != 0) {
            str3 = destinationInfo.f169592h;
        }
        return new DestinationInfo(destinationInfo.f169586b, destinationInfo.f169587c, destinationInfo.f169588d, destinationInfo.f169589e, str4, str5, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestinationInfo)) {
            return false;
        }
        DestinationInfo destinationInfo = (DestinationInfo) obj;
        return this.f169586b == destinationInfo.f169586b && L.f(this.f169587c, destinationInfo.f169587c) && this.f169588d == destinationInfo.f169588d && L.f(this.f169589e, destinationInfo.f169589e) && L.f(this.f169590f, destinationInfo.f169590f) && L.f(this.f169591g, destinationInfo.f169591g) && L.f(this.f169592h, destinationInfo.f169592h);
    }

    public final int hashCode() {
        int iD2 = H.d(androidx.appcompat.app.r.e(this.f169588d, (this.f169587c.hashCode() + (Integer.hashCode(this.f169586b) * 31)) * 31, 31), 31, this.f169589e);
        String str = this.f169590f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f169591g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f169592h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DestinationInfo(id=");
        sb2.append(this.f169586b);
        sb2.append(", coords=");
        sb2.append(this.f169587c);
        sb2.append(", iconAttr=");
        sb2.append(this.f169588d);
        sb2.append(", destinationName=");
        sb2.append(this.f169589e);
        sb2.append(", masstransitTravelTime=");
        sb2.append(this.f169590f);
        sb2.append(", pedestrianTravelTime=");
        sb2.append(this.f169591g);
        sb2.append(", autoTravelTime=");
        return C22026a.c(sb2, this.f169592h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f169586b);
        this.f169587c.writeToParcel(parcel, i12);
        parcel.writeInt(this.f169588d);
        parcel.writeString(this.f169589e);
        parcel.writeString(this.f169590f);
        parcel.writeString(this.f169591g);
        parcel.writeString(this.f169592h);
    }

    public /* synthetic */ DestinationInfo(int i12, Coords coords, int i13, String str, String str2, String str3, String str4, int i14, C42822w c42822w) {
        this(i12, coords, i13, str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4);
    }
}
