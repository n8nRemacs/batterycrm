package com.avito.android.passport.profile_list_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.user_hat.ProfileStatus;
import com.avito.android.component.user_hat.ProfileType;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileListItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_list_item/PassportListProfileItem;", "Lcom/avito/android/passport/profile_list_item/PassportListItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportListProfileItem implements PassportListItem {

    @Y61.k
    public static final Parcelable.Creator<PassportListProfileItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f213627b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f213628c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f213629d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Image f213630e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f213631f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f213632g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ProfileType f213633h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ProfileStatus f213634i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f213635j;

    /* compiled from: ProfileListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportListProfileItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportListProfileItem createFromParcel(Parcel parcel) {
            return new PassportListProfileItem(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(PassportListProfileItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, ProfileType.valueOf(parcel.readString()), ProfileStatus.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportListProfileItem[] newArray(int i12) {
            return new PassportListProfileItem[i12];
        }
    }

    public PassportListProfileItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Image image, @Y61.k String str4, boolean z12, @Y61.k ProfileType profileType, @Y61.k ProfileStatus profileStatus, @Y61.k String str5) {
        this.f213627b = str;
        this.f213628c = str2;
        this.f213629d = str3;
        this.f213630e = image;
        this.f213631f = str4;
        this.f213632g = z12;
        this.f213633h = profileType;
        this.f213634i = profileStatus;
        this.f213635j = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportListProfileItem)) {
            return false;
        }
        PassportListProfileItem passportListProfileItem = (PassportListProfileItem) obj;
        return L.f(this.f213627b, passportListProfileItem.f213627b) && L.f(this.f213628c, passportListProfileItem.f213628c) && L.f(this.f213629d, passportListProfileItem.f213629d) && L.f(this.f213630e, passportListProfileItem.f213630e) && L.f(this.f213631f, passportListProfileItem.f213631f) && this.f213632g == passportListProfileItem.f213632g && this.f213633h == passportListProfileItem.f213633h && this.f213634i == passportListProfileItem.f213634i && L.f(this.f213635j, passportListProfileItem.f213635j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF314301b() {
        return this.f213635j;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f213627b.hashCode() * 31, 31, this.f213628c), 31, this.f213629d);
        Image image = this.f213630e;
        return this.f213635j.hashCode() + ((this.f213634i.hashCode() + ((this.f213633h.hashCode() + androidx.appcompat.app.r.i(H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f213631f), 31, this.f213632g)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportListProfileItem(name=");
        sb2.append(this.f213627b);
        sb2.append(", title=");
        sb2.append(this.f213628c);
        sb2.append(", description=");
        sb2.append(this.f213629d);
        sb2.append(", image=");
        sb2.append(this.f213630e);
        sb2.append(", profileId=");
        sb2.append(this.f213631f);
        sb2.append(", isCurrent=");
        sb2.append(this.f213632g);
        sb2.append(", profileType=");
        sb2.append(this.f213633h);
        sb2.append(", profileStatus=");
        sb2.append(this.f213634i);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f213635j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f213627b);
        parcel.writeString(this.f213628c);
        parcel.writeString(this.f213629d);
        parcel.writeParcelable(this.f213630e, i12);
        parcel.writeString(this.f213631f);
        parcel.writeInt(this.f213632g ? 1 : 0);
        parcel.writeString(this.f213633h.name());
        parcel.writeString(this.f213634i.name());
        parcel.writeString(this.f213635j);
    }

    public /* synthetic */ PassportListProfileItem(String str, String str2, String str3, Image image, String str4, boolean z12, ProfileType profileType, ProfileStatus profileStatus, String str5, int i12, C42822w c42822w) {
        this(str, str2, str3, image, str4, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? ProfileType.f125289b : profileType, (i12 & 128) != 0 ? ProfileStatus.f125286d : profileStatus, (i12 & 256) != 0 ? str4 : str5);
    }
}
