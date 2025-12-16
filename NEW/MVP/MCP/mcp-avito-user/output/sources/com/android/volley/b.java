package com.android.volley;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncNetwork.java */
/* loaded from: classes10.dex */
public abstract class b implements p {

    /* compiled from: AsyncNetwork.java */
    public class a implements InterfaceC2123b {
    }

    /* compiled from: AsyncNetwork.java */
    /* renamed from: com.android.volley.b$b, reason: collision with other inner class name */
    public interface InterfaceC2123b {
    }

    @Override // com.android.volley.p
    public final r a(Request<?> request) throws InterruptedException, VolleyError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        b(request, new a());
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (r) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((VolleyError) atomicReference2.get());
            }
            throw new VolleyError(0);
        } catch (InterruptedException e12) {
            z.a("while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new VolleyError(e12);
        }
    }

    public abstract void b(Request<?> request, InterfaceC2123b interfaceC2123b);
}
