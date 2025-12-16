package com.avito.android.short_term_rent.soft_booking.domain;

import androidx.compose.runtime.C22026a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pw0.C47159c;

/* compiled from: ContactsValidateInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/domain/a;", "", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ContactsValidateInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/domain/a$a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.soft_booking.domain.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8445a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StrSoftBookingContactFieldType f282590a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f282591b;

        public C8445a(@Y61.k StrSoftBookingContactFieldType strSoftBookingContactFieldType, @Y61.k String str) {
            this.f282590a = strSoftBookingContactFieldType;
            this.f282591b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8445a)) {
                return false;
            }
            C8445a c8445a = (C8445a) obj;
            return this.f282590a == c8445a.f282590a && L.f(this.f282591b, c8445a.f282591b);
        }

        public final int hashCode() {
            return this.f282591b.hashCode() + (this.f282590a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationError(type=");
            sb2.append(this.f282590a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f282591b, ')');
        }
    }

    @Y61.k
    InterfaceC43160i<StrSoftBookingInternalAction> a(@Y61.k com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, @Y61.l Y41.q<? super InterfaceC43172j<? super StrSoftBookingInternalAction>, ? super C47159c, ? super Continuation<? super G0>, ? extends Object> qVar, @Y61.l Y41.q<? super InterfaceC43172j<? super StrSoftBookingInternalAction>, ? super C47159c, ? super Continuation<? super G0>, ? extends Object> qVar2);
}
