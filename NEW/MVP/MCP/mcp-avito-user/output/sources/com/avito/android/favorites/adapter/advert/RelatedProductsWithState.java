package com.avito.android.favorites.adapter.advert;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.related_products.RelatedProductsEntryPointState;
import com.avito.android.remote.model.RelatedProducts;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteAdvertItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/RelatedProductsWithState;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RelatedProductsWithState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RelatedProductsWithState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RelatedProducts f156429b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RelatedProductsEntryPointState f156430c;

    /* compiled from: FavoriteAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RelatedProductsWithState> {
        @Override // android.os.Parcelable.Creator
        public final RelatedProductsWithState createFromParcel(Parcel parcel) {
            return new RelatedProductsWithState((RelatedProducts) parcel.readParcelable(RelatedProductsWithState.class.getClassLoader()), RelatedProductsEntryPointState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RelatedProductsWithState[] newArray(int i12) {
            return new RelatedProductsWithState[i12];
        }
    }

    public RelatedProductsWithState(@Y61.k RelatedProducts relatedProducts, @Y61.k RelatedProductsEntryPointState relatedProductsEntryPointState) {
        this.f156429b = relatedProducts;
        this.f156430c = relatedProductsEntryPointState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedProductsWithState)) {
            return false;
        }
        RelatedProductsWithState relatedProductsWithState = (RelatedProductsWithState) obj;
        return L.f(this.f156429b, relatedProductsWithState.f156429b) && this.f156430c == relatedProductsWithState.f156430c;
    }

    public final int hashCode() {
        return this.f156430c.hashCode() + (this.f156429b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "RelatedProductsWithState(data=" + this.f156429b + ", state=" + this.f156430c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f156429b, i12);
        parcel.writeString(this.f156430c.name());
    }
}
