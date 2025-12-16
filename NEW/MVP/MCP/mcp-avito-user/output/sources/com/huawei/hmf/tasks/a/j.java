package com.huawei.hmf.tasks.a;

import android.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class j extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f363195b = new ArrayList();

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f363195b) {
            try {
                Iterator it = this.f363195b.iterator();
                while (it.hasNext()) {
                    com.huawei.hmf.tasks.e eVar = (com.huawei.hmf.tasks.e) ((WeakReference) it.next()).get();
                    if (eVar != null) {
                        eVar.cancel();
                    }
                }
                this.f363195b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
