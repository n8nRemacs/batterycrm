package defpackage;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import tech.kwik.core.impl.ProtocolError;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public final /* synthetic */ class tsc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ysc b;

    public /* synthetic */ tsc(ysc yscVar, int i) {
        this.a = i;
        this.b = yscVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [usc] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final ysc yscVar = this.b;
                Thread threadCurrentThread = Thread.currentThread();
                fs3 fs3Var = yscVar.o;
                qje qjeVar = yscVar.a;
                rr3 rr3Var = yscVar.Q0;
                yscVar.N0 = new qb3(fs3Var, qjeVar, rr3Var.a, rr3Var.h, new zsc(yscVar, new zsc(new hk6(new zsc(yscVar, new zsc(yscVar, yscVar, yscVar.c), 2))), 0), new BiFunction() { // from class: usc
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        boolean z;
                        ysc yscVar2 = yscVar;
                        ByteBuffer byteBuffer = (ByteBuffer) obj;
                        byte[] bArr = new byte[16];
                        byteBuffer.get(bArr);
                        if (yscVar2.Q0.f.a.values().stream().filter(new gb3(6)).anyMatch(new pr3(1, bArr))) {
                            z = true;
                            yscVar2.d(new rs0(3, true, null, null));
                            if (utb.a(yscVar2.A0)) {
                                yscVar2.c.debug("Received stateless reset");
                            } else {
                                yscVar2.L0.j();
                                yscVar2.O0.a();
                                yscVar2.A0 = 5;
                                try {
                                    yscVar2.D0.schedule(new tsc(yscVar2, 4), yscVar2.L0.d() * 3, TimeUnit.MILLISECONDS);
                                } catch (RejectedExecutionException unused) {
                                }
                                yscVar2.c.info("Entering draining state because stateless reset was received");
                            }
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                }, yscVar.c);
                usd usdVar = new usd(14, yscVar.N0);
                int i = 0;
                while (!threadCurrentThread.isInterrupted()) {
                    try {
                        n8d n8dVarC = yscVar.M0.c();
                        if (n8dVarC != null) {
                            yscVar.T0.getClass();
                            Duration durationBetween = Duration.between(n8dVarC.a, Instant.now());
                            bh8 bh8Var = yscVar.c;
                            i++;
                            String str = "Start processing packet " + i + " (" + n8dVarC.b.limit() + " bytes)";
                            ByteBuffer byteBuffer = n8dVarC.b;
                            bh8Var.raw(str, byteBuffer, 0, byteBuffer.limit());
                            yscVar.c.debug("Processing delay for packet #" + i + ": " + durationBetween.toMillis() + " ms");
                            usdVar.u(n8dVarC.b, new bj(n8dVarC.a, i, 11));
                            yscVar.L0.k();
                            yscVar.j();
                            rde rdeVar = yscVar.L0;
                            ((LinkedBlockingQueue) yscVar.M0.g).isEmpty();
                            rdeVar.getClass();
                        }
                    } catch (InterruptedException unused) {
                        yscVar.c.debug("Terminating receiver loop because of interrupt");
                        return;
                    } catch (ProtocolError unused2) {
                        yscVar.f(utb.e(r0.a), new TransportError(11).getMessage(), 1);
                        yscVar.L0.k();
                        yscVar.j();
                        return;
                    } catch (RuntimeException e) {
                        yscVar.c.debug("Terminating receiver loop because of error", e);
                        yscVar.a(e);
                        return;
                    } catch (TransportError e2) {
                        yscVar.f(utb.e(e2.a), e2.getMessage(), 1);
                        yscVar.L0.k();
                        yscVar.j();
                        return;
                    }
                }
                break;
            case 1:
                ysc yscVar2 = this.b;
                yscVar2.L0.b(m5c.a, "first Handshake message is being sent");
                fs3 fs3Var2 = yscVar2.o;
                ((boolean[]) fs3Var2.j)[0] = true;
                ((hc[]) fs3Var2.h)[0] = null;
                ((hc[]) fs3Var2.i)[0] = null;
                break;
            case 2:
                this.b.p();
                break;
            case 3:
                this.b.p();
                break;
            default:
                this.b.p();
                break;
        }
    }
}
