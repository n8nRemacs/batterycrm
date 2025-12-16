package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: StrPayoutInitLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/StrPayoutInitLink;", "Lcom/avito/android/deep_linking/links/PayoutLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class StrPayoutInitLink extends PayoutLink {

    @Y61.k
    public static final Parcelable.Creator<StrPayoutInitLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133693b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133694c;

    /* compiled from: StrPayoutInitLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrPayoutInitLink> {
        @Override // android.os.Parcelable.Creator
        public final StrPayoutInitLink createFromParcel(Parcel parcel) {
            return new StrPayoutInitLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StrPayoutInitLink[] newArray(int i12) {
            return new StrPayoutInitLink[i12];
        }
    }

    public /* synthetic */ StrPayoutInitLink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.deep_linking.links.PayoutLink
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF133693b() {
        return this.f133693b;
    }

    @Override // com.avito.android.deep_linking.links.PayoutLink
    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getF133694c() {
        return this.f133694c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133693b);
        parcel.writeString(this.f133694c);
    }

    public StrPayoutInitLink(@Y61.k String str, @Y61.l String str2) {
        this.f133693b = str;
        this.f133694c = str2;
    }
}
