package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.o;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34088q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f34089r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.k f34090s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v f34091t;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f34092b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f34093c;

        public a(v vVar, T t12) {
            this.f34092b = vVar;
            this.f34093c = t12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
            boolean z12 = jVar instanceof o.b;
            T t12 = this.f34093c;
            v vVar = this.f34092b;
            if (z12) {
                vVar.d((o.b) jVar, t12);
            } else if (jVar instanceof o.c) {
                vVar.f(((o.c) jVar).f28150a);
            } else if (jVar instanceof o.a) {
                vVar.f(((o.a) jVar).f28148a);
            } else {
                vVar.f34144c.b(jVar, t12);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.compose.foundation.interaction.k kVar, v vVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f34090s = kVar;
        this.f34091t = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        j jVar = new j(this.f34090s, this.f34091t, continuation);
        jVar.f34089r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34088q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f34089r;
            InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f34090s.c();
            a aVar = new a(this.f34091t, t12);
            this.f34088q = 1;
            if (interfaceC43160iC.collect(aVar, this) == coroutine_suspended) {
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
