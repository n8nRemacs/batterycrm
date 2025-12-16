package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BaseMediaSource.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23150a implements A {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<A.c> f49712b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public final HashSet<A.c> f49713c = new HashSet<>(1);

    /* renamed from: d, reason: collision with root package name */
    public final D.a f49714d = new D.a();

    /* renamed from: e, reason: collision with root package name */
    public final f.a f49715e = new f.a();

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public Looper f49716f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public androidx.media3.common.P f49717g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public androidx.media3.exoplayer.analytics.w f49718h;

    public abstract void C();

    @Override // androidx.media3.exoplayer.source.A
    public final void c(Handler handler, D d12) {
        handler.getClass();
        D.a aVar = this.f49714d;
        aVar.getClass();
        D.a.C1833a c1833a = new D.a.C1833a();
        c1833a.f49486a = handler;
        c1833a.f49487b = d12;
        aVar.f49485c.add(c1833a);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void d(A.c cVar) {
        ArrayList<A.c> arrayList = this.f49712b;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            i(cVar);
            return;
        }
        this.f49716f = null;
        this.f49717g = null;
        this.f49718h = null;
        this.f49713c.clear();
        C();
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void g(A.c cVar) {
        this.f49716f.getClass();
        HashSet<A.c> hashSet = this.f49713c;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (zIsEmpty) {
            v();
        }
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void i(A.c cVar) {
        HashSet<A.c> hashSet = this.f49713c;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        t();
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void j(Handler handler, androidx.media3.exoplayer.drm.f fVar) {
        handler.getClass();
        this.f49715e.a(handler, fVar);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void p(D d12) {
        CopyOnWriteArrayList<D.a.C1833a> copyOnWriteArrayList = this.f49714d.f49485c;
        Iterator<D.a.C1833a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            D.a.C1833a next = it.next();
            if (next.f49487b == d12) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void q(androidx.media3.exoplayer.drm.f fVar) {
        this.f49715e.g(fVar);
    }

    @Override // androidx.media3.exoplayer.source.A
    public final void s(A.c cVar, @j.P androidx.media3.datasource.B b12, androidx.media3.exoplayer.analytics.w wVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f49716f;
        C23110a.b(looper == null || looper == looperMyLooper);
        this.f49718h = wVar;
        androidx.media3.common.P p12 = this.f49717g;
        this.f49712b.add(cVar);
        if (this.f49716f == null) {
            this.f49716f = looperMyLooper;
            this.f49713c.add(cVar);
            y(b12);
        } else if (p12 != null) {
            g(cVar);
            cVar.m(this, p12);
        }
    }

    public void w(androidx.media3.common.P p12) {
        z(p12);
    }

    public abstract void y(@j.P androidx.media3.datasource.B b12);

    public final void z(androidx.media3.common.P p12) {
        this.f49717g = p12;
        Iterator<A.c> it = this.f49712b.iterator();
        while (it.hasNext()) {
            it.next().m(this, p12);
        }
    }

    public void t() {
    }

    public void v() {
    }
}
