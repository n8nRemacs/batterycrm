package defpackage;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ru.ok.android.onelog.impl.BuildConfig;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class z5 extends atc {
    public static final int Y = (int) Math.pow(2.0d, 3.0d);
    public String X = null;
    public final byte[] a;
    public long b;
    public int c;
    public List d;
    public int o;

    public z5(ArrayList arrayList, int i) {
        this.o = 8;
        Iterator it = arrayList.iterator();
        long j = BuildConfig.MAX_TIME_TO_UPLOAD;
        while (it.hasNext()) {
            n7d n7dVar = (n7d) it.next();
            if (n7dVar.b >= j - 1) {
                throw new IllegalArgumentException("invalid range");
            }
            j = n7dVar.a;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Objects.requireNonNull(next);
            arrayList2.add(next);
        }
        this.d = Collections.unmodifiableList(arrayList2);
        int i2 = Y;
        this.o = i2;
        this.c = (i * 1000) / i2;
        Iterator it3 = arrayList.iterator();
        n7d n7dVar2 = (n7d) it3.next();
        long j2 = n7dVar2.b;
        long j3 = n7dVar2.a;
        this.b = j2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1000);
        byteBufferAllocate.put((byte) 2);
        epi.c(this.b, byteBufferAllocate);
        epi.b(this.c, byteBufferAllocate);
        epi.b(arrayList.size() - 1, byteBufferAllocate);
        epi.b(((int) ((n7dVar2.b - j3) + 1)) - 1, byteBufferAllocate);
        while (it3.hasNext()) {
            n7d n7dVar3 = (n7d) it3.next();
            long j4 = n7dVar3.b;
            long j5 = n7dVar3.a;
            epi.b((int) ((j3 - j4) - 2), byteBufferAllocate);
            epi.b(((int) ((j4 - j5) + 1)) - 1, byteBufferAllocate);
            j3 = j5;
        }
        byte[] bArr = new byte[byteBufferAllocate.position()];
        this.a = bArr;
        byteBufferAllocate.get(bArr);
    }

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        List list;
        this.o = (int) Math.pow(2.0d, yscVar.x0);
        ((b6[]) yscVar.b1.b)[btcVar.n().ordinal()].e(this);
        lhd lhdVar = yscVar.w0;
        m5c m5cVarN = btcVar.n();
        Instant instant = (Instant) bjVar.c;
        if (lhdVar.p) {
            return;
        }
        if (lhdVar.m > 0) {
            if (lhdVar.f()) {
                lhdVar.g.recovery("probe count not reset on ack because handshake not yet confirmed");
            } else {
                lhdVar.m = 0;
            }
        }
        lk8 lk8Var = lhdVar.e[m5cVarN.ordinal()];
        if (!lk8Var.l) {
            lk8Var.i = Long.max(lk8Var.i, this.b);
            List list2 = (List) this.d.stream().flatMap(new m0(5)).filter(new ik8(lk8Var, 1)).map(new ni(17, lk8Var)).filter(new kk8(5)).filter(new kk8(6)).collect(Collectors.toList());
            lk8Var.h.getAndAdd(((int) list2.stream().filter(new kk8(7)).count()) * (-1));
            yga ygaVar = lk8Var.d;
            List list3 = (List) list2.stream().filter(new gb3(27)).collect(Collectors.toList());
            synchronized (ygaVar) {
                boolean z = ygaVar.c - ygaVar.b <= ((long) 3);
                long j = ygaVar.b;
                ygaVar.c(list3);
                Stream map = list3.stream().filter(new a6(6, ygaVar)).map(new xga(0));
                if (z) {
                    long j2 = ygaVar.c;
                    map.forEach(new m4(13, ygaVar));
                    if (ygaVar.c != j2) {
                        bh8 bh8Var = ygaVar.a;
                        long j3 = ygaVar.c;
                        list = list2;
                        char c = ygaVar.c < ygaVar.e ? (char) 1 : (char) 2;
                        StringBuilder sb = new StringBuilder("Cwnd(+): ");
                        sb.append(j3);
                        sb.append(" (");
                        sb.append(c != 1 ? c != 2 ? "null" : "CongestionAvoidance" : "SlowStart");
                        sb.append("); inflight: ");
                        sb.append(j);
                        bh8Var.cc(sb.toString());
                    } else {
                        list = list2;
                    }
                } else {
                    list = list2;
                }
            }
            lk8Var.b();
            lk8Var.b.k();
            xud xudVar = lk8Var.c;
            Optional optionalFindFirst = list.stream().filter(new a6(10, this)).findFirst();
            if (optionalFindFirst.isPresent() && list.stream().anyMatch(new kk8(18))) {
                Instant instant2 = ((tlb) optionalFindFirst.get()).a;
                int i = (this.c * this.o) / 1000;
                if (instant.isBefore(instant2)) {
                    xudVar.a.error("Receiving negative rtt estimate: sent=" + instant2 + ", received=" + instant);
                } else {
                    if (i > xudVar.g) {
                        i = xudVar.g;
                    }
                    int i2 = xudVar.d;
                    int millis = (int) Duration.between(instant2, instant).toMillis();
                    if (millis < xudVar.c) {
                        xudVar.c = millis;
                    }
                    if (millis >= xudVar.c + i) {
                        millis -= i;
                    }
                    xudVar.f = millis;
                    if (xudVar.d == -1) {
                        xudVar.d = millis;
                        xudVar.e = millis / 2;
                    } else {
                        xudVar.e = (((xudVar.e * 3) + Math.abs(xudVar.d - millis)) + 2) / 4;
                        xudVar.d = (((xudVar.d * 7) + millis) + 4) / 8;
                    }
                    bh8 bh8Var2 = xudVar.a;
                    int i3 = xudVar.d;
                    StringBuilder sbK = wy1.k("RTT: ", i2, " + ", millis, " -> ");
                    sbK.append(i3);
                    bh8Var2.debug(sbK.toString());
                }
            }
            list.stream().forEach(new jk8(lk8Var, 2));
        }
        lhdVar.h(true);
    }

    @Override // defpackage.atc
    public final int c() {
        byte[] bArr = this.a;
        if (bArr != null) {
            return bArr.length;
        }
        throw new IllegalStateException("frame length not known for parsed frames");
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }

    public final void h(int i, long j) throws TransportError {
        long j2 = (j - i) + 1;
        if (j2 < 0) {
            throw new TransportError(8, "negative packet number in ACK frame");
        }
        this.d.add(new n7d(j2, j));
    }

    public final void i(ByteBuffer byteBuffer, bh8 bh8Var) {
        bh8Var.debug("Parsing AckFrame");
        this.d = new ArrayList();
        byte b = byteBuffer.get();
        this.b = epi.i(byteBuffer);
        this.c = atc.e(byteBuffer);
        int iG = epi.g(byteBuffer);
        long j = this.b;
        int iE = atc.e(byteBuffer);
        h(iE + 1, this.b);
        long j2 = j - iE;
        for (int i = 0; i < iG; i++) {
            int iE2 = atc.e(byteBuffer) + 1;
            h(atc.e(byteBuffer) + 1, (j2 - iE2) - 1);
            j2 -= iE2 + r5;
        }
        if (b == 3) {
            epi.i(byteBuffer);
            epi.i(byteBuffer);
            epi.i(byteBuffer);
        }
    }

    public final String toString() {
        if (this.X == null) {
            this.X = (String) this.d.stream().map(new m0(4)).collect(Collectors.joining(","));
        }
        return "AckFrame[" + this.X + "|Δ" + ((this.c * this.o) / 1000) + "]";
    }
}
