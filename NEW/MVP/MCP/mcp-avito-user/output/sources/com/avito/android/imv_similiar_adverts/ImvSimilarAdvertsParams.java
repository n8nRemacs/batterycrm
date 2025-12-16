package com.avito.android.imv_similiar_adverts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvSimilarAdvertsParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/ImvSimilarAdvertsParams;", "Lcom/avito/android/util/OpenParams;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvSimilarAdvertsParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<ImvSimilarAdvertsParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f170847c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f170848d;

    /* renamed from: e, reason: collision with root package name */
    public final long f170849e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f170850f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f170851g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Long f170852h;

    /* compiled from: ImvSimilarAdvertsParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvSimilarAdvertsParams> {
        @Override // android.os.Parcelable.Creator
        public final ImvSimilarAdvertsParams createFromParcel(Parcel parcel) {
            return new ImvSimilarAdvertsParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvSimilarAdvertsParams[] newArray(int i12) {
            return new ImvSimilarAdvertsParams[i12];
        }
    }

    public ImvSimilarAdvertsParams(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k String str4, @Y61.l Long l12, @Y61.l Long l13) {
        this.f170846b = str;
        this.f170847c = str2;
        this.f170848d = str3;
        this.f170849e = j12;
        this.f170850f = str4;
        this.f170851g = l12;
        this.f170852h = l13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvSimilarAdvertsParams)) {
            return false;
        }
        ImvSimilarAdvertsParams imvSimilarAdvertsParams = (ImvSimilarAdvertsParams) obj;
        return L.f(this.f170846b, imvSimilarAdvertsParams.f170846b) && L.f(this.f170847c, imvSimilarAdvertsParams.f170847c) && L.f(this.f170848d, imvSimilarAdvertsParams.f170848d) && this.f170849e == imvSimilarAdvertsParams.f170849e && L.f(this.f170850f, imvSimilarAdvertsParams.f170850f) && L.f(this.f170851g, imvSimilarAdvertsParams.f170851g) && L.f(this.f170852h, imvSimilarAdvertsParams.f170852h);
    }

    public final int hashCode() {
        int iD2 = H.d(androidx.appcompat.app.r.g(H.d(H.d(this.f170846b.hashCode() * 31, 31, this.f170847c), 31, this.f170848d), 31, this.f170849e), 31, this.f170850f);
        Long l12 = this.f170851g;
        int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f170852h;
        return iHashCode + (l13 != null ? l13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvSimilarAdvertsParams(requestPath=");
        sb2.append(this.f170846b);
        sb2.append(", params=");
        sb2.append(this.f170847c);
        sb2.append(", fromPage=");
        sb2.append(this.f170848d);
        sb2.append(", itemsCount=");
        sb2.append(this.f170849e);
        sb2.append(", esid=");
        sb2.append(this.f170850f);
        sb2.append(", categoryId=");
        sb2.append(this.f170851g);
        sb2.append(", iid=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f170852h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170846b);
        parcel.writeString(this.f170847c);
        parcel.writeString(this.f170848d);
        parcel.writeLong(this.f170849e);
        parcel.writeString(this.f170850f);
        Long l12 = this.f170851g;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f170852h;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
    }
}
