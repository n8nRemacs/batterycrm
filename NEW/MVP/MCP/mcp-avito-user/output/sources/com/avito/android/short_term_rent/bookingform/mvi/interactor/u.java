package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;

/* compiled from: ValidateInputsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u;", "", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface u {

    /* compiled from: ValidateInputsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a;", "", "a", "b", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: ValidateInputsInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a$a;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.bookingform.mvi.interactor.u$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8409a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f281950a;

            public C8409a(@Y61.k Map<String, String> map) {
                this.f281950a = map;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8409a) && L.f(this.f281950a, ((C8409a) obj).f281950a);
            }

            public final int hashCode() {
                return this.f281950a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.w(new StringBuilder("Errors(errors="), this.f281950a, ')');
            }
        }

        /* compiled from: ValidateInputsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a$b;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/u$a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f281951a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1455438018;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }
    }

    @Y61.l
    Object a(@Y61.l Map map, @Y61.k ContinuationImpl continuationImpl);
}
