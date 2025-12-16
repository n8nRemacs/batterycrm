package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/SkeletonItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkeletonItem extends ShortcutNavigationItem {

    @k
    public static final Parcelable.Creator<SkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f283251b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f283252c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f283253d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f283254e;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final SkeletonItem createFromParcel(Parcel parcel) {
            return new SkeletonItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SkeletonItem[] newArray(int i12) {
            return new SkeletonItem[i12];
        }
    }

    public /* synthetic */ SkeletonItem(String str, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    /* renamed from: getDeepLink */
    public final /* bridge */ /* synthetic */ DeepLink getF283231f() {
        return null;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283251b() {
        return this.f283251b;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF283254e() {
        return this.f283254e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283251b);
        parcel.writeInt(this.f283252c ? 1 : 0);
        parcel.writeInt(this.f283253d ? 1 : 0);
    }

    public SkeletonItem(@k String str, boolean z12, boolean z13) {
        super(null);
        this.f283251b = str;
        this.f283252c = z12;
        this.f283253d = z13;
        this.f283254e = "";
    }
}
