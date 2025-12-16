package org.threeten.bp.temporal;

import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes15.dex */
public enum ChronoUnit implements k {
    NANOS("Nanos", org.threeten.bp.c.c(1)),
    MICROS("Micros", org.threeten.bp.c.c(1000)),
    MILLIS("Millis", org.threeten.bp.c.c(1000000)),
    SECONDS("Seconds", org.threeten.bp.c.b(0, 1)),
    MINUTES("Minutes", org.threeten.bp.c.b(0, 60)),
    HOURS("Hours", org.threeten.bp.c.b(0, 3600)),
    HALF_DAYS("HalfDays", org.threeten.bp.c.b(0, 43200)),
    DAYS("Days", org.threeten.bp.c.b(0, 86400)),
    WEEKS("Weeks", org.threeten.bp.c.b(0, 604800)),
    MONTHS("Months", org.threeten.bp.c.b(0, 2629746)),
    YEARS("Years", org.threeten.bp.c.b(0, 31556952)),
    DECADES("Decades", org.threeten.bp.c.b(0, 315569520)),
    CENTURIES("Centuries", org.threeten.bp.c.b(0, 3155695200L)),
    MILLENNIA("Millennia", org.threeten.bp.c.b(0, 31556952000L)),
    ERAS("Eras", org.threeten.bp.c.b(0, 31556952000000000L)),
    FOREVER("Forever", org.threeten.bp.c.b(w81.d.e(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, 999999999), w81.d.h(Long.MAX_VALUE, w81.d.c(999999999, 1000000000))));


    /* renamed from: b, reason: collision with root package name */
    public final String f422170b;

    /* renamed from: c, reason: collision with root package name */
    public final org.threeten.bp.c f422171c;

    ChronoUnit(String str, org.threeten.bp.c cVar) {
        this.f422170b = str;
        this.f422171c = cVar;
    }

    @Override // org.threeten.bp.temporal.k
    public final <R extends c> R a(R r12, long j12) {
        return (R) r12.r(j12, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f422170b;
    }
}
