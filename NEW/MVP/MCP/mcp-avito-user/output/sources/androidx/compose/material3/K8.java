package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: Label.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class K8 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34994q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f34995r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q0 f34996s;

    /* compiled from: Label.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/interaction/j;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<androidx.compose.foundation.interaction.j, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f34997q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f34998r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Q0 f34999s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q0 q02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34999s = q02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f34999s, continuation);
            aVar.f34998r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(androidx.compose.foundation.interaction.j jVar, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(jVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f34997q;
            if (i12 == 0) {
                C42729a0.b(obj);
                androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) this.f34998r;
                boolean z12 = jVar instanceof o.b ? true : jVar instanceof a.b ? true : jVar instanceof g.a;
                Q0 q02 = this.f34999s;
                if (z12) {
                    MutatePriority mutatePriority = MutatePriority.f26798c;
                    this.f34997q = 1;
                    if (q02.a(mutatePriority, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (jVar instanceof o.c ? true : jVar instanceof a.c ? true : jVar instanceof g.b) {
                        q02.dismiss();
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8(androidx.compose.foundation.interaction.m mVar, Q0 q02, Continuation<? super K8> continuation) {
        super(2, continuation);
        this.f34995r = mVar;
        this.f34996s = q02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new K8(this.f34995r, this.f34996s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((K8) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34994q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f34995r.c();
            a aVar = new a(this.f34996s, null);
            this.f34994q = 1;
            if (C43175k.j(interfaceC43160iC, aVar, this) == coroutine_suspended) {
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
