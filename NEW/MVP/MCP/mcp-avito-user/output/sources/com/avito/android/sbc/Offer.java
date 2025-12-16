package com.avito.android.sbc;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/sbc/Offer;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "a", "Discount", "DiscountPercent", "Text", "Lcom/avito/android/sbc/Offer$Discount;", "Lcom/avito/android/sbc/Offer$DiscountPercent;", "Lcom/avito/android/sbc/Offer$Text;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Offer extends ParcelableEntity<String> {

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/sbc/Offer$Discount;", "Lcom/avito/android/sbc/Offer;", "", "slug", "name", "offerText", "", "messagePrice", "minDiscount", "maxDiscount", "Lcom/avito/android/sbc/ExpiresAtDto;", "expiresAtDto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/avito/android/sbc/ExpiresAtDto;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getName", "getOfferText", "J", "getMessagePrice", "()J", "getMinDiscount", "getMaxDiscount", "Lcom/avito/android/sbc/ExpiresAtDto;", "getExpiresAtDto", "()Lcom/avito/android/sbc/ExpiresAtDto;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Discount implements Offer {

        @k
        public static final Parcelable.Creator<Discount> CREATOR = new a();

        @c("expiresAt")
        @l
        private final ExpiresAtDto expiresAtDto;

        @c("maxDiscount")
        private final long maxDiscount;

        @c("messagePrice")
        private final long messagePrice;

        @c("minDiscount")
        private final long minDiscount;

        @c("name")
        @k
        private final String name;

        @c("offerText")
        @k
        private final String offerText;

        @c("slug")
        @k
        private final String slug;

        /* compiled from: CreateDiscountDispatchResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Discount> {
            @Override // android.os.Parcelable.Creator
            public final Discount createFromParcel(Parcel parcel) {
                return new Discount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : ExpiresAtDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Discount[] newArray(int i12) {
                return new Discount[i12];
            }
        }

        public Discount(@k String str, @k String str2, @k String str3, long j12, long j13, long j14, @l ExpiresAtDto expiresAtDto) {
            this.slug = str;
            this.name = str2;
            this.offerText = str3;
            this.messagePrice = j12;
            this.minDiscount = j13;
            this.maxDiscount = j14;
            this.expiresAtDto = expiresAtDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            return L.f(this.slug, discount.slug) && L.f(this.name, discount.name) && L.f(this.offerText, discount.offerText) && this.messagePrice == discount.messagePrice && this.minDiscount == discount.minDiscount && this.maxDiscount == discount.maxDiscount && L.f(this.expiresAtDto, discount.expiresAtDto);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.slug;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            int iG2 = r.g(r.g(r.g(H.d(H.d(this.slug.hashCode() * 31, 31, this.name), 31, this.offerText), 31, this.messagePrice), 31, this.minDiscount), 31, this.maxDiscount);
            ExpiresAtDto expiresAtDto = this.expiresAtDto;
            return iG2 + (expiresAtDto == null ? 0 : expiresAtDto.hashCode());
        }

        @k
        public final String toString() {
            return "Discount(slug=" + this.slug + ", name=" + this.name + ", offerText=" + this.offerText + ", messagePrice=" + this.messagePrice + ", minDiscount=" + this.minDiscount + ", maxDiscount=" + this.maxDiscount + ", expiresAtDto=" + this.expiresAtDto + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.slug);
            parcel.writeString(this.name);
            parcel.writeString(this.offerText);
            parcel.writeLong(this.messagePrice);
            parcel.writeLong(this.minDiscount);
            parcel.writeLong(this.maxDiscount);
            ExpiresAtDto expiresAtDto = this.expiresAtDto;
            if (expiresAtDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expiresAtDto.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/sbc/Offer$DiscountPercent;", "Lcom/avito/android/sbc/Offer;", "", "slug", "name", "offerText", "", "messagePrice", "minDiscountPercent", "maxDiscountPercent", "Lcom/avito/android/sbc/ExpiresAtDto;", "expiresAtDto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLcom/avito/android/sbc/ExpiresAtDto;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getName", "getOfferText", "J", "getMessagePrice", "()J", "getMinDiscountPercent", "getMaxDiscountPercent", "Lcom/avito/android/sbc/ExpiresAtDto;", "getExpiresAtDto", "()Lcom/avito/android/sbc/ExpiresAtDto;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DiscountPercent implements Offer {

        @k
        public static final Parcelable.Creator<DiscountPercent> CREATOR = new a();

        @c("expiresAt")
        @l
        private final ExpiresAtDto expiresAtDto;

        @c("maxDiscount")
        private final long maxDiscountPercent;

        @c("messagePrice")
        private final long messagePrice;

        @c("minDiscount")
        private final long minDiscountPercent;

        @c("name")
        @k
        private final String name;

        @c("offerText")
        @k
        private final String offerText;

        @c("slug")
        @k
        private final String slug;

        /* compiled from: CreateDiscountDispatchResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DiscountPercent> {
            @Override // android.os.Parcelable.Creator
            public final DiscountPercent createFromParcel(Parcel parcel) {
                return new DiscountPercent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : ExpiresAtDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final DiscountPercent[] newArray(int i12) {
                return new DiscountPercent[i12];
            }
        }

        public DiscountPercent(@k String str, @k String str2, @k String str3, long j12, long j13, long j14, @l ExpiresAtDto expiresAtDto) {
            this.slug = str;
            this.name = str2;
            this.offerText = str3;
            this.messagePrice = j12;
            this.minDiscountPercent = j13;
            this.maxDiscountPercent = j14;
            this.expiresAtDto = expiresAtDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountPercent)) {
                return false;
            }
            DiscountPercent discountPercent = (DiscountPercent) obj;
            return L.f(this.slug, discountPercent.slug) && L.f(this.name, discountPercent.name) && L.f(this.offerText, discountPercent.offerText) && this.messagePrice == discountPercent.messagePrice && this.minDiscountPercent == discountPercent.minDiscountPercent && this.maxDiscountPercent == discountPercent.maxDiscountPercent && L.f(this.expiresAtDto, discountPercent.expiresAtDto);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.slug;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            int iG2 = r.g(r.g(r.g(H.d(H.d(this.slug.hashCode() * 31, 31, this.name), 31, this.offerText), 31, this.messagePrice), 31, this.minDiscountPercent), 31, this.maxDiscountPercent);
            ExpiresAtDto expiresAtDto = this.expiresAtDto;
            return iG2 + (expiresAtDto == null ? 0 : expiresAtDto.hashCode());
        }

        @k
        public final String toString() {
            return "DiscountPercent(slug=" + this.slug + ", name=" + this.name + ", offerText=" + this.offerText + ", messagePrice=" + this.messagePrice + ", minDiscountPercent=" + this.minDiscountPercent + ", maxDiscountPercent=" + this.maxDiscountPercent + ", expiresAtDto=" + this.expiresAtDto + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.slug);
            parcel.writeString(this.name);
            parcel.writeString(this.offerText);
            parcel.writeLong(this.messagePrice);
            parcel.writeLong(this.minDiscountPercent);
            parcel.writeLong(this.maxDiscountPercent);
            ExpiresAtDto expiresAtDto = this.expiresAtDto;
            if (expiresAtDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expiresAtDto.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/sbc/Offer$Text;", "Lcom/avito/android/sbc/Offer;", "", "slug", "name", "offerText", "", "messagePrice", "Lcom/avito/android/sbc/ExpiresAtDto;", "expiresAtDto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/avito/android/sbc/ExpiresAtDto;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getName", "getOfferText", "J", "getMessagePrice", "()J", "Lcom/avito/android/sbc/ExpiresAtDto;", "getExpiresAtDto", "()Lcom/avito/android/sbc/ExpiresAtDto;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Text implements Offer {

        @k
        public static final Parcelable.Creator<Text> CREATOR = new a();

        @c("expiresAt")
        @l
        private final ExpiresAtDto expiresAtDto;

        @c("messagePrice")
        private final long messagePrice;

        @c("name")
        @k
        private final String name;

        @c("offerText")
        @k
        private final String offerText;

        @c("slug")
        @k
        private final String slug;

        /* compiled from: CreateDiscountDispatchResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                return new Text(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : ExpiresAtDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i12) {
                return new Text[i12];
            }
        }

        public Text(@k String str, @k String str2, @k String str3, long j12, @l ExpiresAtDto expiresAtDto) {
            this.slug = str;
            this.name = str2;
            this.offerText = str3;
            this.messagePrice = j12;
            this.expiresAtDto = expiresAtDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return L.f(this.slug, text.slug) && L.f(this.name, text.name) && L.f(this.offerText, text.offerText) && this.messagePrice == text.messagePrice && L.f(this.expiresAtDto, text.expiresAtDto);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return this.slug;
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            int iG2 = r.g(H.d(H.d(this.slug.hashCode() * 31, 31, this.name), 31, this.offerText), 31, this.messagePrice);
            ExpiresAtDto expiresAtDto = this.expiresAtDto;
            return iG2 + (expiresAtDto == null ? 0 : expiresAtDto.hashCode());
        }

        @k
        public final String toString() {
            return "Text(slug=" + this.slug + ", name=" + this.name + ", offerText=" + this.offerText + ", messagePrice=" + this.messagePrice + ", expiresAtDto=" + this.expiresAtDto + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.slug);
            parcel.writeString(this.name);
            parcel.writeString(this.offerText);
            parcel.writeLong(this.messagePrice);
            ExpiresAtDto expiresAtDto = this.expiresAtDto;
            if (expiresAtDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expiresAtDto.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/Offer$a;", "", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }
}
