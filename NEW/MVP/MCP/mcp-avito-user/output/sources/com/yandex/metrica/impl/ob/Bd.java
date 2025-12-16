package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Bd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f377845a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f377846b;

    public Bd(@j.N String str, boolean z12) {
        this.f377845a = str;
        this.f377846b = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bd.class != obj.getClass()) {
            return false;
        }
        Bd bd2 = (Bd) obj;
        if (this.f377846b != bd2.f377846b) {
            return false;
        }
        return this.f377845a.equals(bd2.f377845a);
    }

    public int hashCode() {
        return (this.f377845a.hashCode() * 31) + (this.f377846b ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PermissionState{name='");
        sb2.append(this.f377845a);
        sb2.append("', granted=");
        return androidx.appcompat.app.r.x(sb2, this.f377846b, '}');
    }
}
