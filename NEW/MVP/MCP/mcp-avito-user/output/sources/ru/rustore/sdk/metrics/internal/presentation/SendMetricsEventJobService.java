package ru.rustore.sdk.metrics.internal.presentation;

import Oa1.C14666z;
import Y41.l;
import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.reactive.core.g;
import ru.rustore.sdk.reactive.single.AbstractC47905a;
import ru.rustore.sdk.reactive.single.C47913i;
import ru.rustore.sdk.reactive.single.E;
import ru.rustore.sdk.reactive.single.H;
import ru.rustore.sdk.reactive.single.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/metrics/internal/presentation/SendMetricsEventJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0})
/* loaded from: classes9.dex */
public final class SendMetricsEventJobService extends JobService {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC42726C f436816b = C42727D.c(new a());

    /* renamed from: c, reason: collision with root package name */
    public g f436817c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f436818d;

    public static final class a extends N implements Y41.a<C14666z> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C14666z invoke() {
            return C14666z.f12400c.a(SendMetricsEventJobService.this);
        }
    }

    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((C14666z) SendMetricsEventJobService.this.f436816b.getValue()).f12402a.a();
            return G0.f406611a;
        }
    }

    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ JobParameters f436822m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JobParameters jobParameters) {
            super(0);
            this.f436822m = jobParameters;
        }

        @Override // Y41.a
        public final G0 invoke() {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.f436822m;
            if (!sendMetricsEventJobService.f436818d) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return G0.f406611a;
        }
    }

    public static final class d extends N implements l<Throwable, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ JobParameters f436824m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JobParameters jobParameters) {
            super(1);
            this.f436824m = jobParameters;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.f436824m;
            if (!sendMetricsEventJobService.f436818d) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return G0.f406611a;
        }
    }

    public static final class e extends N implements l<G0, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ JobParameters f436826m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JobParameters jobParameters) {
            super(1);
            this.f436826m = jobParameters;
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            SendMetricsEventJobService sendMetricsEventJobService = SendMetricsEventJobService.this;
            JobParameters jobParameters = this.f436826m;
            if (!sendMetricsEventJobService.f436818d) {
                sendMetricsEventJobService.jobFinished(jobParameters, false);
            }
            return G0.f406611a;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC47905a.C12588a c12588a = AbstractC47905a.f436968a;
        b bVar = new b();
        c12588a.getClass();
        u uVar = new u(bVar);
        ru.rustore.sdk.reactive.core.d.f436864a.getClass();
        this.f436817c = E.a(C47913i.a(H.a(uVar, ru.rustore.sdk.reactive.core.d.a()), new c(jobParameters)), new d(jobParameters), new e(jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f436818d = true;
        g gVar = this.f436817c;
        if (gVar != null) {
            gVar.dispose();
        }
        return true;
    }
}
