package androidx.compose.material3;

import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.o;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", i = {}, l = {990}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Ve extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35678q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f35679r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> f35680s;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> f35681b;

        public a(androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> d12) {
            this.f35681b = d12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
            boolean z12 = jVar instanceof o.b;
            androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> d12 = this.f35681b;
            if (z12) {
                d12.add(jVar);
            } else if (jVar instanceof o.c) {
                d12.remove(((o.c) jVar).f28150a);
            } else if (jVar instanceof o.a) {
                d12.remove(((o.a) jVar).f28148a);
            } else if (jVar instanceof a.b) {
                d12.add(jVar);
            } else if (jVar instanceof a.c) {
                d12.remove(((a.c) jVar).f28134a);
            } else if (jVar instanceof a.C1584a) {
                d12.remove(((a.C1584a) jVar).f28133a);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ve(androidx.compose.foundation.interaction.m mVar, androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> d12, Continuation<? super Ve> continuation) {
        super(2, continuation);
        this.f35679r = mVar;
        this.f35680s = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Ve(this.f35679r, this.f35680s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((Ve) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35678q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f35679r.c();
            a aVar = new a(this.f35680s);
            this.f35678q = 1;
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
