package com.avito.android.user_viewed.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedAdvert.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/domain/model/UserViewedAdvert;", "Landroid/os/Parcelable;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserViewedAdvert implements Parcelable {

    @k
    public static final Parcelable.Creator<UserViewedAdvert> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318368b;

    /* renamed from: c, reason: collision with root package name */
    public final int f318369c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f318370d;

    /* renamed from: e, reason: collision with root package name */
    public final long f318371e;

    /* renamed from: f, reason: collision with root package name */
    public final long f318372f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Image f318373g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f318374h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f318375i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f318376j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f318377k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f318378l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final GeoReference f318379m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final ArrayList f318380n;

    /* compiled from: UserViewedAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedAdvert> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedAdvert createFromParcel(Parcel parcel) {
            GeoReference geoReference;
            boolean z12;
            boolean z13;
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(UserViewedAdvert.class.getClassLoader());
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            Image image = (Image) parcel.readParcelable(UserViewedAdvert.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            GeoReference geoReference2 = (GeoReference) parcel.readParcelable(UserViewedAdvert.class.getClassLoader());
            if (parcel.readInt() == 0) {
                z13 = z14;
                z12 = z15;
                geoReference = geoReference2;
                arrayList = null;
            } else {
                geoReference = geoReference2;
                int i13 = parcel.readInt();
                z12 = z15;
                ArrayList arrayList2 = new ArrayList(i13);
                z13 = z14;
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(UserViewedAdvert.class, parcel, arrayList2, iL2, 1);
                    i13 = i13;
                }
                arrayList = arrayList2;
            }
            return new UserViewedAdvert(string, i12, deepLink, j12, j13, image, string2, string3, string4, z13, z12, geoReference, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedAdvert[] newArray(int i12) {
            return new UserViewedAdvert[i12];
        }
    }

    public UserViewedAdvert(@k String str, int i12, @k DeepLink deepLink, long j12, long j13, @k Image image, @k String str2, @l String str3, @l String str4, boolean z12, boolean z13, @l GeoReference geoReference, @l ArrayList arrayList) {
        this.f318368b = str;
        this.f318369c = i12;
        this.f318370d = deepLink;
        this.f318371e = j12;
        this.f318372f = j13;
        this.f318373g = image;
        this.f318374h = str2;
        this.f318375i = str3;
        this.f318376j = str4;
        this.f318377k = z12;
        this.f318378l = z13;
        this.f318379m = geoReference;
        this.f318380n = arrayList;
    }

    public static UserViewedAdvert a(UserViewedAdvert userViewedAdvert, boolean z12) {
        return new UserViewedAdvert(userViewedAdvert.f318368b, userViewedAdvert.f318369c, userViewedAdvert.f318370d, userViewedAdvert.f318371e, userViewedAdvert.f318372f, userViewedAdvert.f318373g, userViewedAdvert.f318374h, userViewedAdvert.f318375i, userViewedAdvert.f318376j, userViewedAdvert.f318377k, z12, userViewedAdvert.f318379m, userViewedAdvert.f318380n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserViewedAdvert)) {
            return false;
        }
        UserViewedAdvert userViewedAdvert = (UserViewedAdvert) obj;
        return L.f(this.f318368b, userViewedAdvert.f318368b) && this.f318369c == userViewedAdvert.f318369c && L.f(this.f318370d, userViewedAdvert.f318370d) && this.f318371e == userViewedAdvert.f318371e && this.f318372f == userViewedAdvert.f318372f && L.f(this.f318373g, userViewedAdvert.f318373g) && L.f(this.f318374h, userViewedAdvert.f318374h) && L.f(this.f318375i, userViewedAdvert.f318375i) && L.f(this.f318376j, userViewedAdvert.f318376j) && this.f318377k == userViewedAdvert.f318377k && this.f318378l == userViewedAdvert.f318378l && L.f(this.f318379m, userViewedAdvert.f318379m) && L.f(this.f318380n, userViewedAdvert.f318380n);
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.g(this.f318373g, r.g(r.g(com.avito.android.actions_sheet.a.e(this.f318370d, r.e(this.f318369c, this.f318368b.hashCode() * 31, 31), 31), 31, this.f318371e), 31, this.f318372f), 31), 31, this.f318374h);
        String str = this.f318375i;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f318376j;
        int i12 = r.i(r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f318377k), 31, this.f318378l);
        GeoReference geoReference = this.f318379m;
        int iHashCode2 = (i12 + (geoReference == null ? 0 : geoReference.hashCode())) * 31;
        ArrayList arrayList = this.f318380n;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserViewedAdvert(id=");
        sb2.append(this.f318368b);
        sb2.append(", categoryId=");
        sb2.append(this.f318369c);
        sb2.append(", deeplink=");
        sb2.append(this.f318370d);
        sb2.append(", timestamp=");
        sb2.append(this.f318371e);
        sb2.append(", viewedAt=");
        sb2.append(this.f318372f);
        sb2.append(", image=");
        sb2.append(this.f318373g);
        sb2.append(", title=");
        sb2.append(this.f318374h);
        sb2.append(", price=");
        sb2.append(this.f318375i);
        sb2.append(", address=");
        sb2.append(this.f318376j);
        sb2.append(", isActive=");
        sb2.append(this.f318377k);
        sb2.append(", isFavorite=");
        sb2.append(this.f318378l);
        sb2.append(", geoReference=");
        sb2.append(this.f318379m);
        sb2.append(", buttons=");
        return e.p(sb2, this.f318380n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318368b);
        parcel.writeInt(this.f318369c);
        parcel.writeParcelable(this.f318370d, i12);
        parcel.writeLong(this.f318371e);
        parcel.writeLong(this.f318372f);
        parcel.writeParcelable(this.f318373g, i12);
        parcel.writeString(this.f318374h);
        parcel.writeString(this.f318375i);
        parcel.writeString(this.f318376j);
        parcel.writeInt(this.f318377k ? 1 : 0);
        parcel.writeInt(this.f318378l ? 1 : 0);
        parcel.writeParcelable(this.f318379m, i12);
        ArrayList arrayList = this.f318380n;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            parcel.writeParcelable((Parcelable) itY.next(), i12);
        }
    }
}
