package com.avito.android.remote.safedeal;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealAction.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDealAction;", "Landroid/os/Parcelable;", "", "title", "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SafeDealAction implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealAction> CREATOR = new a();

    @c(ContextActionHandler.Link.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("icon")
    @l
    private final String icon;

    @c("title")
    @k
    private final String title;

    /* compiled from: SafeDealAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDealAction> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealAction createFromParcel(Parcel parcel) {
            return new SafeDealAction(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SafeDealAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealAction[] newArray(int i12) {
            return new SafeDealAction[i12];
        }
    }

    public SafeDealAction(@k String str, @l String str2, @k DeepLink deepLink) {
        this.title = str;
        this.icon = str2;
        this.deepLink = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeDealAction)) {
            return false;
        }
        SafeDealAction safeDealAction = (SafeDealAction) obj;
        return L.f(this.title, safeDealAction.title) && L.f(this.icon, safeDealAction.icon) && L.f(this.deepLink, safeDealAction.deepLink);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.icon;
        return this.deepLink.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SafeDealAction(title=");
        sb2.append(this.title);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.icon);
        parcel.writeParcelable(this.deepLink, i12);
    }

    public /* synthetic */ SafeDealAction(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, deepLink);
    }
}
