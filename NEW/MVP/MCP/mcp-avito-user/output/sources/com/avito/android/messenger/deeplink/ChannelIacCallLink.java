package com.avito.android.messenger.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ChannelIacCallLink.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/ChannelIacCallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "LLL/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class ChannelIacCallLink extends DeepLink implements LL.a {

    @Y61.k
    public static final Parcelable.Creator<ChannelIacCallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f195316b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f195317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f195318d;

    /* compiled from: ChannelIacCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelIacCallLink> {
        @Override // android.os.Parcelable.Creator
        public final ChannelIacCallLink createFromParcel(Parcel parcel) {
            return new ChannelIacCallLink(parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(ChannelIacCallLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelIacCallLink[] newArray(int i12) {
            return new ChannelIacCallLink[i12];
        }
    }

    public ChannelIacCallLink(@Y61.k String str, boolean z12, @Y61.l DeepLink deepLink) {
        this.f195316b = str;
        this.f195317c = z12;
        this.f195318d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIacCallLink)) {
            return false;
        }
        ChannelIacCallLink channelIacCallLink = (ChannelIacCallLink) obj;
        return kotlin.jvm.internal.L.f(this.f195316b, channelIacCallLink.f195316b) && this.f195317c == channelIacCallLink.f195317c && kotlin.jvm.internal.L.f(this.f195318d, channelIacCallLink.f195318d);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(this.f195316b.hashCode() * 31, 31, this.f195317c);
        DeepLink deepLink = this.f195318d;
        return i12 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelIacCallLink(scenario=");
        sb2.append(this.f195316b);
        sb2.append(", skipCallOptions=");
        sb2.append(this.f195317c);
        sb2.append(", redirectLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f195318d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f195316b);
        parcel.writeInt(this.f195317c ? 1 : 0);
        parcel.writeParcelable(this.f195318d, i12);
    }
}
