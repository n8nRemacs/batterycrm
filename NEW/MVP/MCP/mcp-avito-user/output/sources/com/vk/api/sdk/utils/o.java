package com.vk.api.sdk.utils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VKValidationLocker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/utils/o;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f366748a = new o();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final ReentrantLock f366749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Condition f366750c;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f366749b = reentrantLock;
        f366750c = reentrantLock.newCondition();
    }

    public static void a() {
        try {
            ReentrantLock reentrantLock = f366749b;
            reentrantLock.lock();
            try {
                f366750c.await();
                G0 g02 = G0.f406611a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (InterruptedException unused) {
        }
    }

    public static void b() {
        ReentrantLock reentrantLock = f366749b;
        reentrantLock.lock();
        try {
            f366750c.signalAll();
            G0 g02 = G0.f406611a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
