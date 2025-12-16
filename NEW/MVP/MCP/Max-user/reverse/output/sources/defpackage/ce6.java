package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ce6 implements sa5 {
    public ThreadPoolExecutor X;
    public ThreadPoolExecutor Y;
    public eaj Z;
    public final Context a;
    public final qt6 b;
    public final tha c;
    public final Object d = new Object();
    public Handler o;

    public ce6(Context context, qt6 qt6Var) {
        z5j.e(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = qt6Var;
        this.c = de6.g;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.Z = null;
                Handler handler = this.o;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.o = null;
                ThreadPoolExecutor threadPoolExecutor = this.Y;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.X = null;
                this.Y = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sa5
    public final void b(eaj eajVar) {
        synchronized (this.d) {
            this.Z = eajVar;
        }
        synchronized (this.d) {
            try {
                if (this.Z == null) {
                    return;
                }
                if (this.X == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new nn3(0, "emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.Y = threadPoolExecutor;
                    this.X = threadPoolExecutor;
                }
                this.X.execute(new gq5(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final me6 c() {
        try {
            tha thaVar = this.c;
            Context context = this.a;
            qt6 qt6Var = this.b;
            thaVar.getClass();
            bj bjVarD = bxe.d(context, qt6Var);
            int i = bjVarD.b;
            if (i != 0) {
                throw new RuntimeException(wy1.e(i, "fetchFonts failed (", ")"));
            }
            me6[] me6VarArr = (me6[]) bjVarD.c;
            if (me6VarArr == null || me6VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return me6VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
