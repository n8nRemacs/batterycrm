package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.UtmParamsV2;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPaymentLink.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/PaymentDetails;", "Landroid/os/Parcelable;", "", "searchKey", "productSlug", "autotekaX", "", "fromBlock", "Lcom/avito/android/util/UtmParamsV2;", "utmParams", "promoCode", "", "isPaymentFailed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/util/UtmParamsV2;Ljava/lang/String;Z)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "e", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "Lcom/avito/android/util/UtmParamsV2;", "h", "()Lcom/avito/android/util/UtmParamsV2;", "f", "Z", "i", "()Z", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentDetails> CREATOR = new a();

    @c("autotekaX")
    @k
    private final String autotekaX;

    @c("fromBlock")
    @l
    private final Long fromBlock;

    @c("paymentFailed")
    private final boolean isPaymentFailed;

    @c("productSlug")
    @k
    private final String productSlug;

    @c("promoCode")
    @l
    private final String promoCode;

    @c("searchKey")
    @l
    private final String searchKey;

    @c("utmParams")
    @k
    private final UtmParamsV2 utmParams;

    /* compiled from: AutotekaPaymentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentDetails> {
        @Override // android.os.Parcelable.Creator
        public final PaymentDetails createFromParcel(Parcel parcel) {
            return new PaymentDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (UtmParamsV2) parcel.readParcelable(PaymentDetails.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentDetails[] newArray(int i12) {
            return new PaymentDetails[i12];
        }
    }

    public PaymentDetails(@l String str, @k String str2, @k String str3, @l Long l12, @k UtmParamsV2 utmParamsV2, @l String str4, boolean z12) {
        this.searchKey = str;
        this.productSlug = str2;
        this.autotekaX = str3;
        this.fromBlock = l12;
        this.utmParams = utmParamsV2;
        this.promoCode = str4;
        this.isPaymentFailed = z12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAutotekaX() {
        return this.autotekaX;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getFromBlock() {
        return this.fromBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getProductSlug() {
        return this.productSlug;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDetails)) {
            return false;
        }
        PaymentDetails paymentDetails = (PaymentDetails) obj;
        return L.f(this.searchKey, paymentDetails.searchKey) && L.f(this.productSlug, paymentDetails.productSlug) && L.f(this.autotekaX, paymentDetails.autotekaX) && L.f(this.fromBlock, paymentDetails.fromBlock) && L.f(this.utmParams, paymentDetails.utmParams) && L.f(this.promoCode, paymentDetails.promoCode) && this.isPaymentFailed == paymentDetails.isPaymentFailed;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSearchKey() {
        return this.searchKey;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final UtmParamsV2 getUtmParams() {
        return this.utmParams;
    }

    public final int hashCode() {
        String str = this.searchKey;
        int iD2 = H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.productSlug), 31, this.autotekaX);
        Long l12 = this.fromBlock;
        int iHashCode = (this.utmParams.hashCode() + ((iD2 + (l12 == null ? 0 : l12.hashCode())) * 31)) * 31;
        String str2 = this.promoCode;
        return Boolean.hashCode(this.isPaymentFailed) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsPaymentFailed() {
        return this.isPaymentFailed;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentDetails(searchKey=");
        sb2.append(this.searchKey);
        sb2.append(", productSlug=");
        sb2.append(this.productSlug);
        sb2.append(", autotekaX=");
        sb2.append(this.autotekaX);
        sb2.append(", fromBlock=");
        sb2.append(this.fromBlock);
        sb2.append(", utmParams=");
        sb2.append(this.utmParams);
        sb2.append(", promoCode=");
        sb2.append(this.promoCode);
        sb2.append(", isPaymentFailed=");
        return r.x(sb2, this.isPaymentFailed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.searchKey);
        parcel.writeString(this.productSlug);
        parcel.writeString(this.autotekaX);
        Long l12 = this.fromBlock;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeParcelable(this.utmParams, i12);
        parcel.writeString(this.promoCode);
        parcel.writeInt(this.isPaymentFailed ? 1 : 0);
    }

    public /* synthetic */ PaymentDetails(String str, String str2, String str3, Long l12, UtmParamsV2 utmParamsV2, String str4, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? new UtmParamsV2(null, null, null, null, null, 31, null) : utmParamsV2, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? false : z12);
    }
}
