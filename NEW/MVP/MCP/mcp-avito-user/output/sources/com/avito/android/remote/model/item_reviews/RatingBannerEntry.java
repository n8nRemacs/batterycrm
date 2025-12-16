package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingBannerEntry.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingBannerEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/item_reviews/RatingBannerEntry;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/UniversalColor;", "getBackground", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RatingBannerEntry implements ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<RatingBannerEntry> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final UniversalColor background;

    @c("text")
    @k
    private final String text;

    /* compiled from: RatingBannerEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingBannerEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingBannerEntry createFromParcel(@k Parcel parcel) {
            return new RatingBannerEntry(parcel.readString(), (UniversalColor) parcel.readParcelable(RatingBannerEntry.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingBannerEntry[] newArray(int i12) {
            return new RatingBannerEntry[i12];
        }
    }

    public RatingBannerEntry(@k String str, @l UniversalColor universalColor) {
        this.text = str;
        this.background = universalColor;
    }

    public static /* synthetic */ RatingBannerEntry copy$default(RatingBannerEntry ratingBannerEntry, String str, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = ratingBannerEntry.text;
        }
        if ((i12 & 2) != 0) {
            universalColor = ratingBannerEntry.background;
        }
        return ratingBannerEntry.copy(str, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getBackground() {
        return this.background;
    }

    @k
    public final RatingBannerEntry copy(@k String text, @l UniversalColor background) {
        return new RatingBannerEntry(text, background);
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingBannerEntry)) {
            return false;
        }
        RatingBannerEntry ratingBannerEntry = (RatingBannerEntry) other;
        return L.f(this.text, ratingBannerEntry.text) && L.f(this.background, ratingBannerEntry.background);
    }

    @l
    public final UniversalColor getBackground() {
        return this.background;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        UniversalColor universalColor = this.background;
        return iHashCode + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RatingBannerEntry(text=");
        sb2.append(this.text);
        sb2.append(", background=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.background, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.background, flags);
    }
}
