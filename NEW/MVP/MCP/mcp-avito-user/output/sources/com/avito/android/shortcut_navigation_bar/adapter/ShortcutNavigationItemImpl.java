package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItemImpl;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShortcutNavigationItemImpl extends ShortcutNavigationItem {

    @k
    public static final Parcelable.Creator<ShortcutNavigationItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f283243b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f283244c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f283245d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f283246e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f283247f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f283248g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f283249h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Filter.MultiThemeIcon f283250i;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShortcutNavigationItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final ShortcutNavigationItemImpl createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ShortcutNavigationItemImpl.class.getClassLoader());
            String string3 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(ShortcutNavigationItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortcutNavigationItemImpl(string, string2, deepLink, string3, z12, universalImage, boolValueOf, (Filter.MultiThemeIcon) parcel.readParcelable(ShortcutNavigationItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortcutNavigationItemImpl[] newArray(int i12) {
            return new ShortcutNavigationItemImpl[i12];
        }
    }

    public /* synthetic */ ShortcutNavigationItemImpl(String str, String str2, DeepLink deepLink, String str3, boolean z12, UniversalImage universalImage, Boolean bool, Filter.MultiThemeIcon multiThemeIcon, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? null : str3, z12, (i12 & 32) != 0 ? null : universalImage, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : multiThemeIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @l
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF283257d() {
        return this.f283245d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85139c() {
        return this.f283243b;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF283256c() {
        return this.f283244c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283243b);
        parcel.writeString(this.f283244c);
        parcel.writeParcelable(this.f283245d, i12);
        parcel.writeString(this.f283246e);
        parcel.writeInt(this.f283247f ? 1 : 0);
        parcel.writeParcelable(this.f283248g, i12);
        Boolean bool = this.f283249h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f283250i, i12);
    }

    public ShortcutNavigationItemImpl(@k String str, @k String str2, @l DeepLink deepLink, @l String str3, boolean z12, @l UniversalImage universalImage, @l Boolean bool, @l Filter.MultiThemeIcon multiThemeIcon) {
        super(null);
        this.f283243b = str;
        this.f283244c = str2;
        this.f283245d = deepLink;
        this.f283246e = str3;
        this.f283247f = z12;
        this.f283248g = universalImage;
        this.f283249h = bool;
        this.f283250i = multiThemeIcon;
    }
}
