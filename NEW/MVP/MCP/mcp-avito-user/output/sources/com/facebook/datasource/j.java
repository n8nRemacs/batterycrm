package com.facebook.datasource;

import com.facebook.common.internal.r;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.CountDownLatch;

/* compiled from: DataSources.java */
@Nullsafe
/* loaded from: classes5.dex */
public class j {
    public static r a(NullPointerException nullPointerException) {
        return new g(nullPointerException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @I41.h
    public static Object b(c cVar) throws Throwable {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        g gVar = null;
        a aVar = new a(gVar);
        a aVar2 = new a(gVar);
        cVar.d(new h(aVar, countDownLatch, aVar2), new i());
        countDownLatch.await();
        T t12 = aVar2.f339891a;
        if (t12 == 0) {
            return aVar.f339891a;
        }
        throw ((Throwable) t12);
    }

    /* compiled from: DataSources.java */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @I41.h
        public T f339891a;

        public a() {
            this.f339891a = null;
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }
}
