package com.huawei.hmf.tasks.a;

/* loaded from: classes7.dex */
final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f363190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f363191c;

    public h(i iVar, s sVar) {
        this.f363191c = iVar;
        this.f363190b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f363191c.f363194c) {
            try {
                com.huawei.hmf.tasks.h hVar = this.f363191c.f363192a;
                if (hVar != null) {
                    hVar.onFailure(this.f363190b.c());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
