package com.avito.android.advert.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPreloadStorage.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/PreloadCacheKey;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PreloadCacheKey implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PreloadCacheKey> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f71789b;

    /* compiled from: AdvertDetailsPreloadStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreloadCacheKey> {
        @Override // android.os.Parcelable.Creator
        public final PreloadCacheKey createFromParcel(Parcel parcel) {
            return new PreloadCacheKey(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreloadCacheKey[] newArray(int i12) {
            return new PreloadCacheKey[i12];
        }
    }

    public PreloadCacheKey(@Y61.k String str) {
        this.f71789b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadCacheKey) && kotlin.jvm.internal.L.f(this.f71789b, ((PreloadCacheKey) obj).f71789b);
    }

    public final int hashCode() {
        return this.f71789b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("PreloadCacheKey(key="), this.f71789b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f71789b);
    }
}
