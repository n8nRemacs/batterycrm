package com.avito.android.installments_block.entity.util;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsSize.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/util/InstallmentsSize;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsSize implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsSize> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f172885b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f172886c;

    /* compiled from: InstallmentsSize.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsSize> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsSize createFromParcel(Parcel parcel) {
            return new InstallmentsSize(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsSize[] newArray(int i12) {
            return new InstallmentsSize[i12];
        }
    }

    public InstallmentsSize(@l Integer num, @l Integer num2) {
        this.f172885b = num;
        this.f172886c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsSize)) {
            return false;
        }
        InstallmentsSize installmentsSize = (InstallmentsSize) obj;
        return L.f(this.f172885b, installmentsSize.f172885b) && L.f(this.f172886c, installmentsSize.f172886c);
    }

    public final int hashCode() {
        Integer num = this.f172885b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f172886c;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsSize(width=");
        sb2.append(this.f172885b);
        sb2.append(", height=");
        return s.j(sb2, this.f172886c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.f172885b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f172886c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
