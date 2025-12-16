package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class trg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ trg(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z;
        this.o = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.a) {
            case 0:
                rw5 rw5Var = (rw5) this.d;
                boolean z = this.b;
                File file = ((urg) this.o).a;
                cri.e("fb-UnpackingSoSource", "starting syncer worker");
                try {
                    if (z) {
                        try {
                            fwf.c(file);
                        } catch (Throwable th) {
                            cri.e("fb-UnpackingSoSource", "releasing dso store lock for " + file + " (from syncer thread)");
                            rw5Var.close();
                            throw th;
                        }
                    }
                    urg.i((File) this.c, (byte) 1, z);
                    cri.e("fb-UnpackingSoSource", "releasing dso store lock for " + file + " (from syncer thread)");
                    rw5Var.close();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            default:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z2 = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.o;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            yc3 yc3Var = new yc3(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pc4("pscm-ack-executor", 2));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } finally {
                                }
                            }
                            executorUnconfigurableExecutorService.execute(new nt3(context, yc3Var, countDownLatch));
                            try {
                                iIntValue = ((Integer) n5e.a(new h79(context).G(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e2) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e3) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e3.toString()));
                            }
                        }
                        iA = iIntValue;
                    }
                    if (z2 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
        }
    }

    public trg(urg urgVar, boolean z, File file, rw5 rw5Var) {
        this.o = urgVar;
        this.b = z;
        this.c = file;
        this.d = rw5Var;
    }
}
