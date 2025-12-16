package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RestrictTo;
import androidx.work.multiprocess.InterfaceC23620a;
import com.google.common.util.concurrent.D0;
import j.N;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.Q0;

/* compiled from: ListenableWorkerImplClient.java */
@RestrictTo
/* renamed from: androidx.work.multiprocess.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23625f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f56154e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f56155a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f56156b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f56157c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public a f56158d;

    /* compiled from: ListenableWorkerImplClient.java */
    @RestrictTo
    /* renamed from: androidx.work.multiprocess.f$a */
    public static class a implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public final androidx.work.impl.utils.futures.c<InterfaceC23620a> f56159b = new androidx.work.impl.utils.futures.c<>();

        static {
            androidx.work.G.b("ListenableWorkerImplSession");
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(@N ComponentName componentName) {
            androidx.work.G.a().getClass();
            this.f56159b.i(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(@N ComponentName componentName) {
            androidx.work.G.a().getClass();
            this.f56159b.i(new RuntimeException("Cannot bind to service " + componentName));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v6, types: [androidx.work.multiprocess.a] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(@N ComponentName componentName, @N IBinder iBinder) {
            InterfaceC23620a.b.C1967a c1967a;
            androidx.work.G.a().getClass();
            int i12 = InterfaceC23620a.b.f56131a;
            if (iBinder == null) {
                c1967a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC23620a.f56130m);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC23620a)) {
                    InterfaceC23620a.b.C1967a c1967a2 = new InterfaceC23620a.b.C1967a();
                    c1967a2.f56132a = iBinder;
                    c1967a = c1967a2;
                } else {
                    c1967a = (InterfaceC23620a) iInterfaceQueryLocalInterface;
                }
            }
            this.f56159b.h(c1967a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(@N ComponentName componentName) {
            androidx.work.G.a().getClass();
            this.f56159b.i(new RuntimeException("Service disconnected"));
        }
    }

    static {
        androidx.work.G.b("ListenableWorkerImplClient");
    }

    public C23625f(@N Context context, @N ExecutorService executorService) {
        this.f56155a = context;
        this.f56156b = executorService;
    }

    @N
    public final D0<byte[]> a(@N ComponentName componentName, @N InterfaceC23629j<InterfaceC23620a> interfaceC23629j) {
        androidx.work.impl.utils.futures.c<InterfaceC23620a> cVar;
        synchronized (this.f56157c) {
            try {
                if (this.f56158d == null) {
                    androidx.work.G gA2 = androidx.work.G.a();
                    componentName.getPackageName();
                    componentName.getClassName();
                    gA2.getClass();
                    this.f56158d = new a();
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        if (!this.f56155a.bindService(intent, this.f56158d, 1)) {
                            a aVar = this.f56158d;
                            RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
                            androidx.work.G.a().getClass();
                            aVar.f56159b.i(runtimeException);
                        }
                    } catch (Throwable th2) {
                        a aVar2 = this.f56158d;
                        androidx.work.G.a().getClass();
                        aVar2.f56159b.i(th2);
                    }
                }
                cVar = this.f56158d.f56159b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ExecutorService executorService = this.f56156b;
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        CoroutineContext coroutineContextPlus = A0.b(executorService).plus(Q0.a());
        k kVar = new k(cVar, interfaceC23629j, null);
        fVar.getClass();
        return androidx.concurrent.futures.f.a(coroutineContextPlus, false, kVar);
    }
}
