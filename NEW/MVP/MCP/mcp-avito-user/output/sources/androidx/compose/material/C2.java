package androidx.compose.material;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class C2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32482q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f32483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> f32484s;

    /* compiled from: Button.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> f32485b;

        public a(androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> d12) {
            this.f32485b = d12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
            boolean z12 = jVar instanceof g.a;
            androidx.compose.runtime.snapshots.D<androidx.compose.foundation.interaction.j> d12 = this.f32485b;
            if (z12) {
                d12.add(jVar);
            } else if (jVar instanceof g.b) {
                d12.remove(((g.b) jVar).f28141a);
            } else if (jVar instanceof d.a) {
                d12.add(jVar);
            } else if (jVar instanceof d.b) {
                d12.remove(((d.b) jVar).f28135a);
            } else if (jVar instanceof o.b) {
                d12.add(jVar);
            } else if (jVar instanceof o.c) {
                d12.remove(((o.c) jVar).f28150a);
            } else if (jVar instanceof o.a) {
                d12.remove(((o.a) jVar).f28148a);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2(androidx.compose.foundation.interaction.m mVar, androidx.compose.runtime.snapshots.D d12, Continuation continuation) {
        super(2, continuation);
        this.f32483r = mVar;
        this.f32484s = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C2(this.f32483r, this.f32484s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32482q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f32483r.c();
            a aVar = new a(this.f32484s);
            this.f32482q = 1;
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
