package com.avito.android.gig_apply;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: GigSlotMapDeeplink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/GigSlotMapDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigSlotMapDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigSlotMapDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f159520b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f159521c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Double f159522d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Double f159523e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f159524f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f159525g;

    /* compiled from: GigSlotMapDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigSlotMapDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigSlotMapDeeplink createFromParcel(Parcel parcel) {
            return new GigSlotMapDeeplink(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), (DeepLink) parcel.readParcelable(GigSlotMapDeeplink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigSlotMapDeeplink[] newArray(int i12) {
            return new GigSlotMapDeeplink[i12];
        }
    }

    public GigSlotMapDeeplink(@l String str, @l String str2, @l Double d12, @l Double d13, @l String str3, @l DeepLink deepLink) {
        this.f159520b = str;
        this.f159521c = str2;
        this.f159522d = d12;
        this.f159523e = d13;
        this.f159524f = str3;
        this.f159525g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f159520b);
        parcel.writeString(this.f159521c);
        Double d12 = this.f159522d;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f159523e;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
        parcel.writeString(this.f159524f);
        parcel.writeParcelable(this.f159525g, i12);
    }
}
