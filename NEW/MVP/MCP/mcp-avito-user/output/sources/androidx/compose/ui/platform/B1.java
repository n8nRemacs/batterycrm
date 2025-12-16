package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: JvmActuals.jvm.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B1 {
    @Y61.k
    public static final String a(@Y61.k Object obj) {
        StringBuilder sbB = C22491k0.b(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), '@');
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        sbB.append(String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return sbB.toString();
    }
}
