package com.avito.android.profile_phones.confirm_phone;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: PhoneConfirmTabFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/PhoneConfirmTabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneConfirmTabFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<PhoneConfirmTabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhoneConfirmationArguments f226993b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTab f226994c = NavigationTab.f106974j;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f226995d = true;

    /* compiled from: PhoneConfirmTabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneConfirmTabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmTabFragmentData createFromParcel(Parcel parcel) {
            return new PhoneConfirmTabFragmentData(PhoneConfirmationArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneConfirmTabFragmentData[] newArray(int i12) {
            return new PhoneConfirmTabFragmentData[i12];
        }
    }

    public PhoneConfirmTabFragmentData(@Y61.k PhoneConfirmationArguments phoneConfirmationArguments) {
        this.f226993b = phoneConfirmationArguments;
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
    public final NavigationTabSetItem getF209723e() {
        return this.f226994c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF226995d() {
        return this.f226995d;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f226993b.writeToParcel(parcel, i12);
    }
}
