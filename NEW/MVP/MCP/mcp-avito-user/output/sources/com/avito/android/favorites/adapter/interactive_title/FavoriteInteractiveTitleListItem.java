package com.avito.android.favorites.adapter.interactive_title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteInteractiveTitleListItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/interactive_title/FavoriteInteractiveTitleListItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FavoriteInteractiveTitleListItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<FavoriteInteractiveTitleListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f156589b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f156590c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f156591d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156592e;

    /* renamed from: f, reason: collision with root package name */
    public final int f156593f;

    /* compiled from: FavoriteInteractiveTitleListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoriteInteractiveTitleListItem> {
        @Override // android.os.Parcelable.Creator
        public final FavoriteInteractiveTitleListItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new FavoriteInteractiveTitleListItem(parcel.readInt(), parcel.readInt(), (DeepLink) parcel.readParcelable(FavoriteInteractiveTitleListItem.class.getClassLoader()), string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteInteractiveTitleListItem[] newArray(int i12) {
            return new FavoriteInteractiveTitleListItem[i12];
        }
    }

    public FavoriteInteractiveTitleListItem(int i12, int i13, @l DeepLink deepLink, @k String str, @k String str2) {
        this.f156589b = str;
        this.f156590c = str2;
        this.f156591d = deepLink;
        this.f156592e = i12;
        this.f156593f = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteInteractiveTitleListItem)) {
            return false;
        }
        FavoriteInteractiveTitleListItem favoriteInteractiveTitleListItem = (FavoriteInteractiveTitleListItem) obj;
        return L.f(this.f156589b, favoriteInteractiveTitleListItem.f156589b) && L.f(this.f156590c, favoriteInteractiveTitleListItem.f156590c) && L.f(this.f156591d, favoriteInteractiveTitleListItem.f156591d) && this.f156592e == favoriteInteractiveTitleListItem.f156592e && this.f156593f == favoriteInteractiveTitleListItem.f156593f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155500b() {
        return this.f156589b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f156589b.hashCode() * 31, 31, this.f156590c);
        DeepLink deepLink = this.f156591d;
        return Integer.hashCode(this.f156593f) + r.e(this.f156592e, (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteInteractiveTitleListItem(stringId=");
        sb2.append(this.f156589b);
        sb2.append(", title=");
        sb2.append(this.f156590c);
        sb2.append(", deeplink=");
        sb2.append(this.f156591d);
        sb2.append(", topInset=");
        sb2.append(this.f156592e);
        sb2.append(", bottomInset=");
        return r.t(sb2, this.f156593f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f156589b);
        parcel.writeString(this.f156590c);
        parcel.writeParcelable(this.f156591d, i12);
        parcel.writeInt(this.f156592e);
        parcel.writeInt(this.f156593f);
    }

    public /* synthetic */ FavoriteInteractiveTitleListItem(String str, String str2, DeepLink deepLink, int i12, int i13, int i14, C42822w c42822w) {
        this(i12, i13, deepLink, (i14 & 1) != 0 ? UUID.randomUUID().toString() : str, str2);
    }
}
