package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ChannelMapLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelMapLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ChannelMapLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<ChannelMapLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133102d;

    /* compiled from: ChannelMapLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelMapLink> {
        @Override // android.os.Parcelable.Creator
        public final ChannelMapLink createFromParcel(Parcel parcel) {
            return new ChannelMapLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelMapLink[] newArray(int i12) {
            return new ChannelMapLink[i12];
        }
    }

    public ChannelMapLink(@Y61.l String str, @Y61.k String str2, @Y61.k String str3) {
        this.f133100b = str;
        this.f133101c = str2;
        this.f133102d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelMapLink)) {
            return false;
        }
        ChannelMapLink channelMapLink = (ChannelMapLink) obj;
        return kotlin.jvm.internal.L.f(this.f133100b, channelMapLink.f133100b) && kotlin.jvm.internal.L.f(this.f133101c, channelMapLink.f133101c) && kotlin.jvm.internal.L.f(this.f133102d, channelMapLink.f133102d);
    }

    public final int hashCode() {
        String str = this.f133100b;
        return this.f133102d.hashCode() + androidx.compose.foundation.H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f133101c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelMapLink(title=");
        sb2.append(this.f133100b);
        sb2.append(", method=");
        sb2.append(this.f133101c);
        sb2.append(", paramsJson=");
        return C22026a.c(sb2, this.f133102d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133100b);
        parcel.writeString(this.f133101c);
        parcel.writeString(this.f133102d);
    }
}
