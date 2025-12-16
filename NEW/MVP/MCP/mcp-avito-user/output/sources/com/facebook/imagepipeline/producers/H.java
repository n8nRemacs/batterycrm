package com.facebook.imagepipeline.producers;

/* compiled from: JobScheduler.java */
/* loaded from: classes15.dex */
class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f340545b;

    public H(I i12) {
        this.f340545b = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i12 = this.f340545b;
        i12.f340546a.execute(i12.f340548c);
    }
}
