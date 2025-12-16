package com.avito.android.virtual_deal_room_reference_category.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ClientAddDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/deeplink/ClientAddDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_virtual-deal-room-reference-category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class ClientAddDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<ClientAddDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f327206b;

    /* compiled from: ClientAddDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientAddDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ClientAddDeeplink createFromParcel(Parcel parcel) {
            return new ClientAddDeeplink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClientAddDeeplink[] newArray(int i12) {
            return new ClientAddDeeplink[i12];
        }
    }

    public ClientAddDeeplink(boolean z12) {
        this.f327206b = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientAddDeeplink) && this.f327206b == ((ClientAddDeeplink) obj).f327206b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f327206b);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ClientAddDeeplink(isRoot="), this.f327206b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f327206b ? 1 : 0);
    }
}
