package com.avito.android.services_realty_sheet.link;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServicesRealtySheetLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_realty_sheet/link/ServicesRealtySheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_services-realty-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServicesRealtySheetLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServicesRealtySheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f280418b;

    /* renamed from: c, reason: collision with root package name */
    public final double f280419c;

    /* renamed from: d, reason: collision with root package name */
    public final double f280420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f280421e;

    /* compiled from: ServicesRealtySheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesRealtySheetLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesRealtySheetLink createFromParcel(Parcel parcel) {
            return new ServicesRealtySheetLink(parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesRealtySheetLink[] newArray(int i12) {
            return new ServicesRealtySheetLink[i12];
        }
    }

    public ServicesRealtySheetLink(double d12, double d13, int i12, int i13) {
        this.f280418b = i12;
        this.f280419c = d12;
        this.f280420d = d13;
        this.f280421e = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesRealtySheetLink)) {
            return false;
        }
        ServicesRealtySheetLink servicesRealtySheetLink = (ServicesRealtySheetLink) obj;
        return this.f280418b == servicesRealtySheetLink.f280418b && Double.compare(this.f280419c, servicesRealtySheetLink.f280419c) == 0 && Double.compare(this.f280420d, servicesRealtySheetLink.f280420d) == 0 && this.f280421e == servicesRealtySheetLink.f280421e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f280421e) + androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d(Integer.hashCode(this.f280418b) * 31, 31, this.f280419c), 31, this.f280420d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesRealtySheetLink(priceForMeter=");
        sb2.append(this.f280418b);
        sb2.append(", square=");
        sb2.append(this.f280419c);
        sb2.append(", serviceRatio=");
        sb2.append(this.f280420d);
        sb2.append(", totalPriceWithMaterials=");
        return r.t(sb2, this.f280421e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f280418b);
        parcel.writeDouble(this.f280419c);
        parcel.writeDouble(this.f280420d);
        parcel.writeInt(this.f280421e);
    }
}
