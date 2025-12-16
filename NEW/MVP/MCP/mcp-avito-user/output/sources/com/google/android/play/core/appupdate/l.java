package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.avito.android.home.HomeActivity;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class l implements InterfaceC37095b {

    /* renamed from: a, reason: collision with root package name */
    public final w f358058a;

    /* renamed from: b, reason: collision with root package name */
    public final i f358059b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f358060c;

    public l(w wVar, i iVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f358058a = wVar;
        this.f358059b = iVar;
        this.f358060c = context;
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final Task<C37094a> a() {
        String packageName = this.f358060c.getPackageName();
        w wVar = this.f358058a;
        com.google.android.play.core.appupdate.internal.D d12 = wVar.f358080a;
        if (d12 != null) {
            w.f358078e.c("requestUpdateInfo(%s)", packageName);
            C37028k c37028k = new C37028k();
            d12.c(new r(c37028k, c37028k, wVar, packageName), c37028k);
            return c37028k.f355672a;
        }
        Object[] objArr = {-9};
        com.google.android.play.core.appupdate.internal.s sVar = w.f358078e;
        sVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            com.google.android.play.core.appupdate.internal.s.d(sVar.f358045a, "onError(%d)", objArr);
        }
        return C37030m.e(new InstallException(-9));
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final boolean b(C37094a c37094a, @JY0.b int i12, HomeActivity homeActivity) throws IntentSender.SendIntentException {
        AbstractC37097d abstractC37097dA = AbstractC37097d.c(i12).a();
        k kVar = new k(homeActivity);
        if (c37094a == null || c37094a.a(abstractC37097dA) == null || c37094a.f358013i) {
            return false;
        }
        c37094a.f358013i = true;
        kVar.f358057b.startIntentSenderForResult(c37094a.a(abstractC37097dA).getIntentSender(), 0, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final Task<Void> c() {
        String packageName = this.f358060c.getPackageName();
        w wVar = this.f358058a;
        com.google.android.play.core.appupdate.internal.D d12 = wVar.f358080a;
        if (d12 != null) {
            w.f358078e.c("completeUpdate(%s)", packageName);
            C37028k c37028k = new C37028k();
            d12.c(new s(c37028k, c37028k, wVar, packageName), c37028k);
            return c37028k.f355672a;
        }
        Object[] objArr = {-9};
        com.google.android.play.core.appupdate.internal.s sVar = w.f358078e;
        sVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            com.google.android.play.core.appupdate.internal.s.d(sVar.f358045a, "onError(%d)", objArr);
        }
        return C37030m.e(new InstallException(-9));
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final synchronized void d(com.google.android.play.core.install.a aVar) {
        this.f358059b.b(aVar);
    }

    @Override // com.google.android.play.core.appupdate.InterfaceC37095b
    public final synchronized void e(com.google.android.play.core.install.a aVar) {
        this.f358059b.c(aVar);
    }
}
