package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsyncHttpStack.java */
/* renamed from: com.android.volley.toolbox.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC27623c extends AbstractC27625e {

    /* compiled from: AsyncHttpStack.java */
    /* renamed from: com.android.volley.toolbox.c$a */
    public class a implements b {
    }

    /* compiled from: AsyncHttpStack.java */
    /* renamed from: com.android.volley.toolbox.c$b */
    public interface b {
    }

    /* compiled from: AsyncHttpStack.java */
    /* renamed from: com.android.volley.toolbox.c$c, reason: collision with other inner class name */
    public static class C2125c {

        /* renamed from: a, reason: collision with root package name */
        public final o f67115a;

        /* renamed from: b, reason: collision with root package name */
        public final IOException f67116b;

        /* renamed from: c, reason: collision with root package name */
        public final AuthFailureError f67117c;

        public C2125c(o oVar, IOException iOException, AuthFailureError authFailureError, a aVar) {
            this.f67115a = oVar;
            this.f67116b = iOException;
            this.f67117c = authFailureError;
        }
    }

    @Override // com.android.volley.toolbox.AbstractC27625e
    public final o a(Request<?> request, Map<String, String> map) throws InterruptedException, IOException, AuthFailureError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        b();
        try {
            countDownLatch.await();
            C2125c c2125c = (C2125c) atomicReference.get();
            o oVar = c2125c.f67115a;
            if (oVar != null) {
                return oVar;
            }
            IOException iOException = c2125c.f67116b;
            if (iOException != null) {
                throw iOException;
            }
            throw c2125c.f67117c;
        } catch (InterruptedException e12) {
            com.android.volley.z.a("while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e12.toString());
        }
    }

    public abstract void b();
}
