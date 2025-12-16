package defpackage;

import java.time.Clock;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final class lk8 {
    public final Clock a;
    public final lhd b;
    public final xud c;
    public final yga d;
    public final ghd e;
    public final vqc f;
    public volatile Instant j;
    public volatile Instant k;
    public volatile boolean l;
    public volatile long i = -1;
    public final AtomicInteger h = new AtomicInteger();
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public lk8(Clock clock, lhd lhdVar, xud xudVar, yga ygaVar, ghd ghdVar, vqc vqcVar) {
        this.a = clock;
        this.b = lhdVar;
        this.c = xudVar;
        this.d = ygaVar;
        this.e = ghdVar;
        this.f = vqcVar;
    }

    public final synchronized void a() {
        this.d.b((List) this.g.values().stream().filter(new kk8(3)).filter(new kk8(4)).collect(Collectors.toList()));
        this.h.set(0);
        this.g.clear();
        this.j = null;
        this.k = null;
        this.l = true;
    }

    public final void b() {
        if (this.l) {
            return;
        }
        long jMax = (int) (Integer.max(this.c.b(), this.c.f) * 1.125f);
        Instant instantMinusMillis = Instant.now(this.a).minusMillis(jMax);
        List list = (List) this.g.values().stream().filter(new kk8(8)).filter(new cn4(this, 2, instantMinusMillis)).filter(new gb3(24)).collect(Collectors.toList());
        if (!list.isEmpty()) {
            List list2 = (List) list.stream().filter(new gb3(28)).collect(Collectors.toList());
            this.h.getAndAdd(((int) list2.stream().filter(new gb3(29)).count()) * (-1));
            list2.stream().forEach(new jk8(this, 0));
            this.e.run();
            yga ygaVar = this.d;
            List list3 = (List) list2.stream().filter(new gb3(27)).collect(Collectors.toList());
            synchronized (ygaVar) {
                long jSum = list3.stream().map(new m0(2)).mapToInt(new n0(2)).sum();
                ygaVar.b -= jSum;
                ygaVar.d.k();
                if (jSum > 0) {
                    ygaVar.a();
                    ygaVar.a.debug("Bytes in flight decreased to " + ygaVar.b + " (" + list3.size() + " packets lost)");
                }
            }
            if (!list3.isEmpty() && ((tlb) list3.stream().max(new ov5(13)).get()).a.isAfter(ygaVar.f)) {
                ygaVar.f = Instant.now();
                ygaVar.c /= 2;
                long j = 2400;
                if (ygaVar.c < j) {
                    ygaVar.c = j;
                }
                bh8 bh8Var = ygaVar.a;
                long j2 = ygaVar.c;
                long j3 = ygaVar.b;
                StringBuilder sbL = az1.l(j2, "Cwnd(-): ", "; inflight: ");
                sbL.append(j3);
                bh8Var.cc(sbL.toString());
                ygaVar.e = ygaVar.c;
            }
            ygaVar.a.getQLog().getClass();
            list2.stream().forEach(new jk8(this, 1));
        }
        Optional optionalMin = this.g.values().stream().filter(new gb3(25)).filter(new ik8(this, 0)).filter(new gb3(26)).map(new m0(28)).min(new ov5(9));
        if (optionalMin.isPresent() && ((Instant) optionalMin.get()).isAfter(instantMinusMillis)) {
            this.j = ((Instant) optionalMin.get()).plusMillis(jMax);
        } else {
            this.j = null;
        }
    }
}
