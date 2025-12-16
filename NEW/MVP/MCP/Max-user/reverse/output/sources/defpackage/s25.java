package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* loaded from: classes.dex */
public final class s25 implements h25 {
    public final Context a;
    public final j25 b;
    public final boolean c;
    public final Class d;
    public t25 e;

    public s25(Context context, j25 j25Var, boolean z, Class cls) {
        this.a = context;
        this.b = j25Var;
        this.c = z;
        this.d = cls;
        j25Var.e.add(this);
    }

    @Override // defpackage.h25
    public final void a(j25 j25Var) {
        t25 t25Var = this.e;
        if (t25Var != null) {
            t25.a(t25Var, j25Var.l);
        }
    }

    @Override // defpackage.h25
    public final void b() {
    }

    @Override // defpackage.h25
    public final void c() {
        t25 t25Var = this.e;
        if (t25Var != null) {
            t25Var.b();
        }
    }

    @Override // defpackage.h25
    public final void d(j25 j25Var, boolean z) {
        if (z || j25Var.i) {
            return;
        }
        t25 t25Var = this.e;
        if (t25Var == null || t25Var.o) {
            List list = j25Var.l;
            for (int i = 0; i < list.size(); i++) {
                if (((xz4) list.get(i)).b == 0) {
                    g();
                    return;
                }
            }
        }
    }

    @Override // defpackage.h25
    public final void e(xz4 xz4Var, Exception exc) {
        t25 t25Var = this.e;
        if (t25Var == null || t25Var.o) {
            int i = xz4Var.b;
            if (i == 2 || i == 5 || i == 7) {
                a8i.l("DownloadService", "DownloadService wasn't running. Restarting.");
                g();
            }
        }
    }

    @Override // defpackage.h25
    public final void f(j25 j25Var, xz4 xz4Var) {
    }

    public final void g() {
        boolean z = this.c;
        Class cls = this.d;
        Context context = this.a;
        if (!z) {
            try {
                context.startService(new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused) {
                a8i.l("DownloadService", "Failed to restart (process is idle)");
            }
        } else {
            try {
                Intent action = new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                String str = zxg.a;
                context.startForegroundService(action);
            } catch (IllegalStateException unused2) {
                a8i.l("DownloadService", "Failed to restart (foreground launch restriction)");
            }
        }
    }
}
