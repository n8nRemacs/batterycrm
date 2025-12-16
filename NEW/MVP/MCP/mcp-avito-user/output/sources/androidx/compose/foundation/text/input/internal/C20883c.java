package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.Metadata;

/* compiled from: TextFieldKeyEventHandler.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/c;", "Landroidx/compose/foundation/text/input/internal/g1;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20883c extends g1 {
    @Override // androidx.compose.foundation.text.input.internal.g1
    public final boolean a(@Y61.k KeyEvent keyEvent, @Y61.k t1 t1Var, @Y61.k p1 p1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k Y41.l<? super KeyCommand, ? extends kotlin.G0> lVar, boolean z12, boolean z13, @Y61.k Y41.a<kotlin.G0> aVar) {
        int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f40069b.getClass();
        if (!androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d) || !keyEvent.isFromSource(257) || j1.b(keyEvent)) {
            return super.a(keyEvent, t1Var, p1Var, textFieldSelectionState, lVar, z12, z13, aVar);
        }
        textFieldSelectionState.getClass();
        throw null;
    }

    @Override // androidx.compose.foundation.text.input.internal.g1
    public final boolean b(@Y61.k KeyEvent keyEvent, @Y61.k t1 t1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.k androidx.compose.ui.focus.r rVar, @Y61.k InterfaceC22489j2 interfaceC22489j2) {
        if (super.b(keyEvent, t1Var, textFieldSelectionState, rVar, interfaceC22489j2)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual()) {
            int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
            androidx.compose.ui.input.key.d.f40069b.getClass();
            if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d) && keyEvent.getSource() != 257) {
                if (j1.a(19, keyEvent)) {
                    C22220e.f39163b.getClass();
                    return rVar.h(C22220e.f39168g);
                }
                if (j1.a(20, keyEvent)) {
                    C22220e.f39163b.getClass();
                    return rVar.h(C22220e.f39169h);
                }
                if (j1.a(21, keyEvent)) {
                    C22220e.f39163b.getClass();
                    return rVar.h(C22220e.f39166e);
                }
                if (j1.a(22, keyEvent)) {
                    C22220e.f39163b.getClass();
                    return rVar.h(C22220e.f39167f);
                }
                if (j1.a(23, keyEvent)) {
                    interfaceC22489j2.show();
                    return true;
                }
            }
        }
        return false;
    }
}
