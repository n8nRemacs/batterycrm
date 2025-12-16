package com.avito.android.sbc.create.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/create/model/Offer;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "Discount", "DiscountPercent", "Text", "Lcom/avito/android/sbc/create/model/Offer$Discount;", "Lcom/avito/android/sbc/create/model/Offer$DiscountPercent;", "Lcom/avito/android/sbc/create/model/Offer$Text;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Offer extends ParcelableEntity<String> {

    /* compiled from: CreateDiscountDispatchData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/model/Offer$Discount;", "Lcom/avito/android/sbc/create/model/Offer;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Discount implements Offer {

        @k
        public static final Parcelable.Creator<Discount> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f259190b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f259191c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f259192d;

        /* renamed from: e, reason: collision with root package name */
        public final long f259193e;

        /* renamed from: f, reason: collision with root package name */
        public final long f259194f;

        /* renamed from: g, reason: collision with root package name */
        public final long f259195g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final ExpiresAtDto f259196h;

        /* compiled from: CreateDiscountDispatchData.kt */
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
            this.f259190b = str;
            this.f259191c = str2;
            this.f259192d = str3;
            this.f259193e = j12;
            this.f259194f = j13;
            this.f259195g = j14;
            this.f259196h = expiresAtDto;
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
            return L.f(this.f259190b, discount.f259190b) && L.f(this.f259191c, discount.f259191c) && L.f(this.f259192d, discount.f259192d) && this.f259193e == discount.f259193e && this.f259194f == discount.f259194f && this.f259195g == discount.f259195g && L.f(this.f259196h, discount.f259196h);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return getF259204b();
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF259205c() {
            return this.f259191c;
        }

        @Override // com.avito.android.sbc.create.model.Offer
        @k
        /* renamed from: getSlug, reason: from getter */
        public final String getF259204b() {
            return this.f259190b;
        }

        public final int hashCode() {
            int iG2 = r.g(r.g(r.g(H.d(H.d(this.f259190b.hashCode() * 31, 31, this.f259191c), 31, this.f259192d), 31, this.f259193e), 31, this.f259194f), 31, this.f259195g);
            ExpiresAtDto expiresAtDto = this.f259196h;
            return iG2 + (expiresAtDto == null ? 0 : expiresAtDto.hashCode());
        }

        @k
        public final String toString() {
            return "Discount(slug=" + this.f259190b + ", name=" + this.f259191c + ", offerText=" + this.f259192d + ", messagePrice=" + this.f259193e + ", minDiscount=" + this.f259194f + ", maxDiscount=" + this.f259195g + ", expiresAtDto=" + this.f259196h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f259190b);
            parcel.writeString(this.f259191c);
            parcel.writeString(this.f259192d);
            parcel.writeLong(this.f259193e);
            parcel.writeLong(this.f259194f);
            parcel.writeLong(this.f259195g);
            ExpiresAtDto expiresAtDto = this.f259196h;
            if (expiresAtDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expiresAtDto.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CreateDiscountDispatchData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/model/Offer$DiscountPercent;", "Lcom/avito/android/sbc/create/model/Offer;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DiscountPercent implements Offer {

        @k
        public static final Parcelable.Creator<DiscountPercent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f259197b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f259198c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f259199d;

        /* renamed from: e, reason: collision with root package name */
        public final long f259200e;

        /* renamed from: f, reason: collision with root package name */
        public final long f259201f;

        /* renamed from: g, reason: collision with root package name */
        public final long f259202g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final ExpiresAtDto f259203h;

        /* compiled from: CreateDiscountDispatchData.kt */
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
            this.f259197b = str;
            this.f259198c = str2;
            this.f259199d = str3;
            this.f259200e = j12;
            this.f259201f = j13;
            this.f259202g = j14;
            this.f259203h = expiresAtDto;
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
            return L.f(this.f259197b, discountPercent.f259197b) && L.f(this.f259198c, discountPercent.f259198c) && L.f(this.f259199d, discountPercent.f259199d) && this.f259200e == discountPercent.f259200e && this.f259201f == discountPercent.f259201f && this.f259202g == discountPercent.f259202g && L.f(this.f259203h, discountPercent.f259203h);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return getF259204b();
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF259205c() {
            return this.f259198c;
        }

        @Override // com.avito.android.sbc.create.model.Offer
        @k
        /* renamed from: getSlug, reason: from getter */
        public final String getF259204b() {
            return this.f259197b;
        }

        public final int hashCode() {
            int iG2 = r.g(r.g(r.g(H.d(H.d(this.f259197b.hashCode() * 31, 31, this.f259198c), 31, this.f259199d), 31, this.f259200e), 31, this.f259201f), 31, this.f259202g);
            ExpiresAtDto expiresAtDto = this.f259203h;
            return iG2 + (expiresAtDto == null ? 0 : expiresAtDto.hashCode());
        }

        @k
        public final String toString() {
            return "DiscountPercent(slug=" + this.f259197b + ", name=" + this.f259198c + ", offerText=" + this.f259199d + ", messagePrice=" + this.f259200e + ", minDiscountPercent=" + this.f259201f + ", maxDiscountPercent=" + this.f259202g + ", expiresAtDto=" + this.f259203h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f259197b);
            parcel.writeString(this.f259198c);
            parcel.writeString(this.f259199d);
            parcel.writeLong(this.f259200e);
            parcel.writeLong(this.f259201f);
            parcel.writeLong(this.f259202g);
            ExpiresAtDto expiresAtDto = this.f259203h;
            if (expiresAtDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expiresAtDto.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CreateDiscountDispatchData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/model/Offer$Text;", "Lcom/avito/android/sbc/create/model/Offer;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Text implements Offer {

        @k
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f259204b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f259205c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f259206d;

        /* renamed from: e, reason: collision with root package name */
        public final long f259207e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ExpiresAtDto f259208f;

        /* compiled from: CreateDiscountDispatchData.kt */
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
            this.f259204b = str;
            this.f259205c = str2;
            this.f259206d = str3;
            this.f259207e = j12;
            this.f259208f = expiresAtDto;
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
            return L.f(this.f259204b, text.f259204b) && L.f(this.f259205c, text.f259205c) && L.f(this.f259206d, text.f259206d) && this.f259207e == text.f259207e && L.f(this.f259208f, text.f259208f);
        }

        @Override // com.avito.android.remote.model.Entity
        public final Object getId() {
            return getF259204b();
        }

        @Override // com.avito.android.remote.model.Entity
        @k
        /* renamed from: getName, reason: from getter */
        public final String getF259205c() {
            return this.f259205c;
        }

        @Override // com.avito.android.sbc.create.model.Offer
        @k
        /* renamed from: getSlug, reason: from getter */
        public final String getF259204b() {
            return this.f259204b;
        }

        public final int hashCode() {
            int iG2 = r.g(H.d(H.d(this.f259204b.hashCode() * 31, 31, this.f259205c), 31, this.f259206d), 31, this.f259207e);
            ExpiresAtDto expiresAtDto = this.f259208f;
            return iG2 + (expiresAtDto == null ? 0 : expiresAtDto.hashCode());
        }

        @k
        public final String toString() {
            return "Text(slug=" + this.f259204b + ", name=" + this.f259205c + ", offerText=" + this.f259206d + ", messagePrice=" + this.f259207e + ", expiresAtDto=" + this.f259208f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f259204b);
            parcel.writeString(this.f259205c);
            parcel.writeString(this.f259206d);
            parcel.writeLong(this.f259207e);
            ExpiresAtDto expiresAtDto = this.f259208f;
            if (expiresAtDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                expiresAtDto.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CreateDiscountDispatchData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    /* renamed from: getSlug */
    String getF259204b();
}
