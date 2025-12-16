package androidx.compose.material3;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {519}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class J7 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34937q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f34938r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f34939s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N7 f34940t;

    /* compiled from: FloatingActionButton.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f34941b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f34942c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N7 f34943d;

        public a(ArrayList arrayList, kotlinx.coroutines.T t12, N7 n72) {
            this.f34941b = arrayList;
            this.f34942c = t12;
            this.f34943d = n72;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
            boolean z12 = jVar instanceof g.a;
            ArrayList arrayList = this.f34941b;
            if (z12) {
                arrayList.add(jVar);
            } else if (jVar instanceof g.b) {
                arrayList.remove(((g.b) jVar).f28141a);
            } else if (jVar instanceof d.a) {
                arrayList.add(jVar);
            } else if (jVar instanceof d.b) {
                arrayList.remove(((d.b) jVar).f28135a);
            } else if (jVar instanceof o.b) {
                arrayList.add(jVar);
            } else if (jVar instanceof o.c) {
                arrayList.remove(((o.c) jVar).f28150a);
            } else if (jVar instanceof o.a) {
                arrayList.remove(((o.a) jVar).f28148a);
            }
            C43259k.d(this.f34942c, null, null, new I7(this.f34943d, (androidx.compose.foundation.interaction.j) C42745f0.S(arrayList), null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7(androidx.compose.foundation.interaction.m mVar, N7 n72, Continuation continuation) {
        super(2, continuation);
        this.f34939s = mVar;
        this.f34940t = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        J7 j72 = new J7(this.f34939s, this.f34940t, continuation);
        j72.f34938r = obj;
        return j72;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((J7) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34937q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f34938r;
            ArrayList arrayList = new ArrayList();
            InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f34939s.c();
            a aVar = new a(arrayList, t12, this.f34940t);
            this.f34937q = 1;
            if (interfaceC43160iC.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
