package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: MyAdvertDetailsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertDetailsLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class MyAdvertDetailsLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<MyAdvertDetailsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133450b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f133451c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133452d;

    /* compiled from: MyAdvertDetailsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MyAdvertDetailsLink> {
        @Override // android.os.Parcelable.Creator
        public final MyAdvertDetailsLink createFromParcel(Parcel parcel) {
            return new MyAdvertDetailsLink(parcel.readString(), (DeepLink) parcel.readParcelable(MyAdvertDetailsLink.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MyAdvertDetailsLink[] newArray(int i12) {
            return new MyAdvertDetailsLink[i12];
        }
    }

    public /* synthetic */ MyAdvertDetailsLink(String str, DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyAdvertDetailsLink)) {
            return false;
        }
        MyAdvertDetailsLink myAdvertDetailsLink = (MyAdvertDetailsLink) obj;
        return kotlin.jvm.internal.L.f(this.f133450b, myAdvertDetailsLink.f133450b) && kotlin.jvm.internal.L.f(this.f133451c, myAdvertDetailsLink.f133451c) && this.f133452d == myAdvertDetailsLink.f133452d;
    }

    public final int hashCode() {
        int iHashCode = this.f133450b.hashCode() * 31;
        DeepLink deepLink = this.f133451c;
        return Boolean.hashCode(this.f133452d) + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MyAdvertDetailsLink(itemId=");
        sb2.append(this.f133450b);
        sb2.append(", invokeAction=");
        sb2.append(this.f133451c);
        sb2.append(", isNewAdvert=");
        return androidx.appcompat.app.r.x(sb2, this.f133452d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133450b);
        parcel.writeParcelable(this.f133451c, i12);
        parcel.writeInt(this.f133452d ? 1 : 0);
    }

    public MyAdvertDetailsLink(@Y61.k String str, @Y61.l DeepLink deepLink, boolean z12) {
        this.f133450b = str;
        this.f133451c = deepLink;
        this.f133452d = z12;
    }
}
