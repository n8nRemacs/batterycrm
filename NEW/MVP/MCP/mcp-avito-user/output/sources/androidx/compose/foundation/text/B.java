package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f30178a;

    public B(TextFieldSelectionState textFieldSelectionState) {
        this.f30178a = textFieldSelectionState;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        TextFieldSelectionState textFieldSelectionState = this.f30178a;
        androidx.compose.foundation.text.input.internal.selection.Z z12 = textFieldSelectionState.f31266g;
        if (z12 != null) {
            z12.a();
        }
        textFieldSelectionState.f31267h = null;
        textFieldSelectionState.f31265f = null;
    }
}
