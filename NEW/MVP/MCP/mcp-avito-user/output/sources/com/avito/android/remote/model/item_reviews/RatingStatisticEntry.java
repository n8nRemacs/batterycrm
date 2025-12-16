package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingStatisticEntry.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingStatisticEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "", "reviewCount", "", "Lcom/avito/android/remote/model/item_reviews/RatingStatistic;", "statistic", "<init>", "(ILjava/util/List;)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getReviewCount", "()I", "Ljava/util/List;", "getStatistic", "()Ljava/util/List;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingStatisticEntry implements ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<RatingStatisticEntry> CREATOR = new Creator();

    @c("reviewCount")
    private final int reviewCount;

    @c("statistic")
    @k
    private final List<RatingStatistic> statistic;

    /* compiled from: RatingStatisticEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingStatisticEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingStatisticEntry createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = a.c(RatingStatistic.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RatingStatisticEntry(i12, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingStatisticEntry[] newArray(int i12) {
            return new RatingStatisticEntry[i12];
        }
    }

    public RatingStatisticEntry(int i12, @k List<RatingStatistic> list) {
        this.reviewCount = i12;
        this.statistic = list;
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    public final int getReviewCount() {
        return this.reviewCount;
    }

    @k
    public final List<RatingStatistic> getStatistic() {
        return this.statistic;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.reviewCount);
        Iterator itJ = C0.j(this.statistic, parcel);
        while (itJ.hasNext()) {
            ((RatingStatistic) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
