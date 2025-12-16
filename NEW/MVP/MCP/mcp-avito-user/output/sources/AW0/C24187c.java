package aw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.exoplayer.analytics.m;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Law0/c;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C24187c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Date f56788a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f56789b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56790c;

    public C24187c(@k Date date, @k Date date2, boolean z12) {
        this.f56788a = date;
        this.f56789b = date2;
        this.f56790c = z12;
    }

    public static C24187c a(C24187c c24187c, Date date, Date date2) {
        boolean z12 = c24187c.f56790c;
        c24187c.getClass();
        return new C24187c(date, date2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24187c)) {
            return false;
        }
        C24187c c24187c = (C24187c) obj;
        return L.f(this.f56788a, c24187c.f56788a) && L.f(this.f56789b, c24187c.f56789b) && this.f56790c == c24187c.f56790c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56790c) + m.f(this.f56789b, this.f56788a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormDateRangeData(checkIn=");
        sb2.append(this.f56788a);
        sb2.append(", checkOut=");
        sb2.append(this.f56789b);
        sb2.append(", reloadsForm=");
        return r.x(sb2, this.f56790c, ')');
    }
}
