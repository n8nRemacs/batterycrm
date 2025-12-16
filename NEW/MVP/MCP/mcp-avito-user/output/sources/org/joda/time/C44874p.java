package org.joda.time;

import java.io.Serializable;

/* compiled from: Instant.java */
/* renamed from: org.joda.time.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C44874p extends org.joda.time.base.c implements K, Serializable {
    private static final long serialVersionUID = 3299096530934209741L;

    /* renamed from: b, reason: collision with root package name */
    public final long f420954b;

    static {
        new C44874p(0L);
    }

    public C44874p() {
        this.f420954b = C44866h.a();
    }

    @Override // org.joda.time.K
    public final long getMillis() {
        return this.f420954b;
    }

    @Override // org.joda.time.K
    public final AbstractC44854a y() {
        return org.joda.time.chrono.x.f420650N;
    }

    public C44874p(long j12) {
        this.f420954b = j12;
    }

    @Override // org.joda.time.base.c, org.joda.time.K
    public final C44874p P5() {
        return this;
    }
}
