package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MallMainLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/MallMainLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class MallMainLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<MallMainLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133434b;

    /* compiled from: MallMainLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MallMainLink> {
        @Override // android.os.Parcelable.Creator
        public final MallMainLink createFromParcel(Parcel parcel) {
            return new MallMainLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MallMainLink[] newArray(int i12) {
            return new MallMainLink[i12];
        }
    }

    public MallMainLink(@Y61.l String str) {
        this.f133434b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MallMainLink) && kotlin.jvm.internal.L.f(this.f133434b, ((MallMainLink) obj).f133434b);
    }

    public final int hashCode() {
        String str = this.f133434b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("MallMainLink(from_page="), this.f133434b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133434b);
    }
}
