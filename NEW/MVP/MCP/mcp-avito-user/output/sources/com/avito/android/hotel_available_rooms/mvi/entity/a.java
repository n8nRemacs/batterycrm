package com.avito.android.hotel_available_rooms.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelAvailableRoomsState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a$a;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a$b;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a$c;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a$d;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: HotelAvailableRoomsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/a$a;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.hotel_available_rooms.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4768a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<TV0.a> f163136a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163137b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f163138c;

        /* JADX WARN: Multi-variable type inference failed */
        public C4768a(@k List<? extends TV0.a> list, @k PrintableText printableText, @k PrintableText printableText2) {
            this.f163136a = list;
            this.f163137b = printableText;
            this.f163138c = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4768a)) {
                return false;
            }
            C4768a c4768a = (C4768a) obj;
            return L.f(this.f163136a, c4768a.f163136a) && L.f(this.f163137b, c4768a.f163137b) && L.f(this.f163138c, c4768a.f163138c);
        }

        public final int hashCode() {
            return this.f163138c.hashCode() + com.avito.android.actions_sheet.a.f(this.f163137b, this.f163136a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentEmptyRooms(filters=");
            sb2.append(this.f163136a);
            sb2.append(", errorTitle=");
            sb2.append(this.f163137b);
            sb2.append(", errorDescription=");
            return AK.c.m(sb2, this.f163138c, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/a$b;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<TV0.a> f163139a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<TV0.a> f163140b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k List<? extends TV0.a> list, @k List<? extends TV0.a> list2) {
            this.f163139a = list;
            this.f163140b = list2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f163139a, bVar.f163139a) && L.f(this.f163140b, bVar.f163140b);
        }

        public final int hashCode() {
            return this.f163140b.hashCode() + (this.f163139a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentRooms(filters=");
            sb2.append(this.f163139a);
            sb2.append(", rooms=");
            return H.p(sb2, this.f163140b, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/a$c;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<TV0.a> f163141a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163142b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f163143c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k List<? extends TV0.a> list, @k PrintableText printableText, @k PrintableText printableText2) {
            this.f163141a = list;
            this.f163142b = printableText;
            this.f163143c = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f163141a, cVar.f163141a) && L.f(this.f163142b, cVar.f163142b) && L.f(this.f163143c, cVar.f163143c);
        }

        public final int hashCode() {
            return this.f163143c.hashCode() + com.avito.android.actions_sheet.a.f(this.f163142b, this.f163141a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(filters=");
            sb2.append(this.f163141a);
            sb2.append(", errorTitle=");
            sb2.append(this.f163142b);
            sb2.append(", errorDescription=");
            return AK.c.m(sb2, this.f163143c, ')');
        }
    }

    /* compiled from: HotelAvailableRoomsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/mvi/entity/a$d;", "Lcom/avito/android/hotel_available_rooms/mvi/entity/a;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<TV0.a> f163144a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163145b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@l List<? extends TV0.a> list, boolean z12) {
            this.f163144a = list;
            this.f163145b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f163144a, dVar.f163144a) && this.f163145b == dVar.f163145b;
        }

        public final int hashCode() {
            List<TV0.a> list = this.f163144a;
            return Boolean.hashCode(this.f163145b) + ((list == null ? 0 : list.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loading(filters=");
            sb2.append(this.f163144a);
            sb2.append(", isFiltersVisible=");
            return r.x(sb2, this.f163145b, ')');
        }
    }
}
