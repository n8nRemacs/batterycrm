package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InterfaceC22544x2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: SuspendingPointerInputFilter.kt */
@RestrictsSuspension
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/unit/d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22325c extends androidx.compose.ui.unit.d {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.c$a */
    public static final class a {
    }

    @Y61.k
    C22340s C0();

    default long J1() {
        l0.n.f413402b.getClass();
        return 0L;
    }

    @Y61.l
    Object N1(@Y61.k PointerEventPass pointerEventPass, @Y61.k Continuation<? super C22340s> continuation);

    @Y61.l
    default Object U1(long j12, @Y61.k Y41.p pVar, @Y61.k BaseContinuationImpl baseContinuationImpl) {
        return pVar.invoke(this, baseContinuationImpl);
    }

    @Y61.l
    default Object W0(long j12, @Y61.k Y41.p pVar, @Y61.k BaseContinuationImpl baseContinuationImpl) {
        return pVar.invoke(this, baseContinuationImpl);
    }

    long a();

    @Y61.k
    InterfaceC22544x2 getViewConfiguration();
}
