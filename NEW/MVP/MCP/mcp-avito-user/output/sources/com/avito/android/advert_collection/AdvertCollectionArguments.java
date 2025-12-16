package com.avito.android.advert_collection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/AdvertCollectionArguments;", "Landroid/os/Parcelable;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertCollectionArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f81174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f81175c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f81176d;

    /* compiled from: AdvertCollectionArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCollectionArguments> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionArguments createFromParcel(Parcel parcel) {
            return new AdvertCollectionArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionArguments[] newArray(int i12) {
            return new AdvertCollectionArguments[i12];
        }
    }

    public AdvertCollectionArguments(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f81174b = str;
        this.f81175c = str2;
        this.f81176d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCollectionArguments)) {
            return false;
        }
        AdvertCollectionArguments advertCollectionArguments = (AdvertCollectionArguments) obj;
        return L.f(this.f81174b, advertCollectionArguments.f81174b) && L.f(this.f81175c, advertCollectionArguments.f81175c) && L.f(this.f81176d, advertCollectionArguments.f81176d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f81174b.hashCode() * 31, 31, this.f81175c);
        String str = this.f81176d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionArguments(collectionId=");
        sb2.append(this.f81174b);
        sb2.append(", token=");
        sb2.append(this.f81175c);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f81176d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f81174b);
        parcel.writeString(this.f81175c);
        parcel.writeString(this.f81176d);
    }
}
