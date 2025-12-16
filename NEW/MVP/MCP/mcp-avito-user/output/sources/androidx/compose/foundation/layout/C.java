package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: BoxWithConstraints.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.layout.Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22365i0 f28216l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f28217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(InterfaceC22365i0 interfaceC22365i0, C22096n c22096n) {
        super(2);
        this.f28216l = interfaceC22365i0;
        this.f28217m = c22096n;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(androidx.compose.ui.layout.Z0 z02, C22712b c22712b) {
        androidx.compose.ui.layout.Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        return this.f28216l.b(z03, z03.h0(kotlin.G0.f406611a, new C22096n(-1945019079, new B(this.f28217m, new G(z03, j12, null)), true)), j12);
    }
}
