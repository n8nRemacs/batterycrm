package com.avito.android.user_adverts.root_screen;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.AdvertActionTransferData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/UserAdvertsFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_user-adverts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<UserAdvertsFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f312201b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f312202c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AdvertActionTransferData f312203d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f312204e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f312205f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f312206g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f312207h;

    /* compiled from: UserAdvertsFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFragmentData createFromParcel(Parcel parcel) {
            return new UserAdvertsFragmentData(parcel.readString(), parcel.readString(), (AdvertActionTransferData) parcel.readParcelable(UserAdvertsFragmentData.class.getClassLoader()), (DeepLink) parcel.readParcelable(UserAdvertsFragmentData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (NavigationTabSetItem) parcel.readParcelable(UserAdvertsFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFragmentData[] newArray(int i12) {
            return new UserAdvertsFragmentData[i12];
        }
    }

    public UserAdvertsFragmentData() {
        this(null, null, null, null, false, false, null, 127, null);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f312207h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF186714d() {
        return this.f312205f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsFragmentData)) {
            return false;
        }
        UserAdvertsFragmentData userAdvertsFragmentData = (UserAdvertsFragmentData) obj;
        return L.f(this.f312201b, userAdvertsFragmentData.f312201b) && L.f(this.f312202c, userAdvertsFragmentData.f312202c) && L.f(this.f312203d, userAdvertsFragmentData.f312203d) && L.f(this.f312204e, userAdvertsFragmentData.f312204e) && this.f312205f == userAdvertsFragmentData.f312205f && this.f312206g == userAdvertsFragmentData.f312206g && L.f(this.f312207h, userAdvertsFragmentData.f312207h);
    }

    public final int hashCode() {
        String str = this.f312201b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f312202c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdvertActionTransferData advertActionTransferData = this.f312203d;
        int iHashCode3 = (iHashCode2 + (advertActionTransferData == null ? 0 : advertActionTransferData.hashCode())) * 31;
        DeepLink deepLink = this.f312204e;
        return this.f312207h.hashCode() + r.i(r.i((iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f312205f), 31, this.f312206g);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFragmentData(shortcut=");
        sb2.append(this.f312201b);
        sb2.append(", message=");
        sb2.append(this.f312202c);
        sb2.append(", advertAction=");
        sb2.append(this.f312203d);
        sb2.append(", action=");
        sb2.append(this.f312204e);
        sb2.append(", needAuthorization=");
        sb2.append(this.f312205f);
        sb2.append(", showNavigation=");
        sb2.append(this.f312206g);
        sb2.append(", navigationTab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f312207h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f312201b);
        parcel.writeString(this.f312202c);
        parcel.writeParcelable(this.f312203d, i12);
        parcel.writeParcelable(this.f312204e, i12);
        parcel.writeInt(this.f312205f ? 1 : 0);
        parcel.writeInt(this.f312206g ? 1 : 0);
        parcel.writeParcelable(this.f312207h, i12);
    }

    public UserAdvertsFragmentData(@l String str, @l String str2, @l AdvertActionTransferData advertActionTransferData, @l DeepLink deepLink, boolean z12, boolean z13, @k NavigationTabSetItem navigationTabSetItem) {
        this.f312201b = str;
        this.f312202c = str2;
        this.f312203d = advertActionTransferData;
        this.f312204e = deepLink;
        this.f312205f = z12;
        this.f312206g = z13;
        this.f312207h = navigationTabSetItem;
    }

    public /* synthetic */ UserAdvertsFragmentData(String str, String str2, AdvertActionTransferData advertActionTransferData, DeepLink deepLink, boolean z12, boolean z13, NavigationTabSetItem navigationTabSetItem, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : advertActionTransferData, (i12 & 8) == 0 ? deepLink : null, (i12 & 16) != 0 ? true : z12, (i12 & 32) != 0 ? true : z13, (i12 & 64) != 0 ? NavigationTab.f106972h : navigationTabSetItem);
    }
}
