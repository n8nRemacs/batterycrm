package com.avito.android.advert.item.neighboring_dates;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import ba.C25604a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NeighboringDatesInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/a;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<Z9.a> f77745a;

    /* compiled from: NeighboringDatesInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/a$a;", "", "a", "b", "c", "Lcom/avito/android/advert/item/neighboring_dates/a$a$a;", "Lcom/avito/android/advert/item/neighboring_dates/a$a$b;", "Lcom/avito/android/advert/item/neighboring_dates/a$a$c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.neighboring_dates.a$a, reason: collision with other inner class name */
    public interface InterfaceC2298a {

        /* compiled from: NeighboringDatesInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/a$a$a;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.neighboring_dates.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2299a implements InterfaceC2298a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C2299a f77746a = new C2299a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C2299a);
            }

            public final int hashCode() {
                return -1874806514;
            }

            @k
            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: NeighboringDatesInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/a$a$b;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.neighboring_dates.a$a$b */
        public static final /* data */ class b implements InterfaceC2298a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final C25604a f77747a;

            public b(@k C25604a c25604a) {
                this.f77747a = c25604a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f77747a, ((b) obj).f77747a);
            }

            public final int hashCode() {
                return this.f77747a.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(response=" + this.f77747a + ')';
            }
        }

        /* compiled from: NeighboringDatesInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/a$a$c;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.item.neighboring_dates.a$a$c */
        public static final /* data */ class c implements InterfaceC2298a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f77748a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -282124606;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }
    }

    @Inject
    public a(@k h31.e<Z9.a> eVar) {
        this.f77745a = eVar;
    }
}
