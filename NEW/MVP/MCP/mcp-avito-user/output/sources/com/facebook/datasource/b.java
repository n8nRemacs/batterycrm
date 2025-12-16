package com.facebook.datasource;

/* compiled from: AbstractDataSource.java */
/* loaded from: classes5.dex */
class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f339874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f339875c;

    public b(c cVar, k kVar) {
        this.f339875c = cVar;
        this.f339874b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f339874b.d(this.f339875c);
    }
}
