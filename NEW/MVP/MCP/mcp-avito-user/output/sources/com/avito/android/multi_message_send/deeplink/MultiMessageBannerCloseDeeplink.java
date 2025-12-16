package com.avito.android.multi_message_send.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: MultiMessageBannerCloseDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/deeplink/MultiMessageBannerCloseDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_multi-message-send_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class MultiMessageBannerCloseDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<MultiMessageBannerCloseDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f206619b;

    /* compiled from: MultiMessageBannerCloseDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiMessageBannerCloseDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final MultiMessageBannerCloseDeeplink createFromParcel(Parcel parcel) {
            return new MultiMessageBannerCloseDeeplink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMessageBannerCloseDeeplink[] newArray(int i12) {
            return new MultiMessageBannerCloseDeeplink[i12];
        }
    }

    public MultiMessageBannerCloseDeeplink(long j12) {
        this.f206619b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiMessageBannerCloseDeeplink) && this.f206619b == ((MultiMessageBannerCloseDeeplink) obj).f206619b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f206619b);
    }

    @k
    public final String toString() {
        return r.u(new StringBuilder("MultiMessageBannerCloseDeeplink(itemId="), this.f206619b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f206619b);
    }
}
