package androidx.work.impl.background.greedy;

import androidx.work.G;
import androidx.work.impl.model.H;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes10.dex */
class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f55570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f55571c;

    public a(b bVar, H h12) {
        this.f55571c = bVar;
        this.f55570b = h12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G gA2 = G.a();
        int i12 = b.f55572e;
        H h12 = this.f55570b;
        gA2.getClass();
        this.f55571c.f55573a.j(h12);
    }
}
