package com.avito.android.beduin.ui.screen.home_tab;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.ScreenStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: HomeTabBeduinScreenLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/home_tab/HomeTabBeduinScreenLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class HomeTabBeduinScreenLink extends DeepLink {

    @k
    public static final Parcelable.Creator<HomeTabBeduinScreenLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f104402b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ScreenStyle f104403c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final NavigationTabSetItem f104404d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104405e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104406f;

    /* compiled from: HomeTabBeduinScreenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HomeTabBeduinScreenLink> {
        @Override // android.os.Parcelable.Creator
        public final HomeTabBeduinScreenLink createFromParcel(Parcel parcel) {
            return new HomeTabBeduinScreenLink(parcel.readString(), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()), (NavigationTabSetItem) parcel.readParcelable(HomeTabBeduinScreenLink.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HomeTabBeduinScreenLink[] newArray(int i12) {
            return new HomeTabBeduinScreenLink[i12];
        }
    }

    public /* synthetic */ HomeTabBeduinScreenLink(String str, ScreenStyle screenStyle, NavigationTabSetItem navigationTabSetItem, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : screenStyle, (i12 & 4) != 0 ? null : navigationTabSetItem, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabBeduinScreenLink)) {
            return false;
        }
        HomeTabBeduinScreenLink homeTabBeduinScreenLink = (HomeTabBeduinScreenLink) obj;
        return L.f(this.f104402b, homeTabBeduinScreenLink.f104402b) && this.f104403c == homeTabBeduinScreenLink.f104403c && L.f(this.f104404d, homeTabBeduinScreenLink.f104404d) && this.f104405e == homeTabBeduinScreenLink.f104405e && this.f104406f == homeTabBeduinScreenLink.f104406f;
    }

    public final int hashCode() {
        int iHashCode = this.f104402b.hashCode() * 31;
        ScreenStyle screenStyle = this.f104403c;
        int iHashCode2 = (iHashCode + (screenStyle == null ? 0 : screenStyle.hashCode())) * 31;
        NavigationTabSetItem navigationTabSetItem = this.f104404d;
        return Boolean.hashCode(this.f104406f) + r.i((iHashCode2 + (navigationTabSetItem != null ? navigationTabSetItem.hashCode() : 0)) * 31, 31, this.f104405e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HomeTabBeduinScreenLink(url=");
        sb2.append(this.f104402b);
        sb2.append(", presentationStyle=");
        sb2.append(this.f104403c);
        sb2.append(", navigationTab=");
        sb2.append(this.f104404d);
        sb2.append(", showNavigation=");
        sb2.append(this.f104405e);
        sb2.append(", needAuthorization=");
        return r.x(sb2, this.f104406f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104402b);
        ScreenStyle screenStyle = this.f104403c;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
        parcel.writeParcelable(this.f104404d, i12);
        parcel.writeInt(this.f104405e ? 1 : 0);
        parcel.writeInt(this.f104406f ? 1 : 0);
    }

    public HomeTabBeduinScreenLink(@k String str, @l ScreenStyle screenStyle, @l NavigationTabSetItem navigationTabSetItem, boolean z12, boolean z13) {
        this.f104402b = str;
        this.f104403c = screenStyle;
        this.f104404d = navigationTabSetItem;
        this.f104405e = z12;
        this.f104406f = z13;
    }
}
