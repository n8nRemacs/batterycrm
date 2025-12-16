package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: HelpCenterUrlShowLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/HelpCenterUrlShowLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class HelpCenterUrlShowLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<HelpCenterUrlShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133352b;

    /* compiled from: HelpCenterUrlShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HelpCenterUrlShowLink> {
        @Override // android.os.Parcelable.Creator
        public final HelpCenterUrlShowLink createFromParcel(Parcel parcel) {
            return new HelpCenterUrlShowLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HelpCenterUrlShowLink[] newArray(int i12) {
            return new HelpCenterUrlShowLink[i12];
        }
    }

    public HelpCenterUrlShowLink(@Y61.k String str) {
        this.f133352b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpCenterUrlShowLink) && kotlin.jvm.internal.L.f(this.f133352b, ((HelpCenterUrlShowLink) obj).f133352b);
    }

    public final int hashCode() {
        return this.f133352b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("HelpCenterUrlShowLink(url="), this.f133352b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133352b);
    }
}
