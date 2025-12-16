package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.exoplayer2.offline.h;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.HashMap;

/* compiled from: DownloadService.java */
/* loaded from: classes6.dex */
public abstract class j extends Service {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<Class<? extends j>, b> f345814e = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public b f345815b;

    /* renamed from: c, reason: collision with root package name */
    public int f345816c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f345817d;

    /* compiled from: DownloadService.java */
    public static final class b implements h.d {

        /* renamed from: a, reason: collision with root package name */
        public final h f345818a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final com.google.android.exoplayer2.scheduler.c f345819b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public j f345820c;

        public b() {
            throw null;
        }

        public b(Context context, h hVar, boolean z12, com.google.android.exoplayer2.scheduler.c cVar, Class cls, a aVar) {
            this.f345818a = hVar;
            this.f345819b = cVar;
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
            java.util.HashMap<java.lang.Class<? extends com.google.android.exoplayer2.offline.j>, com.google.android.exoplayer2.offline.j$b> r8 = com.google.android.exoplayer2.offline.j.f345814e
            java.lang.Object r0 = r8.get(r7)
            com.google.android.exoplayer2.offline.j$b r0 = (com.google.android.exoplayer2.offline.j.b) r0
            r9 = 0
            if (r0 != 0) goto L29
            int r0 = com.google.android.exoplayer2.util.U.f348106a
            com.google.android.exoplayer2.offline.h r2 = r11.a()
            r2.a(r9)
            com.google.android.exoplayer2.offline.j$b r10 = new com.google.android.exoplayer2.offline.j$b
            android.content.Context r1 = r11.getApplicationContext()
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r10
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.put(r7, r10)
        L29:
            r11.f345815b = r0
            com.google.android.exoplayer2.offline.j r1 = r0.f345820c
            if (r1 != 0) goto L30
            r9 = 1
        L30:
            com.google.android.exoplayer2.util.C36585a.d(r9)
            r0.f345820c = r11
            com.google.android.exoplayer2.offline.h r0 = r0.f345818a
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.j.onCreate():void");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b bVar = this.f345815b;
        bVar.getClass();
        C36585a.d(bVar.f345820c == this);
        bVar.f345820c = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(@P Intent intent, int i12, int i13) {
        String action;
        String stringExtra;
        h hVar;
        this.f345816c = i13;
        this.f345817d = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            if (!intent.getBooleanExtra("foreground", false)) {
                "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
            }
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        hVar = this.f345815b.f345818a;
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                intent.getClass();
                if (((DownloadRequest) intent.getParcelableExtra("download_request")) != null) {
                    intent.getIntExtra("stop_reason", 0);
                    hVar.f345804a++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                hVar.a(false);
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                hVar.f345804a++;
                throw null;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                intent.getClass();
                if (((Requirements) intent.getParcelableExtra("requirements")) != null) {
                    hVar.getClass();
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                hVar.a(true);
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                intent.getClass();
                if (intent.hasExtra("stop_reason")) {
                    intent.getIntExtra("stop_reason", 0);
                    hVar.f345804a++;
                    throw null;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    hVar.f345804a++;
                    throw null;
                }
                break;
        }
        int i14 = U.f348106a;
        if (hVar.f345804a == 0) {
            b bVar = this.f345815b;
            bVar.f345818a.getClass();
            com.google.android.exoplayer2.scheduler.c cVar = bVar.f345819b;
            if (cVar != null && !U.a(null, new Requirements(0))) {
                cVar.cancel();
                throw null;
            }
            if (i14 >= 28 || !this.f345817d) {
                stopSelfResult(this.f345816c);
            } else {
                stopSelf();
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        this.f345817d = true;
    }
}
