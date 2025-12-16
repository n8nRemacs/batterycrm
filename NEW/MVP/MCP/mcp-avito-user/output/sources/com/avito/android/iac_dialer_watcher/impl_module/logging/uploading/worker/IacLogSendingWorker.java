package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker;

import Y61.k;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.F;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.Y;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.H;
import com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.IacLogSendingWorker;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import l41.o;

/* compiled from: IacLogSendingWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/worker/IacLogSendingWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"IncorrectJobScheduling"})
/* loaded from: classes14.dex */
public final class IacLogSendingWorker extends RxWorker {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f168050g = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_watcher.impl_module.logging.k f168051b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public H f168052c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f168053d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public Application f168054e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a f168055f;

    /* compiled from: IacLogSendingWorker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/worker/IacLogSendingWorker$a;", "", "<init>", "()V", "", "BUNDLE_KEY_SCHEDULED_SESSION_ID", "Ljava/lang/String;", "TAG", "", "TASK_DELAY_MILLIS", "J", "TASK_NO_DELAY_MILLIS", "WORK_NAME", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(@k Application application, long j12, boolean z12) {
            C23542f.a aVar = new C23542f.a();
            aVar.b(NetworkType.f55396c);
            J.a aVarG = new J.a(IacLogSendingWorker.class).f(aVar.a()).g(z12 ? 86400000L : 1000L, TimeUnit.MILLISECONDS);
            C23544h.a aVar2 = new C23544h.a();
            aVar2.c("KEY_SCHEDULED_SESSION_ID", j12);
            J jB2 = aVarG.h(aVar2.a()).b();
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSendingWorker", "Worker is scheduling. addDelay=" + z12 + ", scheduledSessionId=" + j12, null);
            WorkManager.f55428a.getClass();
            Y.f(application).a("IacLogSendingWorker_WorkName", ExistingWorkPolicy.f55375b, jB2).a();
        }

        public a() {
        }
    }

    /* compiled from: IacLogSendingWorker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "currentSession", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "kotlin.jvm.PlatformType", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f168057c;

        public b(long j12) {
            this.f168057c = j12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            w wVar = (w) obj;
            final IacLogSendingWorker iacLogSendingWorker = IacLogSendingWorker.this;
            com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a aVar = iacLogSendingWorker.f168055f;
            if (aVar == null) {
                aVar = null;
            }
            aVar.getClass();
            n<Object> nVar = com.avito.android.iac_dialer_watcher.impl_module.splitter.features.a.f168141e[2];
            if (((Boolean) aVar.f168144d.a().invoke()).booleanValue()) {
                return I.q(new F.a.c());
            }
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
            StringBuilder sb2 = new StringBuilder("Worker is started. scheduledSessionId=");
            final long j12 = this.f168057c;
            sb2.append(j12);
            sb2.append(", currentSession=");
            sb2.append(wVar);
            bVar.a("IacLogSendingWorker", sb2.toString(), null);
            if (wVar.f167936a == j12) {
                bVar.a("IacLogSendingWorker", "This is still the same session. Lets reschedule worker.", null);
                return new G(new Callable() { // from class: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        IacLogSendingWorker.a aVar2 = IacLogSendingWorker.f168050g;
                        Application application = iacLogSendingWorker.f168054e;
                        if (application == null) {
                            application = null;
                        }
                        aVar2.getClass();
                        IacLogSendingWorker.a.a(application, j12, true);
                        return new F.a.c();
                    }
                });
            }
            H h12 = iacLogSendingWorker.f168052c;
            return (h12 != null ? h12 : null).a().r(com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.b.f168060b).v(new F.a.C1949a());
        }
    }

    public IacLogSendingWorker(@k Context context, @k WorkerParameters workerParameters) {
        super(context, workerParameters);
        com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.a.a().a((com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.c) C29972i.a(C29972i.b(getApplicationContext()), com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.worker.di.c.class)).a(this);
    }

    @Override // androidx.work.rxjava3.RxWorker
    @k
    public final I<F.a> b() {
        long jB2 = getInputData().b("KEY_SCHEDULED_SESSION_ID", -1L);
        com.avito.android.iac_dialer_watcher.impl_module.logging.k kVar = this.f168051b;
        if (kVar == null) {
            kVar = null;
        }
        T tA2 = kVar.a();
        InterfaceC35745a5 interfaceC35745a5 = this.f168053d;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        W wZ2 = tA2.z(interfaceC35745a5.a());
        InterfaceC35745a5 interfaceC35745a52 = this.f168053d;
        return new C42017o(wZ2.s((interfaceC35745a52 != null ? interfaceC35745a52 : null).a()).n(new b(jB2)), new com.avito.android.advert_core.task.a(12));
    }
}
