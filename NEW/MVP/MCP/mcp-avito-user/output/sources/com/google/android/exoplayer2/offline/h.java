package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.offline.k;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: DownloadManager.java */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f345804a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f345805b;

    /* compiled from: DownloadManager.java */
    public static final class b {
        public b() {
            throw null;
        }
    }

    /* compiled from: DownloadManager.java */
    public static final class c extends Handler {
        /* JADX WARN: Finally extract failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        int i12 = U.f348106a;
                        throw th2;
                    }
                case 1:
                    throw null;
                case 2:
                    throw null;
                case 3:
                    ((String) message.obj).getClass();
                    throw null;
                case 4:
                    throw null;
                case 5:
                    throw null;
                case 6:
                    String str = ((DownloadRequest) message.obj).f345793b;
                    throw null;
                case 7:
                    throw null;
                case 8:
                    new ArrayList();
                    throw null;
                case 9:
                    String str2 = ((e) message.obj).f345806b.f345793b;
                    throw null;
                case 10:
                    e eVar = (e) message.obj;
                    int i13 = U.f348106a;
                    String str3 = eVar.f345806b.f345793b;
                    throw null;
                case 11:
                    throw null;
                case 12:
                    throw null;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* compiled from: DownloadManager.java */
    public interface d {
    }

    /* compiled from: DownloadManager.java */
    public static class e extends Thread implements k.a {

        /* renamed from: b, reason: collision with root package name */
        public final DownloadRequest f345806b;

        /* renamed from: c, reason: collision with root package name */
        public final k f345807c;

        /* renamed from: d, reason: collision with root package name */
        public final i f345808d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f345809e;

        /* renamed from: f, reason: collision with root package name */
        public final int f345810f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public volatile c f345811g;

        /* renamed from: h, reason: collision with root package name */
        public long f345812h = -1;

        public e(DownloadRequest downloadRequest, k kVar, i iVar, boolean z12, int i12, c cVar, a aVar) {
            this.f345806b = downloadRequest;
            this.f345807c = kVar;
            this.f345808d = iVar;
            this.f345809e = z12;
            this.f345810f = i12;
            this.f345811g = cVar;
        }

        @Override // com.google.android.exoplayer2.offline.k.a
        public final void a(long j12, long j13, float f12) {
            this.f345808d.f345813a = j13;
            this.f345808d.getClass();
            if (j12 != this.f345812h) {
                this.f345812h = j12;
                c cVar = this.f345811g;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (j12 >> 32), (int) j12, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException, IOException {
            try {
                if (this.f345809e) {
                    this.f345807c.remove();
                } else {
                    long j12 = -1;
                    int i12 = 0;
                    while (true) {
                        try {
                            this.f345807c.a(this);
                            break;
                        } catch (IOException e12) {
                            long j13 = this.f345808d.f345813a;
                            if (j13 != j12) {
                                i12 = 0;
                                j12 = j13;
                            }
                            int i13 = i12 + 1;
                            if (i13 > this.f345810f) {
                                throw e12;
                            }
                            Thread.sleep(Math.min(i12 * 1000, 5000));
                            i12 = i13;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
            c cVar = this.f345811g;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public final void a(boolean z12) {
        if (this.f345805b == z12) {
            return;
        }
        this.f345805b = z12;
        this.f345804a++;
        throw null;
    }
}
