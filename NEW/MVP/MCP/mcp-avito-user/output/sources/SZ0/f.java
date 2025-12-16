package SZ0;

import android.util.Log;
import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.google.android.gms.common.internal.C36713l;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.mlkit_common.zzsc;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.tasks.C37019b;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.AbstractC37639h;
import j.N;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@RX0.a
/* loaded from: classes6.dex */
public class f<DetectionResultT> implements Closeable, InterfaceC22982O {

    /* renamed from: f, reason: collision with root package name */
    public static final C36713l f15074f = new C36713l("MobileVisionBase", "");

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f15075b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37639h f15076c;

    /* renamed from: d, reason: collision with root package name */
    public final C37019b f15077d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15078e;

    @RX0.a
    public f(@N AbstractC37639h<DetectionResultT, com.google.mlkit.vision.common.a> abstractC37639h, @N Executor executor) {
        this.f15076c = abstractC37639h;
        C37019b c37019b = new C37019b();
        this.f15077d = c37019b;
        this.f15078e = executor;
        abstractC37639h.f362374b.incrementAndGet();
        abstractC37639h.a(executor, new Callable() { // from class: SZ0.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C36713l c36713l = f.f15074f;
                return null;
            }
        }, c37019b.f355671a).e(new InterfaceC37023f() { // from class: SZ0.i
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public final void onFailure(Exception exc) {
                C36713l c36713l = f.f15074f;
                if (Log.isLoggable(c36713l.f349447a, 6)) {
                    c36713l.d("Error preloading model resource");
                }
            }
        });
    }

    @N
    @RX0.a
    public final synchronized Task<DetectionResultT> b(@N final com.google.mlkit.vision.common.a aVar) {
        if (this.f15075b.get()) {
            return C37030m.e(new MlKitException("This detector is already closed!", 14));
        }
        if (aVar.f362446d < 32 || aVar.f362447e < 32) {
            return C37030m.e(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.f15076c.a(this.f15078e, new Callable() { // from class: SZ0.g
            @Override // java.util.concurrent.Callable
            public final Object call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                com.google.mlkit.vision.common.a aVar2 = aVar;
                f fVar = this.f15079b;
                fVar.getClass();
                zzkl zzklVarZze = zzkl.zze("detectorTaskWithResource#run");
                zzklVarZze.zzb();
                try {
                    List listD = fVar.f15076c.d(aVar2);
                    zzklVarZze.close();
                    return listD;
                } catch (Throwable th2) {
                    try {
                        zzklVarZze.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            }
        }, this.f15077d.f355671a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @RX0.a
    @InterfaceC23042i0(Lifecycle.Event.ON_DESTROY)
    public synchronized void close() {
        boolean z12 = true;
        if (this.f15075b.getAndSet(true)) {
            return;
        }
        this.f15077d.a();
        final AbstractC37639h abstractC37639h = this.f15076c;
        Executor executor = this.f15078e;
        if (abstractC37639h.f362374b.get() <= 0) {
            z12 = false;
        }
        C36729v.m(z12);
        final C37028k c37028k = new C37028k();
        abstractC37639h.f362373a.a(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.C
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC37645n abstractC37645n = abstractC37639h;
                int iDecrementAndGet = abstractC37645n.f362374b.decrementAndGet();
                C36729v.m(iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    abstractC37645n.c();
                    abstractC37645n.f362375c.set(false);
                }
                zzsc.zza();
                c37028k.b(null);
            }
        }, executor);
    }

    @N
    public Task<List<TZ0.a>> gQ(@N com.google.mlkit.vision.common.a aVar) {
        return b(aVar);
    }
}
