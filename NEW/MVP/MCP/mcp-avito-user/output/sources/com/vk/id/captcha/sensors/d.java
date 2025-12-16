package com.vk.id.captcha.sensors;

import Y61.k;
import Y61.l;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.G0;
import kotlin.jvm.internal.s0;

/* compiled from: HandlerThreadProvider.kt */
@s0
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final String f366817a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private volatile HandlerThread f366818b;

    /* renamed from: c, reason: collision with root package name */
    @k
    private AtomicInteger f366819c = new AtomicInteger();

    public d(@k String str) {
        this.f366817a = str;
    }

    @k
    public final HandlerThread a() {
        HandlerThread handlerThread = this.f366818b;
        if (handlerThread != null) {
            this.f366819c.incrementAndGet();
            return handlerThread;
        }
        synchronized (this) {
            HandlerThread handlerThread2 = this.f366818b;
            if (handlerThread2 != null) {
                this.f366819c.incrementAndGet();
                return handlerThread2;
            }
            HandlerThread handlerThread3 = new HandlerThread(this.f366817a);
            handlerThread3.start();
            this.f366818b = handlerThread3;
            this.f366819c.incrementAndGet();
            return handlerThread3;
        }
    }

    public final void b() {
        if (this.f366818b == null) {
            this.f366819c.decrementAndGet();
            return;
        }
        synchronized (this) {
            try {
                if (this.f366819c.decrementAndGet() == 0) {
                    HandlerThread handlerThread = this.f366818b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    this.f366818b = null;
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
