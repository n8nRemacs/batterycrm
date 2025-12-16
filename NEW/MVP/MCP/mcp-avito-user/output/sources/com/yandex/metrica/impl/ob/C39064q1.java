package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.q1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39064q1 implements InterfaceC39040p1 {

    /* renamed from: a, reason: collision with root package name */
    private ICommonExecutor f381406a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC39040p1 f381407b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38791f1 f381408c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f381409d;

    /* renamed from: com.yandex.metrica.impl.ob.q1$a */
    public class a extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f381410a;

        public a(Bundle bundle) {
            this.f381410a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.b(this.f381410a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$b */
    public class b extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f381412a;

        public b(Bundle bundle) {
            this.f381412a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.a(this.f381412a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$c */
    public class c extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Configuration f381414a;

        public c(Configuration configuration) {
            this.f381414a = configuration;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.onConfigurationChanged(this.f381414a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$d */
    public class d extends AbstractRunnableC38787em {
        public d() {
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            synchronized (C39064q1.this) {
                try {
                    if (C39064q1.this.f381409d) {
                        C39064q1.this.f381408c.e();
                        C39064q1.this.f381407b.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$e */
    public class e extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f381417a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f381418b;

        public e(Intent intent, int i12) {
            this.f381417a = intent;
            this.f381418b = i12;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.a(this.f381417a, this.f381418b);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$f */
    public class f extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f381420a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f381421b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f381422c;

        public f(Intent intent, int i12, int i13) {
            this.f381420a = intent;
            this.f381421b = i12;
            this.f381422c = i13;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.a(this.f381420a, this.f381421b, this.f381422c);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$g */
    public class g extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f381424a;

        public g(Intent intent) {
            this.f381424a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.a(this.f381424a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$h */
    public class h extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f381426a;

        public h(Intent intent) {
            this.f381426a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.c(this.f381426a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$i */
    public class i extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f381428a;

        public i(Intent intent) {
            this.f381428a = intent;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.b(this.f381428a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$j */
    public class j extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f381430a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f381431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f381432c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bundle f381433d;

        public j(String str, int i12, String str2, Bundle bundle) {
            this.f381430a = str;
            this.f381431b = i12;
            this.f381432c = str2;
            this.f381433d = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.a(this.f381430a, this.f381431b, this.f381432c, this.f381433d);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$k */
    public class k extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f381435a;

        public k(Bundle bundle) {
            this.f381435a = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.reportData(this.f381435a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q1$l */
    public class l extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f381437a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bundle f381438b;

        public l(int i12, Bundle bundle) {
            this.f381437a = i12;
            this.f381438b = bundle;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            C39064q1.this.f381407b.a(this.f381437a, this.f381438b);
        }
    }

    public C39064q1(@j.N InterfaceC39040p1 interfaceC39040p1) {
        this(F0.g().q().c(), interfaceC39040p1, F0.g().h());
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void onConfigurationChanged(@j.N Configuration configuration) {
        this.f381406a.execute(new c(configuration));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void reportData(Bundle bundle) {
        this.f381406a.execute(new k(bundle));
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public synchronized void a() {
        this.f381409d = true;
        this.f381406a.execute(new d());
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void b(Intent intent) {
        this.f381406a.execute(new i(intent));
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void c(Intent intent) {
        this.f381406a.execute(new h(intent));
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void b() {
        this.f381406a.removeAll();
        synchronized (this) {
            this.f381408c.f();
            this.f381409d = false;
        }
        this.f381407b.b();
    }

    @j.k0
    public C39064q1(@j.N ICommonExecutor iCommonExecutor, @j.N InterfaceC39040p1 interfaceC39040p1, @j.N C38791f1 c38791f1) {
        this.f381409d = false;
        this.f381406a = iCommonExecutor;
        this.f381407b = interfaceC39040p1;
        this.f381408c = c38791f1;
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void a(Intent intent, int i12) {
        this.f381406a.execute(new e(intent, i12));
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void a(Intent intent, int i12, int i13) {
        this.f381406a.execute(new f(intent, i12, i13));
    }

    @Override // com.yandex.metrica.impl.ob.B1
    public void a(Intent intent) {
        this.f381406a.execute(new g(intent));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void a(String str, int i12, String str2, Bundle bundle) {
        this.f381406a.execute(new j(str, i12, str2, bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void a(int i12, Bundle bundle) {
        this.f381406a.execute(new l(i12, bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void a(@j.N Bundle bundle) {
        this.f381406a.execute(new b(bundle));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void a(@j.N MetricaService.d dVar) {
        this.f381407b.a(dVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39040p1
    public void b(@j.N Bundle bundle) {
        this.f381406a.execute(new a(bundle));
    }
}
