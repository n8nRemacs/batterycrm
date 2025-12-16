package com.avito.android.bottom_navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.ui.fragments.ResultFragmentData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: BottomNavigationControllerState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/BottomNavigationControllerState;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BottomNavigationControllerState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BottomNavigationControllerState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f106926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ResultFragmentData f106927c;

    /* compiled from: BottomNavigationControllerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BottomNavigationControllerState> {
        @Override // android.os.Parcelable.Creator
        public final BottomNavigationControllerState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iD2 = 0;
            while (iD2 != i12) {
                iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
            }
            return new BottomNavigationControllerState(arrayList, parcel.readInt() == 0 ? null : ResultFragmentData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BottomNavigationControllerState[] newArray(int i12) {
            return new BottomNavigationControllerState[i12];
        }
    }

    public BottomNavigationControllerState(@Y61.k ArrayList arrayList, @Y61.l ResultFragmentData resultFragmentData) {
        this.f106926b = arrayList;
        this.f106927c = resultFragmentData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f106926b, parcel);
        while (itZ.hasNext()) {
            parcel.writeInt(((Number) itZ.next()).intValue());
        }
        ResultFragmentData resultFragmentData = this.f106927c;
        if (resultFragmentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            resultFragmentData.writeToParcel(parcel, i12);
        }
    }
}
