package aw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Law0/d;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C24188d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f56791a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f56792b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f56793c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<String> f56794d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f56795e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56796f;

    public C24188d(@l Integer num, @l Integer num2, @l Boolean bool, @l List<String> list, @l Integer num3, boolean z12) {
        this.f56791a = num;
        this.f56792b = num2;
        this.f56793c = bool;
        this.f56794d = list;
        this.f56795e = num3;
        this.f56796f = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24188d)) {
            return false;
        }
        C24188d c24188d = (C24188d) obj;
        return L.f(this.f56791a, c24188d.f56791a) && L.f(this.f56792b, c24188d.f56792b) && L.f(this.f56793c, c24188d.f56793c) && L.f(this.f56794d, c24188d.f56794d) && L.f(this.f56795e, c24188d.f56795e) && this.f56796f == c24188d.f56796f;
    }

    public final int hashCode() {
        Integer num = this.f56791a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f56792b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f56793c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.f56794d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.f56795e;
        return Boolean.hashCode(this.f56796f) + ((iHashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormGuestsData(totalCount=");
        sb2.append(this.f56791a);
        sb2.append(", adultsCount=");
        sb2.append(this.f56792b);
        sb2.append(", withPets=");
        sb2.append(this.f56793c);
        sb2.append(", childrenAges=");
        sb2.append(this.f56794d);
        sb2.append(", guestsDetailedValueVersion=");
        sb2.append(this.f56795e);
        sb2.append(", reloadsForm=");
        return r.x(sb2, this.f56796f, ')');
    }
}
