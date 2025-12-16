package androidx.compose.foundation.text.input.internal.selection;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/j;", "rect", "Lkotlin/G0;", "emit", "(Ll0/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class J<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31231b;

    public J(TextFieldSelectionState textFieldSelectionState) {
        this.f31231b = textFieldSelectionState;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        l0.j jVar = (l0.j) obj;
        l0.j.f413388e.getClass();
        boolean zF2 = kotlin.jvm.internal.L.f(jVar, l0.j.f413389f);
        TextFieldSelectionState textFieldSelectionState = this.f31231b;
        if (zF2) {
            Z z12 = textFieldSelectionState.f31266g;
            if (z12 != null) {
                z12.a();
            }
        } else {
            Z z13 = textFieldSelectionState.f31266g;
            if (z13 != null) {
                Object objB = z13.b(textFieldSelectionState, jVar, continuation);
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : G0.f406611a;
            }
        }
        return G0.f406611a;
    }
}
