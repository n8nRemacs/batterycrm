package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.C23638w;
import androidx.work.F;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f;
import com.vk.id.captcha.web.h;
import j.N;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public class BackgroundDownloadJob extends Worker implements BackgroundWorkerListener {
    private static Logger LOGGER = Logger.getLogger(BackgroundDownloadJob.class.getCanonicalName());
    protected static final String TAG = "mapkit_background_download";

    public BackgroundDownloadJob(@N Context context, @N WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doWork$0(BackgroundDownloadInitializer backgroundDownloadInitializer) {
        backgroundDownloadInitializer.setListener(this);
        backgroundDownloadInitializer.initializeMapkit();
    }

    @Override // androidx.work.Worker
    @N
    public synchronized F.a doWork() {
        LOGGER.info("Start background download job");
        BackgroundDownloadInitializer initializer = BackgroundDownloadManager.getInitializer();
        if (initializer != null) {
            new Handler(Looper.getMainLooper()).post(new h(1, this, initializer));
        }
        try {
            try {
                wait();
                LOGGER.info("Stop background download job");
            } finally {
                if (initializer != null) {
                    new Handler(Looper.getMainLooper()).post(new f(initializer, 18));
                }
            }
        } catch (InterruptedException unused) {
            LOGGER.info("Background download job interrupted");
            F.a.b bVar = new F.a.b();
            if (initializer != null) {
                new Handler(Looper.getMainLooper()).post(new f(initializer, 18));
            }
            return bVar;
        }
        return new F.a.c();
    }

    @Override // androidx.work.F
    public synchronized void onStopped() {
        notifyAll();
    }

    @Override // com.yandex.mapkit.offline_cache.internal.BackgroundWorkerListener
    public void updateForegroundInfo(@N C23638w c23638w) {
        setForegroundAsync(c23638w);
    }
}
