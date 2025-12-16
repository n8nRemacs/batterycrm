package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.C20495q0;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class I0 implements PointerInputEventHandler {

    /* compiled from: SelectionManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", i = {0}, l = {754, 760}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31847q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f31848r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ L0 f31849s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f31850t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0 l02, Y41.a<kotlin.G0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31849s = l02;
            this.f31850t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f31849s, this.f31850t, continuation);
            aVar.f31848r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC22325c interfaceC22325c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f31847q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC22325c = (InterfaceC22325c) this.f31848r;
                this.f31848r = interfaceC22325c;
                this.f31847q = 1;
                Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> qVar = C20445d2.f27614a;
                obj = C20445d2.d(interfaceC22325c, PointerEventPass.f40174c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    if (!((Boolean) obj).booleanValue() && this.f31849s.d() == null) {
                        ((D0) this.f31850t).invoke();
                    }
                    return kotlin.G0.f406611a;
                }
                interfaceC22325c = (InterfaceC22325c) this.f31848r;
                C42729a0.b(obj);
            }
            PointerEventPass pointerEventPass = PointerEventPass.f40173b;
            this.f31848r = null;
            this.f31847q = 2;
            obj = C20495q0.a(interfaceC22325c, (androidx.compose.ui.input.pointer.C) obj, pointerEventPass, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (!((Boolean) obj).booleanValue()) {
                ((D0) this.f31850t).invoke();
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        Object objC = C20444d1.c(k12, new a(null, null, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
