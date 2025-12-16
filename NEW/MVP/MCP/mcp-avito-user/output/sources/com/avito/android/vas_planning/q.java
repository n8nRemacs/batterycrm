package com.avito.android.vas_planning;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.architecture_components.C;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanningViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning/q;", "Lcom/avito/android/vas_planning/item/radio/a;", "Lcom/avito/android/vas_planning/item/date_time/a;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface q extends com.avito.android.vas_planning.item.radio.a, com.avito.android.vas_planning.item.date_time.a {

    /* compiled from: VasPlanningViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/q$a;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f322459a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ApiError f322460b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f322461c;

        public a() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f322459a, aVar.f322459a) && L.f(this.f322460b, aVar.f322460b) && L.f(this.f322461c, aVar.f322461c);
        }

        public final int hashCode() {
            String str = this.f322459a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ApiError apiError = this.f322460b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f322461c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(message=");
            sb2.append(this.f322459a);
            sb2.append(", typedError=");
            sb2.append(this.f322460b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f322461c, ')');
        }

        public a(String str, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            apiError = (i12 & 2) != 0 ? null : apiError;
            th2 = (i12 & 4) != 0 ? null : th2;
            this.f322459a = str;
            this.f322460b = apiError;
            this.f322461c = th2;
        }
    }

    @Y61.k
    com.jakewharton.rxrelay3.c I5();

    @Y61.k
    D Wc();

    @Y61.k
    D Xa();

    void b6();

    void eb(@Y61.k DeepLink deepLink);

    @Y61.k
    com.jakewharton.rxrelay3.c f3();

    @Y61.k
    D g6();

    void h0();

    @Y61.k
    C h3();

    @Y61.k
    D o4();
}
