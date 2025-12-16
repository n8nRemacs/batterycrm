package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SellerAvatar;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SellersCarouselWidget.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/SellerWidget;", "Landroid/os/Parcelable;", "", "name", SearchParamsConverterKt.SELLER_ID, "Lcom/avito/android/remote/model/vertical_main/SellerRating;", "rating", "Lcom/avito/android/remote/model/SellerAvatar;", "avatar", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/SellerRating;Lcom/avito/android/remote/model/SellerAvatar;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getSellerId", "Lcom/avito/android/remote/model/vertical_main/SellerRating;", "getRating", "()Lcom/avito/android/remote/model/vertical_main/SellerRating;", "Lcom/avito/android/remote/model/SellerAvatar;", "getAvatar", "()Lcom/avito/android/remote/model/SellerAvatar;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SellerWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerWidget> CREATOR = new Creator();

    @l
    private final SellerAvatar avatar;

    @k
    private final String name;

    @l
    private final SellerRating rating;

    @c("seller_id")
    @k
    private final String sellerId;

    @k
    private final DeepLink uri;

    /* compiled from: SellersCarouselWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerWidget createFromParcel(@k Parcel parcel) {
            return new SellerWidget(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SellerRating.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SellerAvatar.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(SellerWidget.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerWidget[] newArray(int i12) {
            return new SellerWidget[i12];
        }
    }

    public SellerWidget(@k String str, @k String str2, @l SellerRating sellerRating, @l SellerAvatar sellerAvatar, @k DeepLink deepLink) {
        this.name = str;
        this.sellerId = str2;
        this.rating = sellerRating;
        this.avatar = sellerAvatar;
        this.uri = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final SellerAvatar getAvatar() {
        return this.avatar;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final SellerRating getRating() {
        return this.rating;
    }

    @k
    public final String getSellerId() {
        return this.sellerId;
    }

    @k
    public final DeepLink getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.sellerId);
        SellerRating sellerRating = this.rating;
        if (sellerRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerRating.writeToParcel(parcel, flags);
        }
        SellerAvatar sellerAvatar = this.avatar;
        if (sellerAvatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerAvatar.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.uri, flags);
    }
}
