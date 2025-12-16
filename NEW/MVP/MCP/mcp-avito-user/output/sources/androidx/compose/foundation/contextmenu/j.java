package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: ContextMenuGestures.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class j implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<l0.g, G0> f27031b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Y41.l<? super l0.g, G0> lVar) {
        this.f27031b = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(K k12, Continuation<? super G0> continuation) {
        Object objC = C20444d1.c(k12, new k(this.f27031b, null), continuation);
        if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objC = G0.f406611a;
        }
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : G0.f406611a;
    }
}
