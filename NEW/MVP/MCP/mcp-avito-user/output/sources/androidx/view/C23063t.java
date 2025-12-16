package androidx.view;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/t;", "Lkotlinx/coroutines/o0;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23063t implements InterfaceC43268o0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC22991Y<?> f46886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C23051n f46887c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46888d;

    /* compiled from: CoroutineLiveData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.lifecycle.t$a */
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return C23063t.this.new a(continuation);
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
            C23063t c23063t = C23063t.this;
            if (!c23063t.f46888d) {
                c23063t.f46887c.b(c23063t.f46886b);
                c23063t.f46888d = true;
            }
            return G0.f406611a;
        }
    }

    public C23063t(@k AbstractC22991Y abstractC22991Y, @k C23051n c23051n) {
        this.f46886b = abstractC22991Y;
        this.f46887c = c23051n;
    }

    @Override // kotlinx.coroutines.InterfaceC43268o0
    public final void dispose() {
        c cVar = C43262l0.f411945a;
        C43259k.d(U.a(K.f411877a.y()), null, null, new a(null), 3);
    }
}
