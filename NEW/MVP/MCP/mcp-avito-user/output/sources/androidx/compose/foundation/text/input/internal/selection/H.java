package androidx.compose.foundation.text.input.internal.selection;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/l;", "it", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/text/input/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class H<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31229b;

    public H(TextFieldSelectionState textFieldSelectionState) {
        this.f31229b = textFieldSelectionState;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        TextFieldSelectionState textFieldSelectionState = this.f31229b;
        textFieldSelectionState.u(false);
        textFieldSelectionState.v(TextToolbarState.f31344b);
        return G0.f406611a;
    }
}
