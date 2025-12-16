package com.avito.android;

import Gs.C13912a;
import android.content.Context;
import android.content.res.Configuration;
import androidx.core.util.InterfaceC22791e;
import androidx.work.C23538b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.Y;
import com.avito.android.analytics.event.C28420i0;
import com.avito.android.analytics.screens.D;
import com.avito.android.app.task.ScheduleMetricSendingTask;
import com.avito.android.di.component.InterfaceC29895b;
import com.avito.android.di.component.InterfaceC29896c;
import com.avito.android.di.component.InterfaceC29897d;
import com.avito.android.di.module.InterfaceC30242y1;
import com.avito.android.work.WorkManagerInitialExceptionHandler;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.k;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AbstractAvitoApp.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/a;", "Lcom/avito/android/s;", "Lcom/avito/android/K;", "Lcom/avito/android/di/component/c;", "Lcom/avito/android/analytics/Y$a;", "Lcom/avito/android/app/task/ScheduleMetricSendingTask$a;", "Landroidx/work/b$c;", "<init>", "()V", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractApplicationC27634a extends AbstractApplicationC34428s implements K<InterfaceC29896c>, Y.a, ScheduleMetricSendingTask.a, C23538b.c {

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public id.d f67627d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.android.analytics.task.a f67628e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Inject
    @Y61.l
    public com.avito.android.analytics.Y f67629f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Inject
    @Y61.l
    public BY.d f67630g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f67631h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public P f67632i;

    /* renamed from: j, reason: collision with root package name */
    public long f67633j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public InterfaceC29895b f67634k;

    /* compiled from: AbstractAvitoApp.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.a$a, reason: collision with other inner class name */
    public static final class C2127a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public C2127a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.avito.android.time.c.f301452a.getClass();
            AbstractApplicationC27634a.this.f67633j = com.avito.android.time.c.f301453b.a();
            k.a.f398604a.getClass();
            id.k kVar = id.k.f398602a;
            id.k.f398603b = com.avito.android.time.c.f301453b.a();
            id.k.f398602a.getClass();
            Gs.c cVar = Gs.c.f6754a;
            C13912a.f6752b.getClass();
            cVar.getClass();
            Gs.c.b("Application");
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AbstractAvitoApp.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.a$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Configuration f67637m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Configuration configuration) {
            super(0);
            this.f67637m = configuration;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.avito.android.analytics.Y y12 = AbstractApplicationC27634a.this.f67629f;
            if (y12 != null) {
                int i12 = y12.f89688b;
                Configuration configuration = this.f67637m;
                int i13 = configuration.orientation;
                if (i12 != i13) {
                    y12.f89688b = i13;
                    LinkedHashSet<String> linkedHashSet = y12.f89689c;
                    if (!linkedHashSet.isEmpty()) {
                        int i14 = configuration.orientation;
                        String str = i14 == 1 ? "portrait" : i14 == 2 ? "landscape" : null;
                        if (str != null) {
                            y12.f89687a.c(new C28420i0(C42745f0.O(linkedHashSet, null, null, null, null, 63), str, y12.f89690d ? "tablet" : "phone"));
                        }
                    }
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AbstractAvitoApp.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.a$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f67639m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(0);
            this.f67639m = i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r11 = this;
                com.avito.android.a r0 = com.avito.android.AbstractApplicationC27634a.this
                BY.d r0 = r0.f67630g
                if (r0 == 0) goto L9f
                com.avito.android.I1 r1 = r0.f1467b
                kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.I1.f67278k0
                r3 = 18
                r2 = r2[r3]
                com.avito.android.A0$a r1 = r1.f67332s
                DE0.a r1 = r1.a()
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L22
                goto L9f
            L22:
                int r1 = r11.f67639m
                r2 = 5
                java.lang.String r3 = "unknown"
                if (r1 == r2) goto L47
                r2 = 10
                if (r1 == r2) goto L47
                r2 = 15
                if (r1 == r2) goto L47
                r2 = 20
                if (r1 == r2) goto L9f
                r2 = 40
                if (r1 == r2) goto L44
                r2 = 60
                if (r1 == r2) goto L44
                r2 = 80
                if (r1 == r2) goto L44
                r1 = r3
                goto L49
            L44:
                java.lang.String r1 = "background"
                goto L49
            L47:
                java.lang.String r1 = "active"
            L49:
                BY.b r2 = r0.f1468c
                java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r4 = r2.f1464b
                if (r4 == 0) goto L63
                java.lang.Object r4 = r4.get()
                r6 = r4
                androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
                if (r6 == 0) goto L63
                com.avito.android.analytics.screens.r r2 = new com.avito.android.analytics.screens.r
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                r5 = r2
                r5.<init>(r6, r7, r8, r9, r10)
                goto L7a
            L63:
                java.lang.ref.WeakReference<android.app.Activity> r2 = r2.f1463a
                if (r2 == 0) goto L7d
                java.lang.Object r2 = r2.get()
                r5 = r2
                android.app.Activity r5 = (android.app.Activity) r5
                if (r5 == 0) goto L7d
                com.avito.android.analytics.screens.r r2 = new com.avito.android.analytics.screens.r
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)
            L7a:
                java.lang.String r2 = r2.f90694a
                goto L7e
            L7d:
                r2 = 0
            L7e:
                if (r2 != 0) goto L81
                goto L82
            L81:
                r3 = r2
            L82:
                com.avito.android.time.c r2 = com.avito.android.time.c.f301452a
                r2.getClass()
                com.avito.android.time.b r2 = com.avito.android.time.c.f301453b
                long r4 = r2.a()
                id.k r2 = id.k.f398602a
                r2.getClass()
                long r6 = id.k.f398603b
                long r4 = r4 - r6
                AY.b r2 = new AY.b
                r2.<init>(r3, r4, r1)
                com.avito.android.analytics.a r0 = r0.f1466a
                r0.c(r2)
            L9f:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.AbstractApplicationC27634a.c.invoke():java.lang.Object");
        }
    }

    /* compiled from: AbstractAvitoApp.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.a$d */
    public static final class d implements InterfaceC22791e, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f67640b;

        public d(Y41.l lVar) {
            this.f67640b = lVar;
        }

        @Override // androidx.core.util.InterfaceC22791e
        public final /* synthetic */ void accept(Object obj) {
            this.f67640b.invoke(obj);
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC22791e) && (obj instanceof kotlin.jvm.internal.D)) {
                return kotlin.jvm.internal.L.f(this.f67640b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f67640b;
        }

        public final int hashCode() {
            return this.f67640b.hashCode();
        }
    }

    @Override // com.avito.android.analytics.Y.a
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final com.avito.android.analytics.Y getF67629f() {
        return this.f67629f;
    }

    @Override // com.avito.android.AbstractApplicationC34428s, android.content.ContextWrapper
    public final void attachBaseContext(@Y61.k Context context) {
        super.attachBaseContext(context);
        C2127a c2127a = new C2127a();
        if (d()) {
            c2127a.invoke();
        }
    }

    @Override // com.avito.android.app.task.ScheduleMetricSendingTask.a
    /* renamed from: b, reason: from getter */
    public final long getF67633j() {
        return this.f67633j;
    }

    @Override // androidx.work.C23538b.c
    @Y61.k
    public final C23538b c() {
        InterfaceC28373a interfaceC28373a;
        InterfaceC28373a interfaceC28373a2;
        P p12;
        C23538b.a aVar = new C23538b.a();
        aVar.f55465c = getPackageName();
        P p13 = null;
        if (!d() || (interfaceC28373a = this.f67631h) == null) {
            interfaceC28373a = null;
        }
        aVar.f55463a = new d(new WorkManagerInitialExceptionHandler(this, interfaceC28373a));
        if (!d() || (interfaceC28373a2 = this.f67631h) == null) {
            interfaceC28373a2 = null;
        }
        if (d() && (p12 = this.f67632i) != null) {
            p13 = p12;
        }
        aVar.f55464b = new d(new com.avito.android.work.b(interfaceC28373a2, p13));
        return new C23538b(aVar);
    }

    @Y61.k
    public abstract com.avito.android.configuration.e e();

    @Y61.k
    public abstract C28728b2 f();

    @Y61.k
    public abstract com.avito.android.push.hms.h g();

    @Y61.k
    public abstract Bw0.h h();

    @Override // com.avito.android.K
    @Y61.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC29896c r0() {
        if (this.f67634k == null) {
            this.f67634k = com.avito.android.di.component.p.a().a(this, f(), e(), g(), h());
        }
        return this.f67634k;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b bVar = new b(configuration);
        if (d()) {
            bVar.invoke();
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onCreate();
        boolean zD2 = d();
        com.avito.android.error_reporting.e eVar = com.avito.android.error_reporting.e.f147863a;
        String strValueOf = String.valueOf(zD2);
        eVar.getClass();
        try {
            FirebaseCrashlytics.getInstance().setCustomKey("is_main_process", strValueOf);
        } catch (IllegalStateException | NullPointerException unused) {
        }
        if (!zD2) {
            androidx.work.multiprocess.t.a(this);
            return;
        }
        com.avito.android.time.c.f301452a.getClass();
        long jA2 = com.avito.android.time.c.f301453b.a() - this.f67633j;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        r0();
        ((InterfaceC30242y1) ((InterfaceC29897d.b) r0()).sh().a(new com.avito.android.di.module.Z0())).a(this);
        com.avito.android.analytics.task.a aVar = this.f67628e;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a(fA2.b(), "app-inject");
        InterfaceC28373a interfaceC28373a = this.f67631h;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new com.avito.android.analytics.events.a(jCurrentTimeMillis));
        com.avito.android.analytics.screens.F fA3 = D.a.a();
        id.d dVar = this.f67627d;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a();
        com.avito.android.analytics.task.a aVar2 = this.f67628e;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.a(fA3.b(), "app-delegate-init");
        com.avito.android.analytics.task.a aVar3 = this.f67628e;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.a(jA2, "content-providers-init");
        id.d dVar2 = this.f67627d;
        (dVar2 != null ? dVar2 : null).b(this.f67633j);
        this.f67627d = new id.g();
        Gs.c cVar = Gs.c.f6754a;
        C13912a.f6752b.getClass();
        cVar.getClass();
        Gs.c.a("Application");
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i12) {
        super.onTrimMemory(i12);
        c cVar = new c(i12);
        if (d()) {
            cVar.invoke();
        }
    }
}
