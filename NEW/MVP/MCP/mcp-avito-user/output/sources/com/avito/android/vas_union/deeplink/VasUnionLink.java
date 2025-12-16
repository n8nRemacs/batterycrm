package com.avito.android.vas_union.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: VasUnionLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/deeplink/VasUnionLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-union_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VasUnionLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<VasUnionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323124b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f323125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f323126d;

    /* compiled from: VasUnionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasUnionLink> {
        @Override // android.os.Parcelable.Creator
        public final VasUnionLink createFromParcel(Parcel parcel) {
            return new VasUnionLink(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasUnionLink[] newArray(int i12) {
            return new VasUnionLink[i12];
        }
    }

    public VasUnionLink(@k String str, boolean z12, @k String str2) {
        this.f323124b = str;
        this.f323125c = z12;
        this.f323126d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f323124b);
        parcel.writeInt(this.f323125c ? 1 : 0);
        parcel.writeString(this.f323126d);
    }
}
