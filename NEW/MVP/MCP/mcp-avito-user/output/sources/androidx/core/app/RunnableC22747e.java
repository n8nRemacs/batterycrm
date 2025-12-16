package androidx.core.app;

import androidx.core.app.C22750h;

/* compiled from: ActivityRecreator.java */
/* renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class RunnableC22747e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C22750h.a f44523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44524c;

    public RunnableC22747e(C22750h.a aVar, Object obj) {
        this.f44523b = aVar;
        this.f44524c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44523b.f44536b = this.f44524c;
    }
}
