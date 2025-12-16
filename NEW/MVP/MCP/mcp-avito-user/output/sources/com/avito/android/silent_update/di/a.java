package com.avito.android.silent_update.di;

import AK0.l;
import Dw0.C13452e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.silent_update.di.b;
import com.avito.android.silent_update.download.UpdateDownloadCompletedBroadcastReceiver;
import com.avito.android.silent_update.install.PackageInstallerStatusReceiver;
import com.google.gson.Gson;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerSilentUpdateComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSilentUpdateComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.silent_update.di.b.a
        public final com.avito.android.silent_update.di.b a(Bw0.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerSilentUpdateComponent.java */
    public static final class c implements com.avito.android.silent_update.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final Bw0.c f283626a;

        public c(Bw0.c cVar, C8456a c8456a) {
            this.f283626a = cVar;
        }

        @Override // com.avito.android.silent_update.di.b
        public final void a(PackageInstallerStatusReceiver packageInstallerStatusReceiver) {
            Bw0.c cVar = this.f283626a;
            packageInstallerStatusReceiver.f283665a = cVar.Q9();
            l lVarHf = cVar.hf();
            Gson gsonZ5 = cVar.Z5();
            t.c(gsonZ5);
            packageInstallerStatusReceiver.f283666b = new com.avito.android.silent_update.a(lVarHf, gsonZ5);
            InterfaceC28373a interfaceC28373aP2 = cVar.p2();
            t.c(interfaceC28373aP2);
            packageInstallerStatusReceiver.f283667c = new C13452e(interfaceC28373aP2);
        }

        @Override // com.avito.android.silent_update.di.b
        public final void b(UpdateDownloadCompletedBroadcastReceiver updateDownloadCompletedBroadcastReceiver) {
            Bw0.c cVar = this.f283626a;
            updateDownloadCompletedBroadcastReceiver.f283629a = cVar.Q9();
            InterfaceC28373a interfaceC28373aP2 = cVar.p2();
            t.c(interfaceC28373aP2);
            updateDownloadCompletedBroadcastReceiver.f283630b = new Cw0.e(interfaceC28373aP2);
            l lVarHf = cVar.hf();
            Gson gsonZ5 = cVar.Z5();
            t.c(gsonZ5);
            updateDownloadCompletedBroadcastReceiver.f283631c = new com.avito.android.silent_update.a(lVarHf, gsonZ5);
            updateDownloadCompletedBroadcastReceiver.f283632d = cVar.Re();
            InterfaceC28373a interfaceC28373aP22 = cVar.p2();
            t.c(interfaceC28373aP22);
            updateDownloadCompletedBroadcastReceiver.f283633e = new com.avito.android.silent_update.install.c(new C13452e(interfaceC28373aP22), cVar.Q9());
        }
    }

    public static b.a a() {
        return new b();
    }
}
