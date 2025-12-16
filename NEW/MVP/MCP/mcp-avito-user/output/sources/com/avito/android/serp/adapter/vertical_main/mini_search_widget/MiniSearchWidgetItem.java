package com.avito.android.serp.adapter.vertical_main.mini_search_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.MiniSearchWidgetAction;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: MiniSearchWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mini_search_widget/MiniSearchWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MiniSearchWidgetItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<MiniSearchWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f273030b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f273031c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final MiniSearchWidgetAction f273032d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f273033e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final MiniSearchWidgetRecentSearches f273034f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Analytics f273035g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Settings f273036h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h.b f273037i;

    /* renamed from: j, reason: collision with root package name */
    public final long f273038j = a.C10492a.a(this);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f273039k = SerpViewType.f268585e;

    /* renamed from: l, reason: collision with root package name */
    public final int f273040l = 6;

    /* compiled from: MiniSearchWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MiniSearchWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final MiniSearchWidgetItem createFromParcel(Parcel parcel) {
            return new MiniSearchWidgetItem(parcel.readString(), (AttributedText) parcel.readParcelable(MiniSearchWidgetItem.class.getClassLoader()), (MiniSearchWidgetAction) parcel.readParcelable(MiniSearchWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(MiniSearchWidgetItem.class.getClassLoader()), parcel.readInt() == 0 ? null : MiniSearchWidgetRecentSearches.CREATOR.createFromParcel(parcel), (Analytics) parcel.readParcelable(MiniSearchWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(MiniSearchWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MiniSearchWidgetItem[] newArray(int i12) {
            return new MiniSearchWidgetItem[i12];
        }
    }

    public MiniSearchWidgetItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l MiniSearchWidgetAction miniSearchWidgetAction, @Y61.l UniversalImage universalImage, @Y61.l MiniSearchWidgetRecentSearches miniSearchWidgetRecentSearches, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f273030b = str;
        this.f273031c = attributedText;
        this.f273032d = miniSearchWidgetAction;
        this.f273033e = universalImage;
        this.f273034f = miniSearchWidgetRecentSearches;
        this.f273035g = analytics;
        this.f273036h = settings;
        this.f273037i = new h.b("mini_search_widget", null, null, null, null, analytics, 30, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniSearchWidgetItem)) {
            return false;
        }
        MiniSearchWidgetItem miniSearchWidgetItem = (MiniSearchWidgetItem) obj;
        return L.f(this.f273030b, miniSearchWidgetItem.f273030b) && L.f(this.f273031c, miniSearchWidgetItem.f273031c) && L.f(this.f273032d, miniSearchWidgetItem.f273032d) && L.f(this.f273033e, miniSearchWidgetItem.f273033e) && L.f(this.f273034f, miniSearchWidgetItem.f273034f) && L.f(this.f273035g, miniSearchWidgetItem.f273035g) && L.f(this.f273036h, miniSearchWidgetItem.f273036h);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272457h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272454e() {
        return this.f273036h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272456g() {
        return this.f273040l;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF276227b() {
        return this.f273030b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF269031n() {
        return this.f273038j;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272455f() {
        return this.f273039k;
    }

    public final int hashCode() {
        int iHashCode = this.f273030b.hashCode() * 31;
        AttributedText attributedText = this.f273031c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        MiniSearchWidgetAction miniSearchWidgetAction = this.f273032d;
        int iHashCode3 = (iHashCode2 + (miniSearchWidgetAction == null ? 0 : miniSearchWidgetAction.hashCode())) * 31;
        UniversalImage universalImage = this.f273033e;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        MiniSearchWidgetRecentSearches miniSearchWidgetRecentSearches = this.f273034f;
        int iHashCode5 = (iHashCode4 + (miniSearchWidgetRecentSearches == null ? 0 : miniSearchWidgetRecentSearches.hashCode())) * 31;
        Analytics analytics = this.f273035g;
        int iHashCode6 = (iHashCode5 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f273036h;
        return iHashCode6 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF269030m() {
        return this.f273037i;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MiniSearchWidgetItem(stringId=");
        sb2.append(this.f273030b);
        sb2.append(", title=");
        sb2.append(this.f273031c);
        sb2.append(", action=");
        sb2.append(this.f273032d);
        sb2.append(", image=");
        sb2.append(this.f273033e);
        sb2.append(", recentSearches=");
        sb2.append(this.f273034f);
        sb2.append(", analytics=");
        sb2.append(this.f273035g);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f273036h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f273030b);
        parcel.writeParcelable(this.f273031c, i12);
        parcel.writeParcelable(this.f273032d, i12);
        parcel.writeParcelable(this.f273033e, i12);
        MiniSearchWidgetRecentSearches miniSearchWidgetRecentSearches = this.f273034f;
        if (miniSearchWidgetRecentSearches == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            miniSearchWidgetRecentSearches.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f273035g, i12);
        parcel.writeParcelable(this.f273036h, i12);
    }
}
