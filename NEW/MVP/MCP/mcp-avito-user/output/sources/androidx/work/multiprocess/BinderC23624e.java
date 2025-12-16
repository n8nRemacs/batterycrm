package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.C23634s;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.AbstractC23623d;
import androidx.work.multiprocess.InterfaceC23620a;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import com.google.common.util.concurrent.D0;
import j.N;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;

/* compiled from: ListenableWorkerImpl.java */
@RestrictTo
/* renamed from: androidx.work.multiprocess.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class BinderC23624e extends InterfaceC23620a.b {

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f56142u;

    /* renamed from: v, reason: collision with root package name */
    public static final Object f56143v;

    /* renamed from: b, reason: collision with root package name */
    public final Context f56144b;

    /* renamed from: p, reason: collision with root package name */
    public final C23538b f56145p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f56146q;

    /* renamed from: r, reason: collision with root package name */
    public final q f56147r;

    /* renamed from: s, reason: collision with root package name */
    public final p f56148s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f56149t;

    /* compiled from: ListenableWorkerImpl.java */
    /* renamed from: androidx.work.multiprocess.e$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D0 f56150b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC23622c f56151c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f56152d;

        public a(D0 d02, InterfaceC23622c interfaceC23622c, String str) {
            this.f56150b = d02;
            this.f56151c = interfaceC23622c;
            this.f56152d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r4 = this;
                com.google.common.util.concurrent.D0 r0 = r4.f56150b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                androidx.work.F$a r0 = (androidx.work.F.a) r0     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                androidx.work.multiprocess.parcelable.ParcelableResult r1 = new androidx.work.multiprocess.parcelable.ParcelableResult     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                byte[] r0 = androidx.work.multiprocess.parcelable.a.a(r1)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                androidx.work.multiprocess.c r1 = r4.f56151c     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                androidx.work.multiprocess.AbstractC23623d.a.b(r1, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29 java.lang.InterruptedException -> L2b java.util.concurrent.ExecutionException -> L2d
                java.lang.Object r0 = androidx.work.multiprocess.BinderC23624e.f56143v
                monitor-enter(r0)
                androidx.work.multiprocess.e r1 = androidx.work.multiprocess.BinderC23624e.this     // Catch: java.lang.Throwable -> L24
                java.util.HashMap r1 = r1.f56149t     // Catch: java.lang.Throwable -> L24
                java.lang.String r2 = r4.f56152d     // Catch: java.lang.Throwable -> L24
                r1.remove(r2)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                goto L60
            L24:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r1
            L27:
                r0 = move-exception
                goto L64
            L29:
                r0 = move-exception
                goto L2f
            L2b:
                r0 = move-exception
                goto L4e
            L2d:
                r0 = move-exception
                goto L4e
            L2f:
                androidx.work.G r1 = androidx.work.G.a()     // Catch: java.lang.Throwable -> L27
                byte[] r2 = androidx.work.multiprocess.BinderC23624e.f56142u     // Catch: java.lang.Throwable -> L27
                r1.getClass()     // Catch: java.lang.Throwable -> L27
                androidx.work.multiprocess.c r1 = r4.f56151c     // Catch: java.lang.Throwable -> L27
                androidx.work.multiprocess.AbstractC23623d.a.a(r1, r0)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r0 = androidx.work.multiprocess.BinderC23624e.f56143v
                monitor-enter(r0)
                androidx.work.multiprocess.e r1 = androidx.work.multiprocess.BinderC23624e.this     // Catch: java.lang.Throwable -> L4b
                java.util.HashMap r1 = r1.f56149t     // Catch: java.lang.Throwable -> L4b
                java.lang.String r2 = r4.f56152d     // Catch: java.lang.Throwable -> L4b
                r1.remove(r2)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
                goto L60
            L4b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
                throw r1
            L4e:
                androidx.work.multiprocess.c r1 = r4.f56151c     // Catch: java.lang.Throwable -> L27
                androidx.work.multiprocess.AbstractC23623d.a.a(r1, r0)     // Catch: java.lang.Throwable -> L27
                java.lang.Object r0 = androidx.work.multiprocess.BinderC23624e.f56143v
                monitor-enter(r0)
                androidx.work.multiprocess.e r1 = androidx.work.multiprocess.BinderC23624e.this     // Catch: java.lang.Throwable -> L61
                java.util.HashMap r1 = r1.f56149t     // Catch: java.lang.Throwable -> L61
                java.lang.String r2 = r4.f56152d     // Catch: java.lang.Throwable -> L61
                r1.remove(r2)     // Catch: java.lang.Throwable -> L61
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            L60:
                return
            L61:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
                throw r1
            L64:
                java.lang.Object r1 = androidx.work.multiprocess.BinderC23624e.f56143v
                monitor-enter(r1)
                androidx.work.multiprocess.e r2 = androidx.work.multiprocess.BinderC23624e.this     // Catch: java.lang.Throwable -> L72
                java.util.HashMap r2 = r2.f56149t     // Catch: java.lang.Throwable -> L72
                java.lang.String r3 = r4.f56152d     // Catch: java.lang.Throwable -> L72
                r2.remove(r3)     // Catch: java.lang.Throwable -> L72
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
                throw r0
            L72:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.BinderC23624e.a.run():void");
        }
    }

    static {
        androidx.work.G.b("WM-RemoteWorker ListenableWorkerImpl");
        f56142u = new byte[0];
        f56143v = new Object();
    }

    public BinderC23624e(@N H h12) {
        this.f56144b = h12.getApplicationContext();
        if (G.f56091f == null) {
            synchronized (G.f56090e) {
                try {
                    if (G.f56091f == null) {
                        G.f56091f = new G(h12);
                    }
                } finally {
                }
            }
        }
        G g12 = G.f56091f;
        this.f56145p = g12.f56092a;
        this.f56146q = g12.f56093b;
        this.f56147r = g12.f56094c;
        this.f56148s = g12.f56095d;
        this.f56149t = new HashMap();
    }

    @Override // androidx.work.multiprocess.InterfaceC23620a
    public final void c3(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
        N0 n02;
        try {
            ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableInterruptRequest.CREATOR);
            String str = parcelableInterruptRequest.f56179b;
            int i12 = parcelableInterruptRequest.f56180c;
            androidx.work.G.a().getClass();
            synchronized (f56143v) {
                n02 = (N0) this.f56149t.remove(str);
            }
            if (n02 != null) {
                this.f56146q.f56028a.execute(new androidx.media3.exoplayer.drm.d(n02, i12, interfaceC23622c, 2));
            } else {
                AbstractC23623d.a.b(interfaceC23622c, f56142u);
            }
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }

    @N
    public final D0<F.a> e4(@N String str, @N String str2, @N WorkerParameters workerParameters) {
        P0 p02 = new P0(null);
        synchronized (f56143v) {
            this.f56149t.put(str, p02);
        }
        Context context = this.f56144b;
        C23538b c23538b = this.f56145p;
        androidx.work.impl.utils.taskexecutor.c cVar = this.f56146q;
        M mB2 = A0.b(cVar.f56031d);
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        CoroutineContext coroutineContextPlus = mB2.plus(p02);
        I i12 = new I(c23538b, context, str2, workerParameters, cVar, null);
        fVar.getClass();
        return androidx.concurrent.futures.f.a(coroutineContextPlus, false, i12);
    }

    @Override // androidx.work.multiprocess.InterfaceC23620a
    public final void o1(@N InterfaceC23622c interfaceC23622c, @N byte[] bArr) {
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) androidx.work.multiprocess.parcelable.a.b(bArr, ParcelableRemoteWorkRequest.CREATOR);
            ParcelableWorkerParameters parcelableWorkerParameters = parcelableRemoteWorkRequest.f56182c;
            C23538b c23538b = this.f56145p;
            androidx.work.impl.utils.taskexecutor.c cVar = this.f56146q;
            q qVar = this.f56147r;
            p pVar = this.f56148s;
            parcelableWorkerParameters.getClass();
            ExecutorService executorService = c23538b.f55447a;
            M m12 = c23538b.f55448b;
            C23634s c23634s = c23538b.f55451e;
            UUID uuid = parcelableWorkerParameters.f56199b;
            WorkerParameters workerParameters = new WorkerParameters(uuid, parcelableWorkerParameters.f56200c, parcelableWorkerParameters.f56201d, parcelableWorkerParameters.f56202e, parcelableWorkerParameters.f56203f, parcelableWorkerParameters.f56204g, executorService, m12, cVar, c23634s, qVar, pVar);
            String string = uuid.toString();
            String str = parcelableRemoteWorkRequest.f56181b;
            androidx.work.G.a().getClass();
            D0<F.a> d0E4 = e4(string, str, workerParameters);
            d0E4.N(new a(d0E4, interfaceC23622c, string), cVar.f56028a);
        } catch (Throwable th2) {
            AbstractC23623d.a.a(interfaceC23622c, th2);
        }
    }
}
