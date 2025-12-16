package com.avito.android.short_term_rent.bookingform.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateBookingRequestUseCase.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a;", "", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/domain/a$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/a$a$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/a$a$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/a$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: CreateBookingRequestUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/a;", "a", "b", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.domain.a$a, reason: collision with other inner class name */
    public interface InterfaceC8380a extends a {

        /* compiled from: CreateBookingRequestUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a$a$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.domain.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8381a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f281328a;

            public C8381a(@k ApiError apiError) {
                this.f281328a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8381a) && L.f(this.f281328a, ((C8381a) obj).f281328a);
            }

            public final int hashCode() {
                return this.f281328a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f281328a, ')');
            }
        }

        /* compiled from: CreateBookingRequestUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a$a$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.domain.a$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f281329a;

            public b(@k String str) {
                this.f281329a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f281329a, ((b) obj).f281329a);
            }

            public final int hashCode() {
                return this.f281329a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("IncorrectData(errorDescription="), this.f281329a, ')');
            }
        }
    }

    /* compiled from: CreateBookingRequestUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/a;", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/domain/a$b$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/a$b$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends a {

        /* compiled from: CreateBookingRequestUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a$b$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/a$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.domain.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C8382a implements b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f281330a;

            public C8382a(@l String str) {
                this.f281330a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8382a) && L.f(this.f281330a, ((C8382a) obj).f281330a);
            }

            public final int hashCode() {
                String str = this.f281330a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("PaymentByUrl(url="), this.f281330a, ')');
            }
        }

        /* compiled from: CreateBookingRequestUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/a$b$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/a$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.domain.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8383b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f281331a;

            public C8383b(@k DeepLink deepLink) {
                this.f281331a = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8383b) && L.f(this.f281331a, ((C8383b) obj).f281331a);
            }

            public final int hashCode() {
                return this.f281331a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Redirect(deepLink="), this.f281331a, ')');
            }
        }
    }
}
