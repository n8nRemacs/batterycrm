package leakcanary;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import leakcanary.internal.RealHeapAnalysisJob;
import leakcanary.r;
import shark.j3;

/* compiled from: ScreenOffTrigger.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/L;", "", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public volatile RealHeapAnalysisJob f414000a;

    /* renamed from: b, reason: collision with root package name */
    public final b f414001b;

    /* renamed from: c, reason: collision with root package name */
    public final C43756n f414002c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f414003d;

    /* renamed from: e, reason: collision with root package name */
    public final Y41.l<r.a, G0> f414004e;

    /* compiled from: ScreenOffTrigger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lleakcanary/r$a;", "result", "Lkotlin/G0;", "invoke", "(Lleakcanary/r$a;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<r.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f414005l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(r.a aVar) {
            r.a aVar2 = aVar;
            j3.f438639b.getClass();
            u uVar = j3.f438638a;
            if (uVar != null) {
                uVar.a(String.valueOf(aVar2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ScreenOffTrigger.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"leakcanary/L$b", "Landroid/content/BroadcastReceiver;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static final class b extends BroadcastReceiver {

        /* compiled from: ScreenOffTrigger.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a implements Runnable {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RealHeapAnalysisJob f414008c;

            public a(RealHeapAnalysisJob realHeapAnalysisJob) {
                this.f414008c = realHeapAnalysisJob;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r.a aVarD = this.f414008c.d();
                L.this.f414000a = null;
                L.this.f414004e.invoke(aVarD);
            }
        }

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            if (!kotlin.jvm.internal.L.f(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
                RealHeapAnalysisJob realHeapAnalysisJob = L.this.f414000a;
                if (realHeapAnalysisJob != null) {
                    realHeapAnalysisJob.b("screen on again");
                }
                L.this.f414000a = null;
                return;
            }
            if (L.this.f414000a == null) {
                C43756n c43756n = L.this.f414002c;
                new C43761t((kotlin.reflect.d<?>) m0.f406844a.b(L.class));
                c43756n.getClass();
                RealHeapAnalysisJob realHeapAnalysisJob2 = new RealHeapAnalysisJob(c43756n.f414106a, c43756n.f414107b, c43756n.f414108c);
                L.this.f414000a = realHeapAnalysisJob2;
                L.this.f414003d.execute(new a(realHeapAnalysisJob2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L(@Y61.k Application application, @Y61.k C43756n c43756n, @Y61.k Executor executor, @Y61.k Y41.l<? super r.a, G0> lVar) {
        this.f414002c = c43756n;
        this.f414003d = executor;
        this.f414004e = lVar;
        this.f414001b = new b();
    }

    public /* synthetic */ L(Application application, C43756n c43756n, Executor executor, Y41.l lVar, int i12, C42822w c42822w) {
        this(application, c43756n, executor, (i12 & 8) != 0 ? a.f414005l : lVar);
    }
}
