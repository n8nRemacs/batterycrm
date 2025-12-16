package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/HintTransactionStats;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HintTransactionStats implements Parcelable {

    @k
    public static final Parcelable.Creator<HintTransactionStats> CREATOR = new a();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("text")
    @l
    private final AttributedText text;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HintTransactionStats> {
        @Override // android.os.Parcelable.Creator
        public final HintTransactionStats createFromParcel(Parcel parcel) {
            return new HintTransactionStats((UniversalImage) parcel.readParcelable(HintTransactionStats.class.getClassLoader()), (AttributedText) parcel.readParcelable(HintTransactionStats.class.getClassLoader()), (DeepLink) parcel.readParcelable(HintTransactionStats.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HintTransactionStats[] newArray(int i12) {
            return new HintTransactionStats[i12];
        }
    }

    public HintTransactionStats(@l UniversalImage universalImage, @l AttributedText attributedText, @l DeepLink deepLink) {
        this.icon = universalImage;
        this.text = attributedText;
        this.deepLink = deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HintTransactionStats)) {
            return false;
        }
        HintTransactionStats hintTransactionStats = (HintTransactionStats) obj;
        return L.f(this.icon, hintTransactionStats.icon) && L.f(this.text, hintTransactionStats.text) && L.f(this.deepLink, hintTransactionStats.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    public final int hashCode() {
        UniversalImage universalImage = this.icon;
        int iHashCode = (universalImage == null ? 0 : universalImage.hashCode()) * 31;
        AttributedText attributedText = this.text;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HintTransactionStats(icon=");
        sb2.append(this.icon);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.icon, i12);
        parcel.writeParcelable(this.text, i12);
        parcel.writeParcelable(this.deepLink, i12);
    }
}
