package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.tooling.animation.D;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TransitionClock.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/g;", "T", "Landroidx/compose/ui/tooling/animation/clock/e;", "Landroidx/compose/ui/tooling/animation/D;", "LA0/c;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g<T> implements e<D<T>, A0.c<T>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D<T> f42787a;

    public g(@Y61.k D<T> d12) {
        this.f42787a = d12;
        d12.a().f26317a.a();
        ((C22082i3) d12.a().f26320d).getF42167b();
    }

    @Override // androidx.compose.ui.tooling.animation.clock.e
    public final long a() {
        long jLongValue = ((Number) this.f42787a.a().f26328l.getF42167b()).longValue();
        List<String> list = k.f42788a;
        return (jLongValue + 999999) / 1000000;
    }
}
