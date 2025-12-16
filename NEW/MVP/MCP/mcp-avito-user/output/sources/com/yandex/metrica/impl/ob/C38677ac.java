package com.yandex.metrica.impl.ob;

import com.yandex.metrica.gpllibrary.a;

/* renamed from: com.yandex.metrica.impl.ob.ac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38677ac {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final a.b f380119a;

    /* renamed from: b, reason: collision with root package name */
    public final long f380120b;

    /* renamed from: c, reason: collision with root package name */
    public final long f380121c;

    public C38677ac(@j.N a.b bVar, long j12, long j13) {
        this.f380119a = bVar;
        this.f380120b = j12;
        this.f380121c = j13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38677ac.class != obj.getClass()) {
            return false;
        }
        C38677ac c38677ac = (C38677ac) obj;
        return this.f380120b == c38677ac.f380120b && this.f380121c == c38677ac.f380121c && this.f380119a == c38677ac.f380119a;
    }

    public int hashCode() {
        int iHashCode = this.f380119a.hashCode() * 31;
        long j12 = this.f380120b;
        int i12 = (iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f380121c;
        return i12 + ((int) (j13 ^ (j13 >>> 32)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GplArguments{priority=");
        sb2.append(this.f380119a);
        sb2.append(", durationSeconds=");
        sb2.append(this.f380120b);
        sb2.append(", intervalSeconds=");
        return androidx.appcompat.app.r.u(sb2, this.f380121c, '}');
    }
}
