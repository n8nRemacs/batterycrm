package com.avito.android.gig_apply;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: GigSlotDeeplink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/GigSlotDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_slot-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigSlotDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigSlotDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f159519b;

    /* compiled from: GigSlotDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigSlotDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigSlotDeeplink createFromParcel(Parcel parcel) {
            return new GigSlotDeeplink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GigSlotDeeplink[] newArray(int i12) {
            return new GigSlotDeeplink[i12];
        }
    }

    public GigSlotDeeplink(long j12) {
        this.f159519b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f159519b);
    }
}
