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

/* compiled from: CarMarketPrice.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/CarMarketPrice;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PriceRanges;", "priceRanges", "Lcom/avito/android/remote/model/PricePoll;", "poll", "Lcom/avito/android/remote/model/ClosePoll;", "closePoll", "<init>", "(Lcom/avito/android/remote/model/PriceRanges;Lcom/avito/android/remote/model/PricePoll;Lcom/avito/android/remote/model/ClosePoll;)V", "component1", "()Lcom/avito/android/remote/model/PriceRanges;", "component2", "()Lcom/avito/android/remote/model/PricePoll;", "component3", "()Lcom/avito/android/remote/model/ClosePoll;", "copy", "(Lcom/avito/android/remote/model/PriceRanges;Lcom/avito/android/remote/model/PricePoll;Lcom/avito/android/remote/model/ClosePoll;)Lcom/avito/android/remote/model/CarMarketPrice;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/PriceRanges;", "getPriceRanges", "Lcom/avito/android/remote/model/PricePoll;", "getPoll", "Lcom/avito/android/remote/model/ClosePoll;", "getClosePoll", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarMarketPrice implements Parcelable {

    @k
    public static final Parcelable.Creator<CarMarketPrice> CREATOR = new Creator();

    @c("closePoll")
    @l
    private final ClosePoll closePoll;

    @c("poll")
    @l
    private final PricePoll poll;

    @c("priceRanges")
    @l
    private final PriceRanges priceRanges;

    /* compiled from: CarMarketPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CarMarketPrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarMarketPrice createFromParcel(@k Parcel parcel) {
            return new CarMarketPrice(parcel.readInt() == 0 ? null : PriceRanges.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PricePoll.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ClosePoll.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarMarketPrice[] newArray(int i12) {
            return new CarMarketPrice[i12];
        }
    }

    public CarMarketPrice(@l PriceRanges priceRanges, @l PricePoll pricePoll, @l ClosePoll closePoll) {
        this.priceRanges = priceRanges;
        this.poll = pricePoll;
        this.closePoll = closePoll;
    }

    public static /* synthetic */ CarMarketPrice copy$default(CarMarketPrice carMarketPrice, PriceRanges priceRanges, PricePoll pricePoll, ClosePoll closePoll, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            priceRanges = carMarketPrice.priceRanges;
        }
        if ((i12 & 2) != 0) {
            pricePoll = carMarketPrice.poll;
        }
        if ((i12 & 4) != 0) {
            closePoll = carMarketPrice.closePoll;
        }
        return carMarketPrice.copy(priceRanges, pricePoll, closePoll);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final PriceRanges getPriceRanges() {
        return this.priceRanges;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final PricePoll getPoll() {
        return this.poll;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ClosePoll getClosePoll() {
        return this.closePoll;
    }

    @k
    public final CarMarketPrice copy(@l PriceRanges priceRanges, @l PricePoll poll, @l ClosePoll closePoll) {
        return new CarMarketPrice(priceRanges, poll, closePoll);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarMarketPrice)) {
            return false;
        }
        CarMarketPrice carMarketPrice = (CarMarketPrice) other;
        return L.f(this.priceRanges, carMarketPrice.priceRanges) && L.f(this.poll, carMarketPrice.poll) && L.f(this.closePoll, carMarketPrice.closePoll);
    }

    @l
    public final ClosePoll getClosePoll() {
        return this.closePoll;
    }

    @l
    public final PricePoll getPoll() {
        return this.poll;
    }

    @l
    public final PriceRanges getPriceRanges() {
        return this.priceRanges;
    }

    public int hashCode() {
        PriceRanges priceRanges = this.priceRanges;
        int iHashCode = (priceRanges == null ? 0 : priceRanges.hashCode()) * 31;
        PricePoll pricePoll = this.poll;
        int iHashCode2 = (iHashCode + (pricePoll == null ? 0 : pricePoll.hashCode())) * 31;
        ClosePoll closePoll = this.closePoll;
        return iHashCode2 + (closePoll != null ? closePoll.hashCode() : 0);
    }

    @k
    public String toString() {
        return "CarMarketPrice(priceRanges=" + this.priceRanges + ", poll=" + this.poll + ", closePoll=" + this.closePoll + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        PriceRanges priceRanges = this.priceRanges;
        if (priceRanges == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceRanges.writeToParcel(parcel, flags);
        }
        PricePoll pricePoll = this.poll;
        if (pricePoll == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pricePoll.writeToParcel(parcel, flags);
        }
        ClosePoll closePoll = this.closePoll;
        if (closePoll == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closePoll.writeToParcel(parcel, flags);
        }
    }
}
