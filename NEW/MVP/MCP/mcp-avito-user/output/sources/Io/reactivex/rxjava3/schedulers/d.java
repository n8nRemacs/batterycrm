package io.reactivex.rxjava3.schedulers;

import androidx.appcompat.app.r;
import j41.e;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: Timed.java */
/* loaded from: classes8.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f404958a;

    /* renamed from: b, reason: collision with root package name */
    public final long f404959b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f404960c;

    public d(@e T t12, long j12, @e TimeUnit timeUnit) {
        Objects.requireNonNull(t12, "value is null");
        this.f404958a = t12;
        this.f404959b = j12;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.f404960c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f404958a, dVar.f404958a) && this.f404959b == dVar.f404959b && Objects.equals(this.f404960c, dVar.f404960c);
    }

    public final int hashCode() {
        int iHashCode = this.f404958a.hashCode() * 31;
        long j12 = this.f404959b;
        return this.f404960c.hashCode() + ((iHashCode + ((int) (j12 ^ (j12 >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timed[time=");
        sb2.append(this.f404959b);
        sb2.append(", unit=");
        sb2.append(this.f404960c);
        sb2.append(", value=");
        return r.o(this.f404958a, "]", sb2);
    }
}
