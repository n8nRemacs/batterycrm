package com.avito.android.user_favorites.adapter.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemsTab.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/adapter/items/ItemsTab;", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ItemsTab extends FavoritesTab {

    @k
    public static final Parcelable.Creator<ItemsTab> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f316848f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f316849g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f316850h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f316851i;

    /* compiled from: ItemsTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemsTab> {
        @Override // android.os.Parcelable.Creator
        public final ItemsTab createFromParcel(Parcel parcel) {
            return new ItemsTab(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemsTab[] newArray(int i12) {
            return new ItemsTab[i12];
        }
    }

    public /* synthetic */ ItemsTab(int i12, String str, String str2, Integer num, int i13, C42822w c42822w) {
        this(i12, (i13 & 8) != 0 ? null : num, str, (i13 & 4) != 0 ? null : str2);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab
    /* renamed from: d, reason: from getter */
    public final int getF316855f() {
        return this.f316848f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemsTab)) {
            return false;
        }
        ItemsTab itemsTab = (ItemsTab) obj;
        return this.f316848f == itemsTab.f316848f && L.f(this.f316849g, itemsTab.f316849g) && L.f(this.f316850h, itemsTab.f316850h) && L.f(this.f316851i, itemsTab.f316851i);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF316857h() {
        return this.f316850h;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF231823d() {
        return this.f316849g;
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f316848f) * 31, 31, this.f316849g);
        String str = this.f316850h;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f316851i;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemsTab(id=");
        sb2.append(this.f316848f);
        sb2.append(", title=");
        sb2.append(this.f316849g);
        sb2.append(", label=");
        sb2.append(this.f316850h);
        sb2.append(", categoryId=");
        return s.j(sb2, this.f316851i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f316848f);
        parcel.writeString(this.f316849g);
        parcel.writeString(this.f316850h);
        Integer num = this.f316851i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public ItemsTab(int i12, @l Integer num, @k String str, @l String str2) {
        super(i12, str, str2, null, 8, null);
        this.f316848f = i12;
        this.f316849g = str;
        this.f316850h = str2;
        this.f316851i = num;
    }
}
