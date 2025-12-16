package androidx.compose.material3;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.InterfaceC22196w1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SegmentedButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21909ue extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37422q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f37423r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f37424s;

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ue$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f37425b;

        public a(InterfaceC22196w1 interfaceC22196w1) {
            this.f37425b = interfaceC22196w1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
            boolean z12 = jVar instanceof o.b ? true : jVar instanceof d.a;
            InterfaceC22196w1 interfaceC22196w1 = this.f37425b;
            if (z12) {
                interfaceC22196w1.L3(interfaceC22196w1.e() + 1);
            } else {
                if (jVar instanceof o.c ? true : jVar instanceof d.b ? true : jVar instanceof o.a) {
                    interfaceC22196w1.L3(interfaceC22196w1.e() - 1);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21909ue(androidx.compose.foundation.interaction.m mVar, InterfaceC22196w1 interfaceC22196w1, Continuation continuation) {
        super(2, continuation);
        this.f37423r = mVar;
        this.f37424s = interfaceC22196w1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21909ue(this.f37423r, this.f37424s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21909ue) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37422q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f37423r.c();
            a aVar = new a(this.f37424s);
            this.f37422q = 1;
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
