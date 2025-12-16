package com.avito.android.messenger.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: IacSellerChannelCallLink.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/IacSellerChannelCallLinkV2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "LLL/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class IacSellerChannelCallLinkV2 extends DeepLink implements Parcelable, LL.a {

    @Y61.k
    public static final Parcelable.Creator<IacSellerChannelCallLinkV2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f195350b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f195351c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f195352d;

    /* compiled from: IacSellerChannelCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacSellerChannelCallLinkV2> {
        @Override // android.os.Parcelable.Creator
        public final IacSellerChannelCallLinkV2 createFromParcel(Parcel parcel) {
            return new IacSellerChannelCallLinkV2(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacSellerChannelCallLinkV2[] newArray(int i12) {
            return new IacSellerChannelCallLinkV2[i12];
        }
    }

    public IacSellerChannelCallLinkV2(boolean z12, boolean z13, boolean z14) {
        this.f195350b = z12;
        this.f195351c = z13;
        this.f195352d = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacSellerChannelCallLinkV2)) {
            return false;
        }
        IacSellerChannelCallLinkV2 iacSellerChannelCallLinkV2 = (IacSellerChannelCallLinkV2) obj;
        return this.f195350b == iacSellerChannelCallLinkV2.f195350b && this.f195351c == iacSellerChannelCallLinkV2.f195351c && this.f195352d == iacSellerChannelCallLinkV2.f195352d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195352d) + androidx.appcompat.app.r.i(Boolean.hashCode(this.f195350b) * 31, 31, this.f195351c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacSellerChannelCallLinkV2(skipCallOptions=");
        sb2.append(this.f195350b);
        sb2.append(", isIacOnly=");
        sb2.append(this.f195351c);
        sb2.append(", isVideo=");
        return androidx.appcompat.app.r.x(sb2, this.f195352d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f195350b ? 1 : 0);
        parcel.writeInt(this.f195351c ? 1 : 0);
        parcel.writeInt(this.f195352d ? 1 : 0);
    }
}
