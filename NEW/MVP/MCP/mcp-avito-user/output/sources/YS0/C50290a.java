package ys0;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormResponseV3SuccessParamsItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lys0/a;", "T", "", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C50290a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f443547a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f443548b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final T f443549c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BookingFormResponseV3SuccessParamsItem f443550d;

    public C50290a(@k String str, @l Boolean bool, @l T t12, @k BookingFormResponseV3SuccessParamsItem bookingFormResponseV3SuccessParamsItem) {
        this.f443547a = str;
        this.f443548b = bool;
        this.f443549c = t12;
        this.f443550d = bookingFormResponseV3SuccessParamsItem;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50290a)) {
            return false;
        }
        C50290a c50290a = (C50290a) obj;
        return L.f(this.f443547a, c50290a.f443547a) && L.f(this.f443548b, c50290a.f443548b) && L.f(this.f443549c, c50290a.f443549c) && L.f(this.f443550d, c50290a.f443550d);
    }

    public final int hashCode() {
        int iHashCode = this.f443547a.hashCode() * 31;
        Boolean bool = this.f443548b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        T t12 = this.f443549c;
        return this.f443550d.hashCode() + ((iHashCode2 + (t12 != null ? t12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "BookingFormResponseV3SuccessParamsItemDecorator(id=" + this.f443547a + ", isOptional=" + this.f443548b + ", value=" + this.f443549c + ", data=" + this.f443550d + ')';
    }
}
