package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.core.util.C22807v;
import androidx.media.AbstractServiceC23085i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IBinder f47090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f47091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47092f;

    public v(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str, IBinder iBinder, Bundle bundle) {
        this.f47092f = kVar;
        this.f47088b = mVar;
        this.f47089c = str;
        this.f47090d = iBinder;
        this.f47091e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f47088b.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f47092f;
        AbstractServiceC23085i.b bVar = AbstractServiceC23085i.this.f47034e.get(binder);
        if (bVar == null) {
            return;
        }
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        HashMap<String, List<C22807v<IBinder, Bundle>>> map = bVar.f47045f;
        String str = this.f47089c;
        List<C22807v<IBinder, Bundle>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<C22807v<IBinder, Bundle>> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            IBinder iBinder = this.f47090d;
            Bundle bundle = this.f47091e;
            if (!zHasNext) {
                arrayList.add(new C22807v<>(iBinder, bundle));
                map.put(str, arrayList);
                C23081e c23081e = new C23081e(abstractServiceC23085i, str, bVar, str, bundle);
                abstractServiceC23085i.f47035f = bVar;
                if (bundle == null) {
                    abstractServiceC23085i.f(str, c23081e);
                } else {
                    abstractServiceC23085i.e(bundle, c23081e, str);
                }
                abstractServiceC23085i.f47035f = null;
                if (!c23081e.b()) {
                    throw new IllegalStateException(androidx.camera.camera2.internal.G.g(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), bVar.f47040a, " id=", str));
                }
                abstractServiceC23085i.f47035f = bVar;
                abstractServiceC23085i.i(bundle, str);
                abstractServiceC23085i.f47035f = null;
                return;
            }
            C22807v<IBinder, Bundle> next = it.next();
            if (iBinder == next.f44895a && C23079c.a(bundle, next.f44896b)) {
                return;
            }
        }
    }
}
