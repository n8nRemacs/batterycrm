package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class o6 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ o6(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                return;
            case 1:
                ArrayList arrayList = cy4.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    cy4.j = null;
                    return;
                }
                ArrayList arrayList2 = cy4.j;
                cy4.j = null;
                if (cy4.k == null) {
                    cy4.k = new cy4(Math.max(1, sxi.a.d));
                }
                ((ScheduledExecutorService) sxi.a.f.a.getValue()).execute(new he(arrayList2, 3));
                return;
            case 2:
                try {
                    int i = beg.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (ta5.m == null) {
                        z = false;
                    }
                    if (z) {
                        ta5.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = beg.a;
                    Trace.endSection();
                    throw th;
                }
            case 3:
            case 4:
                return;
            case 5:
                ((nm8) gq9.a.getAccessor().c(2)).a(Collections.singletonList(new brb(0)));
                return;
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    public o6(qj0 qj0Var) {
        this.a = 5;
    }
}
