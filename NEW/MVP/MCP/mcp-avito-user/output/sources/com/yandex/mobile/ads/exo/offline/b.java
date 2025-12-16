package com.yandex.mobile.ads.exo.offline;

import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.qr;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadRequest f383094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f383095b;

    /* renamed from: c, reason: collision with root package name */
    public final long f383096c;

    /* renamed from: d, reason: collision with root package name */
    public final long f383097d;

    /* renamed from: e, reason: collision with root package name */
    public final long f383098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f383099f;

    /* renamed from: g, reason: collision with root package name */
    public final int f383100g;

    /* renamed from: h, reason: collision with root package name */
    final qr f383101h;

    public b(DownloadRequest downloadRequest, int i12, long j12, long j13, int i13) {
        this(downloadRequest, i12, j12, j13, -1L, i13, 0, new qr());
    }

    public b(DownloadRequest downloadRequest, int i12, long j12, long j13, long j14, int i13, int i14, qr qrVar) {
        db.a(qrVar);
        boolean z12 = false;
        db.a((i14 == 0) == (i12 != 4));
        if (i13 != 0) {
            if (i12 != 2 && i12 != 0) {
                z12 = true;
            }
            db.a(z12);
        }
        this.f383094a = downloadRequest;
        this.f383095b = i12;
        this.f383096c = j12;
        this.f383097d = j13;
        this.f383098e = j14;
        this.f383099f = i13;
        this.f383100g = i14;
        this.f383101h = qrVar;
    }
}
