package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import android.annotation.SuppressLint;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.S;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import pL.C46975b;

/* compiled from: IacLogSaver.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/q;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/o;", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements o {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final String f168102k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final String f168103l;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a f168104a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.writing.e f168105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.k f168106c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e f168107d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k f168108e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168109f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f168110g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.q f168111h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f168112i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168113j = C42727D.c(new e());

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/q$a;", "", "<init>", "()V", "", "LINES_COUNT_OVERLOAD", "Ljava/lang/String;", "TAG", "TAG_IGNORE", "UNCAUGHT_EXCEPTION_SEPARATOR", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f168115c;

        public b(String str) {
            this.f168115c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            q qVar = q.this;
            com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar2 = qVar.f168111h;
            qVar2.f167891a.c(new y.a(qVar2.f167892b.a("calls", "logs", "{{%app_ver%}}", "writingFinish").f91030a, 1L));
            long jNow = qVar.f168110g.now();
            com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar = qVar.f168107d;
            return eVar.j(eVar.f167909a.n(jNow, this.f168115c));
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar = q.this.f168111h;
            qVar.getClass();
            NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("finishSessionError", th3, null, NonFatalErrorEvent.a.c.f147934a, 4, null);
            InterfaceC28373a interfaceC28373a = qVar.f167891a;
            interfaceC28373a.c(nonFatalErrorEvent);
            interfaceC28373a.c(new y.a(qVar.f167892b.a("calls", "logs", "{{%app_ver%}}", "finishSessionError").f91030a, 1L));
            V2.f318762a.a("In_app_calls_logging:", "Error in setting call.finishedAt", th3);
            return G0.f406611a;
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f168117l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("In_app_calls_logging:", "Error in writing uncaught exception", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar = q.this.f168104a;
            aVar.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a.f168141e[0];
            return (Boolean) aVar.f168142b.a().invoke();
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return q.this.f168106c.a();
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "session", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f168121c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f168122d;

        public g(String str, String str2) {
            this.f168121c = str;
            this.f168122d = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) obj;
            q qVar = q.this;
            return qVar.f168107d.d(wVar.f167936a).n(new u(wVar, this.f168121c, this.f168122d, qVar)).k(v.f168131b);
        }
    }

    /* compiled from: IacLogSaver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<Throwable, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar = q.this.f168111h;
            qVar.getClass();
            NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("startSessionError", th3, null, NonFatalErrorEvent.a.c.f147934a, 4, null);
            InterfaceC28373a interfaceC28373a = qVar.f167891a;
            interfaceC28373a.c(nonFatalErrorEvent);
            interfaceC28373a.c(new y.a(qVar.f167892b.a("calls", "logs", "{{%app_ver%}}", "startSessionError").f91030a, 1L));
            V2.f318762a.a("In_app_calls_logging:", "Error in inserting log call", th3);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f168102k = "-------------------------------------------------------------------------";
        f168103l = "            =========================================================================\n            Total lines count in 'tb_iac_log_lines' table reached the limit. No more log lines will be saved in db. \n            =========================================================================";
    }

    @Inject
    public q(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.writing.e eVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.k kVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar2, @Y61.k k kVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.server_time.f fVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar) {
        this.f168104a = aVar;
        this.f168105b = eVar;
        this.f168106c = kVar;
        this.f168107d = eVar2;
        this.f168108e = kVar2;
        this.f168109f = interfaceC35745a5;
        this.f168110g = fVar;
        this.f168111h = qVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.writing.o
    @SuppressLint({"CheckResult"})
    public final void a(@Y61.k String str, @Y61.k String str2) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSaver", androidx.compose.ui.graphics.colorspace.e.n("startCallLog: callId=", str, ", scenario=", str2), null);
        S sD2 = d();
        InterfaceC35745a5 interfaceC35745a5 = this.f168109f;
        A1.g(sD2.z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).n(new f()).n(new g(str, str2)), new h(), null, 2);
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.writing.o
    @SuppressLint({"CheckResult"})
    public final void b(@Y61.k String str) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSaver", "finishCallLog: callId=".concat(str), null);
        A1.g(d().z(this.f168109f.a()).n(new b(str)), new c(), null, 2);
    }

    @SuppressLint({"CheckResult"})
    public final void c(long j12, Thread thread, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        String str = f168102k;
        sb2.append(str);
        sb2.append("Uncaught exception on thread [");
        sb2.append(thread.getName());
        sb2.append("]:\n");
        sb2.append(C46975b.a(th2));
        sb2.append(str);
        String string = sb2.toString();
        A1.g(this.f168107d.g(j12, this.f168110g.now(), string).r(new z(this, string)).i(A.f168066b).v(G0.f406611a), d.f168117l, null, 2);
    }

    public final S d() {
        I iR2 = !this.f168112i.getAndSet(true) ? this.f168106c.a().r(new r(this)).r(s.f168125b) : new G(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.c(1));
        InterfaceC35745a5 interfaceC35745a5 = this.f168109f;
        return iR2.z(interfaceC35745a5.a()).s(interfaceC35745a5.a());
    }
}
