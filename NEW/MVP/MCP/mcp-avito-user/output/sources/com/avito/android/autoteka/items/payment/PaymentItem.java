package com.avito.android.autoteka.items.payment;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.remote.autoteka.model.ContestAgreement;
import com.avito.android.remote.autoteka.model.EmailForm;
import com.avito.android.remote.autoteka.model.PriceDetails;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.autotekateaser.AutotekaPaymentInfoAnalytic;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaymentItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/payment/PaymentItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "LoadingVariant", "PromoCodeState", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<PaymentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96836b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f96837c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f96838d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f96839e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LoadingVariant f96840f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AttributedText f96841g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final EmailForm f96842h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AutotekaPaymentInfoAnalytic f96843i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final PromoCodeState f96844j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final PriceDetails f96845k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f96846l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final ContestAgreement f96847m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/payment/PaymentItem$LoadingVariant;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingVariant {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingVariant f96848b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingVariant f96849c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingVariant f96850d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingVariant[] f96851e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f96852f;

        static {
            LoadingVariant loadingVariant = new LoadingVariant("Payment", 0);
            f96848b = loadingVariant;
            LoadingVariant loadingVariant2 = new LoadingVariant("PromoCode", 1);
            f96849c = loadingVariant2;
            LoadingVariant loadingVariant3 = new LoadingVariant("None", 2);
            f96850d = loadingVariant3;
            LoadingVariant[] loadingVariantArr = {loadingVariant, loadingVariant2, loadingVariant3};
            f96851e = loadingVariantArr;
            f96852f = kotlin.enums.c.a(loadingVariantArr);
        }

        public LoadingVariant() {
            throw null;
        }

        public static LoadingVariant valueOf(String str) {
            return (LoadingVariant) Enum.valueOf(LoadingVariant.class, str);
        }

        public static LoadingVariant[] values() {
            return (LoadingVariant[]) f96851e.clone();
        }
    }

    /* compiled from: PaymentItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/payment/PaymentItem$PromoCodeState;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoCodeState implements Parcelable {

        @k
        public static final Parcelable.Creator<PromoCodeState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f96853b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public String f96854c;

        /* compiled from: PaymentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PromoCodeState> {
            @Override // android.os.Parcelable.Creator
            public final PromoCodeState createFromParcel(Parcel parcel) {
                return new PromoCodeState(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PromoCodeState[] newArray(int i12) {
                return new PromoCodeState[i12];
            }
        }

        public PromoCodeState(@k String str, @k String str2) {
            this.f96853b = str;
            this.f96854c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoCodeState)) {
                return false;
            }
            PromoCodeState promoCodeState = (PromoCodeState) obj;
            return L.f(this.f96853b, promoCodeState.f96853b) && L.f(this.f96854c, promoCodeState.f96854c);
        }

        public final int hashCode() {
            return this.f96854c.hashCode() + (this.f96853b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromoCodeState(promoCodeNotAccepted=");
            sb2.append(this.f96853b);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f96854c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f96853b);
            parcel.writeString(this.f96854c);
        }
    }

    /* compiled from: PaymentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentItem createFromParcel(Parcel parcel) {
            return new PaymentItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PaymentItem.class.getClassLoader()), (Image) parcel.readParcelable(PaymentItem.class.getClassLoader()), LoadingVariant.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(PaymentItem.class.getClassLoader()), (EmailForm) parcel.readParcelable(PaymentItem.class.getClassLoader()), (AutotekaPaymentInfoAnalytic) parcel.readParcelable(PaymentItem.class.getClassLoader()), PromoCodeState.CREATOR.createFromParcel(parcel), (PriceDetails) parcel.readParcelable(PaymentItem.class.getClassLoader()), parcel.readInt() != 0, (ContestAgreement) parcel.readParcelable(PaymentItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentItem[] newArray(int i12) {
            return new PaymentItem[i12];
        }
    }

    public PaymentItem(@k String str, @k String str2, @l AttributedText attributedText, @l Image image, @k LoadingVariant loadingVariant, @k AttributedText attributedText2, @l EmailForm emailForm, @k AutotekaPaymentInfoAnalytic autotekaPaymentInfoAnalytic, @k PromoCodeState promoCodeState, @k PriceDetails priceDetails, boolean z12, @l ContestAgreement contestAgreement) {
        this.f96836b = str;
        this.f96837c = str2;
        this.f96838d = attributedText;
        this.f96839e = image;
        this.f96840f = loadingVariant;
        this.f96841g = attributedText2;
        this.f96842h = emailForm;
        this.f96843i = autotekaPaymentInfoAnalytic;
        this.f96844j = promoCodeState;
        this.f96845k = priceDetails;
        this.f96846l = z12;
        this.f96847m = contestAgreement;
    }

    public static PaymentItem a(PaymentItem paymentItem, LoadingVariant loadingVariant, ContestAgreement contestAgreement, int i12) {
        String str = paymentItem.f96836b;
        String str2 = paymentItem.f96837c;
        AttributedText attributedText = paymentItem.f96838d;
        Image image = paymentItem.f96839e;
        LoadingVariant loadingVariant2 = (i12 & 16) != 0 ? paymentItem.f96840f : loadingVariant;
        AttributedText attributedText2 = paymentItem.f96841g;
        EmailForm emailForm = paymentItem.f96842h;
        AutotekaPaymentInfoAnalytic autotekaPaymentInfoAnalytic = paymentItem.f96843i;
        PromoCodeState promoCodeState = paymentItem.f96844j;
        PriceDetails priceDetails = paymentItem.f96845k;
        boolean z12 = paymentItem.f96846l;
        ContestAgreement contestAgreement2 = (i12 & 2048) != 0 ? paymentItem.f96847m : contestAgreement;
        paymentItem.getClass();
        return new PaymentItem(str, str2, attributedText, image, loadingVariant2, attributedText2, emailForm, autotekaPaymentInfoAnalytic, promoCodeState, priceDetails, z12, contestAgreement2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentItem)) {
            return false;
        }
        PaymentItem paymentItem = (PaymentItem) obj;
        return L.f(this.f96836b, paymentItem.f96836b) && L.f(this.f96837c, paymentItem.f96837c) && L.f(this.f96838d, paymentItem.f96838d) && L.f(this.f96839e, paymentItem.f96839e) && this.f96840f == paymentItem.f96840f && L.f(this.f96841g, paymentItem.f96841g) && L.f(this.f96842h, paymentItem.f96842h) && L.f(this.f96843i, paymentItem.f96843i) && L.f(this.f96844j, paymentItem.f96844j) && L.f(this.f96845k, paymentItem.f96845k) && this.f96846l == paymentItem.f96846l && L.f(this.f96847m, paymentItem.f96847m);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF9890b() {
        return this.f96836b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f96836b.hashCode() * 31, 31, this.f96837c);
        AttributedText attributedText = this.f96838d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Image image = this.f96839e;
        int iB2 = com.avito.android.actions_sheet.a.b((this.f96840f.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.f96841g);
        EmailForm emailForm = this.f96842h;
        int i12 = r.i((this.f96845k.hashCode() + ((this.f96844j.hashCode() + ((this.f96843i.hashCode() + ((iB2 + (emailForm == null ? 0 : emailForm.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f96846l);
        ContestAgreement contestAgreement = this.f96847m;
        return i12 + (contestAgreement != null ? contestAgreement.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PaymentItem(stringId=" + this.f96836b + ", title=" + this.f96837c + ", description=" + this.f96838d + ", image=" + this.f96839e + ", loadingVariant=" + this.f96840f + ", licenseAgreement=" + this.f96841g + ", emailForm=" + this.f96842h + ", autotekaAnalytic=" + this.f96843i + ", promoCodeState=" + this.f96844j + ", priceDetails=" + this.f96845k + ", isPromoCodeLessProfitable=" + this.f96846l + ", contestAgreement=" + this.f96847m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96836b);
        parcel.writeString(this.f96837c);
        parcel.writeParcelable(this.f96838d, i12);
        parcel.writeParcelable(this.f96839e, i12);
        parcel.writeString(this.f96840f.name());
        parcel.writeParcelable(this.f96841g, i12);
        parcel.writeParcelable(this.f96842h, i12);
        parcel.writeParcelable(this.f96843i, i12);
        this.f96844j.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f96845k, i12);
        parcel.writeInt(this.f96846l ? 1 : 0);
        parcel.writeParcelable(this.f96847m, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaymentItem(String str, String str2, AttributedText attributedText, Image image, LoadingVariant loadingVariant, AttributedText attributedText2, EmailForm emailForm, AutotekaPaymentInfoAnalytic autotekaPaymentInfoAnalytic, PromoCodeState promoCodeState, PriceDetails priceDetails, boolean z12, ContestAgreement contestAgreement, int i12, C42822w c42822w) {
        String str3;
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str3 = "ITEM_PAYMENT";
        } else {
            str3 = str;
        }
        this(str3, str2, attributedText, image, loadingVariant, attributedText2, emailForm, autotekaPaymentInfoAnalytic, promoCodeState, priceDetails, z12, contestAgreement);
    }
}
