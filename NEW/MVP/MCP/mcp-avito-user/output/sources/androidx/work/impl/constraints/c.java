package androidx.work.impl.constraints;

import Y41.p;
import Y61.k;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.C23542f;
import androidx.work.G;
import androidx.work.impl.constraints.b;
import androidx.work.impl.model.H;
import j.X;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/c;", "Landroidx/work/impl/constraints/controllers/d;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X
/* loaded from: classes10.dex */
public final class c implements androidx.work.impl.constraints.controllers.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConnectivityManager f55671a;

    /* renamed from: b, reason: collision with root package name */
    public final long f55672b;

    /* compiled from: WorkConstraintsTracker.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Landroidx/work/impl/constraints/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<I0<? super androidx.work.impl.constraints.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f55673q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f55674r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C23542f f55675s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f55676t;

        /* compiled from: WorkConstraintsTracker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.work.impl.constraints.c$a$a, reason: collision with other inner class name */
        public static final class C1954a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ c f55677l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C1955c f55678m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1954a(c cVar, C1955c c1955c) {
                super(0);
                this.f55677l = cVar;
                this.f55678m = c1955c;
            }

            @Override // Y41.a
            public final G0 invoke() {
                G gA2 = G.a();
                int i12 = h.f55710b;
                gA2.getClass();
                this.f55677l.f55671a.unregisterNetworkCallback(this.f55678m);
                return G0.f406611a;
            }
        }

        /* compiled from: WorkConstraintsTracker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$job$1", f = "WorkConstraintsTracker.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f55679q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ c f55680r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ I0<androidx.work.impl.constraints.b> f55681s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(c cVar, I0<? super androidx.work.impl.constraints.b> i02, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f55680r = cVar;
                this.f55681s = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f55680r, this.f55681s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f55679q;
                c cVar = this.f55680r;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    long j12 = cVar.f55672b;
                    this.f55679q = 1;
                    if (C43131e0.b(j12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                G gA2 = G.a();
                int i13 = h.f55710b;
                long j13 = cVar.f55672b;
                gA2.getClass();
                this.f55681s.w(new b.C1953b(7));
                return G0.f406611a;
            }
        }

        /* compiled from: WorkConstraintsTracker.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/work/impl/constraints/c$a$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.work.impl.constraints.c$a$c, reason: collision with other inner class name */
        public static final class C1955c extends ConnectivityManager.NetworkCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ N0 f55682a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<androidx.work.impl.constraints.b> f55683b;

            /* JADX WARN: Multi-variable type inference failed */
            public C1955c(N0 n02, I0<? super androidx.work.impl.constraints.b> i02) {
                this.f55682a = n02;
                this.f55683b = i02;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                ((V0) this.f55682a).c(null);
                G gA2 = G.a();
                int i12 = h.f55710b;
                gA2.getClass();
                this.f55683b.w(b.a.f55669a);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                ((V0) this.f55682a).c(null);
                G gA2 = G.a();
                int i12 = h.f55710b;
                gA2.getClass();
                this.f55683b.w(new b.C1953b(7));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23542f c23542f, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55675s = c23542f;
            this.f55676t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f55675s, this.f55676t, continuation);
            aVar.f55674r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super androidx.work.impl.constraints.b> i02, Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f55673q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f55674r;
                NetworkRequest networkRequestA = this.f55675s.a();
                if (networkRequestA == null) {
                    i02.r().h(null);
                    return G0.f406611a;
                }
                c cVar = this.f55676t;
                C1955c c1955c = new C1955c(C43259k.d(i02, null, null, new b(cVar, i02, null), 3), i02);
                G gA2 = G.a();
                int i13 = h.f55710b;
                gA2.getClass();
                cVar.f55671a.registerNetworkCallback(networkRequestA, c1955c);
                C1954a c1954a = new C1954a(cVar, c1955c);
                this.f55673q = 1;
                if (F0.a(i02, c1954a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    public c(ConnectivityManager connectivityManager, long j12, int i12, C42822w c42822w) {
        j12 = (i12 & 2) != 0 ? h.f55709a : j12;
        this.f55671a = connectivityManager;
        this.f55672b = j12;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean a(@k H h12) {
        return h12.f55804j.a() != null;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    @k
    public final InterfaceC43160i<b> b(@k C23542f c23542f) {
        return C43175k.d(new a(c23542f, this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean c(@k H h12) {
        if (a(h12)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
