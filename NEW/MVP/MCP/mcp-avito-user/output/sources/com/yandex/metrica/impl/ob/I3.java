package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class I3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f378275a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final String f378276b;

    public I3(@j.N String str, @j.P String str2) {
        this.f378275a = str;
        this.f378276b = str2;
    }

    @j.P
    public String a() {
        return this.f378276b;
    }

    public String b() {
        return this.f378275a;
    }

    public String c() {
        return this.f378275a + "_" + A2.a(this.f378276b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        I3 i32 = (I3) obj;
        String str = this.f378275a;
        if (str == null ? i32.f378275a != null : !str.equals(i32.f378275a)) {
            return false;
        }
        String str2 = this.f378276b;
        String str3 = i32.f378276b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f378275a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f378276b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f378275a + "_" + this.f378276b;
    }
}
