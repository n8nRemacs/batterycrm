package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.c;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.request.target.q;
import j.B;
import j.InterfaceC42154j;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes5.dex */
public class j implements ComponentCallbacks2, com.bumptech.glide.manager.i, g<i<Drawable>> {

    /* renamed from: m, reason: collision with root package name */
    public static final com.bumptech.glide.request.g f338811m;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.b f338812b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f338813c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.manager.h f338814d;

    /* renamed from: e, reason: collision with root package name */
    @B
    public final n f338815e;

    /* renamed from: f, reason: collision with root package name */
    @B
    public final m f338816f;

    /* renamed from: g, reason: collision with root package name */
    @B
    public final o f338817g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f338818h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f338819i;

    /* renamed from: j, reason: collision with root package name */
    public final com.bumptech.glide.manager.c f338820j;

    /* renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList<com.bumptech.glide.request.f<Object>> f338821k;

    /* renamed from: l, reason: collision with root package name */
    @B
    public final com.bumptech.glide.request.g f338822l;

    /* compiled from: RequestManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = j.this;
            jVar.f338814d.b(jVar);
        }
    }

    /* compiled from: RequestManager.java */
    public class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        @B
        public final n f338824a;

        public c(@N n nVar) {
            this.f338824a = nVar;
        }

        @Override // com.bumptech.glide.manager.c.a
        public final void a(boolean z12) {
            if (z12) {
                synchronized (j.this) {
                    n nVar = this.f338824a;
                    Iterator it = com.bumptech.glide.util.m.d(nVar.f339516a).iterator();
                    while (it.hasNext()) {
                        com.bumptech.glide.request.d dVar = (com.bumptech.glide.request.d) it.next();
                        if (!dVar.d() && !dVar.a()) {
                            dVar.clear();
                            if (nVar.f339518c) {
                                nVar.f339517b.add(dVar);
                            } else {
                                dVar.b();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        com.bumptech.glide.request.g gVarF = new com.bumptech.glide.request.g().f(Bitmap.class);
        gVarF.f339554r = true;
        f338811m = gVarF;
        new com.bumptech.glide.request.g().f(com.bumptech.glide.load.resource.gif.c.class).f339554r = true;
    }

    public j(@N com.bumptech.glide.b bVar, @N com.bumptech.glide.manager.h hVar, @N m mVar, @N Context context) {
        com.bumptech.glide.request.g gVar;
        n nVar = new n();
        com.bumptech.glide.manager.f fVar = bVar.f338688h;
        this.f338817g = new o();
        a aVar = new a();
        this.f338818h = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f338819i = handler;
        this.f338812b = bVar;
        this.f338814d = hVar;
        this.f338816f = mVar;
        this.f338815e = nVar;
        this.f338813c = context;
        com.bumptech.glide.manager.c cVarA = fVar.a(context.getApplicationContext(), new c(nVar));
        this.f338820j = cVarA;
        if (com.bumptech.glide.util.m.h()) {
            handler.post(aVar);
        } else {
            hVar.b(this);
        }
        hVar.b(cVarA);
        this.f338821k = new CopyOnWriteArrayList<>(bVar.f338684d.f338745e);
        e eVar = bVar.f338684d;
        synchronized (eVar) {
            try {
                if (eVar.f338749i == null) {
                    ((c.a) eVar.f338744d).getClass();
                    com.bumptech.glide.request.g gVar2 = new com.bumptech.glide.request.g();
                    gVar2.f339554r = true;
                    eVar.f338749i = gVar2;
                }
                gVar = eVar.f338749i;
            } finally {
            }
        }
        synchronized (this) {
            com.bumptech.glide.request.g gVarClone = gVar.clone();
            if (gVarClone.f339554r && !gVarClone.f339555s) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            gVarClone.f339555s = true;
            gVarClone.f339554r = true;
            this.f338822l = gVarClone;
        }
        synchronized (bVar.f338689i) {
            try {
                if (bVar.f338689i.contains(this)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                bVar.f338689i.add(this);
            } finally {
            }
        }
    }

    @N
    @InterfaceC42154j
    public final <ResourceType> i<ResourceType> d(@N Class<ResourceType> cls) {
        return new i<>(this.f338812b, this, cls, this.f338813c);
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void e() {
        try {
            this.f338817g.e();
            Iterator it = com.bumptech.glide.util.m.d(this.f338817g.f339519b).iterator();
            while (it.hasNext()) {
                i((q) it.next());
            }
            this.f338817g.f339519b.clear();
            n nVar = this.f338815e;
            Iterator it2 = com.bumptech.glide.util.m.d(nVar.f339516a).iterator();
            while (it2.hasNext()) {
                nVar.a((com.bumptech.glide.request.d) it2.next());
            }
            nVar.f339517b.clear();
            this.f338814d.a(this);
            this.f338814d.a(this.f338820j);
            this.f338819i.removeCallbacks(this.f338818h);
            com.bumptech.glide.b bVar = this.f338812b;
            synchronized (bVar.f338689i) {
                if (!bVar.f338689i.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                bVar.f338689i.remove(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(@P q<?> qVar) {
        if (qVar == null) {
            return;
        }
        boolean zO2 = o(qVar);
        com.bumptech.glide.request.d dVarA = qVar.a();
        if (zO2) {
            return;
        }
        com.bumptech.glide.b bVar = this.f338812b;
        synchronized (bVar.f338689i) {
            try {
                Iterator it = bVar.f338689i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((j) it.next()).o(qVar)) {
                        }
                    } else if (dVarA != null) {
                        qVar.f(null);
                        dVarA.clear();
                    }
                }
            } finally {
            }
        }
    }

    @N
    @InterfaceC42154j
    public final i<Drawable> l(@P Uri uri) {
        i<Drawable> iVarD = d(Drawable.class);
        iVarD.f338801A = uri;
        iVarD.f338803C = true;
        return iVarD;
    }

    public final synchronized void m() {
        n nVar = this.f338815e;
        nVar.f339518c = true;
        Iterator it = com.bumptech.glide.util.m.d(nVar.f339516a).iterator();
        while (it.hasNext()) {
            com.bumptech.glide.request.d dVar = (com.bumptech.glide.request.d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                nVar.f339517b.add(dVar);
            }
        }
    }

    public final synchronized void n() {
        n nVar = this.f338815e;
        nVar.f339518c = false;
        Iterator it = com.bumptech.glide.util.m.d(nVar.f339516a).iterator();
        while (it.hasNext()) {
            com.bumptech.glide.request.d dVar = (com.bumptech.glide.request.d) it.next();
            if (!dVar.d() && !dVar.isRunning()) {
                dVar.b();
            }
        }
        nVar.f339517b.clear();
    }

    public final synchronized boolean o(@N q<?> qVar) {
        com.bumptech.glide.request.d dVarA = qVar.a();
        if (dVarA == null) {
            return true;
        }
        if (!this.f338815e.a(dVarA)) {
            return false;
        }
        this.f338817g.f339519b.remove(qVar);
        qVar.f(null);
        return true;
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onStart() {
        n();
        this.f338817g.onStart();
    }

    @Override // com.bumptech.glide.manager.i
    public final synchronized void onStop() {
        m();
        this.f338817g.onStop();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f338815e + ", treeNode=" + this.f338816f + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    /* compiled from: RequestManager.java */
    public static class b extends com.bumptech.glide.request.target.g<View, Object> {
        @Override // com.bumptech.glide.request.target.q
        public final void g(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(@N Object obj, @P com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
    }
}
