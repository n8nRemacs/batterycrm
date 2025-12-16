package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PublicProfileLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PublicProfileLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PublicProfileLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<PublicProfileLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133622b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133623c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SearchParams f133624d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f133625e;

    /* compiled from: PublicProfileLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublicProfileLink> {
        @Override // android.os.Parcelable.Creator
        public final PublicProfileLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            SearchParams searchParamsCreateFromParcel = parcel.readInt() == 0 ? null : SearchParams.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new PublicProfileLink(string, string2, searchParamsCreateFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PublicProfileLink[] newArray(int i12) {
            return new PublicProfileLink[i12];
        }
    }

    public PublicProfileLink(@Y61.k String str, @Y61.l String str2, @Y61.l SearchParams searchParams, @Y61.k Map<String, String> map) {
        this.f133622b = str;
        this.f133623c = str2;
        this.f133624d = searchParams;
        this.f133625e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicProfileLink)) {
            return false;
        }
        PublicProfileLink publicProfileLink = (PublicProfileLink) obj;
        return kotlin.jvm.internal.L.f(this.f133622b, publicProfileLink.f133622b) && kotlin.jvm.internal.L.f(this.f133623c, publicProfileLink.f133623c) && kotlin.jvm.internal.L.f(this.f133624d, publicProfileLink.f133624d) && kotlin.jvm.internal.L.f(this.f133625e, publicProfileLink.f133625e);
    }

    public final int hashCode() {
        int iHashCode = this.f133622b.hashCode() * 31;
        String str = this.f133623c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SearchParams searchParams = this.f133624d;
        return this.f133625e.hashCode() + ((iHashCode2 + (searchParams != null ? searchParams.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicProfileLink(userKey=");
        sb2.append(this.f133622b);
        sb2.append(", context=");
        sb2.append(this.f133623c);
        sb2.append(", searchParams=");
        sb2.append(this.f133624d);
        sb2.append(", queryMap=");
        return androidx.compose.foundation.H.n(sb2, this.f133625e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133622b);
        parcel.writeString(this.f133623c);
        SearchParams searchParams = this.f133624d;
        if (searchParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchParams.writeToParcel(parcel, i12);
        }
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f133625e, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
