package com.yandex.mapkit.offline_cache.internal;

import android.content.Context;
import androidx.work.C23542f;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import com.yandex.runtime.Runtime;
import j.N;
import j.P;
import j.j0;
import java.util.Collections;

/* loaded from: classes7.dex */
public class BackgroundDownloadManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static BackgroundDownloadInitializer initializer;
    private static BackgroundDownloadManager instance;
    private int activeDownloads = 0;
    private boolean allowCellular = false;
    private WorkManager workManager;

    private BackgroundDownloadManager(@P BackgroundDownloadInitializer backgroundDownloadInitializer, Context context) {
        this.workManager = null;
        initializer = backgroundDownloadInitializer;
        WorkManager.f55428a.getClass();
        this.workManager = Y.f(context);
    }

    @j0
    private void disableBackgroundDownloading() {
        this.workManager.c();
    }

    @j0
    private void enableBackgroundDownloading() {
        NetworkType networkType = this.allowCellular ? NetworkType.f55396c : NetworkType.f55397d;
        C23542f.a aVar = new C23542f.a();
        aVar.b(networkType);
        J jB2 = new J.a(BackgroundDownloadJob.class).f(aVar.a()).b();
        WorkManager workManager = this.workManager;
        workManager.getClass();
        workManager.d(Collections.singletonList(jB2));
    }

    @P
    public static synchronized BackgroundDownloadInitializer getInitializer() {
        return initializer;
    }

    public static BackgroundDownloadManager getInstance() {
        initialize(null, Runtime.getApplicationContext());
        return instance;
    }

    public static void initialize(@P BackgroundDownloadInitializer backgroundDownloadInitializer, @N Context context) {
        if (instance == null) {
            instance = new BackgroundDownloadManager(backgroundDownloadInitializer, context);
        } else if (backgroundDownloadInitializer != null) {
            throw new RuntimeException("BackgroundDownloadManager reinitialization");
        }
    }

    @j0
    public void decrementActiveDownloads() {
        int i12 = this.activeDownloads - 1;
        this.activeDownloads = i12;
        if (i12 == 0) {
            disableBackgroundDownloading();
        }
    }

    @j0
    public void incrementActiveDownloads() {
        int i12 = this.activeDownloads + 1;
        this.activeDownloads = i12;
        if (i12 == 1) {
            enableBackgroundDownloading();
        }
    }

    @j0
    public void updateBackgroundDownloading(boolean z12) {
        this.allowCellular = z12;
        if (this.activeDownloads > 0) {
            enableBackgroundDownloading();
        }
    }
}
