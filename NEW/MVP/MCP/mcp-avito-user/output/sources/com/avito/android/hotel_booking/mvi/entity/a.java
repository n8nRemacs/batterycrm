package com.avito.android.hotel_booking.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.ButtonAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/hotel_booking/mvi/entity/a$a;", "Lcom/avito/android/hotel_booking/mvi/entity/a$b;", "Lcom/avito/android/hotel_booking/mvi/entity/a$c;", "Lcom/avito/android/hotel_booking/mvi/entity/a$d;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/a$a;", "Lcom/avito/android/hotel_booking/mvi/entity/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.hotel_booking.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4801a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f163886a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163887b;

        public C4801a(@k PrintableText printableText, @k PrintableText printableText2) {
            this.f163886a = printableText;
            this.f163887b = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4801a)) {
                return false;
            }
            C4801a c4801a = (C4801a) obj;
            return L.f(this.f163886a, c4801a.f163886a) && L.f(this.f163887b, c4801a.f163887b);
        }

        public final int hashCode() {
            return this.f163887b.hashCode() + (this.f163886a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(title=");
            sb2.append(this.f163886a);
            sb2.append(", description=");
            return AK.c.m(sb2, this.f163887b, ')');
        }
    }

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/a$b;", "Lcom/avito/android/hotel_booking/mvi/entity/a;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f163888a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1536146783;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/a$c;", "Lcom/avito/android/hotel_booking/mvi/entity/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f163889a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163890b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k List<? extends com.avito.conveyor_item.a> list, boolean z12) {
            this.f163889a = list;
            this.f163890b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f163889a, cVar.f163889a) && this.f163890b == cVar.f163890b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f163890b) + (this.f163889a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OfferForm(items=");
            sb2.append(this.f163889a);
            sb2.append(", showLoadingOverlay=");
            return r.x(sb2, this.f163890b, ')');
        }
    }

    /* compiled from: HotelBookingState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/a$d;", "Lcom/avito/android/hotel_booking/mvi/entity/a;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f163891a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163892b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ButtonAction f163893c;

        public d(@k PrintableText printableText, @k PrintableText printableText2, @l ButtonAction buttonAction) {
            this.f163891a = printableText;
            this.f163892b = printableText2;
            this.f163893c = buttonAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f163891a, dVar.f163891a) && L.f(this.f163892b, dVar.f163892b) && L.f(this.f163893c, dVar.f163893c);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f163892b, this.f163891a.hashCode() * 31, 31);
            ButtonAction buttonAction = this.f163893c;
            return iF2 + (buttonAction == null ? 0 : buttonAction.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OfferUnavailable(title=");
            sb2.append(this.f163891a);
            sb2.append(", description=");
            sb2.append(this.f163892b);
            sb2.append(", button=");
            return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f163893c, ')');
        }
    }
}
