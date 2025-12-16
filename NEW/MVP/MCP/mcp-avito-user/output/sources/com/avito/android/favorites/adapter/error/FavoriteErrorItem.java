package com.avito.android.favorites.adapter.error;

import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: FavoriteErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/error/FavoriteErrorItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteErrorItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<FavoriteErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f156557b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Uri f156558c;

    /* compiled from: FavoriteErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoriteErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final FavoriteErrorItem createFromParcel(Parcel parcel) {
            return new FavoriteErrorItem((PrintableText) parcel.readParcelable(FavoriteErrorItem.class.getClassLoader()), (Uri) parcel.readParcelable(FavoriteErrorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteErrorItem[] newArray(int i12) {
            return new FavoriteErrorItem[i12];
        }
    }

    public FavoriteErrorItem(@k PrintableText printableText, @k Uri uri) {
        this.f156557b = printableText;
        this.f156558c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF155015b() {
        return "favorite_error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f156557b, i12);
        parcel.writeParcelable(this.f156558c, i12);
    }
}
