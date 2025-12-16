package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ti, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39152ti {

    /* renamed from: a, reason: collision with root package name */
    public final long f381894a;

    public C39152ti(long j12) {
        this.f381894a = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C39152ti.class == obj.getClass() && this.f381894a == ((C39152ti) obj).f381894a;
    }

    public int hashCode() {
        long j12 = this.f381894a;
        return (int) (j12 ^ (j12 >>> 32));
    }

    public String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("StatSending{disabledReportingInterval="), this.f381894a, '}');
    }
}
