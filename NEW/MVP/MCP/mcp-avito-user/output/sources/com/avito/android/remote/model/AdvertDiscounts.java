package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDiscounts.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b-\u0010\"¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/AdvertDiscounts;", "Landroid/os/Parcelable;", "", "title", "subtitle", "", "Lcom/avito/android/remote/model/Discount;", "discounts", "Lcom/avito/android/remote/model/TotalDiscount;", "total", "Lcom/avito/android/remote/model/MinPrice;", "minPrice", "information", "Lcom/avito/android/remote/model/PriceWithDiscount;", "priceWithDiscount", "Lcom/avito/android/remote/model/GroupedDiscounts;", "groupedValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/TotalDiscount;Lcom/avito/android/remote/model/MinPrice;Ljava/lang/String;Lcom/avito/android/remote/model/PriceWithDiscount;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/util/List;", "getDiscounts", "()Ljava/util/List;", "Lcom/avito/android/remote/model/TotalDiscount;", "getTotal", "()Lcom/avito/android/remote/model/TotalDiscount;", "Lcom/avito/android/remote/model/MinPrice;", "getMinPrice", "()Lcom/avito/android/remote/model/MinPrice;", "getInformation", "Lcom/avito/android/remote/model/PriceWithDiscount;", "getPriceWithDiscount", "()Lcom/avito/android/remote/model/PriceWithDiscount;", "getGroupedValues", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertDiscounts implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDiscounts> CREATOR = new Creator();

    @c("values")
    @l
    private final List<Discount> discounts;

    @c("groupedValues")
    @l
    private final List<GroupedDiscounts> groupedValues;

    @c("information")
    @l
    private final String information;

    @c("minPrice")
    @l
    private final MinPrice minPrice;

    @c("priceWithDiscount")
    @l
    private final PriceWithDiscount priceWithDiscount;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    @c("total")
    @l
    private final TotalDiscount total;

    /* compiled from: AdvertDiscounts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDiscounts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDiscounts createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Discount.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            TotalDiscount totalDiscountCreateFromParcel = parcel.readInt() == 0 ? null : TotalDiscount.CREATOR.createFromParcel(parcel);
            MinPrice minPriceCreateFromParcel = parcel.readInt() == 0 ? null : MinPrice.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            PriceWithDiscount priceWithDiscountCreateFromParcel = parcel.readInt() == 0 ? null : PriceWithDiscount.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(GroupedDiscounts.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new AdvertDiscounts(string, string2, arrayList, totalDiscountCreateFromParcel, minPriceCreateFromParcel, string3, priceWithDiscountCreateFromParcel, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDiscounts[] newArray(int i12) {
            return new AdvertDiscounts[i12];
        }
    }

    public AdvertDiscounts(@l String str, @l String str2, @l List<Discount> list, @l TotalDiscount totalDiscount, @l MinPrice minPrice, @l String str3, @l PriceWithDiscount priceWithDiscount, @l List<GroupedDiscounts> list2) {
        this.title = str;
        this.subtitle = str2;
        this.discounts = list;
        this.total = totalDiscount;
        this.minPrice = minPrice;
        this.information = str3;
        this.priceWithDiscount = priceWithDiscount;
        this.groupedValues = list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<Discount> getDiscounts() {
        return this.discounts;
    }

    @l
    public final List<GroupedDiscounts> getGroupedValues() {
        return this.groupedValues;
    }

    @l
    public final String getInformation() {
        return this.information;
    }

    @l
    public final MinPrice getMinPrice() {
        return this.minPrice;
    }

    @l
    public final PriceWithDiscount getPriceWithDiscount() {
        return this.priceWithDiscount;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final TotalDiscount getTotal() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<Discount> list = this.discounts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Discount) itA.next()).writeToParcel(parcel, flags);
            }
        }
        TotalDiscount totalDiscount = this.total;
        if (totalDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            totalDiscount.writeToParcel(parcel, flags);
        }
        MinPrice minPrice = this.minPrice;
        if (minPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minPrice.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.information);
        PriceWithDiscount priceWithDiscount = this.priceWithDiscount;
        if (priceWithDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceWithDiscount.writeToParcel(parcel, flags);
        }
        List<GroupedDiscounts> list2 = this.groupedValues;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((GroupedDiscounts) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
