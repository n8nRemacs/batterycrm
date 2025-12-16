package com.avito.android.vas_performance.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PerformanceVasLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/PerformanceVasLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class PerformanceVasLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<PerformanceVasLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319861b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f319862c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319863d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f319864e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f319865f;

    /* compiled from: PerformanceVasLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PerformanceVasLink> {
        @Override // android.os.Parcelable.Creator
        public final PerformanceVasLink createFromParcel(Parcel parcel) {
            return new PerformanceVasLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PerformanceVasLink[] newArray(int i12) {
            return new PerformanceVasLink[i12];
        }
    }

    public PerformanceVasLink(@k String str, @k String str2, boolean z12, @k String str3, boolean z13) {
        this.f319861b = str;
        this.f319862c = str2;
        this.f319863d = z12;
        this.f319864e = str3;
        this.f319865f = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f319861b);
        parcel.writeString(this.f319862c);
        parcel.writeInt(this.f319863d ? 1 : 0);
        parcel.writeString(this.f319864e);
        parcel.writeInt(this.f319865f ? 1 : 0);
    }
}
