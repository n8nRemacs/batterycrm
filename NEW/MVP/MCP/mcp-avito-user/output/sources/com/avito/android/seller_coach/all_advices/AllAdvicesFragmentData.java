package com.avito.android.seller_coach.all_advices;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: AllAdvicesFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/AllAdvicesFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AllAdvicesFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<AllAdvicesFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NavigationTab f267340b = NavigationTab.f106972h;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f267341c = true;

    /* compiled from: AllAdvicesFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AllAdvicesFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final AllAdvicesFragmentData createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new AllAdvicesFragmentData();
        }

        @Override // android.os.Parcelable.Creator
        public final AllAdvicesFragmentData[] newArray(int i12) {
            return new AllAdvicesFragmentData[i12];
        }
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF109310g() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF128898d() {
        return this.f267340b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF226992d() {
        return this.f267341c;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
