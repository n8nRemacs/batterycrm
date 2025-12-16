package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.core.os.K;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.e;
import androidx.emoji2.text.n;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.ProcessLifecycleInitializer;
import b2.C25390a;
import b2.InterfaceC25391b;
import j.N;
import j.X;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC25391b<Boolean> {

    @X
    public static class a extends e.d {
    }

    @X
    public static class b implements e.j {

        /* renamed from: a, reason: collision with root package name */
        public final Context f46060a;

        public b(Context context) {
            this.f46060a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.j
        public final void a(@N final e.k kVar) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.h
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = this.f46111b;
                    e.k kVar2 = kVar;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    bVar.getClass();
                    try {
                        n nVarA = c.a(bVar.f46060a);
                        if (nVarA == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        n.c cVar = (n.c) nVarA.f46079a;
                        synchronized (cVar.f46139d) {
                            cVar.f46141f = threadPoolExecutor2;
                        }
                        nVarA.f46079a.a(new i(kVar2, threadPoolExecutor2));
                    } catch (Throwable th2) {
                        kVar2.a(th2);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i12 = K.f44794a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (e.g()) {
                    e.a().h();
                }
                Trace.endSection();
            } catch (Throwable th2) {
                int i13 = K.f44794a;
                Trace.endSection();
                throw th2;
            }
        }
    }

    @Override // b2.InterfaceC25391b
    @N
    public final Boolean a(@N Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.f46080b = 1;
        if (e.f46066k == null) {
            synchronized (e.f46065j) {
                try {
                    if (e.f46066k == null) {
                        e.f46066k = new e(aVar);
                    }
                } finally {
                }
            }
        }
        C25390a c25390aC = C25390a.c(context);
        c25390aC.getClass();
        synchronized (C25390a.f56819e) {
            try {
                objB = c25390aC.f56820a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = c25390aC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        Lifecycle lifecycle = ((InterfaceC22983P) objB).getLifecycle();
        lifecycle.a(new g(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // b2.InterfaceC25391b
    @N
    public final List<Class<? extends InterfaceC25391b<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
