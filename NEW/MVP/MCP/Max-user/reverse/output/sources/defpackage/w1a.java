package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w1a extends FutureTask {
    public final /* synthetic */ sx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1a(sx sxVar, bm4 bm4Var) {
        super(bm4Var);
        this.a = sxVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        sx sxVar = this.a;
        AtomicBoolean atomicBoolean = sxVar.o;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            sxVar.a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            sxVar.a(null);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
