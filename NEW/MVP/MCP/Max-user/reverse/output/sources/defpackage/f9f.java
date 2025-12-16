package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class f9f extends h9f {
    public final double l;
    public final double m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;

    public f9f(long j, String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, double d, double d2, long j2, String str2, long j3, long j4, long j5, long j6, long j7, long j8, u5i u5iVar) {
        super(1, j, str, bigInteger, bigInteger2, bigInteger3, j2, str2, u5iVar);
        this.l = d;
        this.m = d2;
        this.n = j3;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = j8;
    }

    public final String toString() {
        return "AudioRecv{ssrc=" + this.c + ", transportId='" + this.d + "', trackId='" + this.e + "', packetsReceived=" + this.h + ", packetsLost=" + this.i + ", bytesReceived=" + this.j + ", jitterBufferMs=" + this.k + ", audioLevel=" + this.l + ", totalAudioEnergy=" + this.m + ", unknown=" + this.g + '}';
    }
}
