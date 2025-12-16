package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.j;
import j.P;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes10.dex */
final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f343073a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f343074b;

    /* renamed from: c, reason: collision with root package name */
    public final i f343075c;

    /* renamed from: d, reason: collision with root package name */
    public final long f343076d;

    /* renamed from: e, reason: collision with root package name */
    public final long f343077e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f343078f;

    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: com.google.android.datatransport.runtime.b$b, reason: collision with other inner class name */
    public static final class C10562b extends j.a {

        /* renamed from: a, reason: collision with root package name */
        public String f343079a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f343080b;

        /* renamed from: c, reason: collision with root package name */
        public i f343081c;

        /* renamed from: d, reason: collision with root package name */
        public Long f343082d;

        /* renamed from: e, reason: collision with root package name */
        public Long f343083e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap f343084f;

        @Override // com.google.android.datatransport.runtime.j.a
        public final j b() {
            String strQ = this.f343079a == null ? " transportName" : "";
            if (this.f343081c == null) {
                strQ = strQ.concat(" encodedPayload");
            }
            if (this.f343082d == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " eventMillis");
            }
            if (this.f343083e == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " uptimeMillis");
            }
            if (this.f343084f == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " autoMetadata");
            }
            if (strQ.isEmpty()) {
                return new b(this.f343079a, this.f343080b, this.f343081c, this.f343082d.longValue(), this.f343083e.longValue(), this.f343084f, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final Map<String, String> c() {
            HashMap map = this.f343084f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a d(Integer num) {
            this.f343080b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a e(i iVar) {
            if (iVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f343081c = iVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a f(long j12) {
            this.f343082d = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f343079a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.j.a
        public final j.a h(long j12) {
            this.f343083e = Long.valueOf(j12);
            return this;
        }
    }

    public b() {
        throw null;
    }

    public b(String str, Integer num, i iVar, long j12, long j13, Map map, a aVar) {
        this.f343073a = str;
        this.f343074b = num;
        this.f343075c = iVar;
        this.f343076d = j12;
        this.f343077e = j13;
        this.f343078f = map;
    }

    @Override // com.google.android.datatransport.runtime.j
    public final Map<String, String> c() {
        return this.f343078f;
    }

    @Override // com.google.android.datatransport.runtime.j
    @P
    public final Integer d() {
        return this.f343074b;
    }

    @Override // com.google.android.datatransport.runtime.j
    public final i e() {
        return this.f343075c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f343073a.equals(jVar.h()) && ((num = this.f343074b) != null ? num.equals(jVar.d()) : jVar.d() == null) && this.f343075c.equals(jVar.e()) && this.f343076d == jVar.f() && this.f343077e == jVar.i() && this.f343078f.equals(jVar.c());
    }

    @Override // com.google.android.datatransport.runtime.j
    public final long f() {
        return this.f343076d;
    }

    @Override // com.google.android.datatransport.runtime.j
    public final String h() {
        return this.f343073a;
    }

    public final int hashCode() {
        int iHashCode = (this.f343073a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f343074b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f343075c.hashCode()) * 1000003;
        long j12 = this.f343076d;
        int i12 = (iHashCode2 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f343077e;
        return ((i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ this.f343078f.hashCode();
    }

    @Override // com.google.android.datatransport.runtime.j
    public final long i() {
        return this.f343077e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f343073a + ", code=" + this.f343074b + ", encodedPayload=" + this.f343075c + ", eventMillis=" + this.f343076d + ", uptimeMillis=" + this.f343077e + ", autoMetadata=" + this.f343078f + "}";
    }
}
