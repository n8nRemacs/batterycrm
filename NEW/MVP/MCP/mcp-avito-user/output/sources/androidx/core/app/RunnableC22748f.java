package androidx.core.app;

import android.app.Application;
import androidx.core.app.C22750h;

/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC22748f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f44525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C22750h.a f44526c;

    public RunnableC22748f(Application application, C22750h.a aVar) {
        this.f44525b = application;
        this.f44526c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44525b.unregisterActivityLifecycleCallbacks(this.f44526c);
    }
}
