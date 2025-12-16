package com.avito.android.profile_phones.add_phone;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: AddPhoneTabFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/AddPhoneTabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AddPhoneTabFragmentData implements TabFragmentFactory.Data {

    @Y61.k
    public static final Parcelable.Creator<AddPhoneTabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AddPhoneArguments f226827b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTab f226828c = NavigationTab.f106974j;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f226829d = true;

    /* compiled from: AddPhoneTabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddPhoneTabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final AddPhoneTabFragmentData createFromParcel(Parcel parcel) {
            return new AddPhoneTabFragmentData(AddPhoneArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AddPhoneTabFragmentData[] newArray(int i12) {
            return new AddPhoneTabFragmentData[i12];
        }
    }

    public AddPhoneTabFragmentData(@Y61.k AddPhoneArguments addPhoneArguments) {
        this.f226827b = addPhoneArguments;
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
        return this.f226828c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF226995d() {
        return this.f226829d;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f226827b.writeToParcel(parcel, i12);
    }
}
