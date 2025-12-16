package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Wb {

    /* renamed from: a, reason: collision with root package name */
    public final long f379815a;

    /* renamed from: b, reason: collision with root package name */
    public final long f379816b;

    public Wb(long j12, long j13) {
        this.f379815a = j12;
        this.f379816b = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Wb.class != obj.getClass()) {
            return false;
        }
        Wb wb2 = (Wb) obj;
        return this.f379815a == wb2.f379815a && this.f379816b == wb2.f379816b;
    }

    public int hashCode() {
        long j12 = this.f379815a;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        long j13 = this.f379816b;
        return i12 + ((int) ((j13 >>> 32) ^ j13));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ForcedCollectingArguments{durationSeconds=");
        sb2.append(this.f379815a);
        sb2.append(", intervalSeconds=");
        return androidx.appcompat.app.r.u(sb2, this.f379816b, '}');
    }
}
