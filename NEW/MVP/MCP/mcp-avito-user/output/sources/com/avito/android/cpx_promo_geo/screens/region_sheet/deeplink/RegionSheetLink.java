package com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.screens.region_sheet.RegionSheetData;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RegionSheetLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class RegionSheetLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RegionSheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f128250b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f128251c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RegionSheetData f128252d;

    /* compiled from: RegionSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionSheetLink> {
        @Override // android.os.Parcelable.Creator
        public final RegionSheetLink createFromParcel(Parcel parcel) {
            return new RegionSheetLink(parcel.readString(), parcel.readString(), RegionSheetData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RegionSheetLink[] newArray(int i12) {
            return new RegionSheetLink[i12];
        }
    }

    /* compiled from: RegionSheetLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b$a;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b$b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: RegionSheetLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b$a;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f128253b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2116497642;
            }

            @k
            public final String toString() {
                return "Cancelled";
            }
        }

        /* compiled from: RegionSheetLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b$b;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink$b;", "LJu/c$b;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.RegionSheetLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3804b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<Long> f128254b;

            public C3804b(@k List<Long> list) {
                super(null);
                this.f128254b = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3804b) && L.f(this.f128254b, ((C3804b) obj).f128254b);
            }

            public final int hashCode() {
                return this.f128254b.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Success(selectedIds="), this.f128254b, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public RegionSheetLink(@k String str, @k String str2, @k RegionSheetData regionSheetData) {
        this.f128250b = str;
        this.f128251c = str2;
        this.f128252d = regionSheetData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f128250b);
        parcel.writeString(this.f128251c);
        this.f128252d.writeToParcel(parcel, i12);
    }
}
