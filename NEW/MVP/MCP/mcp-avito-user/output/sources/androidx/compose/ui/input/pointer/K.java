package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.InterfaceC22544x2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Landroidx/compose/ui/unit/d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface K extends androidx.compose.ui.unit.d {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    <R> Object N0(@Y61.k Y41.p<? super InterfaceC22325c, ? super Continuation<? super R>, ? extends Object> pVar, @Y61.k Continuation<? super R> continuation);

    @Y61.k
    InterfaceC22544x2 getViewConfiguration();

    default void F1() {
    }
}
