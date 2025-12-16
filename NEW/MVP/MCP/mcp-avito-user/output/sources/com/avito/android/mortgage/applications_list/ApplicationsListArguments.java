package com.avito.android.mortgage.applications_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.ApplicationsItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/ApplicationsListArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationsListArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationsListArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ApplicationsItemModel> f198335b;

    /* compiled from: ApplicationsListArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationsListArguments> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationsListArguments createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ApplicationsItemModel.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ApplicationsListArguments(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationsListArguments[] newArray(int i12) {
            return new ApplicationsListArguments[i12];
        }
    }

    public ApplicationsListArguments(@k List<ApplicationsItemModel> list) {
        this.f198335b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationsListArguments) && L.f(this.f198335b, ((ApplicationsListArguments) obj).f198335b);
    }

    public final int hashCode() {
        return this.f198335b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("ApplicationsListArguments(applications="), this.f198335b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f198335b, parcel);
        while (itJ.hasNext()) {
            ((ApplicationsItemModel) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
