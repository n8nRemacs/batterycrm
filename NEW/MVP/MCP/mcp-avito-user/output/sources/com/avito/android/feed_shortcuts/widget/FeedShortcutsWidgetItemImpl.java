package com.avito.android.feed_shortcuts.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FeedShortcutsWidgetItemImpl.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidgetItemImpl;", "Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidgetItem;", "Lis0/h;", "Lcom/avito/android/remote/model/SettingsElement;", "a", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedShortcutsWidgetItemImpl implements FeedShortcutsWidgetItem, is0.h, SettingsElement {

    @Y61.k
    public static final Parcelable.Creator<FeedShortcutsWidgetItemImpl> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f157692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f157693c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Analytics f157694d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Settings f157695e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h.b f157696f;

    /* renamed from: g, reason: collision with root package name */
    public final long f157697g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f157698h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f157699i;

    /* renamed from: j, reason: collision with root package name */
    public final int f157700j;

    /* compiled from: FeedShortcutsWidgetItemImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/FeedShortcutsWidgetItemImpl$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FeedShortcutsWidgetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FeedShortcutsWidgetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final FeedShortcutsWidgetItemImpl createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(FeedShortcutsWidgetItemImpl.class, parcel, arrayList, iL2, 1);
            }
            return new FeedShortcutsWidgetItemImpl(string, arrayList, (Analytics) parcel.readParcelable(FeedShortcutsWidgetItemImpl.class.getClassLoader()), (Settings) parcel.readParcelable(FeedShortcutsWidgetItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FeedShortcutsWidgetItemImpl[] newArray(int i12) {
            return new FeedShortcutsWidgetItemImpl[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FeedShortcutsWidgetItemImpl(@Y61.k String str, @Y61.k ArrayList arrayList, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f157692b = str;
        this.f157693c = arrayList;
        this.f157694d = analytics;
        this.f157695e = settings;
        com.google.gson.k kVar = new com.google.gson.k();
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            kVar.y(String.valueOf(i12), ((FeedShortcutsWidgetElementItem) obj).getF157672d());
            i12 = i13;
        }
        G0 g02 = G0.f406611a;
        this.f157696f = new h.b("feedShortcutsWidget", kVar.toString(), null, null, null, this.f157694d, 28, null);
        this.f157697g = getF157692b().hashCode();
        this.f157698h = true;
        this.f157699i = SerpViewType.f268585e;
        this.f157700j = 6;
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
        if (!(obj instanceof FeedShortcutsWidgetItemImpl)) {
            return false;
        }
        FeedShortcutsWidgetItemImpl feedShortcutsWidgetItemImpl = (FeedShortcutsWidgetItemImpl) obj;
        return L.f(this.f157692b, feedShortcutsWidgetItemImpl.f157692b) && this.f157693c.equals(feedShortcutsWidgetItemImpl.f157693c) && L.f(this.f157694d, feedShortcutsWidgetItemImpl.f157694d) && L.f(this.f157695e, feedShortcutsWidgetItemImpl.f157695e);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF157698h() {
        return this.f157698h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78300d() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.feed_shortcuts.widget.FeedShortcutsWidgetItem
    @Y61.k
    public final List<FeedShortcutsWidgetElementItem> getItems() {
        return this.f157693c;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF157695e() {
        return this.f157695e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF157700j() {
        return this.f157700j;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF157692b() {
        return this.f157692b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF157697g() {
        return this.f157697g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF157699i() {
        return this.f157699i;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f157693c, this.f157692b.hashCode() * 31, 31);
        Analytics analytics = this.f157694d;
        int iHashCode = (iG2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f157695e;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF157696f() {
        return this.f157696f;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@Y61.l Settings settings) {
        this.f157695e = settings;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeedShortcutsWidgetItemImpl(stringId=");
        sb2.append(this.f157692b);
        sb2.append(", items=");
        sb2.append(this.f157693c);
        sb2.append(", analytics=");
        sb2.append(this.f157694d);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f157695e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f157692b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f157693c, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeParcelable(this.f157694d, i12);
        parcel.writeParcelable(this.f157695e, i12);
    }
}
