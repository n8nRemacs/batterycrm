package com.avito.android.installments_block.entity.util;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsColoredIcon.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/util/InstallmentsColoredIcon;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsColoredIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsColoredIcon> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f172883b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalColor f172884c;

    /* compiled from: InstallmentsColoredIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsColoredIcon> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsColoredIcon createFromParcel(Parcel parcel) {
            return new InstallmentsColoredIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(InstallmentsColoredIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsColoredIcon[] newArray(int i12) {
            return new InstallmentsColoredIcon[i12];
        }
    }

    public InstallmentsColoredIcon(@k String str, @l UniversalColor universalColor) {
        this.f172883b = str;
        this.f172884c = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsColoredIcon)) {
            return false;
        }
        InstallmentsColoredIcon installmentsColoredIcon = (InstallmentsColoredIcon) obj;
        return L.f(this.f172883b, installmentsColoredIcon.f172883b) && L.f(this.f172884c, installmentsColoredIcon.f172884c);
    }

    public final int hashCode() {
        int iHashCode = this.f172883b.hashCode() * 31;
        UniversalColor universalColor = this.f172884c;
        return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsColoredIcon(name=");
        sb2.append(this.f172883b);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f172884c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f172883b);
        parcel.writeParcelable(this.f172884c, i12);
    }
}
