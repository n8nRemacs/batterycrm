package com.avito.android.user_favorites.adapter.collection_list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CollectionListTab.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/adapter/collection_list/CollectionListTab;", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CollectionListTab extends FavoritesTab {

    @k
    public static final Parcelable.Creator<CollectionListTab> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f316840f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f316841g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f316842h;

    /* compiled from: CollectionListTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CollectionListTab> {
        @Override // android.os.Parcelable.Creator
        public final CollectionListTab createFromParcel(Parcel parcel) {
            return new CollectionListTab(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionListTab[] newArray(int i12) {
            return new CollectionListTab[i12];
        }
    }

    public /* synthetic */ CollectionListTab(int i12, String str, String str2, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : str2);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab
    /* renamed from: d, reason: from getter */
    public final int getF316858f() {
        return this.f316840f;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF316861i() {
        return this.f316842h;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF316859g() {
        return this.f316841g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f316840f);
        parcel.writeString(this.f316841g);
        parcel.writeString(this.f316842h);
    }

    public CollectionListTab(int i12, @k String str, @l String str2) {
        super(i12, str, str2, null, 8, null);
        this.f316840f = i12;
        this.f316841g = str;
        this.f316842h = str2;
    }
}
