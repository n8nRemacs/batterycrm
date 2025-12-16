package com.avito.android.settings.ui;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/ui/SettingsFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SettingsFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<SettingsFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f281002b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f281003c;

    /* compiled from: SettingsFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SettingsFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final SettingsFragmentData createFromParcel(Parcel parcel) {
            return new SettingsFragmentData((NavigationTabSetItem) parcel.readParcelable(SettingsFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsFragmentData[] newArray(int i12) {
            return new SettingsFragmentData[i12];
        }
    }

    public SettingsFragmentData(@k NavigationTabSetItem navigationTabSetItem) {
        this.f281002b = navigationTabSetItem;
        this.f281003c = navigationTabSetItem;
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
        return this.f281003c;
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
        return (obj instanceof SettingsFragmentData) && L.f(this.f281002b, ((SettingsFragmentData) obj).f281002b);
    }

    public final int hashCode() {
        return this.f281002b.hashCode();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.u(new StringBuilder("SettingsFragmentData(tab="), this.f281002b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f281002b, i12);
    }
}
