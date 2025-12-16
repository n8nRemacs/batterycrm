package com.avito.android.recent_query_search.widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecentQuerySearchAction.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/recent_query_search/widget/RecentQuerySearchAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecentQuerySearchAction implements Parcelable {

    @k
    public static final Parcelable.Creator<RecentQuerySearchAction> CREATOR = new a();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink link;

    @c("title")
    @l
    private final String title;

    /* compiled from: RecentQuerySearchAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecentQuerySearchAction> {
        @Override // android.os.Parcelable.Creator
        public final RecentQuerySearchAction createFromParcel(Parcel parcel) {
            return new RecentQuerySearchAction((DeepLink) parcel.readParcelable(RecentQuerySearchAction.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecentQuerySearchAction[] newArray(int i12) {
            return new RecentQuerySearchAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecentQuerySearchAction() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentQuerySearchAction)) {
            return false;
        }
        RecentQuerySearchAction recentQuerySearchAction = (RecentQuerySearchAction) obj;
        return L.f(this.link, recentQuerySearchAction.link) && L.f(this.title, recentQuerySearchAction.title);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        DeepLink deepLink = this.link;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecentQuerySearchAction(link=");
        sb2.append(this.link);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.link, i12);
        parcel.writeString(this.title);
    }

    public RecentQuerySearchAction(@l DeepLink deepLink, @l String str) {
        this.link = deepLink;
        this.title = str;
    }

    public /* synthetic */ RecentQuerySearchAction(DeepLink deepLink, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : str);
    }
}
