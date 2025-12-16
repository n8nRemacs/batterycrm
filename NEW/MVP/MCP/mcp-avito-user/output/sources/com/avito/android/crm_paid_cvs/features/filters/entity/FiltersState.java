package com.avito.android.crm_paid_cvs.features.filters.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersState.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/filters/entity/FiltersState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FiltersState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<FiltersState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<FilterItem> f130629b;

    /* compiled from: FiltersState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersState> {
        @Override // android.os.Parcelable.Creator
        public final FiltersState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(FilterItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FiltersState(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersState[] newArray(int i12) {
            return new FiltersState[i12];
        }
    }

    public FiltersState(@k List<FilterItem> list) {
        this.f130629b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FiltersState) && L.f(this.f130629b, ((FiltersState) obj).f130629b);
    }

    public final int hashCode() {
        return this.f130629b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("FiltersState(filters="), this.f130629b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f130629b, parcel);
        while (itJ.hasNext()) {
            ((FilterItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
