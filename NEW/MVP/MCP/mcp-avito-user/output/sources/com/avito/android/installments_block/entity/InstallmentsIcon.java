package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.util.InstallmentsColoredIcon;
import com.avito.android.installments_block.entity.util.InstallmentsSize;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsIcon.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsIcon;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsIcon> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InstallmentsColoredIcon f172854b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f172855c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InstallmentsSize f172856d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f172857e;

    /* compiled from: InstallmentsIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsIcon> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsIcon createFromParcel(Parcel parcel) {
            return new InstallmentsIcon(parcel.readInt() == 0 ? null : InstallmentsColoredIcon.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(InstallmentsIcon.class.getClassLoader()), parcel.readInt() != 0 ? InstallmentsSize.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(InstallmentsIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsIcon[] newArray(int i12) {
            return new InstallmentsIcon[i12];
        }
    }

    public InstallmentsIcon(@l InstallmentsColoredIcon installmentsColoredIcon, @l UniversalImage universalImage, @l InstallmentsSize installmentsSize, @l DeepLink deepLink) {
        this.f172854b = installmentsColoredIcon;
        this.f172855c = universalImage;
        this.f172856d = installmentsSize;
        this.f172857e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsIcon)) {
            return false;
        }
        InstallmentsIcon installmentsIcon = (InstallmentsIcon) obj;
        return L.f(this.f172854b, installmentsIcon.f172854b) && L.f(this.f172855c, installmentsIcon.f172855c) && L.f(this.f172856d, installmentsIcon.f172856d) && L.f(this.f172857e, installmentsIcon.f172857e);
    }

    public final int hashCode() {
        InstallmentsColoredIcon installmentsColoredIcon = this.f172854b;
        int iHashCode = (installmentsColoredIcon == null ? 0 : installmentsColoredIcon.hashCode()) * 31;
        UniversalImage universalImage = this.f172855c;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        InstallmentsSize installmentsSize = this.f172856d;
        int iHashCode3 = (iHashCode2 + (installmentsSize == null ? 0 : installmentsSize.hashCode())) * 31;
        DeepLink deepLink = this.f172857e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsIcon(localIcon=");
        sb2.append(this.f172854b);
        sb2.append(", remoteIcon=");
        sb2.append(this.f172855c);
        sb2.append(", size=");
        sb2.append(this.f172856d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f172857e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        InstallmentsColoredIcon installmentsColoredIcon = this.f172854b;
        if (installmentsColoredIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsColoredIcon.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f172855c, i12);
        InstallmentsSize installmentsSize = this.f172856d;
        if (installmentsSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsSize.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f172857e, i12);
    }
}
