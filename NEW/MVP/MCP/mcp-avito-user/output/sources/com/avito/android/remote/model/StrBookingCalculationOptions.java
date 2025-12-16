package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculationOptions.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalculationOptions;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/Payment;", "payments", "Lcom/avito/android/remote/model/text/AttributedText;", "bonusesInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/StrBookingCalculationOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPayments", "Lcom/avito/android/remote/model/text/AttributedText;", "getBonusesInfo", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrBookingCalculationOptions implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingCalculationOptions> CREATOR = new Creator();

    @c("bonusesInfo")
    @k
    private final AttributedText bonusesInfo;

    @c("payments")
    @k
    private final List<Payment> payments;

    /* compiled from: StrBookingCalculationOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrBookingCalculationOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalculationOptions createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Payment.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new StrBookingCalculationOptions(arrayList, (AttributedText) parcel.readParcelable(StrBookingCalculationOptions.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalculationOptions[] newArray(int i12) {
            return new StrBookingCalculationOptions[i12];
        }
    }

    public StrBookingCalculationOptions(@k List<Payment> list, @k AttributedText attributedText) {
        this.payments = list;
        this.bonusesInfo = attributedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrBookingCalculationOptions copy$default(StrBookingCalculationOptions strBookingCalculationOptions, List list, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = strBookingCalculationOptions.payments;
        }
        if ((i12 & 2) != 0) {
            attributedText = strBookingCalculationOptions.bonusesInfo;
        }
        return strBookingCalculationOptions.copy(list, attributedText);
    }

    @k
    public final List<Payment> component1() {
        return this.payments;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getBonusesInfo() {
        return this.bonusesInfo;
    }

    @k
    public final StrBookingCalculationOptions copy(@k List<Payment> payments, @k AttributedText bonusesInfo) {
        return new StrBookingCalculationOptions(payments, bonusesInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrBookingCalculationOptions)) {
            return false;
        }
        StrBookingCalculationOptions strBookingCalculationOptions = (StrBookingCalculationOptions) other;
        return L.f(this.payments, strBookingCalculationOptions.payments) && L.f(this.bonusesInfo, strBookingCalculationOptions.bonusesInfo);
    }

    @k
    public final AttributedText getBonusesInfo() {
        return this.bonusesInfo;
    }

    @k
    public final List<Payment> getPayments() {
        return this.payments;
    }

    public int hashCode() {
        return this.bonusesInfo.hashCode() + (this.payments.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrBookingCalculationOptions(payments=");
        sb2.append(this.payments);
        sb2.append(", bonusesInfo=");
        return a.w(sb2, this.bonusesInfo, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.payments, parcel);
        while (itJ.hasNext()) {
            ((Payment) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.bonusesInfo, flags);
    }
}
