package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class L extends kotlin.jvm.internal.N implements Y41.p<Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f29307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Q, C22712b, InterfaceC22367j0> f29308m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(B b12, Y41.p<? super Q, ? super C22712b, ? extends InterfaceC22367j0> pVar) {
        super(2);
        this.f29307l = b12;
        this.f29308m = pVar;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(Z0 z02, C22712b c22712b) {
        long j12 = c22712b.f42843a;
        return this.f29308m.invoke(new S(this.f29307l, z02), C22712b.a(j12));
    }
}
