package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class nd7 implements au {
    public final ScheduledExecutorService X;
    public zwd Y;
    public int Z;
    public final Context a;
    public final g95 b;
    public final gp0 c;
    public final zt d;
    public final boolean o;
    public volatile int s0;

    public nd7(Context context, g95 g95Var, zt ztVar, gp0 gp0Var, boolean z) {
        hsi.g(g95Var.d != -9223372036854775807L);
        hsi.g(g95Var.e != -2147483647);
        this.a = context;
        this.b = g95Var;
        this.d = ztVar;
        this.c = gp0Var;
        this.o = z;
        this.X = Executors.newSingleThreadScheduledExecutor();
        this.Z = 0;
    }

    public final void a(final Bitmap bitmap, final hf6 hf6Var) {
        try {
            zwd zwdVar = this.Y;
            if (zwdVar == null) {
                this.Y = this.d.b(hf6Var);
                final int i = 0;
                this.X.schedule(new Runnable(this) { // from class: md7
                    public final /* synthetic */ nd7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.b.a(bitmap, hf6Var);
                                break;
                            default:
                                this.b.a(bitmap, hf6Var);
                                break;
                        }
                    }
                }, 10L, TimeUnit.MILLISECONDS);
                return;
            }
            int iD = zwdVar.d(bitmap, new ct3(0, this.b.d, r4.e));
            if (iD == 1) {
                this.s0 = 100;
                this.Y.f();
            } else if (iD == 2) {
                final int i2 = 1;
                this.X.schedule(new Runnable(this) { // from class: md7
                    public final /* synthetic */ nd7 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.b.a(bitmap, hf6Var);
                                break;
                            default:
                                this.b.a(bitmap, hf6Var);
                                break;
                        }
                    }
                }, 10L, TimeUnit.MILLISECONDS);
            } else {
                if (iD != 3) {
                    throw new IllegalStateException();
                }
                this.s0 = 100;
            }
        } catch (ExportException e) {
            this.d.c(e);
        } catch (RuntimeException e2) {
            this.d.c(ExportException.a(1000, e2));
        }
    }

    @Override // defpackage.au
    public final int g(l16 l16Var) {
        if (this.Z == 2) {
            l16Var.b = this.s0;
        }
        return this.Z;
    }

    @Override // defpackage.au
    public final ah7 j() {
        return ekd.Y;
    }

    @Override // defpackage.au
    public final void release() {
        this.Z = 0;
        this.X.shutdownNow();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r4 = this;
            r0 = 2
            r4.Z = r0
            g95 r0 = r4.b
            long r1 = r0.d
            zt r3 = r4.d
            r3.d(r1)
            r1 = 1
            r3.a(r1)
            k09 r0 = r0.a
            android.content.Context r1 = r4.a
            java.lang.String r1 = defpackage.tfi.c(r1, r0)
            if (r1 == 0) goto L2f
            gp0 r2 = r4.c
            boolean r3 = r2.l(r1)
            if (r3 != 0) goto L23
            goto L2f
        L23:
            a09 r0 = r0.b
            r0.getClass()
            android.net.Uri r0 = r0.a
            ha8 r0 = r2.e(r0)
            goto L4a
        L2f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempted to load a Bitmap from unsupported MIME type: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            yf7 r1 = new yf7
            r1.<init>()
            r1.l(r0)
            r0 = r1
        L4a:
            iv6 r1 = new iv6
            r2 = 20
            r1.<init>(r2, r4)
            yn6 r2 = new yn6
            r3 = 0
            r2.<init>(r0, r3, r1)
            java.util.concurrent.ScheduledExecutorService r1 = r4.X
            r0.d(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd7.start():void");
    }
}
