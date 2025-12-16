package androidx.compose.ui.draw;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22374n;
import kotlin.Metadata;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {
    public static androidx.compose.ui.v a(androidx.compose.ui.v vVar, androidx.compose.ui.graphics.painter.e eVar, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, float f12, U u12, int i12) {
        if ((i12 & 4) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f = InterfaceC22215f.a.f39080f;
        }
        InterfaceC22215f interfaceC22215f2 = interfaceC22215f;
        if ((i12 & 8) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n = InterfaceC22374n.a.f40497f;
        }
        InterfaceC22374n interfaceC22374n2 = interfaceC22374n;
        if ((i12 & 16) != 0) {
            f12 = 1.0f;
        }
        float f13 = f12;
        if ((i12 & 32) != 0) {
            u12 = null;
        }
        return vVar.d0(new PainterElement(eVar, interfaceC22215f2, interfaceC22374n2, f13, u12));
    }
}
