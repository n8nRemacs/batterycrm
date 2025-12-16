package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingStatisticEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "reviewCount", "", "Lcom/avito/android/remote/model/rating_details_mvi/RatingStatisticEntry$RatingStatistic;", "statistic", "<init>", "(ILjava/util/List;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getReviewCount", "Ljava/util/List;", "getStatistic", "()Ljava/util/List;", "RatingStatistic", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingStatisticEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<RatingStatisticEntry> CREATOR = new Creator();

    @c("reviewCount")
    private final int reviewCount;

    @c("statistic")
    @k
    private final List<RatingStatistic> statistic;

    /* compiled from: RatingDetailsEntry.kt */
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

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingStatisticEntry$RatingStatistic;", "Landroid/os/Parcelable;", "", "score", "", "title", "count", "<init>", "(ILjava/lang/String;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getScore", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCount", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RatingStatistic implements Parcelable {

        @k
        public static final Parcelable.Creator<RatingStatistic> CREATOR = new Creator();

        @c("count")
        private final int count;

        @c("score")
        private final int score;

        @c("title")
        @k
        private final String title;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RatingStatistic> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RatingStatistic createFromParcel(@k Parcel parcel) {
                return new RatingStatistic(parcel.readInt(), parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RatingStatistic[] newArray(int i12) {
                return new RatingStatistic[i12];
            }
        }

        public RatingStatistic(int i12, @k String str, int i13) {
            this.score = i12;
            this.title = str;
            this.count = i13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getCount() {
            return this.count;
        }

        public final int getScore() {
            return this.score;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.score);
            parcel.writeString(this.title);
            parcel.writeInt(this.count);
        }
    }

    public RatingStatisticEntry(int i12, @k List<RatingStatistic> list) {
        this.reviewCount = i12;
        this.statistic = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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
