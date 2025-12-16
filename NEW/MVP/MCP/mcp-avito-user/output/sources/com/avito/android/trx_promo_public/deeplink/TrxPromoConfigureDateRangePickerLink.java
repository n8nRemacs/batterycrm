package com.avito.android.trx_promo_public.deeplink;

import AK.c;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TrxPromoConfigureDateRangePickerLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TrxPromoConfigureDateRangePickerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TrxPromoConfigureDateRangePickerLinkContent f304497b;

    /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoConfigureDateRangePickerLink> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureDateRangePickerLink createFromParcel(Parcel parcel) {
            return new TrxPromoConfigureDateRangePickerLink(TrxPromoConfigureDateRangePickerLinkContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureDateRangePickerLink[] newArray(int i12) {
            return new TrxPromoConfigureDateRangePickerLink[i12];
        }
    }

    /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b$a;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b$b;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b$a;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f304498b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -775044571;
            }

            @k
            public final String toString() {
                return "Cancelled";
            }
        }

        /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b$b;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLink$b;", "LJu/c$b;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.trx_promo_public.deeplink.TrxPromoConfigureDateRangePickerLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9351b extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final LocalDate f304499b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final LocalDate f304500c;

            public C9351b(@k LocalDate localDate, @k LocalDate localDate2) {
                super(null);
                this.f304499b = localDate;
                this.f304500c = localDate2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9351b)) {
                    return false;
                }
                C9351b c9351b = (C9351b) obj;
                return L.f(this.f304499b, c9351b.f304499b) && L.f(this.f304500c, c9351b.f304500c);
            }

            public final int hashCode() {
                return this.f304500c.hashCode() + (this.f304499b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(dateFrom=");
                sb2.append(this.f304499b);
                sb2.append(", dateTo=");
                return c.t(sb2, this.f304500c, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TrxPromoConfigureDateRangePickerLink(@k TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent) {
        this.f304497b = trxPromoConfigureDateRangePickerLinkContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrxPromoConfigureDateRangePickerLink) && L.f(this.f304497b, ((TrxPromoConfigureDateRangePickerLink) obj).f304497b);
    }

    public final int hashCode() {
        return this.f304497b.hashCode();
    }

    @k
    public final String toString() {
        return "TrxPromoConfigureDateRangePickerLink(content=" + this.f304497b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f304497b.writeToParcel(parcel, i12);
    }
}
