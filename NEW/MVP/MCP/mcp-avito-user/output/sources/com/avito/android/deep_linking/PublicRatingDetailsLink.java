package com.avito.android.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PublicRatingDetailsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/PublicRatingDetailsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PublicRatingDetailsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PublicRatingDetailsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132852c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f132853d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Long f132854e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f132855f;

    /* compiled from: PublicRatingDetailsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublicRatingDetailsLink> {
        @Override // android.os.Parcelable.Creator
        public final PublicRatingDetailsLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new PublicRatingDetailsLink(string, string2, string3, lValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PublicRatingDetailsLink[] newArray(int i12) {
            return new PublicRatingDetailsLink[i12];
        }
    }

    /* compiled from: PublicRatingDetailsLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b$a;", "Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b$b;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: PublicRatingDetailsLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b$a;", "Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b;", "<init>", "()V", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f132856b = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -491581276;
            }

            @Y61.k
            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: PublicRatingDetailsLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b$b;", "Lcom/avito/android/deep_linking/PublicRatingDetailsLink$b;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.PublicRatingDetailsLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3980b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f132857b;

            public C3980b(@Y61.l String str) {
                this.f132857b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3980b) && kotlin.jvm.internal.L.f(this.f132857b, ((C3980b) obj).f132857b);
            }

            public final int hashCode() {
                String str = this.f132857b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f132857b, ')');
            }
        }
    }

    public PublicRatingDetailsLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.k Map<String, String> map) {
        this.f132851b = str;
        this.f132852c = str2;
        this.f132853d = str3;
        this.f132854e = l12;
        this.f132855f = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicRatingDetailsLink)) {
            return false;
        }
        PublicRatingDetailsLink publicRatingDetailsLink = (PublicRatingDetailsLink) obj;
        return kotlin.jvm.internal.L.f(this.f132851b, publicRatingDetailsLink.f132851b) && kotlin.jvm.internal.L.f(this.f132852c, publicRatingDetailsLink.f132852c) && kotlin.jvm.internal.L.f(this.f132853d, publicRatingDetailsLink.f132853d) && kotlin.jvm.internal.L.f(this.f132854e, publicRatingDetailsLink.f132854e) && kotlin.jvm.internal.L.f(this.f132855f, publicRatingDetailsLink.f132855f);
    }

    public final int hashCode() {
        int iHashCode = this.f132851b.hashCode() * 31;
        String str = this.f132852c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132853d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.f132854e;
        return this.f132855f.hashCode() + ((iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicRatingDetailsLink(userKey=");
        sb2.append(this.f132851b);
        sb2.append(", contextId=");
        sb2.append(this.f132852c);
        sb2.append(", srcRole=");
        sb2.append(this.f132853d);
        sb2.append(", fromItem=");
        sb2.append(this.f132854e);
        sb2.append(", queryMap=");
        return androidx.compose.foundation.H.n(sb2, this.f132855f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132851b);
        parcel.writeString(this.f132852c);
        parcel.writeString(this.f132853d);
        Long l12 = this.f132854e;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f132855f, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
