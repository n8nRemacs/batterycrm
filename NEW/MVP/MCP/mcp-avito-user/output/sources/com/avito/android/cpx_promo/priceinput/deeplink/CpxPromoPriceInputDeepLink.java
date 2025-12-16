package com.avito.android.cpx_promo.priceinput.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CpxPromoPriceInputDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/deeplink/CpxPromoPriceInputDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CpxPromoPriceInputDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CpxPromoPriceInputDeepLink> CREATOR = new a();

    /* compiled from: CpxPromoPriceInputDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoPriceInputDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputDeepLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new CpxPromoPriceInputDeepLink();
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputDeepLink[] newArray(int i12) {
            return new CpxPromoPriceInputDeepLink[i12];
        }
    }

    /* compiled from: CpxPromoPriceInputDeepLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/deeplink/CpxPromoPriceInputDeepLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/cpx_promo/priceinput/deeplink/CpxPromoPriceInputDeepLink$b$a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CpxPromoPriceInputDeepLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/deeplink/CpxPromoPriceInputDeepLink$b$a;", "Lcom/avito/android/cpx_promo/priceinput/deeplink/CpxPromoPriceInputDeepLink$b;", "LJu/c$b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CpxPromoInputSource f127296b;

            /* renamed from: c, reason: collision with root package name */
            public final long f127297c;

            public a(@k CpxPromoInputSource cpxPromoInputSource, long j12) {
                super(null);
                this.f127296b = cpxPromoInputSource;
                this.f127297c = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f127296b == aVar.f127296b && this.f127297c == aVar.f127297c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f127297c) + (this.f127296b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(source=");
                sb2.append(this.f127296b);
                sb2.append(", selectedValue=");
                return r.u(sb2, this.f127297c, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
