package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.offline.h;
import androidx.media3.exoplayer.scheduler.Requirements;
import j.P;
import java.util.HashMap;

/* compiled from: DownloadService.java */
@J
/* loaded from: classes.dex */
public abstract class k extends Service {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<Class<? extends k>, b> f49432e = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public b f49433b;

    /* renamed from: c, reason: collision with root package name */
    public int f49434c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49435d;

    /* compiled from: DownloadService.java */
    public static final class b implements h.d {

        /* renamed from: a, reason: collision with root package name */
        public final h f49436a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final androidx.media3.exoplayer.scheduler.c f49437b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public k f49438c;

        public b() {
            throw null;
        }

        public b(Context context, h hVar, boolean z12, androidx.media3.exoplayer.scheduler.c cVar, Class cls, a aVar) {
            this.f49436a = hVar;
            this.f49437b = cVar;
            hVar.getClass();
            throw null;
        }
    }

    /* compiled from: DownloadService.java */
    public final class c {
    }

    public abstract h a();

    @Override // android.app.Service
    @P
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 ??, still in use, count: 1, list:
          (r10v0 ?? I:java.lang.Object) from 0x0026: INVOKE (r8v0 ?? I:java.util.HashMap), (r7v0 ?? I:java.lang.Object), (r10v0 ?? I:java.lang.Object) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:39)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // android.app.Service
    public final void onCreate() {
        /*
            r11 = this;
            java.lang.Class r7 = r11.getClass()
            java.util.HashMap<java.lang.Class<? extends androidx.media3.exoplayer.offline.k>, androidx.media3.exoplayer.offline.k$b> r8 = androidx.media3.exoplayer.offline.k.f49432e
            java.lang.Object r0 = r8.get(r7)
            androidx.media3.exoplayer.offline.k$b r0 = (androidx.media3.exoplayer.offline.k.b) r0
            r9 = 0
            if (r0 != 0) goto L29
            int r0 = androidx.media3.common.util.M.f47887a
            androidx.media3.exoplayer.offline.h r2 = r11.a()
            r2.a(r9)
            androidx.media3.exoplayer.offline.k$b r10 = new androidx.media3.exoplayer.offline.k$b
            android.content.Context r1 = r11.getApplicationContext()
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r10
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.put(r7, r10)
        L29:
            r11.f49433b = r0
            androidx.media3.exoplayer.offline.k r1 = r0.f49438c
            if (r1 != 0) goto L30
            r9 = 1
        L30:
            androidx.media3.common.util.C23110a.g(r9)
            r0.f49438c = r11
            androidx.media3.exoplayer.offline.h r0 = r0.f49436a
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.k.onCreate():void");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b bVar = this.f49433b;
        bVar.getClass();
        C23110a.g(bVar.f49438c == this);
        bVar.f49438c = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(@P Intent intent, int i12, int i13) {
        String action;
        String stringExtra;
        h hVar;
        this.f49434c = i13;
        this.f49435d = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "androidx.media3.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        hVar = this.f49433b.f49436a;
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (!intent.hasExtra("stop_reason")) {
                    androidx.media3.common.util.s.c();
                    break;
                } else {
                    intent.getIntExtra("stop_reason", 0);
                    hVar.f49424a++;
                    throw null;
                }
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    hVar.f49424a++;
                    throw null;
                }
                androidx.media3.common.util.s.c();
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                hVar.a(false);
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                hVar.f49424a++;
                throw null;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    hVar.f49424a++;
                    throw null;
                }
                androidx.media3.common.util.s.c();
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    hVar.getClass();
                    throw null;
                }
                androidx.media3.common.util.s.c();
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                hVar.a(true);
                break;
            default:
                "Ignored unrecognized action: ".concat(action);
                androidx.media3.common.util.s.c();
                break;
        }
        int i14 = M.f47887a;
        if (hVar.f49424a == 0) {
            b bVar = this.f49433b;
            bVar.f49436a.getClass();
            androidx.media3.exoplayer.scheduler.c cVar = bVar.f49437b;
            if (cVar != null && !M.a(null, new Requirements(0))) {
                cVar.cancel();
                throw null;
            }
            if (i14 >= 28 || !this.f49435d) {
                stopSelfResult(this.f49434c);
            } else {
                stopSelf();
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f49435d = true;
    }
}
