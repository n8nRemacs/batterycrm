package androidx.compose.foundation;

import androidx.compose.runtime.F3;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Overscroll.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/M1;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface M1 {

    /* compiled from: Overscroll.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/M1$a", "Landroidx/compose/ui/v$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends v.d {
    }

    @Y61.k
    default InterfaceC22419k N() {
        return new a();
    }

    boolean O();

    @Y61.l
    Object P(long j12, @Y61.k Y41.p<? super androidx.compose.ui.unit.B, ? super Continuation<? super androidx.compose.ui.unit.B>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation);

    long Q(long j12, int i12, @Y61.k Y41.l<? super l0.g, l0.g> lVar);
}
