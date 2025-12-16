package com.avito.android.favorite_sellers.adapter.error;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/error/ErrorItem;", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ErrorItem implements FavoriteSellersItem {

    @k
    public static final Parcelable.Creator<ErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155553b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Uri f155554c;

    /* compiled from: ErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final ErrorItem createFromParcel(Parcel parcel) {
            return new ErrorItem(parcel.readString(), (Uri) parcel.readParcelable(ErrorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorItem[] newArray(int i12) {
            return new ErrorItem[i12];
        }
    }

    public ErrorItem(@k String str, @k Uri uri) {
        this.f155553b = str;
        this.f155554c = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorItem)) {
            return false;
        }
        ErrorItem errorItem = (ErrorItem) obj;
        return L.f(this.f155553b, errorItem.f155553b) && L.f(this.f155554c, errorItem.f155554c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF154682b() {
        return "error_snippet";
    }

    public final int hashCode() {
        return this.f155554c.hashCode() + (this.f155553b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorItem(message=");
        sb2.append(this.f155553b);
        sb2.append(", failedUri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f155554c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155553b);
        parcel.writeParcelable(this.f155554c, i12);
    }
}
