package androidx.media;

import android.os.IBinder;
import androidx.media.AbstractServiceC23085i;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47107c;

    public z(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar) {
        this.f47107c = kVar;
        this.f47106b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f47106b.f47066a.getBinder();
        AbstractServiceC23085i.b bVarRemove = AbstractServiceC23085i.this.f47034e.remove(binder);
        if (bVarRemove != null) {
            binder.unlinkToDeath(bVarRemove, 0);
        }
    }
}
