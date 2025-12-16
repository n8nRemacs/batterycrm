package com.avito.android.profile_phones.phones_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhonesListTabFragmentData.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/PhonesListTabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhonesListTabFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<PhonesListTabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227415b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f227416c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTab f227417d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227418e;

    /* compiled from: PhonesListTabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhonesListTabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final PhonesListTabFragmentData createFromParcel(Parcel parcel) {
            return new PhonesListTabFragmentData(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesListTabFragmentData[] newArray(int i12) {
            return new PhonesListTabFragmentData[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhonesListTabFragmentData() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF88712c() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF88714e() {
        return this.f227417d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF226992d() {
        return this.f227418e;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f227415b ? 1 : 0);
        parcel.writeString(this.f227416c);
    }

    public PhonesListTabFragmentData(boolean z12, @Y61.l String str) {
        this.f227415b = z12;
        this.f227416c = str;
        this.f227417d = NavigationTab.f106974j;
        this.f227418e = true;
    }

    public /* synthetic */ PhonesListTabFragmentData(boolean z12, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : str);
    }
}
