package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OffersResult.kt */
@d
@P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b'\u0010#R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/mortgage/api/model/Offer;", "Landroid/os/Parcelable;", "Lcom/avito/android/mortgage/api/model/BankInfo;", "bank", "", "cost", "creditCost", "payment", "period", "", "program", "", "rate", "Lcom/avito/android/mortgage/api/model/RateDiscount;", "rateDiscount", "requiredIncome", "", "Lcom/avito/android/mortgage/api/model/OfferBadge;", "badges", "<init>", "(Lcom/avito/android/mortgage/api/model/BankInfo;IIIILjava/lang/String;DLcom/avito/android/mortgage/api/model/RateDiscount;DLjava/util/List;)V", "Lcom/avito/android/mortgage/api/model/BankInfo;", "d", "()Lcom/avito/android/mortgage/api/model/BankInfo;", "I", "getCost", "()I", "getCreditCost", "e", "getPeriod", "Ljava/lang/String;", "getProgram", "()Ljava/lang/String;", "D", "f", "()D", "Lcom/avito/android/mortgage/api/model/RateDiscount;", "g", "()Lcom/avito/android/mortgage/api/model/RateDiscount;", "h", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Offer implements Parcelable {

    @k
    public static final Parcelable.Creator<Offer> CREATOR = new a();

    @c("badges")
    @l
    private final List<OfferBadge> badges;

    @c("bank")
    @k
    private final BankInfo bank;

    @c("cost")
    private final int cost;

    @c("creditCost")
    private final int creditCost;

    @c("payment")
    private final int payment;

    @c("period")
    private final int period;

    @c("program")
    @k
    private final String program;

    @c("rate")
    private final double rate;

    @c("discount")
    @l
    private final RateDiscount rateDiscount;

    @c("requiredIncome")
    private final double requiredIncome;

    /* compiled from: OffersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Offer> {
        @Override // android.os.Parcelable.Creator
        public final Offer createFromParcel(Parcel parcel) {
            BankInfo bankInfoCreateFromParcel = BankInfo.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            String string = parcel.readString();
            double d12 = parcel.readDouble();
            ArrayList arrayList = null;
            RateDiscount rateDiscountCreateFromParcel = parcel.readInt() == 0 ? null : RateDiscount.CREATOR.createFromParcel(parcel);
            double d13 = parcel.readDouble();
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                arrayList = new ArrayList(i16);
                int iC2 = 0;
                while (iC2 != i16) {
                    iC2 = com.avito.android.actions_sheet.a.c(OfferBadge.CREATOR, parcel, arrayList, iC2, 1);
                    i16 = i16;
                }
            }
            return new Offer(bankInfoCreateFromParcel, i12, i13, i14, i15, string, d12, rateDiscountCreateFromParcel, d13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Offer[] newArray(int i12) {
            return new Offer[i12];
        }
    }

    public Offer(@k BankInfo bankInfo, int i12, int i13, int i14, int i15, @k String str, double d12, @l RateDiscount rateDiscount, double d13, @l List<OfferBadge> list) {
        this.bank = bankInfo;
        this.cost = i12;
        this.creditCost = i13;
        this.payment = i14;
        this.period = i15;
        this.program = str;
        this.rate = d12;
        this.rateDiscount = rateDiscount;
        this.requiredIncome = d13;
        this.badges = list;
    }

    @l
    public final List<OfferBadge> c() {
        return this.badges;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final BankInfo getBank() {
        return this.bank;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getPayment() {
        return this.payment;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return L.f(this.bank, offer.bank) && this.cost == offer.cost && this.creditCost == offer.creditCost && this.payment == offer.payment && this.period == offer.period && L.f(this.program, offer.program) && Double.compare(this.rate, offer.rate) == 0 && L.f(this.rateDiscount, offer.rateDiscount) && Double.compare(this.requiredIncome, offer.requiredIncome) == 0 && L.f(this.badges, offer.badges);
    }

    /* renamed from: f, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final RateDiscount getRateDiscount() {
        return this.rateDiscount;
    }

    /* renamed from: h, reason: from getter */
    public final double getRequiredIncome() {
        return this.requiredIncome;
    }

    public final int hashCode() {
        int iD2 = e.d(H.d(r.e(this.period, r.e(this.payment, r.e(this.creditCost, r.e(this.cost, this.bank.hashCode() * 31, 31), 31), 31), 31), 31, this.program), 31, this.rate);
        RateDiscount rateDiscount = this.rateDiscount;
        int iD3 = e.d((iD2 + (rateDiscount == null ? 0 : rateDiscount.hashCode())) * 31, 31, this.requiredIncome);
        List<OfferBadge> list = this.badges;
        return iD3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Offer(bank=");
        sb2.append(this.bank);
        sb2.append(", cost=");
        sb2.append(this.cost);
        sb2.append(", creditCost=");
        sb2.append(this.creditCost);
        sb2.append(", payment=");
        sb2.append(this.payment);
        sb2.append(", period=");
        sb2.append(this.period);
        sb2.append(", program=");
        sb2.append(this.program);
        sb2.append(", rate=");
        sb2.append(this.rate);
        sb2.append(", rateDiscount=");
        sb2.append(this.rateDiscount);
        sb2.append(", requiredIncome=");
        sb2.append(this.requiredIncome);
        sb2.append(", badges=");
        return H.p(sb2, this.badges, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.bank.writeToParcel(parcel, i12);
        parcel.writeInt(this.cost);
        parcel.writeInt(this.creditCost);
        parcel.writeInt(this.payment);
        parcel.writeInt(this.period);
        parcel.writeString(this.program);
        parcel.writeDouble(this.rate);
        RateDiscount rateDiscount = this.rateDiscount;
        if (rateDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rateDiscount.writeToParcel(parcel, i12);
        }
        parcel.writeDouble(this.requiredIncome);
        List<OfferBadge> list = this.badges;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((OfferBadge) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
