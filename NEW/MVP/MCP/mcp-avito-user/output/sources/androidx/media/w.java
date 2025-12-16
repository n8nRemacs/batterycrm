package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.core.util.C22807v;
import androidx.media.AbstractServiceC23085i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.m f47093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IBinder f47095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.k f47096e;

    public w(AbstractServiceC23085i.k kVar, AbstractServiceC23085i.m mVar, String str, IBinder iBinder) {
        this.f47096e = kVar;
        this.f47093b = mVar;
        this.f47094c = str;
        this.f47095d = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f47093b.f47066a.getBinder();
        AbstractServiceC23085i.k kVar = this.f47096e;
        AbstractServiceC23085i.b bVar = AbstractServiceC23085i.this.f47034e.get(binder);
        if (bVar == null) {
            return;
        }
        AbstractServiceC23085i abstractServiceC23085i = AbstractServiceC23085i.this;
        HashMap<String, List<C22807v<IBinder, Bundle>>> map = bVar.f47045f;
        String str = this.f47094c;
        IBinder iBinder = this.f47095d;
        try {
            if (iBinder == null) {
                map.remove(str);
            } else {
                List<C22807v<IBinder, Bundle>> list = map.get(str);
                if (list != null) {
                    Iterator<C22807v<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f44895a) {
                            it.remove();
                        }
                    }
                    if (list.size() == 0) {
                        map.remove(str);
                    }
                }
            }
        } finally {
            abstractServiceC23085i.f47035f = bVar;
            abstractServiceC23085i.j(str);
            abstractServiceC23085i.f47035f = null;
        }
    }
}
