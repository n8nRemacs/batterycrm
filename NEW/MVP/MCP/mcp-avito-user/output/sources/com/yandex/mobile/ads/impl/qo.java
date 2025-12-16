package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import com.yandex.mobile.ads.impl.ch;
import com.yandex.mobile.ads.impl.xc0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class qo implements rr {

    /* renamed from: c, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends com.yandex.mobile.ads.exo.offline.d>> f389271c;

    /* renamed from: a, reason: collision with root package name */
    private final ch.b f389272a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f389273b;

    static {
        SparseArray<Constructor<? extends com.yandex.mobile.ads.exo.offline.d>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, a(Class.forName("com.yandex.mobile.ads.exo.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.yandex.mobile.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.yandex.mobile.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f389271c = sparseArray;
    }

    public qo(ch.b bVar, ExecutorService executorService) {
        this.f389272a = (ch.b) db.a(bVar);
        this.f389273b = (Executor) db.a(executorService);
    }

    public final com.yandex.mobile.ads.exo.offline.d a(DownloadRequest downloadRequest) {
        int iA2 = pc1.a(downloadRequest.f383071b, downloadRequest.f383072c);
        if (iA2 != 0 && iA2 != 1 && iA2 != 2) {
            if (iA2 == 4) {
                return new com.yandex.mobile.ads.exo.offline.e(new xc0.a().a(downloadRequest.f383071b).a(downloadRequest.f383075f).a(), this.f389272a, this.f389273b);
            }
            throw new IllegalArgumentException(ba.a("Unsupported type: ", iA2));
        }
        Constructor<? extends com.yandex.mobile.ads.exo.offline.d> constructor = f389271c.get(iA2);
        if (constructor == null) {
            throw new IllegalStateException(ba.a("Module missing for content type ", iA2));
        }
        try {
            return constructor.newInstance(new xc0.a().a(downloadRequest.f383071b).a(downloadRequest.f383073d).a(downloadRequest.f383075f).a(), this.f389272a, this.f389273b);
        } catch (Exception unused) {
            throw new IllegalStateException(ba.a("Failed to instantiate downloader for content type ", iA2));
        }
    }

    private static Constructor<? extends com.yandex.mobile.ads.exo.offline.d> a(Class<?> cls) {
        try {
            return cls.asSubclass(com.yandex.mobile.ads.exo.offline.d.class).getConstructor(xc0.class, ch.b.class, Executor.class);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("Downloader constructor missing", e12);
        }
    }
}
