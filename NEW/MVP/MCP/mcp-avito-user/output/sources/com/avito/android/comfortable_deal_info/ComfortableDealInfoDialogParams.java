package com.avito.android.comfortable_deal_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealInfoDialogFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_info/ComfortableDealInfoDialogParams;", "Lcom/avito/android/util/OpenParams;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComfortableDealInfoDialogParams implements OpenParams {

    @k
    public static final Parcelable.Creator<ComfortableDealInfoDialogParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f123450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123451c;

    /* compiled from: ComfortableDealInfoDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealInfoDialogParams> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoDialogParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ComfortableDealInfoDialogParams.class, parcel, arrayList, iL2, 1);
            }
            return new ComfortableDealInfoDialogParams(parcel.readInt(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealInfoDialogParams[] newArray(int i12) {
            return new ComfortableDealInfoDialogParams[i12];
        }
    }

    public ComfortableDealInfoDialogParams(int i12, @k ArrayList arrayList) {
        this.f123450b = arrayList;
        this.f123451c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComfortableDealInfoDialogParams)) {
            return false;
        }
        ComfortableDealInfoDialogParams comfortableDealInfoDialogParams = (ComfortableDealInfoDialogParams) obj;
        return L.f(this.f123450b, comfortableDealInfoDialogParams.f123450b) && this.f123451c == comfortableDealInfoDialogParams.f123451c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f123451c) + (this.f123450b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComfortableDealInfoDialogParams(screens=");
        sb2.append(this.f123450b);
        sb2.append(", currentIndex=");
        return r.t(sb2, this.f123451c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f123450b, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeInt(this.f123451c);
    }
}
