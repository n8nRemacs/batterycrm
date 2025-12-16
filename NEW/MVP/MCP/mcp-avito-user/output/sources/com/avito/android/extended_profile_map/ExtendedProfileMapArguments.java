package com.avito.android.extended_profile_map;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapPoint;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileMapArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/ExtendedProfileMapArguments;", "Landroid/os/Parcelable;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileMapArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileMapArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AvitoMapPoint f151152b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<ExtendedProfileAddress> f151153c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f151154d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f151155e;

    /* compiled from: ExtendedProfileMapArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileMapArguments> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileMapArguments createFromParcel(Parcel parcel) {
            AvitoMapPoint avitoMapPoint = (AvitoMapPoint) parcel.readParcelable(ExtendedProfileMapArguments.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(ExtendedProfileAddress.CREATOR.createFromParcel(parcel));
            }
            return new ExtendedProfileMapArguments(avitoMapPoint, linkedHashSet, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileMapArguments[] newArray(int i12) {
            return new ExtendedProfileMapArguments[i12];
        }
    }

    public ExtendedProfileMapArguments(@Y61.l AvitoMapPoint avitoMapPoint, @Y61.k Set<ExtendedProfileAddress> set, @Y61.k String str, @Y61.l String str2) {
        this.f151152b = avitoMapPoint;
        this.f151153c = set;
        this.f151154d = str;
        this.f151155e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileMapArguments)) {
            return false;
        }
        ExtendedProfileMapArguments extendedProfileMapArguments = (ExtendedProfileMapArguments) obj;
        return L.f(this.f151152b, extendedProfileMapArguments.f151152b) && L.f(this.f151153c, extendedProfileMapArguments.f151153c) && L.f(this.f151154d, extendedProfileMapArguments.f151154d) && L.f(this.f151155e, extendedProfileMapArguments.f151155e);
    }

    public final int hashCode() {
        AvitoMapPoint avitoMapPoint = this.f151152b;
        int iD2 = H.d(androidx.media3.exoplayer.analytics.m.g(this.f151153c, (avitoMapPoint == null ? 0 : avitoMapPoint.hashCode()) * 31, 31), 31, this.f151154d);
        String str = this.f151155e;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileMapArguments(center=");
        sb2.append(this.f151152b);
        sb2.append(", addresses=");
        sb2.append(this.f151153c);
        sb2.append(", userKey=");
        sb2.append(this.f151154d);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f151155e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f151152b, i12);
        Set<ExtendedProfileAddress> set = this.f151153c;
        parcel.writeInt(set.size());
        Iterator<ExtendedProfileAddress> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f151154d);
        parcel.writeString(this.f151155e);
    }
}
