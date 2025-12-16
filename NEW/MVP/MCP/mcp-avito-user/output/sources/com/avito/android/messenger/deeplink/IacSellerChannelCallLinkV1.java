package com.avito.android.messenger.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: IacSellerChannelCallLink.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/IacSellerChannelCallLinkV1;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "LLL/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class IacSellerChannelCallLinkV1 extends DeepLink implements Parcelable, LL.a {

    @Y61.k
    public static final Parcelable.Creator<IacSellerChannelCallLinkV1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f195349b;

    /* compiled from: IacSellerChannelCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacSellerChannelCallLinkV1> {
        @Override // android.os.Parcelable.Creator
        public final IacSellerChannelCallLinkV1 createFromParcel(Parcel parcel) {
            return new IacSellerChannelCallLinkV1(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final IacSellerChannelCallLinkV1[] newArray(int i12) {
            return new IacSellerChannelCallLinkV1[i12];
        }
    }

    public IacSellerChannelCallLinkV1(boolean z12) {
        this.f195349b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacSellerChannelCallLinkV1) && this.f195349b == ((IacSellerChannelCallLinkV1) obj).f195349b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195349b);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.x(new StringBuilder("IacSellerChannelCallLinkV1(isIacOnly="), this.f195349b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f195349b ? 1 : 0);
    }
}
