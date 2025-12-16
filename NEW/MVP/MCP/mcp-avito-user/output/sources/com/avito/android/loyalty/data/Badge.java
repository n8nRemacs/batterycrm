package com.avito.android.loyalty.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Badge.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/data/Badge;", "Landroid/os/Parcelable;", "_avito_loyalty_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Badge implements Parcelable {

    @k
    public static final Parcelable.Creator<Badge> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f182980b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f182981c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f182982d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f182983e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f182984f;

    /* compiled from: Badge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Badge> {
        @Override // android.os.Parcelable.Creator
        public final Badge createFromParcel(Parcel parcel) {
            return new Badge(parcel.readInt(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(Badge.class.getClassLoader()), (DeepLink) parcel.readParcelable(Badge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Badge[] newArray(int i12) {
            return new Badge[i12];
        }
    }

    public Badge(int i12, @k String str, @l String str2, @l UniversalImage universalImage, @l DeepLink deepLink) {
        this.f182980b = i12;
        this.f182981c = str;
        this.f182982d = str2;
        this.f182983e = universalImage;
        this.f182984f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return this.f182980b == badge.f182980b && L.f(this.f182981c, badge.f182981c) && L.f(this.f182982d, badge.f182982d) && L.f(this.f182983e, badge.f182983e) && L.f(this.f182984f, badge.f182984f);
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f182980b) * 31, 31, this.f182981c);
        String str = this.f182982d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.f182983e;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        DeepLink deepLink = this.f182984f;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Badge(id=");
        sb2.append(this.f182980b);
        sb2.append(", title=");
        sb2.append(this.f182981c);
        sb2.append(", description=");
        sb2.append(this.f182982d);
        sb2.append(", icon=");
        sb2.append(this.f182983e);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f182984f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f182980b);
        parcel.writeString(this.f182981c);
        parcel.writeString(this.f182982d);
        parcel.writeParcelable(this.f182983e, i12);
        parcel.writeParcelable(this.f182984f, i12);
    }
}
