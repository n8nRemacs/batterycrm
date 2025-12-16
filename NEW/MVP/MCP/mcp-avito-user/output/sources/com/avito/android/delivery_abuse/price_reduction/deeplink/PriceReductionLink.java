package com.avito.android.delivery_abuse.price_reduction.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PriceReductionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_delivery-abuse_price-reduction_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PriceReductionLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PriceReductionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f134783b;

    /* renamed from: c, reason: collision with root package name */
    public final long f134784c;

    /* renamed from: d, reason: collision with root package name */
    public final long f134785d;

    /* compiled from: PriceReductionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceReductionLink> {
        @Override // android.os.Parcelable.Creator
        public final PriceReductionLink createFromParcel(Parcel parcel) {
            return new PriceReductionLink(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceReductionLink[] newArray(int i12) {
            return new PriceReductionLink[i12];
        }
    }

    /* compiled from: PriceReductionLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b$a;", "Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b$b;", "_avito_delivery-abuse_price-reduction_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: PriceReductionLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b$a;", "Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b;", "<init>", "()V", "_avito_delivery-abuse_price-reduction_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f134786b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -783336272;
            }

            @k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: PriceReductionLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b$b;", "Lcom/avito/android/delivery_abuse/price_reduction/deeplink/PriceReductionLink$b;", "_avito_delivery-abuse_price-reduction_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4066b extends b {

            /* renamed from: b, reason: collision with root package name */
            public final long f134787b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f134788c;

            public C4066b(long j12, boolean z12) {
                super(null);
                this.f134787b = j12;
                this.f134788c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4066b)) {
                    return false;
                }
                C4066b c4066b = (C4066b) obj;
                return this.f134787b == c4066b.f134787b && this.f134788c == c4066b.f134788c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f134788c) + (Long.hashCode(this.f134787b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SelectPrice(price=");
                sb2.append(this.f134787b);
                sb2.append(", isNew=");
                return r.x(sb2, this.f134788c, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public PriceReductionLink(long j12, long j13, long j14) {
        this.f134783b = j12;
        this.f134784c = j13;
        this.f134785d = j14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f134783b);
        parcel.writeLong(this.f134784c);
        parcel.writeLong(this.f134785d);
    }
}
