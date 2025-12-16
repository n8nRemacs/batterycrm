package com.avito.android.developments_agency_search.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCardRegionSelectorLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class TariffCardRegionSelectorLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCardRegionSelectorLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f136394b;

    /* compiled from: TariffCardRegionSelectorLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCardRegionSelectorLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCardRegionSelectorLink createFromParcel(Parcel parcel) {
            return new TariffCardRegionSelectorLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCardRegionSelectorLink[] newArray(int i12) {
            return new TariffCardRegionSelectorLink[i12];
        }
    }

    /* compiled from: TariffCardRegionSelectorLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink$b;", "LJu/c$b;", "a", "Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink$b$a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: TariffCardRegionSelectorLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink$b$a;", "Lcom/avito/android/developments_agency_search/deeplink/TariffCardRegionSelectorLink$b;", "LJu/a$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f136395b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f136396c;

            public a(@Y61.k String str, @Y61.k String str2) {
                this.f136395b = str;
                this.f136396c = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f136395b, aVar.f136395b) && kotlin.jvm.internal.L.f(this.f136396c, aVar.f136396c);
            }

            public final int hashCode() {
                return this.f136396c.hashCode() + (this.f136395b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LocationSelected(locationId=");
                sb2.append(this.f136395b);
                sb2.append(", locationName=");
                return C22026a.c(sb2, this.f136396c, ')');
            }
        }
    }

    public TariffCardRegionSelectorLink(@Y61.k String str) {
        this.f136394b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCardRegionSelectorLink) && kotlin.jvm.internal.L.f(this.f136394b, ((TariffCardRegionSelectorLink) obj).f136394b);
    }

    public final int hashCode() {
        return this.f136394b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("TariffCardRegionSelectorLink(locationId="), this.f136394b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136394b);
    }
}
