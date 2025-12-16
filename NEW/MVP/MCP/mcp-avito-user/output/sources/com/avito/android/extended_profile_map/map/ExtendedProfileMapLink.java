package com.avito.android.extended_profile_map.map;

import Hu.InterfaceC14033a;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ExtendedProfileGeo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ExtendedProfileMapLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/map/ExtendedProfileMapLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_extended-profile-map_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileMapLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ExtendedProfileMapLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ExtendedProfileGeo f151260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f151261c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f151262d;

    /* compiled from: ExtendedProfileMapLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileMapLink> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileMapLink createFromParcel(Parcel parcel) {
            return new ExtendedProfileMapLink((ExtendedProfileGeo) parcel.readParcelable(ExtendedProfileMapLink.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileMapLink[] newArray(int i12) {
            return new ExtendedProfileMapLink[i12];
        }
    }

    public ExtendedProfileMapLink(@k ExtendedProfileGeo extendedProfileGeo, @k String str, @l String str2) {
        this.f151260b = extendedProfileGeo;
        this.f151261c = str;
        this.f151262d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileMapLink)) {
            return false;
        }
        ExtendedProfileMapLink extendedProfileMapLink = (ExtendedProfileMapLink) obj;
        return L.f(this.f151260b, extendedProfileMapLink.f151260b) && L.f(this.f151261c, extendedProfileMapLink.f151261c) && L.f(this.f151262d, extendedProfileMapLink.f151262d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f151260b.hashCode() * 31, 31, this.f151261c);
        String str = this.f151262d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileMapLink(geo=");
        sb2.append(this.f151260b);
        sb2.append(", userKey=");
        sb2.append(this.f151261c);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f151262d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f151260b, i12);
        parcel.writeString(this.f151261c);
        parcel.writeString(this.f151262d);
    }
}
