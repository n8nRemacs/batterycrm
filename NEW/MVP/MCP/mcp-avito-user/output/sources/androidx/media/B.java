package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import androidx.media.AbstractServiceC23085i;
import java.util.Objects;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f46998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f46999c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f47000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f47001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47002f;

    public B(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f47002f = kVar;
        this.f46998b = mVar;
        this.f46999c = str;
        this.f47000d = bundle;
        this.f47001e = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f46998b.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f47002f;
        AbstractServiceC23085i.b bVar = AbstractServiceC23085i.this.f47034e.get(binder);
        Bundle bundle = this.f47000d;
        if (bVar == null) {
            Objects.toString(bundle);
            return;
        }
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        ResultReceiver resultReceiver = this.f47001e;
        String str = this.f46999c;
        C23084h c23084h = new C23084h(str, resultReceiver);
        abstractServiceC23085i.f47035f = bVar;
        abstractServiceC23085i.c(bundle, c23084h, str);
        abstractServiceC23085i.f47035f = null;
        if (c23084h.b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }
}
