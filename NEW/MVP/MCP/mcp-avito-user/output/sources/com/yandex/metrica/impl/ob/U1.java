package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C39015o1;
import com.yandex.metrica.impl.ob.J;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class U1 implements C39015o1.c, com.yandex.metrica.rtm.wrapper.k {

    /* renamed from: a, reason: collision with root package name */
    private final P0 f379574a;

    /* renamed from: b, reason: collision with root package name */
    private final C39015o1 f379575b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f379576c;

    /* renamed from: d, reason: collision with root package name */
    private final ICommonExecutor f379577d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38995n6 f379578e;

    public class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A3 f379579b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A3 a32) {
            super(U1.this, null);
            this.f379579b = a32;
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        public void a(@j.N IMetricaService iMetricaService) {
            P0 p02 = U1.this.f379574a;
            A3 a32 = this.f379579b;
            ((T1) p02).getClass();
            Bundle bundle = new Bundle();
            synchronized (a32) {
                bundle.putParcelable("PROCESS_CFG_OBJ", a32);
            }
            iMetricaService.b(bundle);
        }
    }

    public class b extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A3 f379581b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A3 a32) {
            super(U1.this, null);
            this.f379581b = a32;
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        public void a(@j.N IMetricaService iMetricaService) {
            P0 p02 = U1.this.f379574a;
            A3 a32 = this.f379581b;
            ((T1) p02).getClass();
            Bundle bundle = new Bundle();
            synchronized (a32) {
                bundle.putParcelable("PROCESS_CFG_OBJ", a32);
            }
            iMetricaService.a(bundle);
        }
    }

    @j.k0
    public class c extends d {

        /* renamed from: d, reason: collision with root package name */
        private boolean f379583d;

        /* renamed from: e, reason: collision with root package name */
        private final Xl f379584e;

        @j.k0
        public c(@j.N f fVar, @j.N Xl xl2) {
            super(fVar);
            this.f379583d = false;
            this.f379584e = xl2;
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        public boolean b() {
            f fVar = this.f379586b;
            if (fVar.b().f380261h != 0) {
                U1.this.f379578e.a(fVar);
                return false;
            }
            Context contextA = ((T1) U1.this.f379574a).a();
            Intent intentA = C38991n2.a(contextA);
            fVar.b().f380258e = EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b();
            intentA.putExtras(fVar.b().b(fVar.a().c()));
            try {
                contextA.startService(intentA);
                return false;
            } catch (Throwable unused) {
                U1.this.f379578e.a(fVar);
                return false;
            }
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        /* renamed from: a */
        public synchronized Void call() {
            if (this.f379583d) {
                return null;
            }
            this.f379583d = true;
            Xl xl2 = this.f379584e;
            xl2.getClass();
            try {
                if (!TextUtils.isEmpty(xl2.b())) {
                    if (xl2.b().endsWith(":Metrica")) {
                        a(this.f379586b);
                        return null;
                    }
                }
            } catch (Throwable unused) {
            }
            U1.this.f379575b.g();
            return super.call();
        }

        public void a(@j.N f fVar) {
            U1.this.f379578e.a(fVar);
        }
    }

    @j.k0
    public class d extends g {

        /* renamed from: b, reason: collision with root package name */
        final f f379586b;

        @j.k0
        public d(f fVar) {
            super(U1.this, null);
            this.f379586b = fVar;
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        public void a(Throwable th2) {
        }

        @Override // com.yandex.metrica.impl.ob.U1.g, java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Void call() {
            return call();
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        public void a(@j.N IMetricaService iMetricaService) {
            f fVar = this.f379586b;
            ((T1) U1.this.f379574a).a(iMetricaService, fVar.e(), fVar.f379589b);
        }
    }

    public interface e {
        C38715c0 a(C38715c0 c38715c0);
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private C38715c0 f379588a;

        /* renamed from: b, reason: collision with root package name */
        private Q1 f379589b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f379590c = false;

        /* renamed from: d, reason: collision with root package name */
        private e f379591d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private HashMap<J.a, Integer> f379592e;

        public f(C38715c0 c38715c0, Q1 q12) {
            this.f379588a = c38715c0;
            this.f379589b = new Q1(new A3(q12.a()), new CounterConfiguration(q12.b()), q12.e());
        }

        public C38715c0 b() {
            return this.f379588a;
        }

        public HashMap<J.a, Integer> c() {
            return this.f379592e;
        }

        public boolean d() {
            return this.f379590c;
        }

        public C38715c0 e() {
            e eVar = this.f379591d;
            return eVar != null ? eVar.a(this.f379588a) : this.f379588a;
        }

        public String toString() {
            return "ReportToSend{mReport=" + this.f379588a + ", mEnvironment=" + this.f379589b + ", mCrash=" + this.f379590c + ", mAction=" + this.f379591d + ", mTrimmedFields=" + this.f379592e + '}';
        }

        public f a(e eVar) {
            this.f379591d = eVar;
            return this;
        }

        public f a(@j.N HashMap<J.a, Integer> map) {
            this.f379592e = map;
            return this;
        }

        public f a(boolean z12) {
            this.f379590c = z12;
            return this;
        }

        public Q1 a() {
            return this.f379589b;
        }
    }

    public abstract class g implements Callable<Void> {
        private g() {
        }

        public abstract void a(@j.N IMetricaService iMetricaService);

        public void a(Throwable th2) {
        }

        public boolean b() {
            U1.this.f379575b.b();
            synchronized (U1.this.f379576c) {
                if (!U1.this.f379575b.e()) {
                    try {
                        U1.this.f379576c.wait(5000L, 0);
                    } catch (InterruptedException unused) {
                        U1.this.f379576c.notifyAll();
                    }
                }
            }
            return true;
        }

        public /* synthetic */ g(U1 u12, a aVar) {
            this();
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            int i12 = 0;
            do {
                try {
                    IMetricaService iMetricaServiceD = U1.this.f379575b.d();
                    if (iMetricaServiceD != null) {
                        try {
                            a(iMetricaServiceD);
                            return null;
                        } catch (RemoteException unused) {
                        }
                    }
                    i12++;
                    if (!b() || C1.a()) {
                        break;
                    }
                } catch (Throwable th2) {
                    a(th2);
                    return null;
                }
            } while (i12 < 2);
            return null;
        }
    }

    @j.k0
    public class h extends g {

        /* renamed from: b, reason: collision with root package name */
        private final int f379594b;

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f379595c;

        @j.k0
        public h(U1 u12, @j.N int i12, Bundle bundle) {
            super(u12, null);
            this.f379594b = i12;
            this.f379595c = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.U1.g
        public void a(@j.N IMetricaService iMetricaService) {
            iMetricaService.a(this.f379594b, this.f379595c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public U1(P0 p02) {
        T1 t12 = (T1) p02;
        this(t12, P.g().d().d(), new C38995n6(t12.a()));
    }

    @Override // com.yandex.metrica.impl.ob.C39015o1.c
    public void onServiceConnected() {
        synchronized (this.f379576c) {
            this.f379576c.notifyAll();
        }
    }

    public Future<Void> queuePauseUserSession(@j.N A3 a32) {
        return this.f379577d.submit(new b(a32));
    }

    public Future<Void> queueReport(f fVar) {
        return this.f379577d.submit(fVar.d() ? new c(fVar, P.g().h()) : new d(fVar));
    }

    public Future<Void> queueResumeUserSession(@j.N A3 a32) {
        return this.f379577d.submit(new a(a32));
    }

    public void reportData(int i12, @j.N Bundle bundle) {
        this.f379577d.submit(new h(this, i12, bundle));
    }

    public void sendCrash(@j.N f fVar) {
        c cVar = new c(fVar, P.g().h());
        if (this.f379575b.e()) {
            try {
                this.f379577d.submit(cVar).get(4L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        if (cVar.f379583d) {
            return;
        }
        try {
            cVar.call();
        } catch (Throwable unused2) {
        }
    }

    public U1(@j.N P0 p02, @j.N ICommonExecutor iCommonExecutor, @j.N C38995n6 c38995n6) {
        this.f379576c = new Object();
        this.f379574a = p02;
        this.f379577d = iCommonExecutor;
        this.f379578e = c38995n6;
        C39015o1 c39015o1C = ((T1) p02).c();
        this.f379575b = c39015o1C;
        c39015o1C.a(this);
    }

    @Override // com.yandex.metrica.impl.ob.C39015o1.c
    public void onServiceDisconnected() {
    }
}
