package com.avito.android.geo_common.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CoordsByAddressResult.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/geo_common/model/CoordsByAddressResult$Point;", "point", "", "postalCode", MessageBody.Location.KIND, "normalizedAddress", "", "Lcom/avito/android/geo_common/model/CoordsByAddressResult$Components;", "components", "<init>", "(Lcom/avito/android/geo_common/model/CoordsByAddressResult$Point;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/geo_common/model/CoordsByAddressResult$Point;", "d", "()Lcom/avito/android/geo_common/model/CoordsByAddressResult$Point;", "Ljava/lang/String;", "getPostalCode", "()Ljava/lang/String;", "getKind", "c", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Components", "Point", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CoordsByAddressResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CoordsByAddressResult> CREATOR = new a();

    @c("components")
    @l
    private final List<Components> components;

    @c(MessageBody.Location.KIND)
    @k
    private final String kind;

    @c("normalizedAddress")
    @k
    private final String normalizedAddress;

    @c("point")
    @k
    private final Point point;

    @c("postalCode")
    @l
    private final String postalCode;

    /* compiled from: CoordsByAddressResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/geo_common/model/CoordsByAddressResult$Components;", "Landroid/os/Parcelable;", "", MessageBody.Location.KIND, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKind", "()Ljava/lang/String;", "getName", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Components implements Parcelable {

        @k
        public static final Parcelable.Creator<Components> CREATOR = new a();

        @c(MessageBody.Location.KIND)
        @k
        private final String kind;

        @c("name")
        @k
        private final String name;

        /* compiled from: CoordsByAddressResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Components> {
            @Override // android.os.Parcelable.Creator
            public final Components createFromParcel(Parcel parcel) {
                return new Components(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Components[] newArray(int i12) {
                return new Components[i12];
            }
        }

        public Components(@k String str, @k String str2) {
            this.kind = str;
            this.name = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Components)) {
                return false;
            }
            Components components = (Components) obj;
            return L.f(this.kind, components.kind) && L.f(this.name, components.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.kind.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Components(kind=");
            sb2.append(this.kind);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.kind);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: CoordsByAddressResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/geo_common/model/CoordsByAddressResult$Point;", "Landroid/os/Parcelable;", "", "latitude", "longitude", "<init>", "(DD)V", "D", "c", "()D", "d", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Point implements Parcelable {

        @k
        public static final Parcelable.Creator<Point> CREATOR = new a();

        @c("latitude")
        private final double latitude;

        @c("longitude")
        private final double longitude;

        /* compiled from: CoordsByAddressResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Point> {
            @Override // android.os.Parcelable.Creator
            public final Point createFromParcel(Parcel parcel) {
                return new Point(parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Point[] newArray(int i12) {
                return new Point[i12];
            }
        }

        public Point(double d12, double d13) {
            this.latitude = d12;
            this.longitude = d13;
        }

        /* renamed from: c, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* renamed from: d, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Point)) {
                return false;
            }
            Point point = (Point) obj;
            return Double.compare(this.latitude, point.latitude) == 0 && Double.compare(this.longitude, point.longitude) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Point(latitude=");
            sb2.append(this.latitude);
            sb2.append(", longitude=");
            return e.o(sb2, this.longitude, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeDouble(this.latitude);
            parcel.writeDouble(this.longitude);
        }
    }

    /* compiled from: CoordsByAddressResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CoordsByAddressResult> {
        @Override // android.os.Parcelable.Creator
        public final CoordsByAddressResult createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Point pointCreateFromParcel = Point.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Components.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new CoordsByAddressResult(pointCreateFromParcel, string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CoordsByAddressResult[] newArray(int i12) {
            return new CoordsByAddressResult[i12];
        }
    }

    public CoordsByAddressResult(@k Point point, @l String str, @k String str2, @k String str3, @l List<Components> list) {
        this.point = point;
        this.postalCode = str;
        this.kind = str2;
        this.normalizedAddress = str3;
        this.components = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getNormalizedAddress() {
        return this.normalizedAddress;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Point getPoint() {
        return this.point;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoordsByAddressResult)) {
            return false;
        }
        CoordsByAddressResult coordsByAddressResult = (CoordsByAddressResult) obj;
        return L.f(this.point, coordsByAddressResult.point) && L.f(this.postalCode, coordsByAddressResult.postalCode) && L.f(this.kind, coordsByAddressResult.kind) && L.f(this.normalizedAddress, coordsByAddressResult.normalizedAddress) && L.f(this.components, coordsByAddressResult.components);
    }

    public final int hashCode() {
        int iHashCode = this.point.hashCode() * 31;
        String str = this.postalCode;
        int iD2 = H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.kind), 31, this.normalizedAddress);
        List<Components> list = this.components;
        return iD2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoordsByAddressResult(point=");
        sb2.append(this.point);
        sb2.append(", postalCode=");
        sb2.append(this.postalCode);
        sb2.append(", kind=");
        sb2.append(this.kind);
        sb2.append(", normalizedAddress=");
        sb2.append(this.normalizedAddress);
        sb2.append(", components=");
        return H.p(sb2, this.components, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.point.writeToParcel(parcel, i12);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.kind);
        parcel.writeString(this.normalizedAddress);
        List<Components> list = this.components;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Components) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
