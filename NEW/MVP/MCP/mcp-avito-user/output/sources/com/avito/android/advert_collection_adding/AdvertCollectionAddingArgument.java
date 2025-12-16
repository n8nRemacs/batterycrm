package com.avito.android.advert_collection_adding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertCollectionAddingArgument.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection_adding/AdvertCollectionAddingArgument;", "Landroid/os/Parcelable;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertCollectionAddingArgument implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertCollectionAddingArgument> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f81722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f81723c;

    /* compiled from: AdvertCollectionAddingArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertCollectionAddingArgument> {
        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionAddingArgument createFromParcel(Parcel parcel) {
            return new AdvertCollectionAddingArgument(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertCollectionAddingArgument[] newArray(int i12) {
            return new AdvertCollectionAddingArgument[i12];
        }
    }

    public AdvertCollectionAddingArgument(@Y61.k List<String> list, @Y61.l String str) {
        this.f81722b = list;
        this.f81723c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertCollectionAddingArgument)) {
            return false;
        }
        AdvertCollectionAddingArgument advertCollectionAddingArgument = (AdvertCollectionAddingArgument) obj;
        return L.f(this.f81722b, advertCollectionAddingArgument.f81722b) && L.f(this.f81723c, advertCollectionAddingArgument.f81723c);
    }

    public final int hashCode() {
        int iHashCode = this.f81722b.hashCode() * 31;
        String str = this.f81723c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCollectionAddingArgument(ids=");
        sb2.append(this.f81722b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f81723c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeStringList(this.f81722b);
        parcel.writeString(this.f81723c);
    }
}
