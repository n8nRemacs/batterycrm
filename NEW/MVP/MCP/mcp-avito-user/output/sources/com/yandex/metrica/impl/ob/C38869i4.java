package com.yandex.metrica.impl.ob;

import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.i4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38869i4 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final String f380765a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f380766b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final Integer f380767c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final String f380768d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final CounterConfiguration.b f380769e;

    public C38869i4(@j.P String str, @j.N String str2, @j.P Integer num, @j.P String str3, @j.N CounterConfiguration.b bVar) {
        this.f380765a = str;
        this.f380766b = str2;
        this.f380767c = num;
        this.f380768d = str3;
        this.f380769e = bVar;
    }

    @j.P
    public String a() {
        return this.f380765a;
    }

    @j.N
    public String b() {
        return this.f380766b;
    }

    @j.P
    public Integer c() {
        return this.f380767c;
    }

    @j.P
    public String d() {
        return this.f380768d;
    }

    @j.N
    public CounterConfiguration.b e() {
        return this.f380769e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38869i4.class != obj.getClass()) {
            return false;
        }
        C38869i4 c38869i4 = (C38869i4) obj;
        String str = this.f380765a;
        if (str == null ? c38869i4.f380765a != null : !str.equals(c38869i4.f380765a)) {
            return false;
        }
        if (!this.f380766b.equals(c38869i4.f380766b)) {
            return false;
        }
        Integer num = this.f380767c;
        if (num == null ? c38869i4.f380767c != null : !num.equals(c38869i4.f380767c)) {
            return false;
        }
        String str2 = this.f380768d;
        if (str2 == null ? c38869i4.f380768d == null : str2.equals(c38869i4.f380768d)) {
            return this.f380769e == c38869i4.f380769e;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f380765a;
        int iD2 = androidx.compose.foundation.H.d((str != null ? str.hashCode() : 0) * 31, 31, this.f380766b);
        Integer num = this.f380767c;
        int iHashCode = (iD2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f380768d;
        return this.f380769e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.f380765a + "', mPackageName='" + this.f380766b + "', mProcessID=" + this.f380767c + ", mProcessSessionID='" + this.f380768d + "', mReporterType=" + this.f380769e + '}';
    }

    @j.N
    public static C38869i4 a(@j.N C39281z3 c39281z3) {
        return new C38869i4(c39281z3.b().c(), c39281z3.a().f(), c39281z3.a().g(), c39281z3.a().h(), CounterConfiguration.b.a(c39281z3.b().f377493b.getAsString("CFG_REPORTER_TYPE")));
    }
}
