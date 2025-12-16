package com.avito.android.user_favorites.adapter.sellers;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellersTab.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/adapter/sellers/SellersTab;", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SellersTab extends FavoritesTab {

    @k
    public static final Parcelable.Creator<SellersTab> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f316855f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f316856g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f316857h;

    /* compiled from: SellersTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellersTab> {
        @Override // android.os.Parcelable.Creator
        public final SellersTab createFromParcel(Parcel parcel) {
            return new SellersTab(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SellersTab[] newArray(int i12) {
            return new SellersTab[i12];
        }
    }

    public /* synthetic */ SellersTab(int i12, String str, String str2, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : str2);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab
    /* renamed from: d, reason: from getter */
    public final int getF316852f() {
        return this.f316855f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellersTab)) {
            return false;
        }
        SellersTab sellersTab = (SellersTab) obj;
        return this.f316855f == sellersTab.f316855f && L.f(this.f316856g, sellersTab.f316856g) && L.f(this.f316857h, sellersTab.f316857h);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF316854h() {
        return this.f316857h;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF316853g() {
        return this.f316856g;
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f316855f) * 31, 31, this.f316856g);
        String str = this.f316857h;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellersTab(id=");
        sb2.append(this.f316855f);
        sb2.append(", title=");
        sb2.append(this.f316856g);
        sb2.append(", label=");
        return C22026a.c(sb2, this.f316857h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f316855f);
        parcel.writeString(this.f316856g);
        parcel.writeString(this.f316857h);
    }

    public SellersTab(int i12, @k String str, @l String str2) {
        super(i12, str, str2, null, 8, null);
        this.f316855f = i12;
        this.f316856g = str;
        this.f316857h = str2;
    }
}
