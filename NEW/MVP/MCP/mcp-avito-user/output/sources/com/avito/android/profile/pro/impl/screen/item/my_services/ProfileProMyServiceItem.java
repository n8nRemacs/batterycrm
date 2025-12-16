package com.avito.android.profile.pro.impl.screen.item.my_services;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProMyServiceItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/my_services/ProfileProMyServiceItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/profile/pro/impl/screen/item/group/row/a;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProMyServiceItem implements Parcelable, com.avito.android.profile.pro.impl.screen.item.group.row.a {

    @k
    public static final Parcelable.Creator<ProfileProMyServiceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223328b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f223329c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f223330d;

    /* renamed from: e, reason: collision with root package name */
    public final long f223331e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f223332f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f223333g;

    /* compiled from: ProfileProMyServiceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProMyServiceItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProMyServiceItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ProfileProMyServiceItem.class.getClassLoader());
            return new ProfileProMyServiceItem(string, parcel.readString(), parcel.readString(), parcel.readLong(), deepLink, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProMyServiceItem[] newArray(int i12) {
            return new ProfileProMyServiceItem[i12];
        }
    }

    public ProfileProMyServiceItem(@k String str, @k String str2, @k String str3, long j12, @k DeepLink deepLink, @k String str4) {
        this.f223328b = str;
        this.f223329c = deepLink;
        this.f223330d = str2;
        this.f223331e = j12;
        this.f223332f = str3;
        this.f223333g = str4;
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    public final List<String> L() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    /* renamed from: W, reason: from getter */
    public final String getF223593j() {
        return this.f223333g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProMyServiceItem)) {
            return false;
        }
        ProfileProMyServiceItem profileProMyServiceItem = (ProfileProMyServiceItem) obj;
        return L.f(this.f223328b, profileProMyServiceItem.f223328b) && L.f(this.f223329c, profileProMyServiceItem.f223329c) && L.f(this.f223330d, profileProMyServiceItem.f223330d) && this.f223331e == profileProMyServiceItem.f223331e && L.f(this.f223332f, profileProMyServiceItem.f223332f) && L.f(this.f223333g, profileProMyServiceItem.f223333g);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    /* renamed from: f, reason: from getter */
    public final String getF223592i() {
        return this.f223332f;
    }

    public final int hashCode() {
        return this.f223333g.hashCode() + H.d(r.g(H.d(com.avito.android.actions_sheet.a.e(this.f223329c, this.f223328b.hashCode() * 31, 31), 31, this.f223330d), 31, this.f223331e), 31, this.f223332f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProMyServiceItem(title=");
        sb2.append(this.f223328b);
        sb2.append(", uri=");
        sb2.append(this.f223329c);
        sb2.append(", icon=");
        sb2.append(this.f223330d);
        sb2.append(", notificationCount=");
        sb2.append(this.f223331e);
        sb2.append(", sectionName=");
        sb2.append(this.f223332f);
        sb2.append(", subsectionName=");
        return C22026a.c(sb2, this.f223333g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223328b);
        parcel.writeParcelable(this.f223329c, i12);
        parcel.writeString(this.f223330d);
        parcel.writeLong(this.f223331e);
        parcel.writeString(this.f223332f);
        parcel.writeString(this.f223333g);
    }
}
