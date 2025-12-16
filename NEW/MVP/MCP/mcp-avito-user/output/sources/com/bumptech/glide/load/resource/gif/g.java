package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.k;
import com.bumptech.glide.util.m;
import j.N;
import j.P;
import j.k0;
import java.util.ArrayList;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes5.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.gifdecoder.f f339446a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f339447b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f339448c;

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.j f339449d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.e f339450e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f339451f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f339452g;

    /* renamed from: h, reason: collision with root package name */
    public com.bumptech.glide.i<Bitmap> f339453h;

    /* renamed from: i, reason: collision with root package name */
    public a f339454i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f339455j;

    /* renamed from: k, reason: collision with root package name */
    public a f339456k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f339457l;

    /* renamed from: m, reason: collision with root package name */
    public n<Bitmap> f339458m;

    /* renamed from: n, reason: collision with root package name */
    public a f339459n;

    /* renamed from: o, reason: collision with root package name */
    public int f339460o;

    /* renamed from: p, reason: collision with root package name */
    public int f339461p;

    /* renamed from: q, reason: collision with root package name */
    public int f339462q;

    /* compiled from: GifFrameLoader.java */
    @k0
    public static class a extends com.bumptech.glide.request.target.e<Bitmap> {

        /* renamed from: e, reason: collision with root package name */
        public final Handler f339463e;

        /* renamed from: f, reason: collision with root package name */
        public final int f339464f;

        /* renamed from: g, reason: collision with root package name */
        public final long f339465g;

        /* renamed from: h, reason: collision with root package name */
        public Bitmap f339466h;

        public a(Handler handler, int i12, long j12) {
            this.f339463e = handler;
            this.f339464f = i12;
            this.f339465g = j12;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void b(@P Drawable drawable) {
            this.f339466h = null;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(@N Object obj, @P com.bumptech.glide.request.transition.f fVar) {
            this.f339466h = (Bitmap) obj;
            Handler handler = this.f339463e;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f339465g);
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            g gVar = g.this;
            if (i12 == 1) {
                gVar.b((a) message.obj);
                return true;
            }
            if (i12 != 2) {
                return false;
            }
            gVar.f339449d.i((a) message.obj);
            return false;
        }
    }

    /* compiled from: GifFrameLoader.java */
    @k0
    public interface d {
    }

    public g() {
        throw null;
    }

    public g(com.bumptech.glide.b bVar, com.bumptech.glide.gifdecoder.f fVar, int i12, int i13, com.bumptech.glide.load.resource.c cVar, Bitmap bitmap) {
        com.bumptech.glide.load.engine.bitmap_recycle.e eVar = bVar.f338682b;
        com.bumptech.glide.e eVar2 = bVar.f338684d;
        Context baseContext = eVar2.getBaseContext();
        k.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.j jVarD = com.bumptech.glide.b.b(baseContext).f338687g.d(baseContext);
        Context baseContext2 = eVar2.getBaseContext();
        k.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        com.bumptech.glide.i<Bitmap> iVarY = com.bumptech.glide.b.b(baseContext2).f338687g.d(baseContext2).d(Bitmap.class).a(com.bumptech.glide.j.f338811m).a(((com.bumptech.glide.request.g) ((com.bumptech.glide.request.g) new com.bumptech.glide.request.g().g(l.f339088b).x()).t()).n(i12, i13));
        this.f339448c = new ArrayList();
        this.f339449d = jVarD;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f339450e = eVar;
        this.f339447b = handler;
        this.f339453h = iVarY;
        this.f339446a = fVar;
        c(cVar, bitmap);
    }

    public final void a() {
        if (!this.f339451f || this.f339452g) {
            return;
        }
        com.bumptech.glide.gifdecoder.f fVar = this.f339446a;
        a aVar = this.f339459n;
        if (aVar != null) {
            this.f339459n = null;
            b(aVar);
            return;
        }
        this.f339452g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + fVar.c();
        fVar.a();
        this.f339456k = new a(this.f339447b, fVar.f338791k, jUptimeMillis);
        com.bumptech.glide.i<Bitmap> iVarY = this.f339453h.a(new com.bumptech.glide.request.g().s(new jW0.e(Double.valueOf(Math.random()))));
        iVarY.f338801A = fVar;
        iVarY.f338803C = true;
        iVarY.B(this.f339456k);
    }

    @k0
    public final void b(a aVar) {
        this.f339452g = false;
        boolean z12 = this.f339455j;
        Handler handler = this.f339447b;
        if (z12) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f339451f) {
            this.f339459n = aVar;
            return;
        }
        if (aVar.f339466h != null) {
            Bitmap bitmap = this.f339457l;
            if (bitmap != null) {
                this.f339450e.b(bitmap);
                this.f339457l = null;
            }
            a aVar2 = this.f339454i;
            this.f339454i = aVar;
            ArrayList arrayList = this.f339448c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) arrayList.get(size)).a();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(n<Bitmap> nVar, Bitmap bitmap) {
        k.c(nVar, "Argument must not be null");
        this.f339458m = nVar;
        k.c(bitmap, "Argument must not be null");
        this.f339457l = bitmap;
        this.f339453h = this.f339453h.a(new com.bumptech.glide.request.g().u(nVar, true));
        this.f339460o = m.c(bitmap);
        this.f339461p = bitmap.getWidth();
        this.f339462q = bitmap.getHeight();
    }
}
