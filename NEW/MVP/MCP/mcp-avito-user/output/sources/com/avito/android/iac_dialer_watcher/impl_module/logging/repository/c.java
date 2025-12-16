package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import fg0.f;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f167904b;

    @Override // java.util.concurrent.Callable
    public final Object call() throws InterruptedException {
        switch (this.f167904b) {
            case 0:
                int i12 = e.f167908g;
                return G0.f406611a;
            case 1:
                String str = com.avito.android.iac_dialer_watcher.impl_module.logging.writing.q.f168102k;
                return G0.f406611a;
            case 2:
                com.avito.android.push.impl_module.fcm.i.f245951h.acquire();
                return G0.f406611a;
            case 3:
                int i13 = com.avito.android.push.impl_module.token.providing.a.f245979e;
                return f.b.f396039a;
            default:
                return Long.valueOf(System.currentTimeMillis());
        }
    }
}
