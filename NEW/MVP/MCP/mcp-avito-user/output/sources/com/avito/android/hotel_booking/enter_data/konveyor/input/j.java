package com.avito.android.hotel_booking.enter_data.konveyor.input;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EnterDataInputItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j;", "", "a", "b", "Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j$a;", "Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j$b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface j {

    /* compiled from: EnterDataInputItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j$a;", "Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f163524a;

        public a(@Y61.k PrintableText printableText) {
            this.f163524a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f163524a, ((a) obj).f163524a);
        }

        public final int hashCode() {
            return this.f163524a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(errorMessage="), this.f163524a, ')');
        }
    }

    /* compiled from: EnterDataInputItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j$b;", "Lcom/avito/android/hotel_booking/enter_data/konveyor/input/j;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f163525a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1337059017;
        }

        @Y61.k
        public final String toString() {
            return "Normal";
        }
    }
}
