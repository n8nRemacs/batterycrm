package com.avito.android.short_term_rent.bookingform.page;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormPagePayload.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/page/d;", "", "a", "Lcom/avito/android/short_term_rent/bookingform/page/d$a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: FormPagePayload.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/page/d$a;", "Lcom/avito/android/short_term_rent/bookingform/page/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<TV0.a> f282038a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends TV0.a> list) {
            this.f282038a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f282038a, ((a) obj).f282038a);
        }

        public final int hashCode() {
            return this.f282038a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ItemsChanged(value="), this.f282038a, ')');
        }
    }
}
