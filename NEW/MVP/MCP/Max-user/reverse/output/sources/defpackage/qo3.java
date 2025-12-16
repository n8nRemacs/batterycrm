package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class qo3 {
    public final ExecutorService a;
    public final ExecutorService b;
    public final z5i c;
    public final kc3 d;
    public final usd e;
    public final int f;
    public final int g;
    public final int h;

    public qo3(uaj uajVar) {
        ExecutorService executorService = (ExecutorService) uajVar.c;
        if (executorService == null) {
            this.a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new no3(false));
        } else {
            this.a = executorService;
        }
        ExecutorService executorService2 = (ExecutorService) uajVar.e;
        if (executorService2 == null) {
            this.b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new no3(true));
        } else {
            this.b = executorService2;
        }
        z5i z5iVar = (z5i) uajVar.d;
        if (z5iVar == null) {
            String str = z5i.a;
            this.c = new y5i();
        } else {
            this.c = z5iVar;
        }
        this.d = new kc3(22);
        this.e = new usd(15);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = uajVar.b;
    }
}
