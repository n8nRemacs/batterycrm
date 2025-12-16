package androidx.compose.material.internal;

import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.B;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", "childCoordinates", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class g extends N implements Y41.l<A, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f33669l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar) {
        super(1);
        this.f33669l = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(A a12) {
        A aX2 = a12.x();
        long jA2 = aX2.a();
        long jF2 = B.f(aX2);
        androidx.compose.ui.unit.s sVarA = androidx.compose.ui.unit.t.a(androidx.compose.ui.unit.r.a(kotlin.math.b.b(l0.g.g(jF2)), kotlin.math.b.b(l0.g.h(jF2))), jA2);
        s sVar = this.f33669l;
        ((C22082i3) sVar.f33694o).setValue(sVarA);
        sVar.k();
        return G0.f406611a;
    }
}
