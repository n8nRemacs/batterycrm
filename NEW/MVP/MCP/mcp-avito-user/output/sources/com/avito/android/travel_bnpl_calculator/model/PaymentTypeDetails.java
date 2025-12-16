package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypeDetails.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypeDetails;", "Landroid/os/Parcelable;", "", "selectedIndex", "", "Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariant;", "scheduleVariants", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentTypeDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentTypeDetails> CREATOR = new a();

    @c("scheduleVariants")
    @l
    private final List<ScheduleVariant> scheduleVariants;

    @c("selectedIndex")
    @l
    private final Integer selectedIndex;

    /* compiled from: PaymentTypeDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentTypeDetails> {
        @Override // android.os.Parcelable.Creator
        public final PaymentTypeDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ScheduleVariant.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new PaymentTypeDetails(numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentTypeDetails[] newArray(int i12) {
            return new PaymentTypeDetails[i12];
        }
    }

    public PaymentTypeDetails(@l Integer num, @l List<ScheduleVariant> list) {
        this.selectedIndex = num;
        this.scheduleVariants = list;
    }

    @l
    public final List<ScheduleVariant> c() {
        return this.scheduleVariants;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTypeDetails)) {
            return false;
        }
        PaymentTypeDetails paymentTypeDetails = (PaymentTypeDetails) obj;
        return L.f(this.selectedIndex, paymentTypeDetails.selectedIndex) && L.f(this.scheduleVariants, paymentTypeDetails.scheduleVariants);
    }

    public final int hashCode() {
        Integer num = this.selectedIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ScheduleVariant> list = this.scheduleVariants;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentTypeDetails(selectedIndex=");
        sb2.append(this.selectedIndex);
        sb2.append(", scheduleVariants=");
        return H.p(sb2, this.scheduleVariants, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.selectedIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<ScheduleVariant> list = this.scheduleVariants;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((ScheduleVariant) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
