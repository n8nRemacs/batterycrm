package com.avito.android.user_favorites.adapter.comparison;

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

/* compiled from: ComparisonTab.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/adapter/comparison/ComparisonTab;", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ComparisonTab extends FavoritesTab {

    @k
    public static final Parcelable.Creator<ComparisonTab> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    public final int f316843f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f316844g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f316845h;

    /* compiled from: ComparisonTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonTab> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonTab createFromParcel(Parcel parcel) {
            return new ComparisonTab(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonTab[] newArray(int i12) {
            return new ComparisonTab[i12];
        }
    }

    public /* synthetic */ ComparisonTab(int i12, String str, String str2, int i13, C42822w c42822w) {
        this(i12, str, (i13 & 4) != 0 ? null : str2);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab
    /* renamed from: d, reason: from getter */
    public final int getF316858f() {
        return this.f316843f;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonTab)) {
            return false;
        }
        ComparisonTab comparisonTab = (ComparisonTab) obj;
        return this.f316843f == comparisonTab.f316843f && L.f(this.f316844g, comparisonTab.f316844g) && L.f(this.f316845h, comparisonTab.f316845h);
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @l
    /* renamed from: getLabel, reason: from getter */
    public final String getF178136c() {
        return this.f316845h;
    }

    @Override // com.avito.android.user_favorites.adapter.FavoritesTab, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF231823d() {
        return this.f316844g;
    }

    public final int hashCode() {
        int iD2 = H.d(Integer.hashCode(this.f316843f) * 31, 31, this.f316844g);
        String str = this.f316845h;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonTab(id=");
        sb2.append(this.f316843f);
        sb2.append(", title=");
        sb2.append(this.f316844g);
        sb2.append(", label=");
        return C22026a.c(sb2, this.f316845h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f316843f);
        parcel.writeString(this.f316844g);
        parcel.writeString(this.f316845h);
    }

    public ComparisonTab(int i12, @k String str, @l String str2) {
        super(i12, str, str2, null, 8, null);
        this.f316843f = i12;
        this.f316844g = str;
        this.f316845h = str2;
    }
}
