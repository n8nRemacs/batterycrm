package com.facebook.datasource;

import com.facebook.datasource.j;
import java.util.concurrent.CountDownLatch;

/* compiled from: DataSources.java */
/* loaded from: classes5.dex */
final class h implements k<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j.a f339888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f339889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f339890c;

    public h(j.a aVar, CountDownLatch countDownLatch, j.a aVar2) {
        this.f339888a = aVar;
        this.f339889b = countDownLatch;
        this.f339890c = aVar2;
    }

    @Override // com.facebook.datasource.k
    public final void b() {
        this.f339889b.countDown();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Throwable] */
    @Override // com.facebook.datasource.k
    public final void c(f<Object> fVar) {
        CountDownLatch countDownLatch = this.f339889b;
        try {
            this.f339890c.f339891a = fVar.f();
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object] */
    @Override // com.facebook.datasource.k
    public final void e(f<Object> fVar) {
        CountDownLatch countDownLatch = this.f339889b;
        if (fVar.g()) {
            try {
                this.f339888a.f339891a = fVar.a();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    @Override // com.facebook.datasource.k
    public final void d(f<Object> fVar) {
    }
}
