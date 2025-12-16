package com.avito.android.safedeal.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealPaymentBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockSlider;", "Landroid/os/Parcelable;", "", "title", "titleAfterSwipe", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "onStartSwipeDeepLink", "onFinishSwipeDeepLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "f", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "c", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SafeDealPaymentBlockSlider implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealPaymentBlockSlider> CREATOR = new a();

    @c("onFinishSwipeDeepLink")
    @l
    private final DeepLink onFinishSwipeDeepLink;

    @c("onStartSwipeDeepLink")
    @l
    private final DeepLink onStartSwipeDeepLink;

    @c("onTapDeepLink")
    @l
    private final DeepLink onTapDeepLink;

    @c("title")
    @k
    private final String title;

    @c("titleAfterSwipe")
    @k
    private final String titleAfterSwipe;

    /* compiled from: SafeDealPaymentBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDealPaymentBlockSlider> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockSlider createFromParcel(Parcel parcel) {
            return new SafeDealPaymentBlockSlider(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SafeDealPaymentBlockSlider.class.getClassLoader()), (DeepLink) parcel.readParcelable(SafeDealPaymentBlockSlider.class.getClassLoader()), (DeepLink) parcel.readParcelable(SafeDealPaymentBlockSlider.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockSlider[] newArray(int i12) {
            return new SafeDealPaymentBlockSlider[i12];
        }
    }

    public SafeDealPaymentBlockSlider(@k String str, @k String str2, @l DeepLink deepLink, @l DeepLink deepLink2, @l DeepLink deepLink3) {
        this.title = str;
        this.titleAfterSwipe = str2;
        this.onTapDeepLink = deepLink;
        this.onStartSwipeDeepLink = deepLink2;
        this.onFinishSwipeDeepLink = deepLink3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getOnFinishSwipeDeepLink() {
        return this.onFinishSwipeDeepLink;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getOnStartSwipeDeepLink() {
        return this.onStartSwipeDeepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeDealPaymentBlockSlider)) {
            return false;
        }
        SafeDealPaymentBlockSlider safeDealPaymentBlockSlider = (SafeDealPaymentBlockSlider) obj;
        return L.f(this.title, safeDealPaymentBlockSlider.title) && L.f(this.titleAfterSwipe, safeDealPaymentBlockSlider.titleAfterSwipe) && L.f(this.onTapDeepLink, safeDealPaymentBlockSlider.onTapDeepLink) && L.f(this.onStartSwipeDeepLink, safeDealPaymentBlockSlider.onStartSwipeDeepLink) && L.f(this.onFinishSwipeDeepLink, safeDealPaymentBlockSlider.onFinishSwipeDeepLink);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitleAfterSwipe() {
        return this.titleAfterSwipe;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(this.title.hashCode() * 31, 31, this.titleAfterSwipe);
        DeepLink deepLink = this.onTapDeepLink;
        int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.onStartSwipeDeepLink;
        int iHashCode2 = (iHashCode + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        DeepLink deepLink3 = this.onFinishSwipeDeepLink;
        return iHashCode2 + (deepLink3 != null ? deepLink3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SafeDealPaymentBlockSlider(title=");
        sb2.append(this.title);
        sb2.append(", titleAfterSwipe=");
        sb2.append(this.titleAfterSwipe);
        sb2.append(", onTapDeepLink=");
        sb2.append(this.onTapDeepLink);
        sb2.append(", onStartSwipeDeepLink=");
        sb2.append(this.onStartSwipeDeepLink);
        sb2.append(", onFinishSwipeDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.onFinishSwipeDeepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleAfterSwipe);
        parcel.writeParcelable(this.onTapDeepLink, i12);
        parcel.writeParcelable(this.onStartSwipeDeepLink, i12);
        parcel.writeParcelable(this.onFinishSwipeDeepLink, i12);
    }
}
