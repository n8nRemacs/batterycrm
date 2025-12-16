package com.avito.android.beduin.ui.screen.home_tab;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.deep_linking.links.ScreenStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinScreenTabData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/home_tab/BeduinScreenTabData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinScreenTabData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<BeduinScreenTabData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f104394b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ScreenStyle f104395c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f104396d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104397e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f104398f;

    /* compiled from: BeduinScreenTabData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinScreenTabData> {
        @Override // android.os.Parcelable.Creator
        public final BeduinScreenTabData createFromParcel(Parcel parcel) {
            return new BeduinScreenTabData(parcel.readString(), parcel.readInt() == 0 ? null : ScreenStyle.valueOf(parcel.readString()), (NavigationTabSetItem) parcel.readParcelable(BeduinScreenTabData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinScreenTabData[] newArray(int i12) {
            return new BeduinScreenTabData[i12];
        }
    }

    public BeduinScreenTabData(@k String str, @l ScreenStyle screenStyle, @k NavigationTabSetItem navigationTabSetItem, boolean z12, boolean z13) {
        this.f104394b = str;
        this.f104395c = screenStyle;
        this.f104396d = navigationTabSetItem;
        this.f104397e = z12;
        this.f104398f = z13;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115238d() {
        return this.f104396d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF227418e() {
        return this.f104398f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinScreenTabData)) {
            return false;
        }
        BeduinScreenTabData beduinScreenTabData = (BeduinScreenTabData) obj;
        return L.f(this.f104394b, beduinScreenTabData.f104394b) && this.f104395c == beduinScreenTabData.f104395c && L.f(this.f104396d, beduinScreenTabData.f104396d) && this.f104397e == beduinScreenTabData.f104397e && this.f104398f == beduinScreenTabData.f104398f;
    }

    public final int hashCode() {
        int iHashCode = this.f104394b.hashCode() * 31;
        ScreenStyle screenStyle = this.f104395c;
        return Boolean.hashCode(this.f104398f) + r.i((this.f104396d.hashCode() + ((iHashCode + (screenStyle == null ? 0 : screenStyle.hashCode())) * 31)) * 31, 31, this.f104397e);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinScreenTabData(url=");
        sb2.append(this.f104394b);
        sb2.append(", presentationStyle=");
        sb2.append(this.f104395c);
        sb2.append(", navigationTab=");
        sb2.append(this.f104396d);
        sb2.append(", showNavigation=");
        sb2.append(this.f104397e);
        sb2.append(", needAuthorization=");
        return r.x(sb2, this.f104398f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104394b);
        ScreenStyle screenStyle = this.f104395c;
        if (screenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenStyle.name());
        }
        parcel.writeParcelable(this.f104396d, i12);
        parcel.writeInt(this.f104397e ? 1 : 0);
        parcel.writeInt(this.f104398f ? 1 : 0);
    }
}
