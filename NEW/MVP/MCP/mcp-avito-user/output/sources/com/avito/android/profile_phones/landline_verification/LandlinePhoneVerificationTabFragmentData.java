package com.avito.android.profile_phones.landline_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: LandlinePhoneVerificationTabFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/landline_verification/LandlinePhoneVerificationTabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LandlinePhoneVerificationTabFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<LandlinePhoneVerificationTabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LandlinePhoneVerificationArguments f227173b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTab f227174c = NavigationTab.f106974j;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f227175d = true;

    /* compiled from: LandlinePhoneVerificationTabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandlinePhoneVerificationTabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final LandlinePhoneVerificationTabFragmentData createFromParcel(Parcel parcel) {
            return new LandlinePhoneVerificationTabFragmentData(LandlinePhoneVerificationArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final LandlinePhoneVerificationTabFragmentData[] newArray(int i12) {
            return new LandlinePhoneVerificationTabFragmentData[i12];
        }
    }

    public LandlinePhoneVerificationTabFragmentData(@Y61.k LandlinePhoneVerificationArguments landlinePhoneVerificationArguments) {
        this.f227173b = landlinePhoneVerificationArguments;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF264135e() {
        return this.f227174c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF227175d() {
        return this.f227175d;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f227173b.writeToParcel(parcel, i12);
    }
}
