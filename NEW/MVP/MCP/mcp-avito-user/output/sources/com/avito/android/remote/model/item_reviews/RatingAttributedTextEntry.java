package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingAttributedTextEntry.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingAttributedTextEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/item_reviews/RatingAttributedTextEntry;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RatingAttributedTextEntry implements ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<RatingAttributedTextEntry> CREATOR = new Creator();

    @k
    private final AttributedText attributedText;

    /* compiled from: RatingAttributedTextEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingAttributedTextEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingAttributedTextEntry createFromParcel(@k Parcel parcel) {
            return new RatingAttributedTextEntry((AttributedText) parcel.readParcelable(RatingAttributedTextEntry.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingAttributedTextEntry[] newArray(int i12) {
            return new RatingAttributedTextEntry[i12];
        }
    }

    public RatingAttributedTextEntry(@k AttributedText attributedText) {
        this.attributedText = attributedText;
    }

    public static /* synthetic */ RatingAttributedTextEntry copy$default(RatingAttributedTextEntry ratingAttributedTextEntry, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = ratingAttributedTextEntry.attributedText;
        }
        return ratingAttributedTextEntry.copy(attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    @k
    public final RatingAttributedTextEntry copy(@k AttributedText attributedText) {
        return new RatingAttributedTextEntry(attributedText);
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RatingAttributedTextEntry) && L.f(this.attributedText, ((RatingAttributedTextEntry) other).attributedText);
    }

    @k
    public final AttributedText getAttributedText() {
        return this.attributedText;
    }

    public int hashCode() {
        return this.attributedText.hashCode();
    }

    @k
    public String toString() {
        return a.w(new StringBuilder("RatingAttributedTextEntry(attributedText="), this.attributedText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.attributedText, flags);
    }
}
