package androidx.work.impl.constraints.controllers;

import Y41.p;
import Y61.k;
import androidx.work.C23542f;
import androidx.work.G;
import androidx.work.impl.constraints.b;
import androidx.work.impl.model.H;
import java.util.Objects;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ContraintControllers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/constraints/controllers/a;", "T", "Landroidx/work/impl/constraints/controllers/d;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a<T> implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final androidx.work.impl.constraints.trackers.g<T> f55684a;

    /* compiled from: ContraintControllers.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/coroutines/channels/I0;", "Landroidx/work/impl/constraints/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.work.impl.constraints.controllers.a$a, reason: collision with other inner class name */
    public static final class C1956a extends SuspendLambda implements p<I0<? super androidx.work.impl.constraints.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f55685q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f55686r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a<T> f55687s;

        /* compiled from: ContraintControllers.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.work.impl.constraints.controllers.a$a$a, reason: collision with other inner class name */
        public static final class C1957a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a<T> f55688l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ b f55689m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1957a(a<T> aVar, b bVar) {
                super(0);
                this.f55688l = aVar;
                this.f55689m = bVar;
            }

            @Override // Y41.a
            public final G0 invoke() {
                androidx.work.impl.constraints.trackers.g<T> gVar = this.f55688l.f55684a;
                b bVar = this.f55689m;
                synchronized (gVar.f55718c) {
                    if (gVar.f55719d.remove(bVar) && gVar.f55719d.isEmpty()) {
                        gVar.d();
                    }
                }
                return G0.f406611a;
            }
        }

        /* compiled from: ContraintControllers.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/work/impl/constraints/controllers/a$a$b", "Landroidx/work/impl/constraints/a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.work.impl.constraints.controllers.a$a$b */
        public static final class b implements androidx.work.impl.constraints.a<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a<T> f55690a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<androidx.work.impl.constraints.b> f55691b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(a<T> aVar, I0<? super androidx.work.impl.constraints.b> i02) {
                this.f55690a = aVar;
                this.f55691b = i02;
            }

            @Override // androidx.work.impl.constraints.a
            public final void a(T t12) {
                a<T> aVar = this.f55690a;
                this.f55691b.r().w(aVar.e(t12) ? new b.C1953b(aVar.d()) : b.a.f55669a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1956a(a<T> aVar, Continuation<? super C1956a> continuation) {
            super(2, continuation);
            this.f55687s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            C1956a c1956a = new C1956a(this.f55687s, continuation);
            c1956a.f55686r = obj;
            return c1956a;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super androidx.work.impl.constraints.b> i02, Continuation<? super G0> continuation) {
            return ((C1956a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f55685q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i02 = (I0) this.f55686r;
                a<T> aVar = this.f55687s;
                b bVar = new b(aVar, i02);
                androidx.work.impl.constraints.trackers.g<T> gVar = aVar.f55684a;
                synchronized (gVar.f55718c) {
                    try {
                        if (gVar.f55719d.add(bVar)) {
                            if (gVar.f55719d.size() == 1) {
                                gVar.f55720e = gVar.a();
                                G gA2 = G.a();
                                int i13 = androidx.work.impl.constraints.trackers.h.f55721a;
                                Objects.toString(gVar.f55720e);
                                gA2.getClass();
                                gVar.c();
                            }
                            bVar.a(gVar.f55720e);
                        }
                        G0 g02 = G0.f406611a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C1957a c1957a = new C1957a(this.f55687s, bVar);
                this.f55685q = 1;
                if (F0.a(i02, c1957a, this) == coroutine_suspended) {
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

    public a(@k androidx.work.impl.constraints.trackers.g<T> gVar) {
        this.f55684a = gVar;
    }

    @Override // androidx.work.impl.constraints.controllers.d
    @k
    public final InterfaceC43160i<androidx.work.impl.constraints.b> b(@k C23542f c23542f) {
        return C43175k.d(new C1956a(this, null));
    }

    @Override // androidx.work.impl.constraints.controllers.d
    public final boolean c(@k H h12) {
        return a(h12) && e(this.f55684a.a());
    }

    public abstract int d();

    public boolean e(T t12) {
        return false;
    }
}
