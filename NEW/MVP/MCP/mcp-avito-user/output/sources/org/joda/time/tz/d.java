package org.joda.time.tz;

import org.joda.time.AbstractC44868j;

/* compiled from: FixedDateTimeZone.java */
/* loaded from: classes7.dex */
public final class d extends AbstractC44868j {
    private static final long serialVersionUID = -3513011772763289092L;

    /* renamed from: g, reason: collision with root package name */
    public final String f420995g;

    /* renamed from: h, reason: collision with root package name */
    public final int f420996h;

    /* renamed from: i, reason: collision with root package name */
    public final int f420997i;

    public d(int i12, int i13, String str, String str2) {
        super(str);
        this.f420995g = str2;
        this.f420996h = i12;
        this.f420997i = i13;
    }

    @Override // org.joda.time.AbstractC44868j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f420915b.equals(dVar.f420915b) && this.f420997i == dVar.f420997i && this.f420996h == dVar.f420996h;
    }

    @Override // org.joda.time.AbstractC44868j
    public final String g(long j12) {
        return this.f420995g;
    }

    @Override // org.joda.time.AbstractC44868j
    public final int hashCode() {
        return (this.f420996h * 31) + (this.f420997i * 37) + this.f420915b.hashCode();
    }

    @Override // org.joda.time.AbstractC44868j
    public final int i(long j12) {
        return this.f420996h;
    }

    @Override // org.joda.time.AbstractC44868j
    public final int k(long j12) {
        return this.f420996h;
    }

    @Override // org.joda.time.AbstractC44868j
    public final int m(long j12) {
        return this.f420997i;
    }

    @Override // org.joda.time.AbstractC44868j
    public final boolean n() {
        return true;
    }

    @Override // org.joda.time.AbstractC44868j
    public final long o(long j12) {
        return j12;
    }

    @Override // org.joda.time.AbstractC44868j
    public final long p(long j12) {
        return j12;
    }
}
