package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di;

import android.app.Application;
import com.avito.android.iac_dialer_watcher.impl_module.logging.k;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.H;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.IacLogSendingWorker;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerIacLogSendingWorkerComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacLogSendingWorkerComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.b.a
        public final com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.b a(com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerIacLogSendingWorkerComponent.java */
    public static final class c implements com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.c f168061a;

        public c(com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.c cVar, C4971a c4971a) {
            this.f168061a = cVar;
        }

        @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.b
        public final void a(IacLogSendingWorker iacLogSendingWorker) {
            com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.c cVar = this.f168061a;
            k kVarQh = cVar.Qh();
            t.c(kVarQh);
            iacLogSendingWorker.f168051b = kVarQh;
            H hAe = cVar.Ae();
            t.c(hAe);
            iacLogSendingWorker.f168052c = hAe;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            iacLogSendingWorker.f168053d = interfaceC35745a5D;
            Application applicationK = cVar.k();
            t.c(applicationK);
            iacLogSendingWorker.f168054e = applicationK;
            iacLogSendingWorker.f168055f = cVar.cc();
        }
    }

    public static b.a a() {
        return new b();
    }
}
