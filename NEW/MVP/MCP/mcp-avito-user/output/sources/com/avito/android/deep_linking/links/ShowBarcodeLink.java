package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ShowBarcodeLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ShowBarcodeLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ShowBarcodeLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ShowBarcodeLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133660c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133661d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133662e;

    /* compiled from: ShowBarcodeLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShowBarcodeLink> {
        @Override // android.os.Parcelable.Creator
        public final ShowBarcodeLink createFromParcel(Parcel parcel) {
            return new ShowBarcodeLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShowBarcodeLink[] newArray(int i12) {
            return new ShowBarcodeLink[i12];
        }
    }

    /* compiled from: ShowBarcodeLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ShowBarcodeLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f133663b = new b();
    }

    public ShowBarcodeLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f133659b = str;
        this.f133660c = str2;
        this.f133661d = str3;
        this.f133662e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowBarcodeLink)) {
            return false;
        }
        ShowBarcodeLink showBarcodeLink = (ShowBarcodeLink) obj;
        return kotlin.jvm.internal.L.f(this.f133659b, showBarcodeLink.f133659b) && kotlin.jvm.internal.L.f(this.f133660c, showBarcodeLink.f133660c) && kotlin.jvm.internal.L.f(this.f133661d, showBarcodeLink.f133661d) && kotlin.jvm.internal.L.f(this.f133662e, showBarcodeLink.f133662e);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133659b.hashCode() * 31, 31, this.f133660c);
        String str = this.f133661d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133662e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowBarcodeLink(contents=");
        sb2.append(this.f133659b);
        sb2.append(", barcodeFormat=");
        sb2.append(this.f133660c);
        sb2.append(", text=");
        sb2.append(this.f133661d);
        sb2.append(", providerLabel=");
        return C22026a.c(sb2, this.f133662e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133659b);
        parcel.writeString(this.f133660c);
        parcel.writeString(this.f133661d);
        parcel.writeString(this.f133662e);
    }
}
