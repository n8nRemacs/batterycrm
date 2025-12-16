package com.airbnb.lottie;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.zip.ZipInputStream;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.airbnb.lottie.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC27294n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59900c;

    public /* synthetic */ RunnableC27294n(Object obj, int i12) {
        this.f59899b = i12;
        this.f59900c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Object obj = this.f59900c;
        switch (this.f59899b) {
            case 0:
                HashMap map = C27296p.f59916a;
                com.airbnb.lottie.utils.k.b((InputStream) obj);
                return;
            case 1:
                HashMap map2 = C27296p.f59916a;
                com.airbnb.lottie.utils.k.b((ZipInputStream) obj);
                return;
            case 2:
                B b12 = (B) obj;
                Semaphore semaphore = b12.f59032R;
                com.airbnb.lottie.model.layer.c cVar = b12.f59053t;
                if (cVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    cVar.s(b12.f59036c.i());
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    semaphore.release();
                    throw th2;
                }
                semaphore.release();
                return;
            default:
                Executor executor = J.f59110e;
                ((J) obj).c();
                return;
        }
    }
}
