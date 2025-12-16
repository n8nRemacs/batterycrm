package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/material3/Sk;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/material3/Sk;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Qk extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, Sk, List<? extends Object>> {
    static {
        new Qk();
    }

    public Qk() {
        super(2);
    }

    @Override // Y41.p
    public final List<? extends Object> invoke(androidx.compose.runtime.saveable.x xVar, Sk sk2) {
        Sk sk3 = sk2;
        return C42745f0.U(Integer.valueOf((((int) ((((C22040c3) sk3.f35429g).f() + (0.2617994f + 1.5707963267948966d)) / 0.5235988f)) % 12) + (((Boolean) sk3.f35432j.getF42167b()).booleanValue() ? 12 : 0)), Integer.valueOf(Sk.d(((C22040c3) sk3.f35430h).f())), Boolean.valueOf(sk3.f35423a));
    }
}
