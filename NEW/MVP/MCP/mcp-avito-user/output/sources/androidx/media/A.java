package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import androidx.media.AbstractServiceC23085i;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class A implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f46983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f46985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f46986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f46987f;

    public A(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f46987f = kVar;
        this.f46983b = mVar;
        this.f46984c = str;
        this.f46985d = bundle;
        this.f46986e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f46983b.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f46987f;
        AbstractServiceC23085i.b bVar = AbstractServiceC23085i.this.f47034e.get(binder);
        if (bVar == null) {
            return;
        }
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        ResultReceiver resultReceiver = this.f46986e;
        String str = this.f46984c;
        C23083g c23083g = new C23083g(str, resultReceiver);
        abstractServiceC23085i.f47035f = bVar;
        abstractServiceC23085i.h(this.f46985d, c23083g, str);
        abstractServiceC23085i.f47035f = null;
        if (!c23083g.b()) {
            throw new IllegalStateException(androidx.camera.camera2.internal.G.f("onSearch must call detach() or sendResult() before returning for query=", str));
        }
    }
}
