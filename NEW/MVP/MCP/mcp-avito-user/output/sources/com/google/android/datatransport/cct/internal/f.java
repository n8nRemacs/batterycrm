package com.google.android.datatransport.cct.internal;

import androidx.appcompat.app.r;
import com.google.android.datatransport.cct.internal.k;
import j.P;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes10.dex */
final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    public final long f343018a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f343019b;

    /* renamed from: c, reason: collision with root package name */
    public final long f343020c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f343021d;

    /* renamed from: e, reason: collision with root package name */
    public final String f343022e;

    /* renamed from: f, reason: collision with root package name */
    public final long f343023f;

    /* renamed from: g, reason: collision with root package name */
    public final NetworkConnectionInfo f343024g;

    /* compiled from: AutoValue_LogEvent.java */
    public static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f343025a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f343026b;

        /* renamed from: c, reason: collision with root package name */
        public Long f343027c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f343028d;

        /* renamed from: e, reason: collision with root package name */
        public String f343029e;

        /* renamed from: f, reason: collision with root package name */
        public Long f343030f;

        /* renamed from: g, reason: collision with root package name */
        public NetworkConnectionInfo f343031g;

        @Override // com.google.android.datatransport.cct.internal.k.a
        public final k a() {
            String strQ = this.f343025a == null ? " eventTimeMs" : "";
            if (this.f343027c == null) {
                strQ = r.q(strQ, " eventUptimeMs");
            }
            if (this.f343030f == null) {
                strQ = r.q(strQ, " timezoneOffsetSeconds");
            }
            if (strQ.isEmpty()) {
                return new f(this.f343025a.longValue(), this.f343026b, this.f343027c.longValue(), this.f343028d, this.f343029e, this.f343030f.longValue(), this.f343031g, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public final k.a b(@P Integer num) {
            this.f343026b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public final k.a c(long j12) {
            this.f343025a = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public final k.a d(long j12) {
            this.f343027c = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public final k.a e(@P NetworkConnectionInfo networkConnectionInfo) {
            this.f343031g = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.k.a
        public final k.a f(long j12) {
            this.f343030f = Long.valueOf(j12);
            return this;
        }
    }

    public f(long j12, Integer num, long j13, byte[] bArr, String str, long j14, NetworkConnectionInfo networkConnectionInfo, a aVar) {
        this.f343018a = j12;
        this.f343019b = num;
        this.f343020c = j13;
        this.f343021d = bArr;
        this.f343022e = str;
        this.f343023f = j14;
        this.f343024g = networkConnectionInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public final Integer a() {
        return this.f343019b;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public final long b() {
        return this.f343018a;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public final long c() {
        return this.f343020c;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public final NetworkConnectionInfo d() {
        return this.f343024g;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public final byte[] e() {
        return this.f343021d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f343018a == kVar.b() && ((num = this.f343019b) != null ? num.equals(kVar.a()) : kVar.a() == null) && this.f343020c == kVar.c()) {
            if (Arrays.equals(this.f343021d, kVar instanceof f ? ((f) kVar).f343021d : kVar.e()) && ((str = this.f343022e) != null ? str.equals(kVar.f()) : kVar.f() == null) && this.f343023f == kVar.g()) {
                NetworkConnectionInfo networkConnectionInfo = this.f343024g;
                if (networkConnectionInfo == null) {
                    if (kVar.d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(kVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    @P
    public final String f() {
        return this.f343022e;
    }

    @Override // com.google.android.datatransport.cct.internal.k
    public final long g() {
        return this.f343023f;
    }

    public final int hashCode() {
        long j12 = this.f343018a;
        int i12 = (((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f343019b;
        int iHashCode = (i12 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j13 = this.f343020c;
        int iHashCode2 = (((iHashCode ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f343021d)) * 1000003;
        String str = this.f343022e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j14 = this.f343023f;
        int i13 = (iHashCode3 ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f343024g;
        return i13 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f343018a + ", eventCode=" + this.f343019b + ", eventUptimeMs=" + this.f343020c + ", sourceExtension=" + Arrays.toString(this.f343021d) + ", sourceExtensionJsonProto3=" + this.f343022e + ", timezoneOffsetSeconds=" + this.f343023f + ", networkConnectionInfo=" + this.f343024g + "}";
    }
}
