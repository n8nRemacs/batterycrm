package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Fmp.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/fmp/Fmp;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/fmp/FMPBanner;", AdFormat.BANNER, "Lcom/avito/android/remote/model/fmp/FmpOffer;", "offer", "Lcom/avito/android/remote/model/fmp/FmpCalculator;", "calculator", "Lcom/avito/android/remote/model/fmp/FmpProducts;", "products", "<init>", "(Lcom/avito/android/remote/model/fmp/FMPBanner;Lcom/avito/android/remote/model/fmp/FmpOffer;Lcom/avito/android/remote/model/fmp/FmpCalculator;Lcom/avito/android/remote/model/fmp/FmpProducts;)V", "component1", "()Lcom/avito/android/remote/model/fmp/FMPBanner;", "component2", "()Lcom/avito/android/remote/model/fmp/FmpOffer;", "component3", "()Lcom/avito/android/remote/model/fmp/FmpCalculator;", "component4", "()Lcom/avito/android/remote/model/fmp/FmpProducts;", "copy", "(Lcom/avito/android/remote/model/fmp/FMPBanner;Lcom/avito/android/remote/model/fmp/FmpOffer;Lcom/avito/android/remote/model/fmp/FmpCalculator;Lcom/avito/android/remote/model/fmp/FmpProducts;)Lcom/avito/android/remote/model/fmp/Fmp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/fmp/FMPBanner;", "getBanner", "Lcom/avito/android/remote/model/fmp/FmpOffer;", "getOffer", "Lcom/avito/android/remote/model/fmp/FmpCalculator;", "getCalculator", "Lcom/avito/android/remote/model/fmp/FmpProducts;", "getProducts", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Fmp implements Parcelable {

    @k
    public static final Parcelable.Creator<Fmp> CREATOR = new Creator();

    @c(AdFormat.BANNER)
    @l
    private final FMPBanner banner;

    @c("calculator")
    @l
    private final FmpCalculator calculator;

    @c("offer")
    @l
    private final FmpOffer offer;

    @c("products")
    @l
    private final FmpProducts products;

    /* compiled from: Fmp.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Fmp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Fmp createFromParcel(@k Parcel parcel) {
            return new Fmp(parcel.readInt() == 0 ? null : FMPBanner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FmpOffer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FmpCalculator.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FmpProducts.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Fmp[] newArray(int i12) {
            return new Fmp[i12];
        }
    }

    public Fmp(@l FMPBanner fMPBanner, @l FmpOffer fmpOffer, @l FmpCalculator fmpCalculator, @l FmpProducts fmpProducts) {
        this.banner = fMPBanner;
        this.offer = fmpOffer;
        this.calculator = fmpCalculator;
        this.products = fmpProducts;
    }

    public static /* synthetic */ Fmp copy$default(Fmp fmp, FMPBanner fMPBanner, FmpOffer fmpOffer, FmpCalculator fmpCalculator, FmpProducts fmpProducts, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fMPBanner = fmp.banner;
        }
        if ((i12 & 2) != 0) {
            fmpOffer = fmp.offer;
        }
        if ((i12 & 4) != 0) {
            fmpCalculator = fmp.calculator;
        }
        if ((i12 & 8) != 0) {
            fmpProducts = fmp.products;
        }
        return fmp.copy(fMPBanner, fmpOffer, fmpCalculator, fmpProducts);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final FMPBanner getBanner() {
        return this.banner;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final FmpOffer getOffer() {
        return this.offer;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FmpCalculator getCalculator() {
        return this.calculator;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final FmpProducts getProducts() {
        return this.products;
    }

    @k
    public final Fmp copy(@l FMPBanner banner, @l FmpOffer offer, @l FmpCalculator calculator, @l FmpProducts products) {
        return new Fmp(banner, offer, calculator, products);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fmp)) {
            return false;
        }
        Fmp fmp = (Fmp) other;
        return L.f(this.banner, fmp.banner) && L.f(this.offer, fmp.offer) && L.f(this.calculator, fmp.calculator) && L.f(this.products, fmp.products);
    }

    @l
    public final FMPBanner getBanner() {
        return this.banner;
    }

    @l
    public final FmpCalculator getCalculator() {
        return this.calculator;
    }

    @l
    public final FmpOffer getOffer() {
        return this.offer;
    }

    @l
    public final FmpProducts getProducts() {
        return this.products;
    }

    public int hashCode() {
        FMPBanner fMPBanner = this.banner;
        int iHashCode = (fMPBanner == null ? 0 : fMPBanner.hashCode()) * 31;
        FmpOffer fmpOffer = this.offer;
        int iHashCode2 = (iHashCode + (fmpOffer == null ? 0 : fmpOffer.hashCode())) * 31;
        FmpCalculator fmpCalculator = this.calculator;
        int iHashCode3 = (iHashCode2 + (fmpCalculator == null ? 0 : fmpCalculator.hashCode())) * 31;
        FmpProducts fmpProducts = this.products;
        return iHashCode3 + (fmpProducts != null ? fmpProducts.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Fmp(banner=" + this.banner + ", offer=" + this.offer + ", calculator=" + this.calculator + ", products=" + this.products + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        FMPBanner fMPBanner = this.banner;
        if (fMPBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fMPBanner.writeToParcel(parcel, flags);
        }
        FmpOffer fmpOffer = this.offer;
        if (fmpOffer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fmpOffer.writeToParcel(parcel, flags);
        }
        FmpCalculator fmpCalculator = this.calculator;
        if (fmpCalculator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fmpCalculator.writeToParcel(parcel, flags);
        }
        FmpProducts fmpProducts = this.products;
        if (fmpProducts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fmpProducts.writeToParcel(parcel, flags);
        }
    }
}
