package com.facebook.datasource;

/* compiled from: AbstractDataSource.java */
/* loaded from: classes5.dex */
class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f339870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f339871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f339873e;

    public a(c cVar, boolean z12, k kVar, boolean z13) {
        this.f339873e = cVar;
        this.f339870b = z12;
        this.f339871c = kVar;
        this.f339872d = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z12 = this.f339870b;
        c cVar = this.f339873e;
        k kVar = this.f339871c;
        if (z12) {
            kVar.c(cVar);
        } else if (this.f339872d) {
            kVar.b();
        } else {
            kVar.e(cVar);
        }
    }
}
