package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.installments_block.entity.util.InstallmentsColoredIcon;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsOfferDetailsItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsOfferDetailsItem;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsOfferDetailsItem implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsOfferDetailsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f172865b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InstallmentsColoredIcon f172866c;

    /* compiled from: InstallmentsOfferDetailsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsOfferDetailsItem> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsOfferDetailsItem createFromParcel(Parcel parcel) {
            return new InstallmentsOfferDetailsItem((AttributedText) parcel.readParcelable(InstallmentsOfferDetailsItem.class.getClassLoader()), parcel.readInt() == 0 ? null : InstallmentsColoredIcon.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsOfferDetailsItem[] newArray(int i12) {
            return new InstallmentsOfferDetailsItem[i12];
        }
    }

    public InstallmentsOfferDetailsItem(@l AttributedText attributedText, @l InstallmentsColoredIcon installmentsColoredIcon) {
        this.f172865b = attributedText;
        this.f172866c = installmentsColoredIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsOfferDetailsItem)) {
            return false;
        }
        InstallmentsOfferDetailsItem installmentsOfferDetailsItem = (InstallmentsOfferDetailsItem) obj;
        return L.f(this.f172865b, installmentsOfferDetailsItem.f172865b) && L.f(this.f172866c, installmentsOfferDetailsItem.f172866c);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f172865b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        InstallmentsColoredIcon installmentsColoredIcon = this.f172866c;
        return iHashCode + (installmentsColoredIcon != null ? installmentsColoredIcon.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InstallmentsOfferDetailsItem(attributedText=" + this.f172865b + ", icon=" + this.f172866c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f172865b, i12);
        InstallmentsColoredIcon installmentsColoredIcon = this.f172866c;
        if (installmentsColoredIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsColoredIcon.writeToParcel(parcel, i12);
        }
    }
}
