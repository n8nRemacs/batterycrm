package defpackage;

import java.time.Instant;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class tlb {
    public final Instant a;
    public final btc b;
    public final Consumer c;
    public boolean d;
    public boolean e;

    public tlb(Instant instant, btc btcVar, Consumer consumer) {
        this.a = instant;
        this.b = btcVar;
        this.c = consumer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Lb:
            r0 = move-exception
            goto L10
        Ld:
            r0 = 0
        Le:
            monitor-exit(r1)
            return r0
        L10:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tlb.a():boolean");
    }

    public final synchronized boolean b() {
        if (this.e || this.d) {
            return false;
        }
        this.d = true;
        return true;
    }

    public final String toString() {
        btc btcVar = this.b;
        return "Packet " + btcVar.l().name().charAt(0) + "|" + (btcVar.m().longValue() >= 0 ? btcVar.m() : ".") + "| |" + btcVar.o() + "|" + (this.e ? "Acked" : this.d ? "Lost" : "Inflight");
    }
}
