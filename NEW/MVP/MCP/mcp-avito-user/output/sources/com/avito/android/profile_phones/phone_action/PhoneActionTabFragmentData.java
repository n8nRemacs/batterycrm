package com.avito.android.profile_phones.phone_action;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;

/* compiled from: PhoneActionTabFragmentData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/PhoneActionTabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionTabFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<PhoneActionTabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhoneActionArguments f227258b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTab f227259c = NavigationTab.f106974j;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f227260d = true;

    /* compiled from: PhoneActionTabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneActionTabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final PhoneActionTabFragmentData createFromParcel(Parcel parcel) {
            return new PhoneActionTabFragmentData(PhoneActionArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneActionTabFragmentData[] newArray(int i12) {
            return new PhoneActionTabFragmentData[i12];
        }
    }

    public PhoneActionTabFragmentData(@k PhoneActionArguments phoneActionArguments) {
        this.f227258b = phoneActionArguments;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF264134d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2 */
    public final NavigationTabSetItem getF115238d() {
        return this.f227259c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF227260d() {
        return this.f227260d;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f227258b.writeToParcel(parcel, i12);
    }
}
