package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ImvCarsDetailsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ImvCarsDetailsLinkV2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ImvCarsDetailsLinkV2 extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ImvCarsDetailsLinkV2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133354b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133355c;

    /* compiled from: ImvCarsDetailsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsDetailsLinkV2> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsLinkV2 createFromParcel(Parcel parcel) {
            return new ImvCarsDetailsLinkV2(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsDetailsLinkV2[] newArray(int i12) {
            return new ImvCarsDetailsLinkV2[i12];
        }
    }

    public ImvCarsDetailsLinkV2(@Y61.k String str, @Y61.k String str2) {
        this.f133354b = str;
        this.f133355c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvCarsDetailsLinkV2)) {
            return false;
        }
        ImvCarsDetailsLinkV2 imvCarsDetailsLinkV2 = (ImvCarsDetailsLinkV2) obj;
        return kotlin.jvm.internal.L.f(this.f133354b, imvCarsDetailsLinkV2.f133354b) && kotlin.jvm.internal.L.f(this.f133355c, imvCarsDetailsLinkV2.f133355c);
    }

    public final int hashCode() {
        return this.f133355c.hashCode() + (this.f133354b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvCarsDetailsLinkV2(imvId=");
        sb2.append(this.f133354b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f133355c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133354b);
        parcel.writeString(this.f133355c);
    }
}
