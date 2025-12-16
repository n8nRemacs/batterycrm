package androidx.compose.foundation.lazy.layout;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LazySaveableStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/lazy/layout/s0;", "it", "", "", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/lazy/layout/s0;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class t0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, s0, Map<String, ? extends List<? extends Object>>> {

    /* renamed from: l, reason: collision with root package name */
    public static final t0 f29542l = new t0();

    public t0() {
        super(2);
    }

    @Override // Y41.p
    public final Map<String, ? extends List<? extends Object>> invoke(androidx.compose.runtime.saveable.x xVar, s0 s0Var) {
        Map<String, List<Object>> mapC = s0Var.c();
        if (mapC.isEmpty()) {
            return null;
        }
        return mapC;
    }
}
