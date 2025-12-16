package com.avito.android.vas_planning.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: VasPlannerLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/deeplink/VasPlannerLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VasPlannerLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<VasPlannerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322247b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f322248c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f322249d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f322250e;

    /* compiled from: VasPlannerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlannerLink> {
        @Override // android.os.Parcelable.Creator
        public final VasPlannerLink createFromParcel(Parcel parcel) {
            return new VasPlannerLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlannerLink[] newArray(int i12) {
            return new VasPlannerLink[i12];
        }
    }

    public VasPlannerLink(@k String str, @k String str2, boolean z12, @k String str3) {
        this.f322247b = str;
        this.f322248c = str2;
        this.f322249d = z12;
        this.f322250e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322247b);
        parcel.writeString(this.f322248c);
        parcel.writeInt(this.f322249d ? 1 : 0);
        parcel.writeString(this.f322250e);
    }
}
