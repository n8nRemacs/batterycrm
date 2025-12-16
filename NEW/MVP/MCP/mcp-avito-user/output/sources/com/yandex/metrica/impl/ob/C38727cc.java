package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.cc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38727cc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Qc f380311a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final C38677ac f380312b;

    public C38727cc(@j.N Qc qc2, @j.P C38677ac c38677ac) {
        this.f380311a = qc2;
        this.f380312b = c38677ac;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38727cc.class != obj.getClass()) {
            return false;
        }
        C38727cc c38727cc = (C38727cc) obj;
        if (!this.f380311a.equals(c38727cc.f380311a)) {
            return false;
        }
        C38677ac c38677ac = this.f380312b;
        C38677ac c38677ac2 = c38727cc.f380312b;
        return c38677ac != null ? c38677ac.equals(c38677ac2) : c38677ac2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f380311a.hashCode() * 31;
        C38677ac c38677ac = this.f380312b;
        return iHashCode + (c38677ac != null ? c38677ac.hashCode() : 0);
    }

    public String toString() {
        return "GplCollectingConfig{providerAccessFlags=" + this.f380311a + ", arguments=" + this.f380312b + '}';
    }
}
