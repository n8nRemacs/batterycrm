package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ImvSimilarAdvertsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ImvSimilarAdvertsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ImvSimilarAdvertsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ImvSimilarAdvertsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133364b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133365c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133366d;

    /* renamed from: e, reason: collision with root package name */
    public final long f133367e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f133368f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Long f133369g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Long f133370h;

    /* compiled from: ImvSimilarAdvertsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvSimilarAdvertsLink> {
        @Override // android.os.Parcelable.Creator
        public final ImvSimilarAdvertsLink createFromParcel(Parcel parcel) {
            return new ImvSimilarAdvertsLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvSimilarAdvertsLink[] newArray(int i12) {
            return new ImvSimilarAdvertsLink[i12];
        }
    }

    public ImvSimilarAdvertsLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k String str4, @Y61.l Long l12, @Y61.l Long l13) {
        this.f133364b = str;
        this.f133365c = str2;
        this.f133366d = str3;
        this.f133367e = j12;
        this.f133368f = str4;
        this.f133369g = l12;
        this.f133370h = l13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133364b);
        parcel.writeString(this.f133365c);
        parcel.writeString(this.f133366d);
        parcel.writeLong(this.f133367e);
        parcel.writeString(this.f133368f);
        Long l12 = this.f133369g;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f133370h;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
    }
}
