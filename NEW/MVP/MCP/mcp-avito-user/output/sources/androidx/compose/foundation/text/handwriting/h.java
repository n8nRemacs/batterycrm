package androidx.compose.foundation.text.handwriting;

import Y61.k;
import androidx.compose.foundation.text.c3;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import androidx.compose.ui.node.C22436t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StylusHandwriting.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C22436t f30731a;

    static {
        float f12 = 40;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 10;
        f30731a = new C22436t(f13, f12, f13, f12, true, null);
    }

    @k
    public static final v a(@k v vVar, boolean z12, boolean z13, @k Y41.a<G0> aVar) {
        if (!z12 || !j.f30741a) {
            return vVar;
        }
        if (z13) {
            vVar = vVar.d0(new StylusHoverIconModifierElement(c3.f30672b, false, f30731a));
        }
        return vVar.d0(new StylusHandwritingElement(aVar));
    }
}
