package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.Collection;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: PressDownGesture.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {31, 37}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20919d extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.input.pointer.C f31361q;

    /* renamed from: r, reason: collision with root package name */
    public int f31362r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f31363s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20921f f31364t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f31365u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20919d(InterfaceC20921f interfaceC20921f, Y41.a<G0> aVar, Continuation<? super C20919d> continuation) {
        super(2, continuation);
        this.f31364t = interfaceC20921f;
        this.f31365u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        C20919d c20919d = new C20919d(this.f31364t, this.f31365u, continuation);
        c20919d.f31363s = obj;
        return c20919d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super G0> continuation) {
        return ((C20919d) create(interfaceC22325c, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31362r;
        Y41.a<G0> aVar = this.f31365u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22325c interfaceC22325c = (InterfaceC22325c) this.f31363s;
            this.f31363s = interfaceC22325c;
            this.f31362r = 1;
            obj = C20445d2.c(interfaceC22325c, this, 2);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.compose.ui.input.pointer.C c12 = this.f31361q;
                InterfaceC22325c interfaceC22325c2 = (InterfaceC22325c) this.f31363s;
                C42729a0.b(obj);
                do {
                    ?? r13 = ((C22340s) obj).f40278a;
                    int size = ((Collection) r13).size();
                    for (int i13 = 0; i13 < size; i13++) {
                        androidx.compose.ui.input.pointer.C c13 = (androidx.compose.ui.input.pointer.C) r13.get(i13);
                        if (androidx.compose.ui.input.pointer.B.a(c13.f40116a, c12.f40116a) && c13.f40119d) {
                            this.f31363s = interfaceC22325c2;
                            this.f31361q = c12;
                            this.f31362r = 2;
                            obj = interfaceC22325c2.N1(PointerEventPass.f40174c, this);
                        }
                    }
                    ((TextFieldSelectionState.g.b.C1622b) aVar).invoke();
                    return G0.f406611a;
                } while (obj != coroutine_suspended);
                return coroutine_suspended;
            }
            C42729a0.b(obj);
        }
        long j12 = ((androidx.compose.ui.input.pointer.C) obj).f40118c;
        ((TextFieldSelectionState.g.b.a) this.f31364t).f31337a.getClass();
        throw null;
    }
}
