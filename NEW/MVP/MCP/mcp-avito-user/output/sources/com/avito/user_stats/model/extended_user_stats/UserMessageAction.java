package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/UserMessageAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserMessageAction implements Parcelable {

    @k
    public static final Parcelable.Creator<UserMessageAction> CREATOR = new a();

    @c("link")
    @l
    private final DeepLink link;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: CommonStatsBasicIndicators.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserMessageAction> {
        @Override // android.os.Parcelable.Creator
        public final UserMessageAction createFromParcel(Parcel parcel) {
            return new UserMessageAction((AttributedText) parcel.readParcelable(UserMessageAction.class.getClassLoader()), (DeepLink) parcel.readParcelable(UserMessageAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserMessageAction[] newArray(int i12) {
            return new UserMessageAction[i12];
        }
    }

    public UserMessageAction(@l AttributedText attributedText, @l DeepLink deepLink) {
        this.title = attributedText;
        this.link = deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
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
        if (!(obj instanceof UserMessageAction)) {
            return false;
        }
        UserMessageAction userMessageAction = (UserMessageAction) obj;
        return L.f(this.title, userMessageAction.title) && L.f(this.link, userMessageAction.link);
    }

    public final int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        DeepLink deepLink = this.link;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserMessageAction(title=");
        sb2.append(this.title);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.link, i12);
    }
}
