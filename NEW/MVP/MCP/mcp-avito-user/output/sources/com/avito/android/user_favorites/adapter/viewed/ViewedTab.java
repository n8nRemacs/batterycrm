package com.avito.android.user_favorites.adapter.viewed;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedTab.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/adapter/viewed/ViewedTab;", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewedTab extends FavoritesTab {

    @k
    public static final Parcelable.Creator<ViewedTab> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f316858f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f316859g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f316860h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f316861i;

    /* compiled from: ViewedTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ViewedTab> {
        @Override // android.os.Parcelable.Creator
        public final ViewedTab createFromParcel(Parcel parcel) {
            return new ViewedTab(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ViewedTab[] newArray(int i12) {
            return new ViewedTab[i12];
        }
    }

    public /* synthetic */ ViewedTab(int i12, String str, String str2, String str3, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab
    @l
    /* renamed from: c, reason: from getter */
    public final String getF316860h() {
        return this.f316860h;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab
    /* renamed from: d, reason: from getter */
    public final int getF316858f() {
        return this.f316858f;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF316861i() {
        return this.f316861i;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF316859g() {
        return this.f316859g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f316858f);
        parcel.writeString(this.f316859g);
        parcel.writeString(this.f316860h);
        parcel.writeString(this.f316861i);
    }

    public ViewedTab(int i12, @k String str, @l String str2, @l String str3) {
        super(i12, str, str3, str2);
        this.f316858f = i12;
        this.f316859g = str;
        this.f316860h = str2;
        this.f316861i = str3;
    }
}
