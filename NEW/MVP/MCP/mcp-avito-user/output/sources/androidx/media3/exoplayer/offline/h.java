package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.offline.l;
import j.P;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: DownloadManager.java */
@J
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f49424a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49425b;

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
                        int i12 = M.f47887a;
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
                    String str = ((DownloadRequest) message.obj).f49416b;
                    throw null;
                case 7:
                    throw null;
                case 8:
                    new ArrayList();
                    throw null;
                case 9:
                    String str2 = ((e) message.obj).f49426b.f49416b;
                    throw null;
                case 10:
                    e eVar = (e) message.obj;
                    int i13 = M.f47887a;
                    String str3 = eVar.f49426b.f49416b;
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
    public static class e extends Thread implements l.a {

        /* renamed from: b, reason: collision with root package name */
        public final DownloadRequest f49426b;

        /* renamed from: c, reason: collision with root package name */
        public final l f49427c;

        /* renamed from: d, reason: collision with root package name */
        public final j f49428d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f49429e;

        /* renamed from: f, reason: collision with root package name */
        public final int f49430f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public volatile c f49431g;

        public e(DownloadRequest downloadRequest, l lVar, j jVar, boolean z12, int i12, c cVar, a aVar) {
            this.f49426b = downloadRequest;
            this.f49427c = lVar;
            this.f49428d = jVar;
            this.f49429e = z12;
            this.f49430f = i12;
            this.f49431g = cVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException, IOException {
            try {
                if (this.f49429e) {
                    this.f49427c.remove();
                    throw null;
                }
                long j12 = -1;
                int i12 = 0;
                while (true) {
                    try {
                        this.f49427c.a(this);
                        break;
                    } catch (IOException e12) {
                        this.f49428d.getClass();
                        if (0 != j12) {
                            i12 = 0;
                            j12 = 0;
                        }
                        int i13 = i12 + 1;
                        if (i13 > this.f49430f) {
                            throw e12;
                        }
                        Thread.sleep(Math.min(i12 * 1000, 5000));
                        i12 = i13;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
            c cVar = this.f49431g;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public final void a(boolean z12) {
        if (this.f49425b == z12) {
            return;
        }
        this.f49425b = z12;
        this.f49424a++;
        throw null;
    }
}
