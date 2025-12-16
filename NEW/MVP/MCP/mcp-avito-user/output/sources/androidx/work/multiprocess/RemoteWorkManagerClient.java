package androidx.work.multiprocess;

import Fc1.G3;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import androidx.work.C23638w;
import androidx.work.impl.C23550e;
import androidx.work.impl.Y;
import androidx.work.multiprocess.InterfaceC23621b;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import com.google.common.util.concurrent.D0;
import j.N;
import java.util.UUID;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.Q0;

@RestrictTo
/* loaded from: classes10.dex */
public class RemoteWorkManagerClient extends t {

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.camera.core.processing.j f56113i;

    /* renamed from: a, reason: collision with root package name */
    public c f56114a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f56115b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f56116c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f56117d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f56118e;

    /* renamed from: f, reason: collision with root package name */
    public final long f56119f;

    /* renamed from: g, reason: collision with root package name */
    public final C23550e f56120g;

    /* renamed from: h, reason: collision with root package name */
    public final d f56121h;

    public class a implements InterfaceC23629j<InterfaceC23621b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f56122b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C23638w f56123c;

        public a(String str, C23638w c23638w) {
            this.f56122b = str;
            this.f56123c = c23638w;
        }

        @Override // androidx.work.multiprocess.InterfaceC23629j
        public final void i(@N IInterface iInterface, @N m mVar) {
            ((InterfaceC23621b) iInterface).E1(mVar, androidx.work.multiprocess.parcelable.a.a(new ParcelableForegroundRequestInfo(this.f56122b, this.f56123c)));
        }
    }

    public class b implements InterfaceC23629j<InterfaceC23621b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f56124b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C23544h f56125c;

        public b(UUID uuid, C23544h c23544h) {
            this.f56124b = uuid;
            this.f56125c = c23544h;
        }

        @Override // androidx.work.multiprocess.InterfaceC23629j
        public final void i(@N IInterface iInterface, @N m mVar) {
            ((InterfaceC23621b) iInterface).w0(mVar, androidx.work.multiprocess.parcelable.a.a(new ParcelableUpdateRequest(this.f56124b, this.f56125c)));
        }
    }

    @RestrictTo
    public static class c implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public final androidx.work.impl.utils.futures.c<InterfaceC23621b> f56126b = new androidx.work.impl.utils.futures.c<>();

        /* renamed from: c, reason: collision with root package name */
        public final RemoteWorkManagerClient f56127c;

        static {
            androidx.work.G.b("RemoteWMgr.Connection");
        }

        public c(@N RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f56127c = remoteWorkManagerClient;
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(@N ComponentName componentName) {
            androidx.work.G.a().getClass();
            this.f56126b.i(new RuntimeException("Binding died"));
            this.f56127c.d();
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(@N ComponentName componentName) {
            androidx.work.G.a().getClass();
            this.f56126b.i(new RuntimeException("Cannot bind to service " + componentName));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v6, types: [androidx.work.multiprocess.b] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(@N ComponentName componentName, @N IBinder iBinder) {
            InterfaceC23621b.AbstractBinderC1968b.a aVar;
            androidx.work.G.a().getClass();
            int i12 = InterfaceC23621b.AbstractBinderC1968b.f56134a;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC23621b.f56133n);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC23621b)) {
                    InterfaceC23621b.AbstractBinderC1968b.a aVar2 = new InterfaceC23621b.AbstractBinderC1968b.a();
                    aVar2.f56135a = iBinder;
                    aVar = aVar2;
                } else {
                    aVar = (InterfaceC23621b) iInterfaceQueryLocalInterface;
                }
            }
            this.f56126b.h(aVar);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(@N ComponentName componentName) {
            androidx.work.G.a().getClass();
            this.f56126b.i(new RuntimeException("Service disconnected"));
            this.f56127c.d();
        }
    }

    public static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final RemoteWorkManagerClient f56128b;

        static {
            androidx.work.G.b("SessionHandler");
        }

        public d(@N RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f56128b = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j12 = this.f56128b.f56118e;
            synchronized (this.f56128b.f56117d) {
                try {
                    long j13 = this.f56128b.f56118e;
                    c cVar = this.f56128b.f56114a;
                    if (cVar != null) {
                        if (j12 == j13) {
                            androidx.work.G.a().getClass();
                            this.f56128b.f56115b.unbindService(cVar);
                            androidx.work.G.a().getClass();
                            cVar.f56126b.i(new RuntimeException("Binding died"));
                            cVar.f56127c.d();
                        } else {
                            androidx.work.G.a().getClass();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static {
        androidx.work.G.b("RemoteWorkManagerClient");
        f56113i = new androidx.camera.core.processing.j(4);
    }

    public RemoteWorkManagerClient(@N Context context, @N Y y12) {
        this(context, y12, 6000000L);
    }

    @Override // androidx.work.multiprocess.t
    @N
    public final D0<Void> b(@N String str, @N C23638w c23638w) {
        D0<byte[]> d0E = e(new a(str, c23638w));
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        M mB2 = A0.b(this.f56116c);
        C23627h c23627h = new C23627h(f56113i, d0E, null);
        fVar.getClass();
        return androidx.concurrent.futures.f.a(mB2, false, c23627h);
    }

    @Override // androidx.work.multiprocess.t
    @N
    public final D0<Void> c(@N UUID uuid, @N C23544h c23544h) {
        D0<byte[]> d0E = e(new b(uuid, c23544h));
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        M mB2 = A0.b(this.f56116c);
        C23627h c23627h = new C23627h(f56113i, d0E, null);
        fVar.getClass();
        return androidx.concurrent.futures.f.a(mB2, false, c23627h);
    }

    public final void d() {
        synchronized (this.f56117d) {
            androidx.work.G.a().getClass();
            this.f56114a = null;
        }
    }

    @N
    public final D0<byte[]> e(@N InterfaceC23629j<InterfaceC23621b> interfaceC23629j) {
        androidx.work.impl.utils.futures.c<InterfaceC23621b> cVar;
        Intent intent = new Intent(this.f56115b, (Class<?>) RemoteWorkManagerService.class);
        synchronized (this.f56117d) {
            try {
                this.f56118e++;
                if (this.f56114a == null) {
                    androidx.work.G.a().getClass();
                    c cVar2 = new c(this);
                    this.f56114a = cVar2;
                    try {
                        if (!this.f56115b.bindService(intent, cVar2, 1)) {
                            c cVar3 = this.f56114a;
                            RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
                            androidx.work.G.a().getClass();
                            cVar3.f56126b.i(runtimeException);
                        }
                    } catch (Throwable th2) {
                        c cVar4 = this.f56114a;
                        androidx.work.G.a().getClass();
                        cVar4.f56126b.i(th2);
                    }
                }
                this.f56120g.b(this.f56121h);
                cVar = this.f56114a.f56126b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        J11.c cVar5 = new J11.c(22, this, cVar);
        androidx.work.impl.utils.taskexecutor.a aVar = this.f56116c;
        cVar.N(cVar5, aVar);
        androidx.concurrent.futures.f fVar = androidx.concurrent.futures.f.f43167a;
        CoroutineContext coroutineContextPlus = A0.b(aVar).plus(Q0.a());
        k kVar = new k(cVar, interfaceC23629j, null);
        fVar.getClass();
        D0<byte[]> d0A = androidx.concurrent.futures.f.a(coroutineContextPlus, false, kVar);
        d0A.N(new G3(this, 17), aVar);
        return d0A;
    }

    public RemoteWorkManagerClient(@N Context context, @N Y y12, long j12) {
        this.f56115b = context.getApplicationContext();
        this.f56116c = y12.f55560e.f56028a;
        this.f56117d = new Object();
        this.f56114a = null;
        this.f56121h = new d(this);
        this.f56119f = j12;
        this.f56120g = y12.f55558c.f55453g;
    }
}
