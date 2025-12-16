package defpackage;

/* loaded from: classes3.dex */
public final class lig {
    public byte[] a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean j;
    public ka5 k;
    public byte[] n;
    public byte[] o;
    public byte[] q;
    public enb r;
    public int i = 3;
    public int l = 25;
    public int m = 2;
    public long s = 0;
    public int p = 1500;

    public final String toString() {
        byte[] bArr = this.a;
        String strA = bArr != null ? uwi.a(bArr) : "null";
        long j = this.b / 1000;
        int i = this.p;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        long j6 = this.g;
        long j7 = this.h;
        int i2 = this.i;
        int i3 = this.l;
        boolean z = this.j;
        int i4 = this.m;
        byte[] bArr2 = this.n;
        String strA2 = bArr2 != null ? uwi.a(bArr2) : "null";
        byte[] bArr3 = this.o;
        String strA3 = bArr3 != null ? uwi.a(bArr3) : "null";
        long j8 = this.s;
        StringBuilder sbQ = xrf.q("\n- original destination connection id\t", j, strA, "\n- max idle timeout\t");
        sbQ.append("\n- max udp payload size\t");
        sbQ.append(i);
        sbQ.append("\n- initial max data\t\t\t");
        sbQ.append(j2);
        az1.r(j3, "\n- initial max stream data bidi local\t", "\n- initial max stream data bidi remote\t", sbQ);
        sbQ.append(j4);
        az1.r(j5, "\n- initial max stream data uni\t\t", "\n- initial max streams bidi\t\t", sbQ);
        sbQ.append(j6);
        az1.r(j7, "\n- initial max streams uni\t\t", "\n- ack delay exponent\t\t\t", sbQ);
        hf3.g(sbQ, i2, "\n- max ack delay\t\t\t\t", i3, "\n- disable migration\t\t\t");
        sbQ.append(z);
        sbQ.append("\n- active connection id limit\t\t");
        sbQ.append(i4);
        sbQ.append("\n- initial source connection id\t\t");
        ho7.r(sbQ, strA2, "\n- retry source connection id\t\t", strA3, "\n- max datagram frame size\t\t");
        sbQ.append(j8);
        return sbQ.toString();
    }
}
