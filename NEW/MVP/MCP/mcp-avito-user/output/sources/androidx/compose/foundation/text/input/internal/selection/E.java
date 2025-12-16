package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.selection.C20998b0;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", i = {0}, l = {453}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
/* loaded from: classes.dex */
final class E extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f31224q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31225r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31226s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(TextFieldSelectionState textFieldSelectionState, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f31226s = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        E e12 = new E(this.f31226s, continuation);
        e12.f31225r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31224q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22325c interfaceC22325c = (InterfaceC22325c) this.f31225r;
            PointerEventPass pointerEventPass = PointerEventPass.f40173b;
            this.f31225r = interfaceC22325c;
            this.f31224q = 1;
            obj = interfaceC22325c.N1(pointerEventPass, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        C20998b0.h((C22340s) obj);
        this.f31226s.getClass();
        throw null;
    }
}
