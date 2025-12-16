package com.avito.android.mortgage.landing.list.items.offers.offer.payload;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.OfferBadge;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferPayload.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a;", "", "a", "b", "c", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: OfferPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a$a;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.list.items.offers.offer.payload.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5906a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<OfferBadge> f199868a;

        public C5906a(@k List<OfferBadge> list) {
            this.f199868a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5906a) && L.f(this.f199868a, ((C5906a) obj).f199868a);
        }

        public final int hashCode() {
            return this.f199868a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("BadgesPayload(badges="), this.f199868a, ')');
        }
    }

    /* compiled from: OfferPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a$b;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f199869a;

        public b(boolean z12) {
            this.f199869a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f199869a == ((b) obj).f199869a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f199869a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CheckedPayload(isChecked="), this.f199869a, ')');
        }
    }

    /* compiled from: OfferPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a$c;", "Lcom/avito/android/mortgage/landing/list/items/offers/offer/payload/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f199870a;

        public c(@k AttributedText attributedText) {
            this.f199870a = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f199870a, ((c) obj).f199870a);
        }

        public final int hashCode() {
            return this.f199870a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("SubtitlePayload(subtitle="), this.f199870a, ')');
        }
    }
}
