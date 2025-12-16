package com.avito.android.profile.pro.impl.screen.item.employee.company;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProEmployeeCompanyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/company/ProfileProEmployeeCompanyItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProEmployeeCompanyItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProEmployeeCompanyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223208b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f223209c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f223210d;

    /* compiled from: ProfileProEmployeeCompanyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProEmployeeCompanyItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProEmployeeCompanyItem createFromParcel(Parcel parcel) {
            return new ProfileProEmployeeCompanyItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ProfileProEmployeeCompanyItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProEmployeeCompanyItem[] newArray(int i12) {
            return new ProfileProEmployeeCompanyItem[i12];
        }
    }

    public ProfileProEmployeeCompanyItem(@k String str, @k String str2, @l Image image) {
        this.f223208b = str;
        this.f223209c = str2;
        this.f223210d = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProEmployeeCompanyItem)) {
            return false;
        }
        ProfileProEmployeeCompanyItem profileProEmployeeCompanyItem = (ProfileProEmployeeCompanyItem) obj;
        return L.f(this.f223208b, profileProEmployeeCompanyItem.f223208b) && L.f(this.f223209c, profileProEmployeeCompanyItem.f223209c) && L.f(this.f223210d, profileProEmployeeCompanyItem.f223210d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222246b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223291b() {
        return this.f223208b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f223208b.hashCode() * 31, 31, this.f223209c);
        Image image = this.f223210d;
        return iD2 + (image == null ? 0 : image.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProEmployeeCompanyItem(stringId=");
        sb2.append(this.f223208b);
        sb2.append(", title=");
        sb2.append(this.f223209c);
        sb2.append(", image=");
        return AK.c.o(sb2, this.f223210d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223208b);
        parcel.writeString(this.f223209c);
        parcel.writeParcelable(this.f223210d, i12);
    }
}
