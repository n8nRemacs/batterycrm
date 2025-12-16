package com.huawei.hms.framework.common;

/* loaded from: classes7.dex */
public class RunnableEnhance implements Runnable {
    static final String TRANCELOGO = " -->";

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f363468b;

    /* renamed from: c, reason: collision with root package name */
    public final String f363469c = Thread.currentThread().getName();

    public RunnableEnhance(Runnable runnable) {
        this.f363468b = runnable;
    }

    public String getParentName() {
        return this.f363469c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f363468b.run();
    }
}
