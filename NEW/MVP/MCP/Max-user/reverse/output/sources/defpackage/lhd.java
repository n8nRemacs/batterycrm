package defpackage;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class lhd {
    public final Clock a;
    public final int b;
    public final xud c;
    public final yga d;
    public final lk8[] e;
    public final rde f;
    public final bh8 g;
    public final ScheduledExecutorService h;
    public final int i;
    public int j;
    public ScheduledFuture k;
    public final Object l;
    public volatile int m;
    public volatile Instant n;
    public volatile int o;
    public volatile boolean p;

    public lhd(int i, xud xudVar, yga ygaVar, rde rdeVar, bh8 bh8Var) {
        Clock clockSystemUTC = Clock.systemUTC();
        this.e = new lk8[m5c.values().length];
        this.l = new Object();
        int i2 = 1;
        this.o = 1;
        int i3 = 0;
        this.p = false;
        this.a = clockSystemUTC;
        this.b = i;
        xud xudVar2 = xudVar;
        this.c = xudVar2;
        yga ygaVar2 = ygaVar;
        this.d = ygaVar2;
        m5c[] m5cVarArrValues = m5c.values();
        int length = m5cVarArrValues.length;
        int i4 = 0;
        while (i4 < length) {
            this.e[m5cVarArrValues[i4].ordinal()] = new lk8(clockSystemUTC, this, xudVar2, ygaVar2, new ghd(rdeVar, i3), bh8Var.getQLog());
            i4++;
            xudVar2 = xudVar;
            ygaVar2 = ygaVar;
        }
        this.f = rdeVar;
        this.g = bh8Var;
        this.h = Executors.newScheduledThreadPool(1, new pc4("loss-detection", 0));
        synchronized (this.l) {
            this.k = new khd();
        }
        String property = System.getProperty("tech.kwik.core.probe-type");
        if (property != null) {
            String lowerCase = property.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("double")) {
                bh8Var.recovery("Using PaddingFrame as probe");
                i2 = 3;
            } else if (lowerCase.equals("single")) {
                bh8Var.recovery("Using PingFrame as probe");
                i2 = 2;
            }
        }
        this.i = i2;
    }

    public static void g(Runnable runnable, int i) throws InterruptedException {
        for (int i2 = 0; i2 < i; i2++) {
            runnable.run();
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public final wib a(Function function) {
        wib wibVar = null;
        for (m5c m5cVar : m5c.values()) {
            Instant instant = (Instant) function.apply(this.e[m5cVar.ordinal()]);
            if (instant != null) {
                if (wibVar == null) {
                    wibVar = new wib(m5cVar, instant, false, 5);
                } else if (!((Instant) wibVar.c).isBefore(instant)) {
                    wibVar = new wib(m5cVar, instant, false, 5);
                }
            }
        }
        return wibVar;
    }

    public final List b(m5c m5cVar) {
        Optional optionalFindFirst = ((List) this.e[m5cVar.ordinal()].g.values().stream().filter(new kk8(1)).filter(new kk8(2)).map(new m0(29)).collect(Collectors.toList())).stream().filter(new kk8(13)).filter(new kk8(14)).findFirst();
        return optionalFindFirst.isPresent() ? (List) ((btc) optionalFindFirst.get()).c.stream().filter(new kk8(15)).collect(Collectors.toList()) : Collections.EMPTY_LIST;
    }

    public final wib c() {
        int iMax = (Integer.max(1, this.c.a() * 4) + this.c.b()) * ((int) Math.pow(2.0d, this.m));
        if (f()) {
            if (az1.v(this.o) < 1) {
                this.g.recovery("getPtoTimeAndSpace: no ack eliciting in flight and no handshake keys -> probe Initial");
                return new wib(m5c.a, this.a.instant().plusMillis(iMax), false, 5);
            }
            this.g.recovery("getPtoTimeAndSpace: no ack eliciting in flight but handshake keys -> probe Handshake");
            return new wib(m5c.b, this.a.instant().plusMillis(iMax), false, 5);
        }
        Instant instantPlusMillis = Instant.MAX;
        m5c m5cVar = null;
        for (m5c m5cVar2 : m5c.values()) {
            if (this.e[m5cVar2.ordinal()].h.get() != 0) {
                m5c m5cVar3 = m5c.c;
                if (m5cVar2 != m5cVar3 || az1.v(this.o) >= 4) {
                    if (m5cVar2 == m5cVar3) {
                        iMax += this.j * ((int) Math.pow(2.0d, this.m));
                    }
                    Instant instant = this.e[m5cVar2.ordinal()].k;
                    if (instant != null) {
                        long j = iMax;
                        if (instant.plusMillis(j).isBefore(instantPlusMillis)) {
                            instantPlusMillis = instant.plusMillis(j);
                            m5cVar = m5cVar2;
                        }
                    }
                } else {
                    this.g.recovery("getPtoTimeAndSpace is skipping level App, because handshake not yet confirmed!");
                }
            }
        }
        if (m5cVar == null) {
            return null;
        }
        return new wib(m5cVar, instantPlusMillis, false, 5);
    }

    public final void d(int i) {
        if (this.p) {
            return;
        }
        int i2 = this.o;
        this.o = i;
        if (i != 5 || i2 == 5) {
            return;
        }
        this.g.recovery("State is set to ".concat(u45.u(i)));
        k();
    }

    public final void e() {
        Instant instant = this.n;
        if (instant == null) {
            this.g.warn("Loss detection timeout: Timer was cancelled.");
            return;
        }
        if (!this.a.instant().isBefore(instant) || Duration.between(this.a.instant(), instant).toMillis() <= 0) {
            this.g.recovery("%s loss detection timeout handler running", this.a.instant());
        } else {
            this.g.warn("Loss detection timeout running (at " + this.a.instant() + ") is " + Duration.between(this.a.instant(), instant).toMillis() + " ms too early; rescheduling to " + this.n);
            i(this.n);
        }
        wib wibVarA = a(new xga(3));
        if ((wibVarA != null ? (Instant) wibVarA.c : null) != null) {
            this.e[((m5c) wibVarA.b).ordinal()].b();
            h(false);
            this.f.k();
            k();
            return;
        }
        if (this.g.logRecovery()) {
            wib wibVarA2 = a(new xga(4));
            if (wibVarA2 != null) {
                this.g.recovery(String.format("Sending probe %d, because no ack since %%s. Current RTT: %d/%d.", Integer.valueOf(this.m), Integer.valueOf(this.c.b()), Integer.valueOf(this.c.a())), (Instant) wibVarA2.c);
            } else {
                this.g.recovery(String.format("Sending probe %d. Current RTT: %d/%d.", Integer.valueOf(this.m), Integer.valueOf(this.c.b()), Integer.valueOf(this.c.a())));
            }
        }
        this.m++;
        int i = this.m > 1 ? 2 : 1;
        if (Stream.of((Object[]) this.e).anyMatch(new kk8(17))) {
            wib wibVarC = c();
            if (wibVarC == null) {
                this.g.recovery("Refraining from sending probe because received ack meanwhile");
                return;
            } else {
                j((m5c) wibVarC.b, i);
                return;
            }
        }
        if (!f()) {
            this.g.recovery("Refraining from sending probe as no ack eliciting in flight and no peer awaiting address validation");
            return;
        }
        this.g.recovery("Sending probe because peer awaiting address validation");
        if (az1.v(this.o) < 1) {
            j(m5c.a, 1);
        } else {
            j(m5c.b, 1);
        }
    }

    public final boolean f() {
        return this.b == 1 && az1.v(this.o) < 4 && this.e[1].i < 0;
    }

    public final void h(boolean z) {
        long j = this.d.c;
        long j2 = this.d.b;
        if (!z) {
            this.g.getQLog().getClass();
            return;
        }
        vqc qLog = this.g.getQLog();
        this.c.getClass();
        this.c.getClass();
        int i = this.c.f;
        qLog.getClass();
    }

    public final void i(Instant instant) {
        try {
            synchronized (this.l) {
                this.k.cancel(false);
                this.n = instant;
                this.k = this.h.schedule(new hhd(this, 0), Duration.between(this.a.instant(), instant).toMillis(), TimeUnit.MILLISECONDS);
            }
        } catch (RejectedExecutionException e) {
            if (!this.p) {
                throw e;
            }
        }
    }

    public final void j(final m5c m5cVar, int i) throws InterruptedException {
        bh8 bh8Var = this.g;
        int i2 = this.i;
        if (i2 == 2) {
            bh8Var.recovery("Sending single PingFrame as probe");
            final int i3 = 0;
            g(new Runnable(this) { // from class: ihd
                public final /* synthetic */ lhd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            rde rdeVar = this.b.f;
                            Object[] objArr = {new r0c()};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            arrayList.add(obj);
                            rdeVar.i(Collections.unmodifiableList(arrayList), m5cVar.a());
                            break;
                        default:
                            rde rdeVar2 = this.b.f;
                            Object[] objArr2 = {new r0c(), new r0c()};
                            ArrayList arrayList2 = new ArrayList(2);
                            for (int i4 = 0; i4 < 2; i4++) {
                                Object obj2 = objArr2[i4];
                                Objects.requireNonNull(obj2);
                                arrayList2.add(obj2);
                            }
                            rdeVar2.i(Collections.unmodifiableList(arrayList2), m5cVar.a());
                            break;
                    }
                }
            }, i);
            return;
        }
        if (i2 == 3) {
            bh8Var.recovery("Sending two PingFrames as probe");
            final int i4 = 1;
            g(new Runnable(this) { // from class: ihd
                public final /* synthetic */ lhd b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            rde rdeVar = this.b.f;
                            Object[] objArr = {new r0c()};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            arrayList.add(obj);
                            rdeVar.i(Collections.unmodifiableList(arrayList), m5cVar.a());
                            break;
                        default:
                            rde rdeVar2 = this.b.f;
                            Object[] objArr2 = {new r0c(), new r0c()};
                            ArrayList arrayList2 = new ArrayList(2);
                            for (int i42 = 0; i42 < 2; i42++) {
                                Object obj2 = objArr2[i42];
                                Objects.requireNonNull(obj2);
                                arrayList2.add(obj2);
                            }
                            rdeVar2.i(Collections.unmodifiableList(arrayList2), m5cVar.a());
                            break;
                    }
                }
            }, i);
            return;
        }
        m5c m5cVar2 = m5c.a;
        if (m5cVar == m5cVar2) {
            final List listB = b(m5cVar2);
            if (listB.isEmpty()) {
                bh8Var.recovery("(Probe is Initial ping, because there is no Initial data to retransmit)");
                g(new hhd(this, 1), i);
                return;
            } else {
                bh8Var.recovery("(Probe is an initial retransmit)");
                final int i5 = 0;
                g(new Runnable(this) { // from class: jhd
                    public final /* synthetic */ lhd b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.b.f.i(listB, hf5.a);
                                break;
                            default:
                                this.b.f.i(listB, hf5.c);
                                break;
                        }
                    }
                }, i);
                return;
            }
        }
        m5c m5cVar3 = m5c.b;
        if (m5cVar == m5cVar3) {
            final List listB2 = b(m5cVar3);
            if (listB2.isEmpty()) {
                bh8Var.recovery("(Probe is a handshake ping)");
                g(new hhd(this, 2), i);
                return;
            } else {
                bh8Var.recovery("(Probe is a handshake retransmit)");
                final int i6 = 1;
                g(new Runnable(this) { // from class: jhd
                    public final /* synthetic */ lhd b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.b.f.i(listB2, hf5.a);
                                break;
                            default:
                                this.b.f.i(listB2, hf5.c);
                                break;
                        }
                    }
                }, i);
                return;
            }
        }
        hf5 hf5VarA = m5cVar.a();
        List listB3 = b(m5cVar);
        if (listB3.isEmpty()) {
            bh8Var.recovery("(Probe is ping on level " + hf5VarA + ")");
            g(new d8c(this, 16, hf5VarA), i);
            return;
        }
        bh8Var.recovery("(Probe is retransmit on level " + hf5VarA + ")");
        g(new zcd(this, listB3, hf5VarA), i);
    }

    public final void k() {
        xud xudVar = this.c;
        bh8 bh8Var = this.g;
        wib wibVarA = a(new xga(3));
        Instant instant = wibVarA != null ? (Instant) wibVarA.c : null;
        if (instant != null) {
            i(instant);
            return;
        }
        boolean zAnyMatch = Stream.of((Object[]) this.e).anyMatch(new kk8(17));
        boolean zF = f();
        if (!zAnyMatch && !zF) {
            bh8Var.recovery("cancelling loss detection timer (no loss time set, no ack eliciting in flight, peer not awaiting address validation (2))");
            this.k.cancel(true);
            this.n = null;
            return;
        }
        wib wibVarC = c();
        if (wibVarC == null) {
            bh8Var.recovery("cancelling loss detection timer (no loss time set, no ack eliciting in flight, peer not awaiting address validation (1))");
            this.k.cancel(true);
            this.n = null;
            return;
        }
        Instant instant2 = (Instant) wibVarC.c;
        i(instant2);
        if (bh8Var.logRecovery()) {
            int millis = (int) Duration.between(this.a.instant(), instant2).toMillis();
            m5c m5cVar = (m5c) wibVarC.b;
            String str = zF ? "peerAwaitingAddressValidation " : "";
            String str2 = zAnyMatch ? "ackElicitingInFlight " : "";
            bh8Var.recovery("reschedule loss detection timer for PTO over " + millis + " millis, based on %s/" + m5cVar + ", because " + str + str2 + "| RTT:" + xudVar.b() + "/" + xudVar.a(), instant2);
        }
    }
}
