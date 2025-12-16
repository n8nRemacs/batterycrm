package androidx.media;

import androidx.media.AbstractServiceC23085i;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47087c;

    public u(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar) {
        this.f47087c = kVar;
        this.f47086b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC23085i.b bVarRemove = AbstractServiceC23085i.this.f47034e.remove(this.f47086b.f47066a.getBinder());
        if (bVarRemove != null) {
            bVarRemove.f47044e.f47066a.getBinder().unlinkToDeath(bVarRemove, 0);
        }
    }
}
