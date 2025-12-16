package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.l;
import j.P;
import java.util.ArrayList;
import java.util.List;
import rZ0.InterfaceC47620a;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes10.dex */
final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public final long f343032a;

    /* renamed from: b, reason: collision with root package name */
    public final long f343033b;

    /* renamed from: c, reason: collision with root package name */
    public final ClientInfo f343034c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f343035d;

    /* renamed from: e, reason: collision with root package name */
    public final String f343036e;

    /* renamed from: f, reason: collision with root package name */
    public final List<k> f343037f;

    /* renamed from: g, reason: collision with root package name */
    public final QosTier f343038g;

    /* compiled from: AutoValue_LogRequest.java */
    public static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f343039a;

        /* renamed from: b, reason: collision with root package name */
        public Long f343040b;

        /* renamed from: c, reason: collision with root package name */
        public ClientInfo f343041c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f343042d;

        /* renamed from: e, reason: collision with root package name */
        public String f343043e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f343044f;

        /* renamed from: g, reason: collision with root package name */
        public QosTier f343045g;

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l a() {
            String strConcat = this.f343039a == null ? " requestTimeMs" : "";
            if (this.f343040b == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (strConcat.isEmpty()) {
                return new g(this.f343039a.longValue(), this.f343040b.longValue(), this.f343041c, this.f343042d, this.f343043e, this.f343044f, this.f343045g, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a b(@P ClientInfo clientInfo) {
            this.f343041c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a c(@P ArrayList arrayList) {
            this.f343044f = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a d(@P Integer num) {
            this.f343042d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a e(@P String str) {
            this.f343043e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a f() {
            this.f343045g = QosTier.f342949b;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a g(long j12) {
            this.f343039a = Long.valueOf(j12);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.l.a
        public final l.a h(long j12) {
            this.f343040b = Long.valueOf(j12);
            return this;
        }
    }

    public g() {
        throw null;
    }

    public g(long j12, long j13, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier, a aVar) {
        this.f343032a = j12;
        this.f343033b = j13;
        this.f343034c = clientInfo;
        this.f343035d = num;
        this.f343036e = str;
        this.f343037f = list;
        this.f343038g = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public final ClientInfo b() {
        return this.f343034c;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    @InterfaceC47620a.InterfaceC12382a
    public final List<k> c() {
        return this.f343037f;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public final Integer d() {
        return this.f343035d;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public final String e() {
        return this.f343036e;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<k> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f343032a == lVar.g() && this.f343033b == lVar.h() && ((clientInfo = this.f343034c) != null ? clientInfo.equals(lVar.b()) : lVar.b() == null) && ((num = this.f343035d) != null ? num.equals(lVar.d()) : lVar.d() == null) && ((str = this.f343036e) != null ? str.equals(lVar.e()) : lVar.e() == null) && ((list = this.f343037f) != null ? list.equals(lVar.c()) : lVar.c() == null)) {
            QosTier qosTier = this.f343038g;
            if (qosTier == null) {
                if (lVar.f() == null) {
                    return true;
                }
            } else if (qosTier.equals(lVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    @P
    public final QosTier f() {
        return this.f343038g;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public final long g() {
        return this.f343032a;
    }

    @Override // com.google.android.datatransport.cct.internal.l
    public final long h() {
        return this.f343033b;
    }

    public final int hashCode() {
        long j12 = this.f343032a;
        long j13 = this.f343033b;
        int i12 = (((((int) (j12 ^ (j12 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        ClientInfo clientInfo = this.f343034c;
        int iHashCode = (i12 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f343035d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f343036e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<k> list = this.f343037f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f343038g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f343032a + ", requestUptimeMs=" + this.f343033b + ", clientInfo=" + this.f343034c + ", logSource=" + this.f343035d + ", logSourceName=" + this.f343036e + ", logEvents=" + this.f343037f + ", qosTier=" + this.f343038g + "}";
    }
}
