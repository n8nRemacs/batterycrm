package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculationOptions.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016Jx\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b\t\u0010\u001cR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b\n\u0010\u001cR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b9\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b<\u0010\u0016R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b=\u0010\u0014¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/Payment;", "Landroid/os/Parcelable;", "", "id", "", DeliverySubsidiesSlotKt.AMOUNT, "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "isEnabled", "isSelected", "", "Lcom/avito/android/remote/model/StrBookingCalculation;", "_calculations", "clickMessage", "shouldDisablePromoCodeInfo", "promoCodeDisabledText", "<init>", "(Ljava/lang/String;ILcom/avito/android/remote/model/text/AttributedText;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "component6", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Z", "component5", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "copy", "(Ljava/lang/String;ILcom/avito/android/remote/model/text/AttributedText;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/Payment;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "I", "getAmount", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Z", "Ljava/util/List;", "getClickMessage", "Ljava/lang/Boolean;", "getShouldDisablePromoCodeInfo", "getPromoCodeDisabledText", "getCalculations", "calculations", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Payment implements Parcelable {

    @k
    public static final Parcelable.Creator<Payment> CREATOR = new Creator();

    @c("calculations")
    @l
    private final List<StrBookingCalculation> _calculations;

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    private final int amount;

    @c("clickMessage")
    @l
    private final String clickMessage;

    @c("id")
    @k
    private final String id;

    @c("isEnabled")
    private final boolean isEnabled;

    @c("isSelected")
    private final boolean isSelected;

    @c("promoCodeDisabledText")
    @l
    private final String promoCodeDisabledText;

    @c("shouldDisablePromoCodeInfo")
    @l
    private final Boolean shouldDisablePromoCodeInfo;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: StrBookingCalculationOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Payment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Payment createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Payment.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(StrBookingCalculation.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Payment(string, i12, attributedText, z12, z13, arrayList, string2, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Payment[] newArray(int i12) {
            return new Payment[i12];
        }
    }

    public Payment(@k String str, int i12, @k AttributedText attributedText, boolean z12, boolean z13, @l List<StrBookingCalculation> list, @l String str2, @l Boolean bool, @l String str3) {
        this.id = str;
        this.amount = i12;
        this.title = attributedText;
        this.isEnabled = z12;
        this.isSelected = z13;
        this._calculations = list;
        this.clickMessage = str2;
        this.shouldDisablePromoCodeInfo = bool;
        this.promoCodeDisabledText = str3;
    }

    private final List<StrBookingCalculation> component6() {
        return this._calculations;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getClickMessage() {
        return this.clickMessage;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getShouldDisablePromoCodeInfo() {
        return this.shouldDisablePromoCodeInfo;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getPromoCodeDisabledText() {
        return this.promoCodeDisabledText;
    }

    @k
    public final Payment copy(@k String id2, int amount, @k AttributedText title, boolean isEnabled, boolean isSelected, @l List<StrBookingCalculation> _calculations, @l String clickMessage, @l Boolean shouldDisablePromoCodeInfo, @l String promoCodeDisabledText) {
        return new Payment(id2, amount, title, isEnabled, isSelected, _calculations, clickMessage, shouldDisablePromoCodeInfo, promoCodeDisabledText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) other;
        return L.f(this.id, payment.id) && this.amount == payment.amount && L.f(this.title, payment.title) && this.isEnabled == payment.isEnabled && this.isSelected == payment.isSelected && L.f(this._calculations, payment._calculations) && L.f(this.clickMessage, payment.clickMessage) && L.f(this.shouldDisablePromoCodeInfo, payment.shouldDisablePromoCodeInfo) && L.f(this.promoCodeDisabledText, payment.promoCodeDisabledText);
    }

    public final int getAmount() {
        return this.amount;
    }

    @k
    public final List<StrBookingCalculation> getCalculations() {
        List<StrBookingCalculation> list = this._calculations;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final String getClickMessage() {
        return this.clickMessage;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getPromoCodeDisabledText() {
        return this.promoCodeDisabledText;
    }

    @l
    public final Boolean getShouldDisablePromoCodeInfo() {
        return this.shouldDisablePromoCodeInfo;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i12 = r.i(r.i(a.b(r.e(this.amount, this.id.hashCode() * 31, 31), 31, this.title), 31, this.isEnabled), 31, this.isSelected);
        List<StrBookingCalculation> list = this._calculations;
        int iHashCode = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.clickMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.shouldDisablePromoCodeInfo;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.promoCodeDisabledText;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Payment(id=");
        sb2.append(this.id);
        sb2.append(", amount=");
        sb2.append(this.amount);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", _calculations=");
        sb2.append(this._calculations);
        sb2.append(", clickMessage=");
        sb2.append(this.clickMessage);
        sb2.append(", shouldDisablePromoCodeInfo=");
        sb2.append(this.shouldDisablePromoCodeInfo);
        sb2.append(", promoCodeDisabledText=");
        return C22026a.c(sb2, this.promoCodeDisabledText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeInt(this.amount);
        parcel.writeParcelable(this.title, flags);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        List<StrBookingCalculation> list = this._calculations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((StrBookingCalculation) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.clickMessage);
        Boolean bool = this.shouldDisablePromoCodeInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.promoCodeDisabledText);
    }
}
