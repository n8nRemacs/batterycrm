package com.avito.android.rating.details.adapter.summary;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SummaryItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/adapter/summary/SummaryItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "SummaryScore", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SummaryItem implements RatingDetailsItem {

    @k
    public static final Parcelable.Creator<SummaryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246539b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<SummaryScore> f246540c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f246541d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f246542e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f246543f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f246544g;

    /* compiled from: SummaryItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/adapter/summary/SummaryItem$SummaryScore;", "Landroid/os/Parcelable;", "SummaryScoreDetails", "SummaryScoreState", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class SummaryScore implements Parcelable {

        @k
        public static final Parcelable.Creator<SummaryScore> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f246545b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SummaryScoreState f246546c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final SummaryScoreDetails f246547d;

        /* compiled from: SummaryItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/summary/SummaryItem$SummaryScore$SummaryScoreDetails;", "Landroid/os/Parcelable;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SummaryScoreDetails implements Parcelable {

            @k
            public static final Parcelable.Creator<SummaryScoreDetails> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f246548b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f246549c;

            /* compiled from: SummaryItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SummaryScoreDetails> {
                @Override // android.os.Parcelable.Creator
                public final SummaryScoreDetails createFromParcel(Parcel parcel) {
                    return new SummaryScoreDetails(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SummaryScoreDetails[] newArray(int i12) {
                    return new SummaryScoreDetails[i12];
                }
            }

            public SummaryScoreDetails(@k String str, @k String str2) {
                this.f246548b = str;
                this.f246549c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SummaryScoreDetails)) {
                    return false;
                }
                SummaryScoreDetails summaryScoreDetails = (SummaryScoreDetails) obj;
                return L.f(this.f246548b, summaryScoreDetails.f246548b) && L.f(this.f246549c, summaryScoreDetails.f246549c);
            }

            public final int hashCode() {
                return this.f246549c.hashCode() + (this.f246548b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SummaryScoreDetails(title=");
                sb2.append(this.f246548b);
                sb2.append(", description=");
                return C22026a.c(sb2, this.f246549c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f246548b);
                parcel.writeString(this.f246549c);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SummaryItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/summary/SummaryItem$SummaryScore$SummaryScoreState;", "", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class SummaryScoreState {

            /* renamed from: b, reason: collision with root package name */
            public static final SummaryScoreState f246550b;

            /* renamed from: c, reason: collision with root package name */
            public static final SummaryScoreState f246551c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ SummaryScoreState[] f246552d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f246553e;

            static {
                SummaryScoreState summaryScoreState = new SummaryScoreState("POSITIVE", 0);
                f246550b = summaryScoreState;
                SummaryScoreState summaryScoreState2 = new SummaryScoreState("NEGATIVE", 1);
                f246551c = summaryScoreState2;
                SummaryScoreState[] summaryScoreStateArr = {summaryScoreState, summaryScoreState2};
                f246552d = summaryScoreStateArr;
                f246553e = kotlin.enums.c.a(summaryScoreStateArr);
            }

            public SummaryScoreState() {
                throw null;
            }

            public static SummaryScoreState valueOf(String str) {
                return (SummaryScoreState) Enum.valueOf(SummaryScoreState.class, str);
            }

            public static SummaryScoreState[] values() {
                return (SummaryScoreState[]) f246552d.clone();
            }
        }

        /* compiled from: SummaryItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SummaryScore> {
            @Override // android.os.Parcelable.Creator
            public final SummaryScore createFromParcel(Parcel parcel) {
                return new SummaryScore(parcel.readString(), SummaryScoreState.valueOf(parcel.readString()), SummaryScoreDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SummaryScore[] newArray(int i12) {
                return new SummaryScore[i12];
            }
        }

        public SummaryScore(@k String str, @k SummaryScoreState summaryScoreState, @k SummaryScoreDetails summaryScoreDetails) {
            this.f246545b = str;
            this.f246546c = summaryScoreState;
            this.f246547d = summaryScoreDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummaryScore)) {
                return false;
            }
            SummaryScore summaryScore = (SummaryScore) obj;
            return L.f(this.f246545b, summaryScore.f246545b) && this.f246546c == summaryScore.f246546c && L.f(this.f246547d, summaryScore.f246547d);
        }

        public final int hashCode() {
            return this.f246547d.hashCode() + ((this.f246546c.hashCode() + (this.f246545b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "SummaryScore(title=" + this.f246545b + ", scoreState=" + this.f246546c + ", details=" + this.f246547d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f246545b);
            parcel.writeString(this.f246546c.name());
            this.f246547d.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: SummaryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SummaryItem> {
        @Override // android.os.Parcelable.Creator
        public final SummaryItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SummaryScore.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SummaryItem(string, arrayList, parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SummaryItem.class.getClassLoader()), (RatingItemsMarginHorizontal) parcel.readParcelable(SummaryItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SummaryItem[] newArray(int i12) {
            return new SummaryItem[i12];
        }
    }

    public SummaryItem(@k String str, @k List<SummaryScore> list, @k String str2, @k String str3, @l DeepLink deepLink, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f246539b = str;
        this.f246540c = list;
        this.f246541d = str2;
        this.f246542e = str3;
        this.f246543f = deepLink;
        this.f246544g = ratingItemsMarginHorizontal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryItem)) {
            return false;
        }
        SummaryItem summaryItem = (SummaryItem) obj;
        return L.f(this.f246539b, summaryItem.f246539b) && L.f(this.f246540c, summaryItem.f246540c) && L.f(this.f246541d, summaryItem.f246541d) && L.f(this.f246542e, summaryItem.f246542e) && L.f(this.f246543f, summaryItem.f246543f) && L.f(this.f246544g, summaryItem.f246544g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78563b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8979d() {
        return this.f246539b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.e(this.f246539b.hashCode() * 31, 31, this.f246540c), 31, this.f246541d), 31, this.f246542e);
        DeepLink deepLink = this.f246543f;
        return this.f246544g.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "SummaryItem(stringId=" + this.f246539b + ", scores=" + this.f246540c + ", title=" + this.f246541d + ", buttonTitle=" + this.f246542e + ", analyticsAction=" + this.f246543f + ", marginHorizontal=" + this.f246544g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f246539b);
        Iterator itJ = C0.j(this.f246540c, parcel);
        while (itJ.hasNext()) {
            ((SummaryScore) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f246541d);
        parcel.writeString(this.f246542e);
        parcel.writeParcelable(this.f246543f, i12);
        parcel.writeParcelable(this.f246544g, i12);
    }

    public /* synthetic */ SummaryItem(String str, List list, String str2, String str3, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        this(str, list, str2, str3, deepLink, (i12 & 32) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
