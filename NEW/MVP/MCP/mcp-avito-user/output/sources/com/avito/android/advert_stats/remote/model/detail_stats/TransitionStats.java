package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/advert_stats/remote/model/detail_stats/HintTransactionStats;", "hint", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/advert_stats/remote/model/detail_stats/HintTransactionStats;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/advert_stats/remote/model/detail_stats/HintTransactionStats;", "c", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/HintTransactionStats;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TransitionStats implements Parcelable {

    @k
    public static final Parcelable.Creator<TransitionStats> CREATOR = new a();

    @c("transitionUri")
    @l
    private final DeepLink deepLink;

    @c("hint")
    @l
    private final HintTransactionStats hint;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TransitionStats> {
        @Override // android.os.Parcelable.Creator
        public final TransitionStats createFromParcel(Parcel parcel) {
            return new TransitionStats((AttributedText) parcel.readParcelable(TransitionStats.class.getClassLoader()), (DeepLink) parcel.readParcelable(TransitionStats.class.getClassLoader()), parcel.readInt() == 0 ? null : HintTransactionStats.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TransitionStats[] newArray(int i12) {
            return new TransitionStats[i12];
        }
    }

    public TransitionStats(@l AttributedText attributedText, @l DeepLink deepLink, @l HintTransactionStats hintTransactionStats) {
        this.title = attributedText;
        this.deepLink = deepLink;
        this.hint = hintTransactionStats;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final HintTransactionStats getHint() {
        return this.hint;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionStats)) {
            return false;
        }
        TransitionStats transitionStats = (TransitionStats) obj;
        return L.f(this.title, transitionStats.title) && L.f(this.deepLink, transitionStats.deepLink) && L.f(this.hint, transitionStats.hint);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        DeepLink deepLink = this.deepLink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        HintTransactionStats hintTransactionStats = this.hint;
        return iHashCode2 + (hintTransactionStats != null ? hintTransactionStats.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "TransitionStats(title=" + this.title + ", deepLink=" + this.deepLink + ", hint=" + this.hint + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.deepLink, i12);
        HintTransactionStats hintTransactionStats = this.hint;
        if (hintTransactionStats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hintTransactionStats.writeToParcel(parcel, i12);
        }
    }
}
