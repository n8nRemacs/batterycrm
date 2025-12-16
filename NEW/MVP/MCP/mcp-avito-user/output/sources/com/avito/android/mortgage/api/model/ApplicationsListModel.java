package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/api/model/ApplicationsListModel;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/mortgage/api/model/ApplicationsItemModel;", "applications", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationsListModel implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationsListModel> CREATOR = new a();

    @c("applications")
    @l
    private final List<ApplicationsItemModel> applications;

    /* compiled from: ApplicationsListModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationsListModel> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationsListModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ApplicationsItemModel.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ApplicationsListModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationsListModel[] newArray(int i12) {
            return new ApplicationsListModel[i12];
        }
    }

    public ApplicationsListModel(@l List<ApplicationsItemModel> list) {
        this.applications = list;
    }

    @l
    public final List<ApplicationsItemModel> c() {
        return this.applications;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationsListModel) && L.f(this.applications, ((ApplicationsListModel) obj).applications);
    }

    public final int hashCode() {
        List<ApplicationsItemModel> list = this.applications;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("ApplicationsListModel(applications="), this.applications, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<ApplicationsItemModel> list = this.applications;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((ApplicationsItemModel) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
