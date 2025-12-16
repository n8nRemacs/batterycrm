package com.avito.android.mortgage.landing.list.items.offers.payload;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.offers.offer.OfferItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OffersPayload.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/payload/a;", "", "a", "b", "c", "d", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$c;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: OffersPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.list.items.offers.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5907a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f199872a;

        public C5907a(boolean z12) {
            this.f199872a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5907a) && this.f199872a == ((C5907a) obj).f199872a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199872a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("MkbBannerChangePayload(isVisible="), this.f199872a, ')');
        }
    }

    /* compiled from: OffersPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f199873a;

        public b(boolean z12) {
            this.f199873a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f199873a == ((b) obj).f199873a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199873a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OffersButtonChangePayload(isLoading="), this.f199873a, ')');
        }
    }

    /* compiled from: OffersPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$c;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<OfferItem> f199874a;

        public c(@k List<OfferItem> list) {
            this.f199874a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f199874a, ((c) obj).f199874a);
        }

        public final int hashCode() {
            return this.f199874a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OffersChangePayload(items="), this.f199874a, ')');
        }
    }

    /* compiled from: OffersPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/payload/a$d;", "Lcom/avito/android/mortgage/landing/list/items/offers/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f199875a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f199876b;

        public d(boolean z12, boolean z13) {
            this.f199875a = z12;
            this.f199876b = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f199875a == dVar.f199875a && this.f199876b == dVar.f199876b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199876b) + (Boolean.hashCode(this.f199875a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OffersStateChangePayload(isLoading=");
            sb2.append(this.f199875a);
            sb2.append(", isEmpty=");
            return r.x(sb2, this.f199876b, ')');
        }
    }
}
