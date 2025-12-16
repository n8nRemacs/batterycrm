package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39277z {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final a f382277a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final Boolean f382278b;

    /* renamed from: com.yandex.metrica.impl.ob.z$a */
    public enum a {
        ACTIVE,
        WORKING_SET,
        FREQUENT,
        RARE,
        RESTRICTED
    }

    public C39277z(@j.P a aVar, @j.P Boolean bool) {
        this.f382277a = aVar;
        this.f382278b = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C39277z.class != obj.getClass()) {
            return false;
        }
        C39277z c39277z = (C39277z) obj;
        if (this.f382277a != c39277z.f382277a) {
            return false;
        }
        Boolean bool = this.f382278b;
        return bool != null ? bool.equals(c39277z.f382278b) : c39277z.f382278b == null;
    }

    public int hashCode() {
        a aVar = this.f382277a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Boolean bool = this.f382278b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
