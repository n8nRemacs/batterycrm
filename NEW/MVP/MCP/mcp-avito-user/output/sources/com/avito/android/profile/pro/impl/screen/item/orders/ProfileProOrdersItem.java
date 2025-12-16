package com.avito.android.profile.pro.impl.screen.item.orders;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProOrdersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/orders/ProfileProOrdersItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProOrdersItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProOrdersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223359b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f223360c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f223361d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f223362e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f223363f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f223364g;

    /* compiled from: ProfileProOrdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProOrdersItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProOrdersItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ProfileProOrdersItem.class.getClassLoader());
            DeepLink deepLink2 = (DeepLink) parcel.readParcelable(ProfileProOrdersItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(parcel.readValue(ProfileProOrdersItem.class.getClassLoader()));
            }
            return new ProfileProOrdersItem(string, string2, string3, deepLink, deepLink2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProOrdersItem[] newArray(int i12) {
            return new ProfileProOrdersItem[i12];
        }
    }

    public ProfileProOrdersItem(@k String str, @l String str2, @l String str3, @l DeepLink deepLink, @l DeepLink deepLink2, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f223359b = str;
        this.f223360c = str2;
        this.f223361d = str3;
        this.f223362e = deepLink;
        this.f223363f = deepLink2;
        this.f223364g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProOrdersItem)) {
            return false;
        }
        ProfileProOrdersItem profileProOrdersItem = (ProfileProOrdersItem) obj;
        return L.f(this.f223359b, profileProOrdersItem.f223359b) && L.f(this.f223360c, profileProOrdersItem.f223360c) && L.f(this.f223361d, profileProOrdersItem.f223361d) && L.f(this.f223362e, profileProOrdersItem.f223362e) && L.f(this.f223363f, profileProOrdersItem.f223363f) && L.f(this.f223364g, profileProOrdersItem.f223364g);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223441b() {
        return this.f223359b;
    }

    public final int hashCode() {
        int iHashCode = this.f223359b.hashCode() * 31;
        String str = this.f223360c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f223361d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f223362e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f223363f;
        return this.f223364g.hashCode() + ((iHashCode4 + (deepLink2 != null ? deepLink2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProOrdersItem(stringId=");
        sb2.append(this.f223359b);
        sb2.append(", title=");
        sb2.append(this.f223360c);
        sb2.append(", badgeTitle=");
        sb2.append(this.f223361d);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.f223362e);
        sb2.append(", onShowDeepLink=");
        sb2.append(this.f223363f);
        sb2.append(", items=");
        return H.n(sb2, this.f223364g, ')');
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223359b);
        parcel.writeString(this.f223360c);
        parcel.writeString(this.f223361d);
        parcel.writeParcelable(this.f223362e, i12);
        parcel.writeParcelable(this.f223363f, i12);
        ?? r32 = this.f223364g;
        parcel.writeInt(r32.size());
        Iterator it = r32.iterator();
        while (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }
}
