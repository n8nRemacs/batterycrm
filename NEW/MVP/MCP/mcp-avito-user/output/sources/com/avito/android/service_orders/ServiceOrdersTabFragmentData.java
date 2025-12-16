package com.avito.android.service_orders;

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

/* compiled from: ServiceOrdersTabFragmentData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/ServiceOrdersTabFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceOrdersTabFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<ServiceOrdersTabFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final NavigationTabSetItem f279057b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ServiceOrdersArguments f279058c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f279059d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f279060e;

    /* compiled from: ServiceOrdersTabFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceOrdersTabFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrdersTabFragmentData createFromParcel(Parcel parcel) {
            return new ServiceOrdersTabFragmentData((NavigationTabSetItem) parcel.readParcelable(ServiceOrdersTabFragmentData.class.getClassLoader()), ServiceOrdersArguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrdersTabFragmentData[] newArray(int i12) {
            return new ServiceOrdersTabFragmentData[i12];
        }
    }

    public ServiceOrdersTabFragmentData(@l NavigationTabSetItem navigationTabSetItem, @k ServiceOrdersArguments serviceOrdersArguments) {
        this.f279057b = navigationTabSetItem;
        this.f279058c = serviceOrdersArguments;
        this.f279059d = navigationTabSetItem == null ? NavigationTab.f106974j : navigationTabSetItem;
        this.f279060e = true;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF88712c() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF209723e() {
        return this.f279059d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0, reason: from getter */
    public final boolean getF224264d() {
        return this.f279060e;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f279057b, i12);
        this.f279058c.writeToParcel(parcel, i12);
    }
}
