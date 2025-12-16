package com.avito.android.short_term_rent.bookingform.mvi.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.short_term_rent.bookingform.mvi.entity.FooterButtonItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$b;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$c;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$d;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$e;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$f;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$g;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$h;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$i;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$k;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$l;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$m;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$n;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$o;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$q;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8401a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C8401a f281831a = new C8401a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C8401a);
        }

        public final int hashCode() {
            return -1274074926;
        }

        @Y61.k
        public final String toString() {
            return "BackNavigation";
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$b;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Date f281832a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Date f281833b;

        public b(@Y61.k Date date, @Y61.k Date date2) {
            this.f281832a = date;
            this.f281833b = date2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f281832a, bVar.f281832a) && L.f(this.f281833b, bVar.f281833b);
        }

        public final int hashCode() {
            return this.f281833b.hashCode() + (this.f281832a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateRangeChanged(checkInDate=");
            sb2.append(this.f281832a);
            sb2.append(", checkOutDate=");
            return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f281833b, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$c;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f281834a;

        public c(@Y61.k DeepLink deepLink) {
            this.f281834a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f281834a, ((c) obj).f281834a);
        }

        public final int hashCode() {
            return this.f281834a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deepLink="), this.f281834a, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$d;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f281835a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 366759685;
        }

        @Y61.k
        public final String toString() {
            return "ErrorButtonClick";
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$e;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FooterButtonItem.ActionType f281836a;

        public e(@Y61.k FooterButtonItem.ActionType actionType) {
            this.f281836a = actionType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f281836a == ((e) obj).f281836a;
        }

        public final int hashCode() {
            return this.f281836a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FooterButtonClick(actionType=" + this.f281836a + ')';
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$f;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f281837a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f281838b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Boolean f281839c;

        public f(int i12, @Y61.k ArrayList arrayList, @Y61.l Boolean bool) {
            this.f281837a = i12;
            this.f281838b = arrayList;
            this.f281839c = bool;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f281837a == fVar.f281837a && this.f281838b.equals(fVar.f281838b) && L.f(this.f281839c, fVar.f281839c);
        }

        public final int hashCode() {
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f281838b, Integer.hashCode(this.f281837a) * 31, 31);
            Boolean bool = this.f281839c;
            return iG2 + (bool == null ? 0 : bool.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GuestsSelectionChanged(adultGuestsCount=");
            sb2.append(this.f281837a);
            sb2.append(", children=");
            sb2.append(this.f281838b);
            sb2.append(", withPets=");
            return C0.g(sb2, this.f281839c, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$g;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f281840a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f281841b;

        public g(@Y61.k String str, @Y61.k String str2) {
            this.f281840a = str;
            this.f281841b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f281840a, gVar.f281840a) && L.f(this.f281841b, gVar.f281841b);
        }

        public final int hashCode() {
            return this.f281841b.hashCode() + (this.f281840a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputTextChange(parameterId=");
            sb2.append(this.f281840a);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f281841b, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$h;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f281842a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ParametrizedEvent f281843b;

        public h(@Y61.l DeepLink deepLink, @Y61.l ParametrizedEvent parametrizedEvent) {
            this.f281842a = deepLink;
            this.f281843b = parametrizedEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f281842a, hVar.f281842a) && L.f(this.f281843b, hVar.f281843b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f281842a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            ParametrizedEvent parametrizedEvent = this.f281843b;
            return iHashCode + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnButtonClick(deepLink=");
            sb2.append(this.f281842a);
            sb2.append(", event=");
            return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f281843b, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$i;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            Integer.hashCode(0);
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "OnFooterDescriptionClick(pageIndex=0, itemIdToScroll=null)";
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f281844a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -938287549;
        }

        @Y61.k
        public final String toString() {
            return "OnPreviewItemClick";
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$k;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RetroBadgeItemHint f281845a;

        public k(@Y61.k RetroBadgeItemHint retroBadgeItemHint) {
            this.f281845a = retroBadgeItemHint;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f281845a, ((k) obj).f281845a);
        }

        public final int hashCode() {
            return this.f281845a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnRetroBadgeClick(hint=" + this.f281845a + ')';
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$l;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ParametrizedEvent f281846a;

        public l(@Y61.k ParametrizedEvent parametrizedEvent) {
            this.f281846a = parametrizedEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f281846a, ((l) obj).f281846a);
        }

        public final int hashCode() {
            return this.f281846a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("OnShowEvent(event="), this.f281846a, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$m;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f281847a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -247957865;
        }

        @Y61.k
        public final String toString() {
            return "PaymentDetailsAttached";
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$n;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f281848a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f281849b;

        public n(@Y61.l String str, @Y61.k String str2) {
            this.f281848a = str;
            this.f281849b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f281848a, nVar.f281848a) && L.f(this.f281849b, nVar.f281849b);
        }

        public final int hashCode() {
            String str = this.f281848a;
            return this.f281849b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaymentPlanSelected(buttonName=");
            sb2.append(this.f281848a);
            sb2.append(", planId=");
            return C22026a.c(sb2, this.f281849b, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$o;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f281850a;

        public o(@Y61.k String str) {
            this.f281850a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f281850a, ((o) obj).f281850a);
        }

        public final int hashCode() {
            return this.f281850a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentTypeSelected(paymentType="), this.f281850a, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface p extends a {

        /* compiled from: BookingFormAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.entity.a$p$a, reason: collision with other inner class name */
        public static final /* data */ class C8402a implements p {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f281851a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f281852b;

            public C8402a(@Y61.k String str, @Y61.l String str2) {
                this.f281851a = str;
                this.f281852b = str2;
            }

            @Override // com.avito.android.short_term_rent.bookingform.mvi.entity.a.p
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF281851a() {
                return this.f281851a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8402a)) {
                    return false;
                }
                C8402a c8402a = (C8402a) obj;
                return L.f(this.f281851a, c8402a.f281851a) && L.f(this.f281852b, c8402a.f281852b);
            }

            public final int hashCode() {
                int iHashCode = this.f281851a.hashCode() * 31;
                String str = this.f281852b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NewPromoCode(promoCode=");
                sb2.append(this.f281851a);
                sb2.append(", toastMessage=");
                return C22026a.c(sb2, this.f281852b, ')');
            }
        }

        /* compiled from: BookingFormAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p$b;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$p;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements p {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f281853a = new b();

            @Override // com.avito.android.short_term_rent.bookingform.mvi.entity.a.p
            @Y61.l
            /* renamed from: a */
            public final String getF281851a() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 356884172;
            }

            @Y61.k
            public final String toString() {
                return "ResetPromoCode";
            }
        }

        @Y61.l
        /* renamed from: a */
        String getF281851a();
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$q;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f281854a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f281855b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f281856c;

        public q(@Y61.k String str, boolean z12, boolean z13) {
            this.f281854a = str;
            this.f281855b = z12;
            this.f281856c = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.f281854a, qVar.f281854a) && this.f281855b == qVar.f281855b && this.f281856c == qVar.f281856c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f281856c) + androidx.appcompat.app.r.i(this.f281854a.hashCode() * 31, 31, this.f281855b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RefundToggleButtonClick(buttonId=");
            sb2.append(this.f281854a);
            sb2.append(", isButtonSelected=");
            sb2.append(this.f281855b);
            sb2.append(", needFormToReload=");
            return androidx.appcompat.app.r.x(sb2, this.f281856c, ')');
        }
    }

    /* compiled from: BookingFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f281857a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f281858b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC8403a f281859c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f281860d;

        /* compiled from: BookingFormAction.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r$a;", "", "a", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r$a$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.entity.a$r$a, reason: collision with other inner class name */
        public interface InterfaceC8403a {

            /* compiled from: BookingFormAction.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r$a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/a$r$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.entity.a$r$a$a, reason: collision with other inner class name */
            public static final /* data */ class C8404a implements InterfaceC8403a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.l
                public final Long f281861a;

                public C8404a(@Y61.l Long l12) {
                    this.f281861a = l12;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C8404a) && L.f(this.f281861a, ((C8404a) obj).f281861a);
                }

                public final int hashCode() {
                    Long l12 = this.f281861a;
                    if (l12 == null) {
                        return 0;
                    }
                    return l12.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return androidx.media3.exoplayer.analytics.m.m(new StringBuilder("Bonuses(amount="), this.f281861a, ')');
                }
            }
        }

        public r(@Y61.k String str, @Y61.k String str2, @Y61.k InterfaceC8403a interfaceC8403a, boolean z12) {
            this.f281857a = str;
            this.f281858b = str2;
            this.f281859c = interfaceC8403a;
            this.f281860d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f281857a, rVar.f281857a) && L.f(this.f281858b, rVar.f281858b) && L.f(this.f281859c, rVar.f281859c) && this.f281860d == rVar.f281860d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f281860d) + ((this.f281859c.hashCode() + H.d(this.f281857a.hashCode() * 31, 31, this.f281858b)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleSelectionChanged(parameterId=");
            sb2.append(this.f281857a);
            sb2.append(", selectedToggleParameterId=");
            sb2.append(this.f281858b);
            sb2.append(", toggleValue=");
            sb2.append(this.f281859c);
            sb2.append(", needFormReload=");
            return androidx.appcompat.app.r.x(sb2, this.f281860d, ')');
        }
    }
}
