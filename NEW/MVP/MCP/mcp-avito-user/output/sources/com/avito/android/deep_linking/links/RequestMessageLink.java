package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RequestMessageLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/RequestMessageLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RequestMessageLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RequestMessageLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133636b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f133637c;

    /* compiled from: RequestMessageLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RequestMessageLink> {
        @Override // android.os.Parcelable.Creator
        public final RequestMessageLink createFromParcel(Parcel parcel) {
            return new RequestMessageLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RequestMessageLink[] newArray(int i12) {
            return new RequestMessageLink[i12];
        }
    }

    /* compiled from: RequestMessageLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/RequestMessageLink$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f133638b = new b();
    }

    public RequestMessageLink(@Y61.k String str, boolean z12) {
        this.f133636b = str;
        this.f133637c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestMessageLink)) {
            return false;
        }
        RequestMessageLink requestMessageLink = (RequestMessageLink) obj;
        return kotlin.jvm.internal.L.f(this.f133636b, requestMessageLink.f133636b) && this.f133637c == requestMessageLink.f133637c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133637c) + (this.f133636b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestMessageLink(itemId=");
        sb2.append(this.f133636b);
        sb2.append(", writeOffConfirmed=");
        return androidx.appcompat.app.r.x(sb2, this.f133637c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133636b);
        parcel.writeInt(this.f133637c ? 1 : 0);
    }
}
