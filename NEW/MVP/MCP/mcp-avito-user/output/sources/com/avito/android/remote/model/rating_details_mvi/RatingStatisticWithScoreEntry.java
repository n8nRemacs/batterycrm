package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0001)BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b\u000e\u0010(¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingStatisticWithScoreEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "score", "scoreFloat", "", "title", "subtitle", "", "reviewCount", "", "Lcom/avito/android/remote/model/rating_details_mvi/RatingStatisticWithScoreEntry$RatingStatistic;", "statistic", "", "isCompact", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Float;", "getScore", "()Ljava/lang/Float;", "getScoreFloat", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Ljava/lang/Integer;", "getReviewCount", "()Ljava/lang/Integer;", "Ljava/util/List;", "getStatistic", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "RatingStatistic", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingStatisticWithScoreEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<RatingStatisticWithScoreEntry> CREATOR = new Creator();

    @c("isCompact")
    @l
    private final Boolean isCompact;

    @c("reviewCount")
    @l
    private final Integer reviewCount;

    @c("score")
    @l
    private final Float score;

    @c("scoreFloat")
    @l
    private final Float scoreFloat;

    @c("ratingStat")
    @l
    private final List<RatingStatistic> statistic;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingStatisticWithScoreEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingStatisticWithScoreEntry createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf = null;
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(RatingStatistic.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RatingStatisticWithScoreEntry(fValueOf, fValueOf2, string, string2, numValueOf, arrayList, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingStatisticWithScoreEntry[] newArray(int i12) {
            return new RatingStatisticWithScoreEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingStatisticWithScoreEntry$RatingStatistic;", "Landroid/os/Parcelable;", "", "score", "", "title", "count", "<init>", "(ILjava/lang/String;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getScore", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCount", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public RatingStatisticWithScoreEntry(@l Float f12, @l Float f13, @l String str, @l String str2, @l Integer num, @l List<RatingStatistic> list, @l Boolean bool) {
        this.score = f12;
        this.scoreFloat = f13;
        this.title = str;
        this.subtitle = str2;
        this.reviewCount = num;
        this.statistic = list;
        this.isCompact = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getReviewCount() {
        return this.reviewCount;
    }

    @l
    public final Float getScore() {
        return this.score;
    }

    @l
    public final Float getScoreFloat() {
        return this.scoreFloat;
    }

    @l
    public final List<RatingStatistic> getStatistic() {
        return this.statistic;
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
    /* renamed from: isCompact, reason: from getter */
    public final Boolean getIsCompact() {
        return this.isCompact;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Float f12 = this.score;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Float f13 = this.scoreFloat;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f13);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Integer num = this.reviewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        List<RatingStatistic> list = this.statistic;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RatingStatistic) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.isCompact;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
