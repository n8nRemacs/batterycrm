package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.unit.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {
    public static final int a(X x12, AbstractC22348a abstractC22348a) {
        long j12;
        X xU02 = x12.u0();
        if (xU02 == null) {
            C47949a.b("Child of " + x12 + " cannot be null when calculating alignment line");
        }
        if (x12.z0().t().containsKey(abstractC22348a)) {
            Integer num = x12.z0().t().get(abstractC22348a);
            return num != null ? num.intValue() : BeduinInputModel.MIN_TEXT_VERSION;
        }
        int iD02 = xU02.d0(abstractC22348a);
        if (iD02 == Integer.MIN_VALUE) {
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        xU02.f40704h = true;
        x12.f40705i = true;
        x12.F0();
        xU02.f40704h = false;
        x12.f40705i = false;
        if (abstractC22348a instanceof C22387u) {
            long f40898a = xU02.getF40898A();
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j12 = f40898a & 4294967295L;
        } else {
            long f40898a2 = xU02.getF40898A();
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j12 = f40898a2 >> 32;
        }
        return iD02 + ((int) j12);
    }
}
