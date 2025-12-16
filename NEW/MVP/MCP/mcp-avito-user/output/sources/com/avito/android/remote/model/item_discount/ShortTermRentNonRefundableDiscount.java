package com.avito.android.remote.model.item_discount;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ShortTermRentItemDiscounts.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/item_discount/ShortTermRentNonRefundableDiscount;", "Landroid/os/Parcelable;", "", "isAvailable", "isEnabled", "", "description", "", "totalPrice", "priceWithDiscount", "", "discountPercent", "Landroid/net/Uri;", ContextActionHandler.Link.DEEPLINK, "<init>", "(ZZLjava/lang/String;JJILandroid/net/Uri;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "J", "getTotalPrice", "()J", "getPriceWithDiscount", "I", "getDiscountPercent", "Landroid/net/Uri;", "getDeepLink", "()Landroid/net/Uri;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ShortTermRentNonRefundableDiscount implements Parcelable {

    @k
    public static final Parcelable.Creator<ShortTermRentNonRefundableDiscount> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final Uri deepLink;

    @c("description")
    @k
    private final String description;

    @c("discountPercent")
    private final int discountPercent;

    @c("available")
    private final boolean isAvailable;

    @c("enabled")
    private final boolean isEnabled;

    @c("priceWithDiscount")
    private final long priceWithDiscount;

    @c("totalPrice")
    private final long totalPrice;

    /* compiled from: ShortTermRentItemDiscounts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShortTermRentNonRefundableDiscount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ShortTermRentNonRefundableDiscount createFromParcel(@k Parcel parcel) {
            return new ShortTermRentNonRefundableDiscount(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt(), (Uri) parcel.readParcelable(ShortTermRentNonRefundableDiscount.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ShortTermRentNonRefundableDiscount[] newArray(int i12) {
            return new ShortTermRentNonRefundableDiscount[i12];
        }
    }

    public ShortTermRentNonRefundableDiscount(boolean z12, boolean z13, @k String str, long j12, long j13, int i12, @l Uri uri) {
        this.isAvailable = z12;
        this.isEnabled = z13;
        this.description = str;
        this.totalPrice = j12;
        this.priceWithDiscount = j13;
        this.discountPercent = i12;
        this.deepLink = uri;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Uri getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final int getDiscountPercent() {
        return this.discountPercent;
    }

    public final long getPriceWithDiscount() {
        return this.priceWithDiscount;
    }

    public final long getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: isAvailable, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isAvailable ? 1 : 0);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.description);
        parcel.writeLong(this.totalPrice);
        parcel.writeLong(this.priceWithDiscount);
        parcel.writeInt(this.discountPercent);
        parcel.writeParcelable(this.deepLink, flags);
    }
}
