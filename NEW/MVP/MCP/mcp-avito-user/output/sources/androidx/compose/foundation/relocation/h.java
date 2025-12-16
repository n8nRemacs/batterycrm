package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BringIntoViewRequester.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/relocation/h;", "Landroidx/compose/ui/v$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h extends v.d {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public a f30077p;

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        a aVar = this.f30077p;
        if (aVar instanceof d) {
            ((d) aVar).f30076a.j(this);
        }
        if (aVar instanceof d) {
            ((d) aVar).f30076a.b(this);
        }
        this.f30077p = aVar;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        a aVar = this.f30077p;
        if (aVar instanceof d) {
            ((d) aVar).f30076a.j(this);
        }
    }
}
