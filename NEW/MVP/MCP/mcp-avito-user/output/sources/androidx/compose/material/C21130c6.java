package androidx.compose.material;

import androidx.compose.foundation.gestures.C20445d2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/K;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", i = {}, l = {497}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.c6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21130c6 extends SuspendLambda implements Y41.p<androidx.compose.ui.input.pointer.K, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33506q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f33507r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33508s;

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.c6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f33509l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<kotlin.G0> aVar) {
            super(1);
            this.f33509l = aVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            this.f33509l.invoke();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21130c6(Y41.a<kotlin.G0> aVar, Continuation<? super C21130c6> continuation) {
        super(2, continuation);
        this.f33508s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C21130c6 c21130c6 = new C21130c6(this.f33508s, continuation);
        c21130c6.f33507r = obj;
        return c21130c6;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        return ((C21130c6) create(k12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33506q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.input.pointer.K k12 = (androidx.compose.ui.input.pointer.K) this.f33507r;
            a aVar = new a(this.f33508s);
            this.f33506q = 1;
            if (C20445d2.g(k12, null, null, aVar, this, 7) == coroutine_suspended) {
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
