package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesResult.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/FavoriteAdvertPrice;", "Landroid/os/Parcelable;", "", "value", "previousPrice", "previousPriceHint", "Lcom/avito/android/remote/model/DiscountIcon;", "discountIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DiscountIcon;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/DiscountIcon;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DiscountIcon;)Lcom/avito/android/remote/model/FavoriteAdvertPrice;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "getPreviousPrice", "getPreviousPriceHint", "Lcom/avito/android/remote/model/DiscountIcon;", "getDiscountIcon", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FavoriteAdvertPrice implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoriteAdvertPrice> CREATOR = new Creator();

    @c("discountIcon")
    @l
    private final DiscountIcon discountIcon;

    @c("formattedValueOld")
    @l
    private final String previousPrice;

    @c("previousPriceHint")
    @l
    private final String previousPriceHint;

    @c("formattedValue")
    @k
    private final String value;

    /* compiled from: FavoritesResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteAdvertPrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteAdvertPrice createFromParcel(@k Parcel parcel) {
            return new FavoriteAdvertPrice(parcel.readString(), parcel.readString(), parcel.readString(), (DiscountIcon) parcel.readParcelable(FavoriteAdvertPrice.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteAdvertPrice[] newArray(int i12) {
            return new FavoriteAdvertPrice[i12];
        }
    }

    public FavoriteAdvertPrice(@k String str, @l String str2, @l String str3, @l DiscountIcon discountIcon) {
        this.value = str;
        this.previousPrice = str2;
        this.previousPriceHint = str3;
        this.discountIcon = discountIcon;
    }

    public static /* synthetic */ FavoriteAdvertPrice copy$default(FavoriteAdvertPrice favoriteAdvertPrice, String str, String str2, String str3, DiscountIcon discountIcon, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = favoriteAdvertPrice.value;
        }
        if ((i12 & 2) != 0) {
            str2 = favoriteAdvertPrice.previousPrice;
        }
        if ((i12 & 4) != 0) {
            str3 = favoriteAdvertPrice.previousPriceHint;
        }
        if ((i12 & 8) != 0) {
            discountIcon = favoriteAdvertPrice.discountIcon;
        }
        return favoriteAdvertPrice.copy(str, str2, str3, discountIcon);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getPreviousPrice() {
        return this.previousPrice;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPreviousPriceHint() {
        return this.previousPriceHint;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DiscountIcon getDiscountIcon() {
        return this.discountIcon;
    }

    @k
    public final FavoriteAdvertPrice copy(@k String value, @l String previousPrice, @l String previousPriceHint, @l DiscountIcon discountIcon) {
        return new FavoriteAdvertPrice(value, previousPrice, previousPriceHint, discountIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteAdvertPrice)) {
            return false;
        }
        FavoriteAdvertPrice favoriteAdvertPrice = (FavoriteAdvertPrice) other;
        return L.f(this.value, favoriteAdvertPrice.value) && L.f(this.previousPrice, favoriteAdvertPrice.previousPrice) && L.f(this.previousPriceHint, favoriteAdvertPrice.previousPriceHint) && L.f(this.discountIcon, favoriteAdvertPrice.discountIcon);
    }

    @l
    public final DiscountIcon getDiscountIcon() {
        return this.discountIcon;
    }

    @l
    public final String getPreviousPrice() {
        return this.previousPrice;
    }

    @l
    public final String getPreviousPriceHint() {
        return this.previousPriceHint;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.previousPrice;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.previousPriceHint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DiscountIcon discountIcon = this.discountIcon;
        return iHashCode3 + (discountIcon != null ? discountIcon.hashCode() : 0);
    }

    @k
    public String toString() {
        return "FavoriteAdvertPrice(value=" + this.value + ", previousPrice=" + this.previousPrice + ", previousPriceHint=" + this.previousPriceHint + ", discountIcon=" + this.discountIcon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.value);
        parcel.writeString(this.previousPrice);
        parcel.writeString(this.previousPriceHint);
        parcel.writeParcelable(this.discountIcon, flags);
    }
}
