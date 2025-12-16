package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/ClarifyButtonItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClarifyButtonItem extends ShortcutNavigationItem {

    @k
    public static final Parcelable.Creator<ClarifyButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f283214b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f283215c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f283216d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f283217e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f283218f;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClarifyButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ClarifyButtonItem createFromParcel(Parcel parcel) {
            return new ClarifyButtonItem((DeepLink) parcel.readParcelable(ClarifyButtonItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClarifyButtonItem[] newArray(int i12) {
            return new ClarifyButtonItem[i12];
        }
    }

    public /* synthetic */ ClarifyButtonItem(String str, String str2, DeepLink deepLink, String str3, boolean z12, int i12, C42822w c42822w) {
        this(deepLink, str, str2, (i12 & 8) != 0 ? "icon_shortcut" : str3, (i12 & 16) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClarifyButtonItem)) {
            return false;
        }
        ClarifyButtonItem clarifyButtonItem = (ClarifyButtonItem) obj;
        return L.f(this.f283214b, clarifyButtonItem.f283214b) && L.f(this.f283215c, clarifyButtonItem.f283215c) && L.f(this.f283216d, clarifyButtonItem.f283216d) && L.f(this.f283217e, clarifyButtonItem.f283217e) && this.f283218f == clarifyButtonItem.f283218f;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @l
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF283216d() {
        return this.f283216d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283214b() {
        return this.f283214b;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF283215c() {
        return this.f283215c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f283214b.hashCode() * 31, 31, this.f283215c);
        DeepLink deepLink = this.f283216d;
        return Boolean.hashCode(this.f283218f) + H.d((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f283217e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClarifyButtonItem(stringId=");
        sb2.append(this.f283214b);
        sb2.append(", text=");
        sb2.append(this.f283215c);
        sb2.append(", deepLink=");
        sb2.append(this.f283216d);
        sb2.append(", iconType=");
        sb2.append(this.f283217e);
        sb2.append(", isSelectedFilters=");
        return r.x(sb2, this.f283218f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283214b);
        parcel.writeString(this.f283215c);
        parcel.writeParcelable(this.f283216d, i12);
        parcel.writeString(this.f283217e);
        parcel.writeInt(this.f283218f ? 1 : 0);
    }

    public ClarifyButtonItem(@l DeepLink deepLink, @k String str, @k String str2, @k String str3, boolean z12) {
        super(null);
        this.f283214b = str;
        this.f283215c = str2;
        this.f283216d = deepLink;
        this.f283217e = str3;
        this.f283218f = z12;
    }
}
