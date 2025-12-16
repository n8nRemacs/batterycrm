package androidx.media;

import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import androidx.media.AbstractServiceC23085i;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f47099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47100e;

    public x(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str, ResultReceiver resultReceiver) {
        this.f47100e = kVar;
        this.f47097b = mVar;
        this.f47098c = str;
        this.f47099d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f47097b.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f47100e;
        AbstractServiceC23085i.b bVar = AbstractServiceC23085i.this.f47034e.get(binder);
        if (bVar == null) {
            return;
        }
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        ResultReceiver resultReceiver = this.f47099d;
        String str = this.f47098c;
        C23082f c23082f = new C23082f(str, resultReceiver);
        abstractServiceC23085i.f47035f = bVar;
        abstractServiceC23085i.g(str, c23082f);
        abstractServiceC23085i.f47035f = null;
        if (!c23082f.b()) {
            throw new IllegalStateException(androidx.camera.camera2.internal.G.f("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
