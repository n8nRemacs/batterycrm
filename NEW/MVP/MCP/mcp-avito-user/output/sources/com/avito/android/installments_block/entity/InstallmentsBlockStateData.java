package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlockStateData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsBlockStateData;", "Landroid/os/Parcelable;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsBlockStateData implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsBlockStateData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f172843b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InstallmentsIcon f172844c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f172845d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InstallmentsPriceInfo f172846e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final InstallmentsProgress f172847f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<InstallmentsButton> f172848g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<InstallmentsOfferDetailsItem> f172849h;

    /* compiled from: InstallmentsBlockStateData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsBlockStateData> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsBlockStateData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            InstallmentsIcon installmentsIconCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentsIcon.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(InstallmentsBlockStateData.class.getClassLoader());
            InstallmentsPriceInfo installmentsPriceInfoCreateFromParcel = parcel.readInt() == 0 ? null : InstallmentsPriceInfo.CREATOR.createFromParcel(parcel);
            InstallmentsProgress installmentsProgressCreateFromParcel = parcel.readInt() != 0 ? InstallmentsProgress.CREATOR.createFromParcel(parcel) : null;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(InstallmentsButton.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(InstallmentsOfferDetailsItem.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new InstallmentsBlockStateData(string, installmentsIconCreateFromParcel, attributedText, installmentsPriceInfoCreateFromParcel, installmentsProgressCreateFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsBlockStateData[] newArray(int i12) {
            return new InstallmentsBlockStateData[i12];
        }
    }

    public InstallmentsBlockStateData(@l String str, @l InstallmentsIcon installmentsIcon, @l AttributedText attributedText, @l InstallmentsPriceInfo installmentsPriceInfo, @l InstallmentsProgress installmentsProgress, @k List<InstallmentsButton> list, @k List<InstallmentsOfferDetailsItem> list2) {
        this.f172843b = str;
        this.f172844c = installmentsIcon;
        this.f172845d = attributedText;
        this.f172846e = installmentsPriceInfo;
        this.f172847f = installmentsProgress;
        this.f172848g = list;
        this.f172849h = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsBlockStateData)) {
            return false;
        }
        InstallmentsBlockStateData installmentsBlockStateData = (InstallmentsBlockStateData) obj;
        return L.f(this.f172843b, installmentsBlockStateData.f172843b) && L.f(this.f172844c, installmentsBlockStateData.f172844c) && L.f(this.f172845d, installmentsBlockStateData.f172845d) && L.f(this.f172846e, installmentsBlockStateData.f172846e) && L.f(this.f172847f, installmentsBlockStateData.f172847f) && L.f(this.f172848g, installmentsBlockStateData.f172848g) && L.f(this.f172849h, installmentsBlockStateData.f172849h);
    }

    public final int hashCode() {
        String str = this.f172843b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        InstallmentsIcon installmentsIcon = this.f172844c;
        int iHashCode2 = (iHashCode + (installmentsIcon == null ? 0 : installmentsIcon.hashCode())) * 31;
        AttributedText attributedText = this.f172845d;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        InstallmentsPriceInfo installmentsPriceInfo = this.f172846e;
        int iHashCode4 = (iHashCode3 + (installmentsPriceInfo == null ? 0 : installmentsPriceInfo.hashCode())) * 31;
        InstallmentsProgress installmentsProgress = this.f172847f;
        return this.f172849h.hashCode() + H.e((iHashCode4 + (installmentsProgress != null ? installmentsProgress.hashCode() : 0)) * 31, 31, this.f172848g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsBlockStateData(title=");
        sb2.append(this.f172843b);
        sb2.append(", icon=");
        sb2.append(this.f172844c);
        sb2.append(", subtitle=");
        sb2.append(this.f172845d);
        sb2.append(", priceInfo=");
        sb2.append(this.f172846e);
        sb2.append(", progress=");
        sb2.append(this.f172847f);
        sb2.append(", buttons=");
        sb2.append(this.f172848g);
        sb2.append(", offerDetailsItems=");
        return H.p(sb2, this.f172849h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f172843b);
        InstallmentsIcon installmentsIcon = this.f172844c;
        if (installmentsIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsIcon.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f172845d, i12);
        InstallmentsPriceInfo installmentsPriceInfo = this.f172846e;
        if (installmentsPriceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsPriceInfo.writeToParcel(parcel, i12);
        }
        InstallmentsProgress installmentsProgress = this.f172847f;
        if (installmentsProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installmentsProgress.writeToParcel(parcel, i12);
        }
        Iterator itJ = C0.j(this.f172848g, parcel);
        while (itJ.hasNext()) {
            ((InstallmentsButton) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f172849h, parcel);
        while (itJ2.hasNext()) {
            ((InstallmentsOfferDetailsItem) itJ2.next()).writeToParcel(parcel, i12);
        }
    }
}
