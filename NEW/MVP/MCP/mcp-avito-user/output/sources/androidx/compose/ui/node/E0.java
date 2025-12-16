package androidx.compose.ui.node;

import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: ObserverModifierNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E0 {
    public static final <T extends v.d & D0> void a(@Y61.k T t12, @Y61.k Y41.a<kotlin.G0> aVar) {
        F0 f02 = t12.f42886h;
        if (f02 == null) {
            f02 = new F0(t12);
            t12.f42886h = f02;
        }
        L0 snapshotObserver = C22421l.h(t12).getSnapshotObserver();
        F0.f40568c.getClass();
        snapshotObserver.b(f02, F0.f40569d, aVar);
    }
}
