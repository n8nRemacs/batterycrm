package com.avito.android.short_term_rent.bookingform.domain.validation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputsValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/b;", "", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/b$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/b$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: InputsValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/b$a;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f281437a;

        public a(@k String str) {
            this.f281437a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f281437a, ((a) obj).f281437a);
        }

        public final int hashCode() {
            return this.f281437a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failure(errorMessage="), this.f281437a, ')');
        }
    }

    /* compiled from: InputsValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/validation/b$b;", "Lcom/avito/android/short_term_rent/bookingform/domain/validation/b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.domain.validation.b$b, reason: collision with other inner class name */
    public static final /* data */ class C8385b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C8385b f281438a = new C8385b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C8385b);
        }

        public final int hashCode() {
            return -1707341559;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
