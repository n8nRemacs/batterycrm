package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import j.N;
import j.l0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36612a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f348805a;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* renamed from: com.google.android.gms.cloudmessaging.a$a, reason: collision with other inner class name */
    public static final class C10614a {
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* renamed from: com.google.android.gms.cloudmessaging.a$b */
    public static final class b {
    }

    public AbstractC36612a() {
        zze.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f348805a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @l0
    public abstract int a(@N Context context, @N CloudMessage cloudMessage);

    @l0
    public final int c(@N Context context, @N Intent intent) {
        int i12;
        Task taskB;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            taskB = C37030m.f(null);
        } else {
            Bundle bundleM = com.avito.android.actions_sheet.a.m("google.message_id", stringExtra);
            v vVarA = v.a(context);
            synchronized (vVarA) {
                i12 = vVarA.f348847d;
                vVarA.f348847d = i12 + 1;
            }
            taskB = vVarA.b(new s(i12, 2, bundleM));
        }
        int iA2 = a(context, new CloudMessage(intent));
        try {
            C37030m.b(taskB, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e12) {
            new StringBuilder(String.valueOf(e12).length() + 20);
        }
        return iA2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@N final Context context, @N final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        this.f348805a.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.i
            @Override // java.lang.Runnable
            public final void run() {
                int iC2;
                Intent intent2 = intent;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                AbstractC36612a abstractC36612a = this.f348818b;
                abstractC36612a.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    Context context2 = context;
                    if (intent3 != null) {
                        PendingIntent pendingIntent = (PendingIntent) intent3.getParcelableExtra("pending_intent");
                        if (pendingIntent != null) {
                            try {
                                pendingIntent.send();
                            } catch (PendingIntent.CanceledException unused) {
                            }
                        }
                        Bundle extras = intent3.getExtras();
                        if (extras != null) {
                            extras.remove("pending_intent");
                        } else {
                            extras = new Bundle();
                        }
                        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent3.getAction())) {
                            abstractC36612a.b(extras);
                            iC2 = -1;
                        } else {
                            iC2 = 500;
                        }
                    } else {
                        iC2 = abstractC36612a.c(context2, intent2);
                    }
                    if (zIsOrderedBroadcast) {
                        pendingResult.setResultCode(iC2);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }

    @l0
    public void b(@N Bundle bundle) {
    }
}
