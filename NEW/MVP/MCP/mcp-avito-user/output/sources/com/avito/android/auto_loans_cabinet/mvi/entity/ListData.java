package com.avito.android.auto_loans_cabinet.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: AutoLoansCabinetState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/mvi/entity/ListData;", "Landroid/os/Parcelable;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ListData implements Parcelable {

    @k
    public static final Parcelable.Creator<ListData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f95487b;

    /* compiled from: AutoLoansCabinetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ListData> {
        @Override // android.os.Parcelable.Creator
        public final ListData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ListData.class, parcel, arrayList, iL2, 1);
            }
            return new ListData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ListData[] newArray(int i12) {
            return new ListData[i12];
        }
    }

    public ListData(@k ArrayList arrayList) {
        this.f95487b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListData) && this.f95487b.equals(((ListData) obj).f95487b);
    }

    public final int hashCode() {
        return this.f95487b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("ListData(items="), this.f95487b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ArrayList arrayList = this.f95487b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i12);
        }
    }
}
