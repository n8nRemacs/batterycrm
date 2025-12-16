package com.avito.android.remote_toggles_fetcher.analytics;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Application;
import android.app.KeyguardManager;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.sequences.o0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: TogglesUpdateTimeMonitor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote_toggles_fetcher/analytics/f;", "", "_avito_remote-toggles-fetcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f254435a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f254436b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final I1 f254437c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f254438d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C43238h f254439e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC42726C f254440f = C42727D.c(new b());

    /* compiled from: TogglesUpdateTimeMonitor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.remote_toggles_fetcher.analytics.TogglesUpdateTimeMonitor$startMonitoring$1", f = "TogglesUpdateTimeMonitor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* compiled from: TogglesUpdateTimeMonitor.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/remote_toggles_fetcher/analytics/f$a$a", "Landroidx/lifecycle/q;", "_avito_remote-toggles-fetcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.remote_toggles_fetcher.analytics.f$a$a, reason: collision with other inner class name */
        public static final class C7616a implements InterfaceC23057q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f254442b;

            public C7616a(f fVar) {
                this.f254442b = fVar;
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onStart(@k InterfaceC22983P interfaceC22983P) {
                f fVar = this.f254442b;
                fVar.f254436b.c(new com.avito.android.remote_toggles_fetcher.analytics.a(f.b(), fVar.f254438d, true, f.a(fVar)));
            }

            @Override // androidx.view.InterfaceC23057q
            public final void onStop(@k InterfaceC22983P interfaceC22983P) {
                f fVar = this.f254442b;
                fVar.f254436b.c(new com.avito.android.remote_toggles_fetcher.analytics.a(f.b(), fVar.f254438d, false, f.a(fVar)));
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return f.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C23050m0.f46822j.getClass();
            C23050m0.f46823k.f46829g.a(new C7616a(f.this));
            return G0.f406611a;
        }
    }

    /* compiled from: TogglesUpdateTimeMonitor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Map<String, ? extends Boolean>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends Boolean> invoke() {
            f fVar = f.this;
            I1 i12 = fVar.f254437c;
            i12.getClass();
            n<Object>[] nVarArr = I1.f67278k0;
            n<Object> nVar = nVarArr[38];
            DE0.a aVarA = i12.f67291M.a();
            I1 i13 = fVar.f254437c;
            i13.getClass();
            n<Object> nVar2 = nVarArr[39];
            DE0.a aVarA2 = i13.f67292N.a();
            DE0.a<Boolean> aVarW = i13.w();
            n<Object> nVar3 = nVarArr[11];
            return P0.r(new o0(C42756l.f(new DE0.a[]{aVarA, aVarA2, aVarW, i13.f67325l.a()}), g.f254444l));
        }
    }

    @Inject
    public f(@k InterfaceC35863o4 interfaceC35863o4, @k Application application, @k InterfaceC28373a interfaceC28373a, @k I1 i12, @k R0 r02) {
        this.f254435a = application;
        this.f254436b = interfaceC28373a;
        this.f254437c = i12;
        this.f254438d = interfaceC35863o4.a();
        this.f254439e = U.a(r02.b());
    }

    public static final boolean a(f fVar) {
        fVar.getClass();
        try {
            return ((KeyguardManager) fVar.f254435a.getSystemService("keyguard")).isKeyguardLocked();
        } catch (Throwable th2) {
            V2.f318762a.f(th2);
            return false;
        }
    }

    public static long b() {
        return System.currentTimeMillis() / 1000;
    }

    public final void c() {
        I1 i12 = this.f254437c;
        i12.getClass();
        n<Object> nVar = I1.f67278k0[37];
        if (((Boolean) i12.f67290L.a().invoke()).booleanValue()) {
            this.f254436b.c(new com.avito.android.remote_toggles_fetcher.analytics.b(this.f254438d, b(), C42745f0.O(((Map) this.f254440f.getValue()).entrySet(), ",", "{", "}", e.f254434l, 24)));
            C43259k.d(this.f254439e, null, null, new a(null), 3);
        }
    }
}
