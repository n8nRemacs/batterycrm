package com.avito.android.avito_for_business;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.bottom_navigation.space.p;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import com.avito.android.bxcontent.BxContentArguments;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoForBusinessMainBxContentTabData.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avito_for_business/AvitoForBusinessMainBxContentTabData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/space/p;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoForBusinessMainBxContentTabData implements TabFragmentFactory.Data, p {

    @k
    public static final Parcelable.Creator<AvitoForBusinessMainBxContentTabData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BxContentArguments f98061b;

    /* compiled from: AvitoForBusinessMainBxContentTabData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoForBusinessMainBxContentTabData> {
        @Override // android.os.Parcelable.Creator
        public final AvitoForBusinessMainBxContentTabData createFromParcel(Parcel parcel) {
            return new AvitoForBusinessMainBxContentTabData(BxContentArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoForBusinessMainBxContentTabData[] newArray(int i12) {
            return new AvitoForBusinessMainBxContentTabData[i12];
        }
    }

    public AvitoForBusinessMainBxContentTabData(@k BxContentArguments bxContentArguments) {
        this.f98061b = bxContentArguments;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @k
    public final BottomNavigationSpace U() {
        return BottomNavigationSpace.f107066c;
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @k
    public final Set<NavigationTabSetItem> W() {
        return Collections.singleton(NavigationTab.f106975k);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF188931d() {
        return NavigationTab.f106975k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return false;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AvitoForBusinessMainBxContentTabData) && L.f(this.f98061b, ((AvitoForBusinessMainBxContentTabData) obj).f98061b);
    }

    public final int hashCode() {
        return this.f98061b.hashCode();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        return "AvitoForBusinessMainBxContentTabData(arguments=" + this.f98061b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f98061b.writeToParcel(parcel, i12);
    }

    @Override // com.avito.android.bottom_navigation.space.p
    @k
    public final p g0(@k NavigationTabSetItem navigationTabSetItem) {
        return this;
    }
}
