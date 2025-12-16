package com.avito.android.beduin.v2.page.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2FragmentParams;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2TabFragmentData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/BeduinV2TabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2TabFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<BeduinV2TabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BeduinV2FragmentParams f104899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f104900c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f104901d;

    /* compiled from: BeduinV2TabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2TabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2TabFragmentData createFromParcel(Parcel parcel) {
            return new BeduinV2TabFragmentData((BeduinV2FragmentParams) parcel.readParcelable(BeduinV2TabFragmentData.class.getClassLoader()), (NavigationTabSetItem) parcel.readParcelable(BeduinV2TabFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2TabFragmentData[] newArray(int i12) {
            return new BeduinV2TabFragmentData[i12];
        }
    }

    public BeduinV2TabFragmentData(@Y61.k BeduinV2FragmentParams beduinV2FragmentParams, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f104899b = beduinV2FragmentParams;
        this.f104900c = navigationTabSetItem;
        this.f104901d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f104901d;
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

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2TabFragmentData)) {
            return false;
        }
        BeduinV2TabFragmentData beduinV2TabFragmentData = (BeduinV2TabFragmentData) obj;
        return L.f(this.f104899b, beduinV2TabFragmentData.f104899b) && L.f(this.f104900c, beduinV2TabFragmentData.f104900c);
    }

    public final int hashCode() {
        return this.f104900c.hashCode() + (this.f104899b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2TabFragmentData(params=");
        sb2.append(this.f104899b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f104900c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f104899b, i12);
        parcel.writeParcelable(this.f104900c, i12);
    }
}
