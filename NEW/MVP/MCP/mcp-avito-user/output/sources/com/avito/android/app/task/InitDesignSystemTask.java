package com.avito.android.app.task;

import android.app.Application;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C27285e;
import com.airbnb.lottie.q;
import com.avito.android.C29270c0;
import com.avito.android.ab_tests.InterfaceC27661y;
import com.avito.android.ab_tests.configs.TabBarRe23TestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* compiled from: InitDesignSystemTask.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/app/task/InitDesignSystemTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/c0;", "designSystemFeatures", "Lcom/avito/android/ab_tests/y;", "designSystemAbTestsProvider", "Lcom/avito/android/analytics/a;", "analytics", "Lh31/e;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lretrofit2/z;", "retrofit", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/c0;Lcom/avito/android/ab_tests/y;Lcom/avito/android/analytics/a;Lh31/e;Lh31/e;Lcom/avito/android/util/C;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/c0;", "Lcom/avito/android/ab_tests/y;", "Lcom/avito/android/analytics/a;", "Lh31/e;", "Lcom/avito/android/util/C;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitDesignSystemTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final com.avito.android.util.C buildInfo;

    @Y61.k
    private final InterfaceC27661y designSystemAbTestsProvider;

    @Y61.k
    private final C29270c0 designSystemFeatures;

    @Y61.k
    private final h31.e<OkHttpClient> okHttpClient;

    @Y61.k
    private final h31.e<retrofit2.z> retrofit;

    /* compiled from: InitDesignSystemTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<OkHttpClient> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final OkHttpClient invoke() {
            return (OkHttpClient) InitDesignSystemTask.this.okHttpClient.get();
        }
    }

    /* compiled from: InitDesignSystemTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lretrofit2/z;", "invoke", "()Lretrofit2/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<retrofit2.z> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final retrofit2.z invoke() {
            return (retrofit2.z) InitDesignSystemTask.this.retrofit.get();
        }
    }

    /* compiled from: InitDesignSystemTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/TabBarLayout$a$a;", "invoke", "()Lcom/avito/android/lib/design/tab_bar/TabBarLayout$a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<TabBarLayout.a.C5305a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TabBarLayout.a.C5305a invoke() {
            TabBarRe23TestGroup tabBarRe23TestGroup = (TabBarRe23TestGroup) InitDesignSystemTask.this.designSystemAbTestsProvider.a().a();
            tabBarRe23TestGroup.getClass();
            return new TabBarLayout.a.C5305a(tabBarRe23TestGroup != TabBarRe23TestGroup.f67931e, tabBarRe23TestGroup == TabBarRe23TestGroup.f67930d);
        }
    }

    /* compiled from: InitDesignSystemTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            C29270c0 c29270c0 = InitDesignSystemTask.this.designSystemFeatures;
            c29270c0.getClass();
            kotlin.reflect.n<Object> nVar = C29270c0.f113263t[1];
            return (Boolean) c29270c0.f113265c.a().invoke();
        }
    }

    /* compiled from: InitDesignSystemTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            C29270c0 c29270c0 = InitDesignSystemTask.this.designSystemFeatures;
            c29270c0.getClass();
            kotlin.reflect.n<Object> nVar = C29270c0.f113263t[11];
            return (Boolean) c29270c0.f113275m.a().invoke();
        }
    }

    /* compiled from: InitDesignSystemTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            C29270c0 c29270c0 = InitDesignSystemTask.this.designSystemFeatures;
            c29270c0.getClass();
            kotlin.reflect.n<Object> nVar = C29270c0.f113263t[12];
            return (Boolean) c29270c0.f113276n.a().invoke();
        }
    }

    @Inject
    public InitDesignSystemTask(@Y61.k C29270c0 c29270c0, @Y61.k InterfaceC27661y interfaceC27661y, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k h31.e<OkHttpClient> eVar, @Y61.k h31.e<retrofit2.z> eVar2, @Y61.k com.avito.android.util.C c12) {
        this.designSystemFeatures = c29270c0;
        this.designSystemAbTestsProvider = interfaceC27661y;
        this.analytics = interfaceC28373a;
        this.okHttpClient = eVar;
        this.retrofit = eVar2;
        this.buildInfo = c12;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        AW.a aVar = AW.a.f430a;
        InterfaceC28373a interfaceC28373a = this.analytics;
        a aVar2 = new a();
        b bVar = new b();
        com.airbnb.lottie.J.f59110e = new androidx.media3.exoplayer.audio.o(new com.avito.android.lottie.c(aVar, interfaceC28373a, aVar2, bVar), 3);
        com.airbnb.lottie.utils.e.f60101a = new com.avito.android.lottie.a(aVar, interfaceC28373a);
        q.b bVar2 = new q.b();
        com.airbnb.lottie.q qVar = new com.airbnb.lottie.q(new com.avito.android.lottie.d(bVar), null, false, true, true, AsyncUpdates.f59010b, bVar2.f60050a, null);
        com.airbnb.lottie.network.e eVar = qVar.f60043a;
        com.airbnb.lottie.network.e eVar2 = C27285e.f59571e;
        if ((eVar2 != null || eVar != null) && (eVar2 == null || !eVar2.equals(eVar))) {
            C27285e.f59571e = eVar;
            C27285e.f59573g = null;
        }
        com.airbnb.lottie.network.d dVar = qVar.f60044b;
        com.airbnb.lottie.network.d dVar2 = C27285e.f59572f;
        if ((dVar2 != null || dVar != null) && (dVar2 == null || !dVar2.equals(dVar))) {
            C27285e.f59572f = dVar;
            C27285e.f59574h = null;
        }
        boolean z12 = qVar.f60045c;
        if (C27285e.f59567a != z12) {
            C27285e.f59567a = z12;
            if (z12 && C27285e.f59575i == null) {
                C27285e.f59575i = new ThreadLocal<>();
            }
        }
        C27285e.f59568b = qVar.f60046d;
        C27285e.f59569c = qVar.f60047e;
        C27285e.f59570d = qVar.f60048f;
        C27285e.f59576j = qVar.f60049g;
        com.avito.android.lib.design.a aVar3 = com.avito.android.lib.design.a.f178170a;
        c cVar = new c();
        d dVar3 = new d();
        boolean zL2 = this.buildInfo.l();
        e eVar3 = new e();
        f fVar = new f();
        aVar3.getClass();
        com.avito.android.lib.design.a.a(cVar, dVar3, zL2, eVar3, fVar);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
