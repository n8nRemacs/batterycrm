package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

/* renamed from: com.yandex.metrica.impl.ob.dg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38756dg {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f380375a;

    /* renamed from: b, reason: collision with root package name */
    public final long f380376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f380377c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final a f380378d;

    /* renamed from: com.yandex.metrica.impl.ob.dg$a */
    public enum a {
        UNKNOWN("unknown"),
        GP("gpl"),
        HMS("hms-content-provider");


        /* renamed from: a, reason: collision with root package name */
        public final String f380383a;

        a(String str) {
            this.f380383a = str;
        }
    }

    private C38756dg(@j.N byte[] bArr) {
        C39149tf c39149tfA = C39149tf.a(bArr);
        this.f380375a = c39149tfA.f381883a;
        this.f380376b = c39149tfA.f381885c;
        this.f380377c = c39149tfA.f381884b;
        this.f380378d = a(c39149tfA.f381886d);
    }

    @j.P
    public static C38756dg a(@j.N byte[] bArr) {
        if (A2.a(bArr)) {
            return null;
        }
        return new C38756dg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38756dg.class != obj.getClass()) {
            return false;
        }
        C38756dg c38756dg = (C38756dg) obj;
        return this.f380376b == c38756dg.f380376b && this.f380377c == c38756dg.f380377c && this.f380375a.equals(c38756dg.f380375a) && this.f380378d == c38756dg.f380378d;
    }

    public int hashCode() {
        int iHashCode = this.f380375a.hashCode() * 31;
        long j12 = this.f380376b;
        int i12 = (iHashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f380377c;
        return this.f380378d.hashCode() + ((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31);
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.f380375a + "', referrerClickTimestampSeconds=" + this.f380376b + ", installBeginTimestampSeconds=" + this.f380377c + ", source=" + this.f380378d + '}';
    }

    public byte[] a() {
        C39149tf c39149tf = new C39149tf();
        c39149tf.f381883a = this.f380375a;
        c39149tf.f381885c = this.f380376b;
        c39149tf.f381884b = this.f380377c;
        int iOrdinal = this.f380378d.ordinal();
        int i12 = 1;
        if (iOrdinal != 1) {
            i12 = 2;
            if (iOrdinal != 2) {
                i12 = 0;
            }
        }
        c39149tf.f381886d = i12;
        return MessageNano.toByteArray(c39149tf);
    }

    public C38756dg(@j.N String str, long j12, long j13, @j.N a aVar) {
        this.f380375a = str;
        this.f380376b = j12;
        this.f380377c = j13;
        this.f380378d = aVar;
    }

    @j.N
    private a a(int i12) {
        if (i12 == 1) {
            return a.GP;
        }
        if (i12 != 2) {
            return a.UNKNOWN;
        }
        return a.HMS;
    }
}
