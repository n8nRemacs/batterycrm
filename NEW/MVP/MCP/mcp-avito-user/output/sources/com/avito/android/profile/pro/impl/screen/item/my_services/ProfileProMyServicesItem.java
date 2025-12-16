package com.avito.android.profile.pro.impl.screen.item.my_services;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProMyServicesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/my_services/ProfileProMyServicesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProMyServicesItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProMyServicesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223334b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f223335c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f223336d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f223337e;

    /* compiled from: ProfileProMyServicesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProMyServicesItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProMyServicesItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ProfileProMyServicesItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ProfileProMyServiceItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ProfileProMyServicesItem(deepLink, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProMyServicesItem[] newArray(int i12) {
            return new ProfileProMyServicesItem[i12];
        }
    }

    public ProfileProMyServicesItem(@l DeepLink deepLink, @k String str, @l String str2, @l ArrayList arrayList) {
        this.f223334b = str;
        this.f223335c = str2;
        this.f223336d = deepLink;
        this.f223337e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProMyServicesItem)) {
            return false;
        }
        ProfileProMyServicesItem profileProMyServicesItem = (ProfileProMyServicesItem) obj;
        return L.f(this.f223334b, profileProMyServicesItem.f223334b) && L.f(this.f223335c, profileProMyServicesItem.f223335c) && L.f(this.f223336d, profileProMyServicesItem.f223336d) && L.f(this.f223337e, profileProMyServicesItem.f223337e);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217853b() {
        return this.f223334b;
    }

    public final int hashCode() {
        int iHashCode = this.f223334b.hashCode() * 31;
        String str = this.f223335c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f223336d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ArrayList arrayList = this.f223337e;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProMyServicesItem(stringId=");
        sb2.append(this.f223334b);
        sb2.append(", title=");
        sb2.append(this.f223335c);
        sb2.append(", uri=");
        sb2.append(this.f223336d);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f223337e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223334b);
        parcel.writeString(this.f223335c);
        parcel.writeParcelable(this.f223336d, i12);
        ArrayList arrayList = this.f223337e;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((ProfileProMyServiceItem) itY.next()).writeToParcel(parcel, i12);
        }
    }
}
