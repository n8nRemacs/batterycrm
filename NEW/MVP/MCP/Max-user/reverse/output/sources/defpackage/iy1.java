package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class iy1 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public iy1(Context context, bhd bhdVar, xw5 xw5Var) {
        this.a = false;
        this.b = false;
        this.c = i6j.a(context);
        this.d = bhdVar;
        this.e = xw5Var;
    }

    public void a() throws InterruptedException {
        synchronized (this.e) {
            this.b = true;
            ((ArrayDeque) this.g).clear();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean z = false;
        ((ExecutorService) this.c).submit(new dj(this, z, new o72(this, 6, countDownLatch), 6));
        countDownLatch.await();
    }

    public void b(Exception exc) {
        synchronized (this.e) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                ((z3h) this.f).d(VideoFrameProcessingException.a(exc));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(a4h a4hVar) throws ExecutionException, InterruptedException, TimeoutException {
        if (d()) {
            try {
                a4hVar.run();
                return;
            } catch (Exception e) {
                b(e);
                return;
            }
        }
        try {
            ((ExecutorService) this.c).submit(new n1h(this, 4, a4hVar)).get(500L, TimeUnit.MILLISECONDS);
        } catch (RuntimeException | ExecutionException | TimeoutException e2) {
            b(e2);
        }
    }

    public boolean d() throws InterruptedException {
        try {
            return Thread.currentThread() == ((Thread) ((Future) this.d).get(500L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            b(e2);
            return false;
        }
    }

    public void e(a4h a4hVar) {
        hsi.g(!d());
        synchronized (this.e) {
            this.b = true;
            ((ArrayDeque) this.g).clear();
        }
        ((ExecutorService) this.c).submit(new dj((Object) this, false, (Object) a4hVar, 6));
        if (this.a) {
            ((ExecutorService) this.c).shutdown();
            if (((ExecutorService) this.c).awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                return;
            }
            ((z3h) this.f).d(new VideoFrameProcessingException("Release timed out. OpenGL resources may not be cleaned up properly."));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.dhd f(java.util.concurrent.Executor r13, defpackage.ju3 r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy1.f(java.util.concurrent.Executor, ju3):dhd");
    }

    public void g(a4h a4hVar, boolean z) {
        synchronized (this.e) {
            if (this.b && z) {
                return;
            }
            try {
                ((ExecutorService) this.c).submit(new dj(this, z, a4hVar, 6));
                e = null;
            } catch (RejectedExecutionException e) {
                e = e;
            }
            if (e != null) {
                b(e);
            }
        }
    }

    public void h(a4h a4hVar) {
        synchronized (this.e) {
            try {
                if (this.b) {
                    return;
                }
                ((ArrayDeque) this.g).add(a4hVar);
                g(new y3h(), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        try {
            hsi.g(d());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            b(e);
        }
    }

    public void j() {
        if (z4j.a((Context) this.c, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        z5j.f("The Recorder this recording is associated to doesn't support audio.", ((sa0) bhd.l(((bhd) this.d).C)).b.e != 0);
        this.a = true;
    }

    public iy1(ry1 ry1Var, qee qeeVar) {
        this.a = false;
        this.b = false;
        this.e = new Object();
        this.f = new ukd(8);
        this.c = ry1Var;
        this.d = qeeVar;
    }

    public iy1(ExecutorService executorService, boolean z, z3h z3hVar) {
        this.c = executorService;
        this.d = executorService.submit(new hgf(1));
        this.a = z;
        this.f = z3hVar;
        this.e = new Object();
        this.g = new ArrayDeque();
    }
}
