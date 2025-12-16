package com.avito.android.mortgage.acceptance_dialog.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Accepted.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/acceptance_dialog/model/Accepted;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Accepted implements Parcelable {

    @k
    public static final Parcelable.Creator<Accepted> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Parcelable f198194b;

    /* compiled from: Accepted.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Accepted> {
        @Override // android.os.Parcelable.Creator
        public final Accepted createFromParcel(Parcel parcel) {
            return new Accepted(parcel.readParcelable(Accepted.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Accepted[] newArray(int i12) {
            return new Accepted[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Accepted() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Accepted) && L.f(this.f198194b, ((Accepted) obj).f198194b);
    }

    public final int hashCode() {
        Parcelable parcelable = this.f198194b;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("Accepted(requestedAction="), this.f198194b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f198194b, i12);
    }

    public Accepted(@l Parcelable parcelable) {
        this.f198194b = parcelable;
    }

    public /* synthetic */ Accepted(Parcelable parcelable, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : parcelable);
    }
}
