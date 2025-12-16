package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyMapping.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20961k1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f31559a = new a();

    /* compiled from: KeyMapping.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/k1$a", "Landroidx/compose/foundation/text/h1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.k1$a */
    public static final class a implements InterfaceC20873h1 {
        @Override // androidx.compose.foundation.text.InterfaceC20873h1
        public final KeyCommand a(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long jA2 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                E1.f30222a.getClass();
                if (androidx.compose.ui.input.key.b.a(jA2, E1.f30231j)) {
                    keyCommand = KeyCommand.f30417Q;
                } else if (androidx.compose.ui.input.key.b.a(jA2, E1.f30232k)) {
                    keyCommand = KeyCommand.f30418R;
                } else if (androidx.compose.ui.input.key.b.a(jA2, E1.f30233l)) {
                    keyCommand = KeyCommand.f30409I;
                } else if (androidx.compose.ui.input.key.b.a(jA2, E1.f30234m)) {
                    keyCommand = KeyCommand.f30410J;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA3 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                E1.f30222a.getClass();
                if (androidx.compose.ui.input.key.b.a(jA3, E1.f30231j)) {
                    keyCommand = KeyCommand.f30434k;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30232k)) {
                    keyCommand = KeyCommand.f30435l;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30233l)) {
                    keyCommand = KeyCommand.f30440q;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30234m)) {
                    keyCommand = KeyCommand.f30441r;
                }
            }
            return keyCommand == null ? C20957j1.f31540a.a(keyEvent) : keyCommand;
        }
    }
}
