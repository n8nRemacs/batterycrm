package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.AbstractServiceC23085i;
import androidx.media.AbstractServiceC23085i.b;
import java.util.Iterator;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f47103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47105f;

    public y(int i12, int i13, Bundle bundle, AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str) {
        this.f47105f = kVar;
        this.f47101b = mVar;
        this.f47102c = i12;
        this.f47103d = str;
        this.f47104e = i13;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        AbstractServiceC23085i.b bVar;
        AbstractServiceC23085i.m mVar = this.f47101b;
        IBinder binder = mVar.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f47105f;
        AbstractServiceC23085i.this.f47034e.remove(binder);
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        Iterator<AbstractServiceC23085i.b> it = abstractServiceC23085i.f47033d.iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractServiceC23085i.b next = it.next();
            if (next.f47042c == this.f47102c) {
                if (TextUtils.isEmpty(this.f47103d) || this.f47104e <= 0) {
                    bVar = abstractServiceC23085i.new b(next.f47040a, next.f47041b, next.f47042c, mVar);
                }
                it.remove();
            }
        }
        if (bVar == null) {
            bVar = abstractServiceC23085i.new b(this.f47103d, this.f47104e, this.f47102c, mVar);
        }
        abstractServiceC23085i.f47034e.put(binder, bVar);
        try {
            binder.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
