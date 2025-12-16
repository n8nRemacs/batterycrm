package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;
import com.google.firebase.messaging.AbstractServiceC37614h;
import com.google.firebase.messaging.P;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes6.dex */
class O extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f361815b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractServiceC37614h.a f361816a;

    /* compiled from: WithinAppServiceBinder.java */
    public interface a {
    }

    public O(AbstractServiceC37614h.a aVar) {
        this.f361816a = aVar;
    }

    public final void a(P.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        Intent intent = aVar.f361823a;
        AbstractServiceC37614h.a aVar2 = this.f361816a;
        aVar2.getClass();
        int i12 = AbstractServiceC37614h.f361860g;
        AbstractServiceC37614h abstractServiceC37614h = AbstractServiceC37614h.this;
        C37028k c37028k = new C37028k();
        abstractServiceC37614h.f361861b.execute(new RunnableC37613g(abstractServiceC37614h, intent, c37028k));
        c37028k.f355672a.d(new androidx.arch.core.executor.a(1), new C37620n(aVar, 3));
    }
}
