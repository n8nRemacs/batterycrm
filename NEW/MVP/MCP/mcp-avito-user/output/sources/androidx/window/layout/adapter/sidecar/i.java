package androidx.window.layout.adapter.sidecar;

import androidx.window.layout.adapter.sidecar.h;
import androidx.window.layout.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.c f55306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f55307c;

    public /* synthetic */ i(h.c cVar, n nVar) {
        this.f55306b = cVar;
        this.f55307c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f55306b.f55304c.accept(this.f55307c);
    }
}
