package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/CollapsedShortcutItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/InlineFilterNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollapsedShortcutItem extends InlineFilterNavigationItem {

    @k
    public static final Parcelable.Creator<CollapsedShortcutItem> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f283219m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f283220n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final DeepLink f283221o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f283222p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final String f283223q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Object f283224r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final Filter f283225s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final String f283226t;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CollapsedShortcutItem> {
        @Override // android.os.Parcelable.Creator
        public final CollapsedShortcutItem createFromParcel(Parcel parcel) {
            return new CollapsedShortcutItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(CollapsedShortcutItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readValue(CollapsedShortcutItem.class.getClassLoader()), (Filter) parcel.readParcelable(CollapsedShortcutItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollapsedShortcutItem[] newArray(int i12) {
            return new CollapsedShortcutItem[i12];
        }
    }

    public CollapsedShortcutItem(@k String str, @k String str2, @l DeepLink deepLink, boolean z12, @k String str3, @l Object obj, @l Filter filter, @l String str4) {
        super(str, str3, obj, str2, deepLink, filter, str4, false, false, 384, null);
        this.f283219m = str;
        this.f283220n = str2;
        this.f283221o = deepLink;
        this.f283222p = z12;
        this.f283223q = str3;
        this.f283224r = obj;
        this.f283225s = filter;
        this.f283226t = str4;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem, com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @l
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF283231f() {
        return this.f283221o;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem, com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283227b() {
        return this.f283219m;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem, com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF283230e() {
        return this.f283220n;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem, android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283219m);
        parcel.writeString(this.f283220n);
        parcel.writeParcelable(this.f283221o, i12);
        parcel.writeInt(this.f283222p ? 1 : 0);
        parcel.writeString(this.f283223q);
        parcel.writeValue(this.f283224r);
        parcel.writeParcelable(this.f283225s, i12);
        parcel.writeString(this.f283226t);
    }
}
