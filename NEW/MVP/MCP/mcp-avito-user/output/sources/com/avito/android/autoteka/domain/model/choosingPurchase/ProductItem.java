package com.avito.android.autoteka.domain.model.choosingPurchase;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: ProductItem.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/domain/model/choosingPurchase/ProductItem;", "Landroid/os/Parcelable;", "ProductItemAnalyticsData", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ProductItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96629b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f96630c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f96631d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f96632e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f96633f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f96634g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f96635h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f96636i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ProductItemAnalyticsData f96637j;

    /* compiled from: ProductItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/domain/model/choosingPurchase/ProductItem$ProductItemAnalyticsData;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProductItemAnalyticsData implements Parcelable {

        @k
        public static final Parcelable.Creator<ProductItemAnalyticsData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f96638b;

        /* renamed from: c, reason: collision with root package name */
        public final long f96639c;

        /* compiled from: ProductItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProductItemAnalyticsData> {
            @Override // android.os.Parcelable.Creator
            public final ProductItemAnalyticsData createFromParcel(Parcel parcel) {
                return new ProductItemAnalyticsData(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final ProductItemAnalyticsData[] newArray(int i12) {
                return new ProductItemAnalyticsData[i12];
            }
        }

        public ProductItemAnalyticsData(long j12, long j13) {
            this.f96638b = j12;
            this.f96639c = j13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductItemAnalyticsData)) {
                return false;
            }
            ProductItemAnalyticsData productItemAnalyticsData = (ProductItemAnalyticsData) obj;
            return this.f96638b == productItemAnalyticsData.f96638b && this.f96639c == productItemAnalyticsData.f96639c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f96639c) + (Long.hashCode(this.f96638b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProductItemAnalyticsData(priceInCents=");
            sb2.append(this.f96638b);
            sb2.append(", productId=");
            return r.u(sb2, this.f96639c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f96638b);
            parcel.writeLong(this.f96639c);
        }
    }

    /* compiled from: ProductItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProductItem> {
        @Override // android.os.Parcelable.Creator
        public final ProductItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ProductItem.class, parcel, arrayList, iL2, 1);
            }
            return new ProductItem(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProductItemAnalyticsData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductItem[] newArray(int i12) {
            return new ProductItem[i12];
        }
    }

    public ProductItem(@k String str, @k ArrayList arrayList, @k String str2, @l String str3, @k String str4, @l String str5, @l String str6, @l String str7, @l ProductItemAnalyticsData productItemAnalyticsData) {
        this.f96629b = str;
        this.f96630c = arrayList;
        this.f96631d = str2;
        this.f96632e = str3;
        this.f96633f = str4;
        this.f96634g = str5;
        this.f96635h = str6;
        this.f96636i = str7;
        this.f96637j = productItemAnalyticsData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96629b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f96630c, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeString(this.f96631d);
        parcel.writeString(this.f96632e);
        parcel.writeString(this.f96633f);
        parcel.writeString(this.f96634g);
        parcel.writeString(this.f96635h);
        parcel.writeString(this.f96636i);
        ProductItemAnalyticsData productItemAnalyticsData = this.f96637j;
        if (productItemAnalyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productItemAnalyticsData.writeToParcel(parcel, i12);
        }
    }
}
