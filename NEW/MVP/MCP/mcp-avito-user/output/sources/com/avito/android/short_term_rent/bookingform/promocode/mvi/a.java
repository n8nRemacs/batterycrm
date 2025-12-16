package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplyPromoCodeUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a;", "", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f282128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f282129b;

    /* compiled from: ApplyPromoCodeUseCase.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;", "", "a", "b", "c", "d", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$a;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$b;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$c;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC8419a {

        /* compiled from: ApplyPromoCodeUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$a;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.mvi.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8420a implements InterfaceC8419a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C8420a f282130a = new C8420a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C8420a);
            }

            public final int hashCode() {
                return -282633755;
            }

            @Y61.k
            public final String toString() {
                return "EmptyMessage";
            }
        }

        /* compiled from: ApplyPromoCodeUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$b;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC8419a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f282131a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 636740540;
            }

            @Y61.k
            public final String toString() {
                return "ResponseError";
            }
        }

        /* compiled from: ApplyPromoCodeUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$c;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.mvi.a$a$c */
        public static final /* data */ class c implements InterfaceC8419a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f282132a;

            public c(@Y61.k String str) {
                this.f282132a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f282132a, ((c) obj).f282132a);
            }

            public final int hashCode() {
                return this.f282132a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f282132a, ')');
            }
        }

        /* compiled from: ApplyPromoCodeUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a$d;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/a$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.mvi.a$a$d */
        public static final /* data */ class d implements InterfaceC8419a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f282133a;

            public d(@Y61.k String str) {
                this.f282133a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f282133a, ((d) obj).f282133a);
            }

            public final int hashCode() {
                return this.f282133a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ValidationError(message="), this.f282133a, ')');
            }
        }
    }

    @Inject
    public a(@Y61.k d1 d1Var, @Y61.k R0 r02) {
        this.f282128a = d1Var;
        this.f282129b = r02;
    }
}
