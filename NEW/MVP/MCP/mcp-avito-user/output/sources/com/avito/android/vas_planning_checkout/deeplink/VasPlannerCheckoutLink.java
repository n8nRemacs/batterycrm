package com.avito.android.vas_planning_checkout.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: VasPlannerCheckoutLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/deeplink/VasPlannerCheckoutLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VasPlannerCheckoutLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<VasPlannerCheckoutLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322820b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f322821c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f322822d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f322823e;

    /* compiled from: VasPlannerCheckoutLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlannerCheckoutLink> {
        @Override // android.os.Parcelable.Creator
        public final VasPlannerCheckoutLink createFromParcel(Parcel parcel) {
            return new VasPlannerCheckoutLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlannerCheckoutLink[] newArray(int i12) {
            return new VasPlannerCheckoutLink[i12];
        }
    }

    public VasPlannerCheckoutLink(@k String str, @k String str2, boolean z12, @k String str3) {
        this.f322820b = str;
        this.f322821c = str2;
        this.f322822d = z12;
        this.f322823e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322820b);
        parcel.writeString(this.f322821c);
        parcel.writeInt(this.f322822d ? 1 : 0);
        parcel.writeString(this.f322823e);
    }
}
