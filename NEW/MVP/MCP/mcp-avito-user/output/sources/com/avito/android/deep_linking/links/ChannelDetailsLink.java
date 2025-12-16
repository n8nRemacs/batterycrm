package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ChannelDetailsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelDetailsLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ChannelDetailsLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<ChannelDetailsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133098b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133099c;

    /* compiled from: ChannelDetailsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelDetailsLink> {
        @Override // android.os.Parcelable.Creator
        public final ChannelDetailsLink createFromParcel(Parcel parcel) {
            return new ChannelDetailsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelDetailsLink[] newArray(int i12) {
            return new ChannelDetailsLink[i12];
        }
    }

    public ChannelDetailsLink(@Y61.k String str, @Y61.l String str2) {
        this.f133098b = str;
        this.f133099c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelDetailsLink)) {
            return false;
        }
        ChannelDetailsLink channelDetailsLink = (ChannelDetailsLink) obj;
        return kotlin.jvm.internal.L.f(this.f133098b, channelDetailsLink.f133098b) && kotlin.jvm.internal.L.f(this.f133099c, channelDetailsLink.f133099c);
    }

    public final int hashCode() {
        int iHashCode = this.f133098b.hashCode() * 31;
        String str = this.f133099c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelDetailsLink(channelId=");
        sb2.append(this.f133098b);
        sb2.append(", flowId=");
        return C22026a.c(sb2, this.f133099c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133098b);
        parcel.writeString(this.f133099c);
    }

    public /* synthetic */ ChannelDetailsLink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
