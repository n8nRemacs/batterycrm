package com.avito.android.sbc.create.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/entity/DiscountAlternativesDialogData;", "Landroid/os/Parcelable;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiscountAlternativesDialogData implements Parcelable {

    @k
    public static final Parcelable.Creator<DiscountAlternativesDialogData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f259787b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f259788c;

    /* compiled from: CreateDiscountDispatchState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DiscountAlternativesDialogData> {
        @Override // android.os.Parcelable.Creator
        public final DiscountAlternativesDialogData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DiscountAlternativesDialogItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DiscountAlternativesDialogData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscountAlternativesDialogData[] newArray(int i12) {
            return new DiscountAlternativesDialogData[i12];
        }
    }

    public DiscountAlternativesDialogData(@k String str, @k ArrayList arrayList) {
        this.f259787b = str;
        this.f259788c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountAlternativesDialogData)) {
            return false;
        }
        DiscountAlternativesDialogData discountAlternativesDialogData = (DiscountAlternativesDialogData) obj;
        return L.f(this.f259787b, discountAlternativesDialogData.f259787b) && this.f259788c.equals(discountAlternativesDialogData.f259788c);
    }

    public final int hashCode() {
        return this.f259788c.hashCode() + (this.f259787b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountAlternativesDialogData(title=");
        sb2.append(this.f259787b);
        sb2.append(", items=");
        return e.p(sb2, this.f259788c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f259787b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f259788c, parcel);
        while (itZ.hasNext()) {
            ((DiscountAlternativesDialogItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
