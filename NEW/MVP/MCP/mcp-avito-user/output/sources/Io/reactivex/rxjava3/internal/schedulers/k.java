package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* loaded from: classes8.dex */
public final class k extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: b, reason: collision with root package name */
    public final String f404735b;

    /* renamed from: c, reason: collision with root package name */
    public final int f404736c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f404737d;

    /* compiled from: RxThreadFactory.java */
    public static final class a extends Thread implements j {
    }

    public k(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@j41.e Runnable runnable) {
        String str = this.f404735b + '-' + incrementAndGet();
        Thread aVar = this.f404737d ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f404736c);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return AK.c.s(new StringBuilder("RxThreadFactory["), this.f404735b, "]");
    }

    public k(String str, int i12, boolean z12) {
        this.f404735b = str;
        this.f404736c = i12;
        this.f404737d = z12;
    }
}
