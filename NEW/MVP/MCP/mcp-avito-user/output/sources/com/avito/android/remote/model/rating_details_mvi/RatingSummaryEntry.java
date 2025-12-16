package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore;", "scores", "", "title", "buttonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getScores", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getButtonTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAnalyticsAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "RatingSummaryScore", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingSummaryEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<RatingSummaryEntry> CREATOR = new Creator();

    @c("analyticsAction")
    @l
    private final DeepLink analyticsAction;

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("scores")
    @k
    private final List<RatingSummaryScore> scores;

    @c("title")
    @k
    private final String title;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingSummaryEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingSummaryEntry createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(RatingSummaryScore.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RatingSummaryEntry(arrayList, parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RatingSummaryEntry.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingSummaryEntry[] newArray(int i12) {
            return new RatingSummaryEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreState;", "scoreState", "Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreDetails;", "details", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreState;Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreDetails;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreState;", "getScoreState", "()Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreState;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreDetails;", "getDetails", "()Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreDetails;", "RatingSummaryScoreDetails", "RatingSummaryScoreState", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class RatingSummaryScore implements Parcelable {

        @k
        public static final Parcelable.Creator<RatingSummaryScore> CREATOR = new Creator();

        @c("details")
        @k
        private final RatingSummaryScoreDetails details;

        @c("scoreState")
        @k
        private final RatingSummaryScoreState scoreState;

        @c("title")
        @k
        private final String title;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RatingSummaryScore> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RatingSummaryScore createFromParcel(@k Parcel parcel) {
                return new RatingSummaryScore(parcel.readString(), RatingSummaryScoreState.valueOf(parcel.readString()), RatingSummaryScoreDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RatingSummaryScore[] newArray(int i12) {
                return new RatingSummaryScore[i12];
            }
        }

        /* compiled from: RatingDetailsEntry.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreDetails;", "Landroid/os/Parcelable;", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RatingSummaryScoreDetails implements Parcelable {

            @k
            public static final Parcelable.Creator<RatingSummaryScoreDetails> CREATOR = new Creator();

            @c("description")
            @k
            private final String description;

            @c("title")
            @k
            private final String title;

            /* compiled from: RatingDetailsEntry.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RatingSummaryScoreDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final RatingSummaryScoreDetails createFromParcel(@k Parcel parcel) {
                    return new RatingSummaryScoreDetails(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final RatingSummaryScoreDetails[] newArray(int i12) {
                    return new RatingSummaryScoreDetails[i12];
                }
            }

            public RatingSummaryScoreDetails(@k String str, @k String str2) {
                this.title = str;
                this.description = str2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/RatingSummaryEntry$RatingSummaryScore$RatingSummaryScoreState;", "", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RatingSummaryScoreState {
            private static final /* synthetic */ kotlin.enums.a $ENTRIES;
            private static final /* synthetic */ RatingSummaryScoreState[] $VALUES;

            @c("positive")
            public static final RatingSummaryScoreState POSITIVE = new RatingSummaryScoreState("POSITIVE", 0);

            @c("negative")
            public static final RatingSummaryScoreState NEGATIVE = new RatingSummaryScoreState("NEGATIVE", 1);

            private static final /* synthetic */ RatingSummaryScoreState[] $values() {
                return new RatingSummaryScoreState[]{POSITIVE, NEGATIVE};
            }

            static {
                RatingSummaryScoreState[] ratingSummaryScoreStateArr$values = $values();
                $VALUES = ratingSummaryScoreStateArr$values;
                $ENTRIES = kotlin.enums.c.a(ratingSummaryScoreStateArr$values);
            }

            private RatingSummaryScoreState(String str, int i12) {
            }

            @k
            public static kotlin.enums.a<RatingSummaryScoreState> getEntries() {
                return $ENTRIES;
            }

            public static RatingSummaryScoreState valueOf(String str) {
                return (RatingSummaryScoreState) Enum.valueOf(RatingSummaryScoreState.class, str);
            }

            public static RatingSummaryScoreState[] values() {
                return (RatingSummaryScoreState[]) $VALUES.clone();
            }
        }

        public RatingSummaryScore(@k String str, @k RatingSummaryScoreState ratingSummaryScoreState, @k RatingSummaryScoreDetails ratingSummaryScoreDetails) {
            this.title = str;
            this.scoreState = ratingSummaryScoreState;
            this.details = ratingSummaryScoreDetails;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final RatingSummaryScoreDetails getDetails() {
            return this.details;
        }

        @k
        public final RatingSummaryScoreState getScoreState() {
            return this.scoreState;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.scoreState.name());
            this.details.writeToParcel(parcel, flags);
        }
    }

    public RatingSummaryEntry(@k List<RatingSummaryScore> list, @k String str, @k String str2, @l DeepLink deepLink) {
        this.scores = list;
        this.title = str;
        this.buttonTitle = str2;
        this.analyticsAction = deepLink;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final DeepLink getAnalyticsAction() {
        return this.analyticsAction;
    }

    @k
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final List<RatingSummaryScore> getScores() {
        return this.scores;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.scores, parcel);
        while (itJ.hasNext()) {
            ((RatingSummaryScore) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.analyticsAction, flags);
    }
}
