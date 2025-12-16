package androidx.compose.ui.semantics;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SemanticsModifier.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f41791a = new AtomicInteger(0);

    @Y61.k
    public static final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super F, G0> lVar) {
        return vVar.d0(new ClearAndSetSemanticsElement(lVar));
    }

    @Y61.k
    public static final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar, boolean z12, @Y61.k Y41.l<? super F, G0> lVar) {
        return vVar.d0(new AppendedSemanticsElement(lVar, z12));
    }
}
