package com.avito.android.freemium.screens.rules.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: FreemiumRulesLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/freemium/screens/rules/deeplink/FreemiumRulesLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class FreemiumRulesLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<FreemiumRulesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f159074b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f159075c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f159076d;

    /* compiled from: FreemiumRulesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FreemiumRulesLink> {
        @Override // android.os.Parcelable.Creator
        public final FreemiumRulesLink createFromParcel(Parcel parcel) {
            return new FreemiumRulesLink(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FreemiumRulesLink[] newArray(int i12) {
            return new FreemiumRulesLink[i12];
        }
    }

    public FreemiumRulesLink(long j12, @k String str, @l String str2) {
        this.f159074b = j12;
        this.f159075c = str;
        this.f159076d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f159074b);
        parcel.writeString(this.f159075c);
        parcel.writeString(this.f159076d);
    }
}
