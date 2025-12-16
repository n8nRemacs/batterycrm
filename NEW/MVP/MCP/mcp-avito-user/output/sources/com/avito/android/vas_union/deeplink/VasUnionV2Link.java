package com.avito.android.vas_union.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: VasUnionLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/deeplink/VasUnionV2Link;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-union_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VasUnionV2Link extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<VasUnionV2Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323128c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f323129d;

    /* compiled from: VasUnionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasUnionV2Link> {
        @Override // android.os.Parcelable.Creator
        public final VasUnionV2Link createFromParcel(Parcel parcel) {
            return new VasUnionV2Link(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VasUnionV2Link[] newArray(int i12) {
            return new VasUnionV2Link[i12];
        }
    }

    public VasUnionV2Link(@k String str, @k String str2, boolean z12) {
        this.f323127b = str;
        this.f323128c = str2;
        this.f323129d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f323127b);
        parcel.writeString(this.f323128c);
        parcel.writeInt(this.f323129d ? 1 : 0);
    }
}
