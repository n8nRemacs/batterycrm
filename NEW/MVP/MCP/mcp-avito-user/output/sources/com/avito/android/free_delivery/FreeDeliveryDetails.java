package com.avito.android.free_delivery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreeDeliveryLink.kt */
@K51.d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u00012B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b)\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b/\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b1\u0010&¨\u00063"}, d2 = {"Lcom/avito/android/free_delivery/FreeDeliveryDetails;", "Landroid/os/Parcelable;", "", "itemId", "", "title", "", "Lcom/avito/android/free_delivery/FreeDeliveryDetails$TrustFactor;", "trustFactors", "inputTitle", "currencySymbol", "", "minDiscount", "maxDiscount", "sliderStep", "discount", "discountTooSmallHint", "discountTooBigHint", "Lcom/avito/android/remote/model/text/AttributedText;", "bannerText", "acceptButtonTitle", "cancelButtonTitle", "itemPrice", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;I)V", "J", "k", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "p", "()Ljava/util/List;", "j", "f", "I", "n", "()I", "m", "o", "g", "i", "h", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "e", "l", "TrustFactor", "_avito_free-delivery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FreeDeliveryDetails implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FreeDeliveryDetails> CREATOR = new a();

    @com.google.gson.annotations.c("acceptButtonTitle")
    @Y61.k
    private final String acceptButtonTitle;

    @com.google.gson.annotations.c("bannerText")
    @Y61.k
    private final AttributedText bannerText;

    @com.google.gson.annotations.c("cancelButtonTitle")
    @Y61.k
    private final String cancelButtonTitle;

    @com.google.gson.annotations.c("currencySymbol")
    @Y61.k
    private final String currencySymbol;

    @com.google.gson.annotations.c("discount")
    private final int discount;

    @com.google.gson.annotations.c("discountTooBigHint")
    @Y61.l
    private final String discountTooBigHint;

    @com.google.gson.annotations.c("discountTooSmallHint")
    @Y61.l
    private final String discountTooSmallHint;

    @com.google.gson.annotations.c("inputTitle")
    @Y61.k
    private final String inputTitle;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c("itemPrice")
    private final int itemPrice;

    @com.google.gson.annotations.c("maxDiscount")
    private final int maxDiscount;

    @com.google.gson.annotations.c("minDiscount")
    private final int minDiscount;

    @com.google.gson.annotations.c("sliderStep")
    private final int sliderStep;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("trustFactors")
    @Y61.k
    private final List<TrustFactor> trustFactors;

    /* compiled from: FreeDeliveryLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/free_delivery/FreeDeliveryDetails$TrustFactor;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "text", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito_free-delivery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TrustFactor implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<TrustFactor> CREATOR = new a();

        @com.google.gson.annotations.c("image")
        @Y61.k
        private final UniversalImage image;

        @com.google.gson.annotations.c("text")
        @Y61.k
        private final String text;

        /* compiled from: FreeDeliveryLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TrustFactor> {
            @Override // android.os.Parcelable.Creator
            public final TrustFactor createFromParcel(Parcel parcel) {
                return new TrustFactor((UniversalImage) parcel.readParcelable(TrustFactor.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrustFactor[] newArray(int i12) {
                return new TrustFactor[i12];
            }
        }

        public TrustFactor(@Y61.k UniversalImage universalImage, @Y61.k String str) {
            this.image = universalImage;
            this.text = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrustFactor)) {
                return false;
            }
            TrustFactor trustFactor = (TrustFactor) obj;
            return L.f(this.image, trustFactor.image) && L.f(this.text, trustFactor.text);
        }

        @Y61.k
        public final UniversalImage getImage() {
            return this.image;
        }

        @Y61.k
        public final String getText() {
            return this.text;
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.image.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TrustFactor(image=");
            sb2.append(this.image);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.image, i12);
            parcel.writeString(this.text);
        }
    }

    /* compiled from: FreeDeliveryLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FreeDeliveryDetails> {
        @Override // android.os.Parcelable.Creator
        public final FreeDeliveryDetails createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(TrustFactor.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FreeDeliveryDetails(j12, string, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(FreeDeliveryDetails.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final FreeDeliveryDetails[] newArray(int i12) {
            return new FreeDeliveryDetails[i12];
        }
    }

    public FreeDeliveryDetails(long j12, @Y61.k String str, @Y61.k List<TrustFactor> list, @Y61.k String str2, @Y61.k String str3, int i12, int i13, int i14, int i15, @Y61.l String str4, @Y61.l String str5, @Y61.k AttributedText attributedText, @Y61.k String str6, @Y61.k String str7, int i16) {
        this.itemId = j12;
        this.title = str;
        this.trustFactors = list;
        this.inputTitle = str2;
        this.currencySymbol = str3;
        this.minDiscount = i12;
        this.maxDiscount = i13;
        this.sliderStep = i14;
        this.discount = i15;
        this.discountTooSmallHint = str4;
        this.discountTooBigHint = str5;
        this.bannerText = attributedText;
        this.acceptButtonTitle = str6;
        this.cancelButtonTitle = str7;
        this.itemPrice = i16;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getAcceptButtonTitle() {
        return this.acceptButtonTitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AttributedText getBannerText() {
        return this.bannerText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeDeliveryDetails)) {
            return false;
        }
        FreeDeliveryDetails freeDeliveryDetails = (FreeDeliveryDetails) obj;
        return this.itemId == freeDeliveryDetails.itemId && L.f(this.title, freeDeliveryDetails.title) && L.f(this.trustFactors, freeDeliveryDetails.trustFactors) && L.f(this.inputTitle, freeDeliveryDetails.inputTitle) && L.f(this.currencySymbol, freeDeliveryDetails.currencySymbol) && this.minDiscount == freeDeliveryDetails.minDiscount && this.maxDiscount == freeDeliveryDetails.maxDiscount && this.sliderStep == freeDeliveryDetails.sliderStep && this.discount == freeDeliveryDetails.discount && L.f(this.discountTooSmallHint, freeDeliveryDetails.discountTooSmallHint) && L.f(this.discountTooBigHint, freeDeliveryDetails.discountTooBigHint) && L.f(this.bannerText, freeDeliveryDetails.bannerText) && L.f(this.acceptButtonTitle, freeDeliveryDetails.acceptButtonTitle) && L.f(this.cancelButtonTitle, freeDeliveryDetails.cancelButtonTitle) && this.itemPrice == freeDeliveryDetails.itemPrice;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: g, reason: from getter */
    public final int getDiscount() {
        return this.discount;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getDiscountTooBigHint() {
        return this.discountTooBigHint;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.discount, androidx.appcompat.app.r.e(this.sliderStep, androidx.appcompat.app.r.e(this.maxDiscount, androidx.appcompat.app.r.e(this.minDiscount, H.d(H.d(H.e(H.d(Long.hashCode(this.itemId) * 31, 31, this.title), 31, this.trustFactors), 31, this.inputTitle), 31, this.currencySymbol), 31), 31), 31), 31);
        String str = this.discountTooSmallHint;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountTooBigHint;
        return Integer.hashCode(this.itemPrice) + H.d(H.d(com.avito.android.actions_sheet.a.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.bannerText), 31, this.acceptButtonTitle), 31, this.cancelButtonTitle);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getDiscountTooSmallHint() {
        return this.discountTooSmallHint;
    }

    @Y61.k
    /* renamed from: j, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    /* renamed from: k, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: l, reason: from getter */
    public final int getItemPrice() {
        return this.itemPrice;
    }

    /* renamed from: m, reason: from getter */
    public final int getMaxDiscount() {
        return this.maxDiscount;
    }

    /* renamed from: n, reason: from getter */
    public final int getMinDiscount() {
        return this.minDiscount;
    }

    /* renamed from: o, reason: from getter */
    public final int getSliderStep() {
        return this.sliderStep;
    }

    @Y61.k
    public final List<TrustFactor> p() {
        return this.trustFactors;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeDeliveryDetails(itemId=");
        sb2.append(this.itemId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", trustFactors=");
        sb2.append(this.trustFactors);
        sb2.append(", inputTitle=");
        sb2.append(this.inputTitle);
        sb2.append(", currencySymbol=");
        sb2.append(this.currencySymbol);
        sb2.append(", minDiscount=");
        sb2.append(this.minDiscount);
        sb2.append(", maxDiscount=");
        sb2.append(this.maxDiscount);
        sb2.append(", sliderStep=");
        sb2.append(this.sliderStep);
        sb2.append(", discount=");
        sb2.append(this.discount);
        sb2.append(", discountTooSmallHint=");
        sb2.append(this.discountTooSmallHint);
        sb2.append(", discountTooBigHint=");
        sb2.append(this.discountTooBigHint);
        sb2.append(", bannerText=");
        sb2.append(this.bannerText);
        sb2.append(", acceptButtonTitle=");
        sb2.append(this.acceptButtonTitle);
        sb2.append(", cancelButtonTitle=");
        sb2.append(this.cancelButtonTitle);
        sb2.append(", itemPrice=");
        return androidx.appcompat.app.r.t(sb2, this.itemPrice, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.itemId);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.trustFactors, parcel);
        while (itJ.hasNext()) {
            ((TrustFactor) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.inputTitle);
        parcel.writeString(this.currencySymbol);
        parcel.writeInt(this.minDiscount);
        parcel.writeInt(this.maxDiscount);
        parcel.writeInt(this.sliderStep);
        parcel.writeInt(this.discount);
        parcel.writeString(this.discountTooSmallHint);
        parcel.writeString(this.discountTooBigHint);
        parcel.writeParcelable(this.bannerText, i12);
        parcel.writeString(this.acceptButtonTitle);
        parcel.writeString(this.cancelButtonTitle);
        parcel.writeInt(this.itemPrice);
    }
}
