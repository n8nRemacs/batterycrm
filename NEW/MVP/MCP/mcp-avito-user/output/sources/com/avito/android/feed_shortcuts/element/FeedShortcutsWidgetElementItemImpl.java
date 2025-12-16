package com.avito.android.feed_shortcuts.element;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedShortcutsWidgetElementItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feed_shortcuts/element/FeedShortcutsWidgetElementItemImpl;", "Lcom/avito/android/feed_shortcuts/element/FeedShortcutsWidgetElementItem;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedShortcutsWidgetElementItemImpl implements FeedShortcutsWidgetElementItem {

    @k
    public static final Parcelable.Creator<FeedShortcutsWidgetElementItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157670b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f157671c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f157672d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f157673e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f157674f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f157675g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Analytics f157676h;

    /* renamed from: i, reason: collision with root package name */
    public final int f157677i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f157678j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final int f157679k = 1;

    /* compiled from: FeedShortcutsWidgetElementItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeedShortcutsWidgetElementItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final FeedShortcutsWidgetElementItemImpl createFromParcel(Parcel parcel) {
            return new FeedShortcutsWidgetElementItemImpl(parcel.readString(), (DeepLink) parcel.readParcelable(FeedShortcutsWidgetElementItemImpl.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalImage) parcel.readParcelable(FeedShortcutsWidgetElementItemImpl.class.getClassLoader()), (Analytics) parcel.readParcelable(FeedShortcutsWidgetElementItemImpl.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedShortcutsWidgetElementItemImpl[] newArray(int i12) {
            return new FeedShortcutsWidgetElementItemImpl[i12];
        }
    }

    public FeedShortcutsWidgetElementItemImpl(@k String str, @k DeepLink deepLink, @k String str2, @k String str3, @l Integer num, @l UniversalImage universalImage, @l Analytics analytics, int i12) {
        this.f157670b = str;
        this.f157671c = deepLink;
        this.f157672d = str2;
        this.f157673e = str3;
        this.f157674f = num;
        this.f157675g = universalImage;
        this.f157676h = analytics;
        this.f157677i = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedShortcutsWidgetElementItemImpl)) {
            return false;
        }
        FeedShortcutsWidgetElementItemImpl feedShortcutsWidgetElementItemImpl = (FeedShortcutsWidgetElementItemImpl) obj;
        return L.f(this.f157670b, feedShortcutsWidgetElementItemImpl.f157670b) && L.f(this.f157671c, feedShortcutsWidgetElementItemImpl.f157671c) && L.f(this.f157672d, feedShortcutsWidgetElementItemImpl.f157672d) && L.f(this.f157673e, feedShortcutsWidgetElementItemImpl.f157673e) && L.f(this.f157674f, feedShortcutsWidgetElementItemImpl.f157674f) && L.f(this.f157675g, feedShortcutsWidgetElementItemImpl.f157675g) && L.f(this.f157676h, feedShortcutsWidgetElementItemImpl.f157676h) && this.f157677i == feedShortcutsWidgetElementItemImpl.f157677i;
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    /* renamed from: f0, reason: from getter */
    public final int getF157677i() {
        return this.f157677i;
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    @k
    /* renamed from: getAction, reason: from getter */
    public final DeepLink getF157671c() {
        return this.f157671c;
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    @l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF157676h() {
        return this.f157676h;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272457h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77564b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    @l
    /* renamed from: getImage, reason: from getter */
    public final UniversalImage getF157675g() {
        return this.f157675g;
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    @l
    /* renamed from: getMicroCategoryId, reason: from getter */
    public final Integer getF157674f() {
        return this.f157674f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF157679k() {
        return this.f157679k;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF157670b() {
        return this.f157670b;
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    @k
    /* renamed from: getSubtitle, reason: from getter */
    public final String getF157673e() {
        return this.f157673e;
    }

    @Override // com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF157672d() {
        return this.f157672d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF157678j() {
        return this.f157678j;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.e(this.f157671c, this.f157670b.hashCode() * 31, 31), 31, this.f157672d), 31, this.f157673e);
        Integer num = this.f157674f;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        UniversalImage universalImage = this.f157675g;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Analytics analytics = this.f157676h;
        return Integer.hashCode(this.f157677i) + ((iHashCode2 + (analytics != null ? analytics.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedShortcutsWidgetElementItemImpl(stringId=");
        sb2.append(this.f157670b);
        sb2.append(", action=");
        sb2.append(this.f157671c);
        sb2.append(", title=");
        sb2.append(this.f157672d);
        sb2.append(", subtitle=");
        sb2.append(this.f157673e);
        sb2.append(", microCategoryId=");
        sb2.append(this.f157674f);
        sb2.append(", image=");
        sb2.append(this.f157675g);
        sb2.append(", analytics=");
        sb2.append(this.f157676h);
        sb2.append(", widgetPosition=");
        return r.t(sb2, this.f157677i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f157670b);
        parcel.writeParcelable(this.f157671c, i12);
        parcel.writeString(this.f157672d);
        parcel.writeString(this.f157673e);
        Integer num = this.f157674f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f157675g, i12);
        parcel.writeParcelable(this.f157676h, i12);
        parcel.writeInt(this.f157677i);
    }
}
