package com.avito.android.comfortable_deal.common.view.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientCardData.kt */
@F3
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/common/view/client/ClientCardData;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ClientCardData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ClientCardData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f120636b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Image f120637c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f120638d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f120639e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RealtyData f120640f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f120641g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DeepLink f120642h;

    /* compiled from: ClientCardData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientCardData> {
        @Override // android.os.Parcelable.Creator
        public final ClientCardData createFromParcel(Parcel parcel) {
            return new ClientCardData(parcel.readString(), (Image) parcel.readParcelable(ClientCardData.class.getClassLoader()), parcel.readString(), parcel.readString(), RealtyData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(ClientCardData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClientCardData[] newArray(int i12) {
            return new ClientCardData[i12];
        }
    }

    public ClientCardData(@Y61.k String str, @Y61.l Image image, @Y61.k String str2, @Y61.l String str3, @Y61.k RealtyData realtyData, boolean z12, @Y61.k DeepLink deepLink) {
        this.f120636b = str;
        this.f120637c = image;
        this.f120638d = str2;
        this.f120639e = str3;
        this.f120640f = realtyData;
        this.f120641g = z12;
        this.f120642h = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientCardData)) {
            return false;
        }
        ClientCardData clientCardData = (ClientCardData) obj;
        return L.f(this.f120636b, clientCardData.f120636b) && L.f(this.f120637c, clientCardData.f120637c) && L.f(this.f120638d, clientCardData.f120638d) && L.f(this.f120639e, clientCardData.f120639e) && L.f(this.f120640f, clientCardData.f120640f) && this.f120641g == clientCardData.f120641g && L.f(this.f120642h, clientCardData.f120642h);
    }

    public final int hashCode() {
        int iHashCode = this.f120636b.hashCode() * 31;
        Image image = this.f120637c;
        int iD2 = H.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f120638d);
        String str = this.f120639e;
        return this.f120642h.hashCode() + androidx.appcompat.app.r.i((this.f120640f.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f120641g);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientCardData(id=");
        sb2.append(this.f120636b);
        sb2.append(", avatar=");
        sb2.append(this.f120637c);
        sb2.append(", name=");
        sb2.append(this.f120638d);
        sb2.append(", phone=");
        sb2.append(this.f120639e);
        sb2.append(", realty=");
        sb2.append(this.f120640f);
        sb2.append(", isRefused=");
        sb2.append(this.f120641g);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f120642h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f120636b);
        parcel.writeParcelable(this.f120637c, i12);
        parcel.writeString(this.f120638d);
        parcel.writeString(this.f120639e);
        this.f120640f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f120641g ? 1 : 0);
        parcel.writeParcelable(this.f120642h, i12);
    }
}
