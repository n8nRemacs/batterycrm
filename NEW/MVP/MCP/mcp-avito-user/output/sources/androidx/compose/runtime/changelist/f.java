package androidx.compose.runtime.changelist;

import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.O2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Operation.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"", "IntParameter", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final void a(O2 o22, InterfaceC22078i<Object> interfaceC22078i, int i12) {
        while (true) {
            int i13 = o22.f38089v;
            if (i12 > i13 && i12 < o22.f38088u) {
                return;
            }
            if (i13 == 0 && i12 == 0) {
                return;
            }
            o22.L();
            if (o22.w(o22.f38089v)) {
                interfaceC22078i.j();
            }
            o22.i();
        }
    }
}
