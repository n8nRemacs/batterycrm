package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class k9f extends i9f {
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;

    public k9f(long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Long l, String str2, u5i u5iVar, Boolean bool) {
        super(2, j, str, bigInteger, bigInteger2, bigInteger3, l, str2, u5iVar, bool);
        this.m = j2;
        this.n = j3;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = j8;
        this.t = j9;
    }

    public final String toString() {
        return "VideoSend{ssrc=" + this.c + ", transportId='" + this.d + "', trackId='" + this.e + "', packetsSent=" + this.h + ", packetsLost=" + this.i + ", bytesSent=" + this.j + ", nacksReceived=" + this.m + ", pliReceived=" + this.n + ", firReceived=" + this.o + ", framesEncoded=" + this.p + ", adaptationChanges=" + this.q + ", avgEncodeMs=" + this.r + ", frameWidth=" + this.s + ", frameHeight=" + this.t + ", isMediaShare=" + this.l + ", targetBitrate=" + this.k + ", unknown=" + this.g + '}';
    }
}
