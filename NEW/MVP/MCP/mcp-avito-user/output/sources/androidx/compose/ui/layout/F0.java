package androidx.compose.ui.layout;

import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: OnRemeasuredModifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/F0;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/F;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F0 extends v.d implements androidx.compose.ui.node.F {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.unit.u, kotlin.G0> f40329p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f40330q = true;

    /* renamed from: r, reason: collision with root package name */
    public long f40331r;

    public F0(@Y61.k Y41.l<? super androidx.compose.ui.unit.u, kotlin.G0> lVar) {
        this.f40329p = lVar;
        long j12 = BeduinInputModel.MIN_TEXT_VERSION;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        this.f40331r = (j12 & 4294967295L) | (j12 << 32);
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        if (androidx.compose.ui.unit.u.c(this.f40331r, j12)) {
            return;
        }
        this.f40329p.invoke(androidx.compose.ui.unit.u.a(j12));
        this.f40331r = j12;
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1, reason: from getter */
    public final boolean getF40330q() {
        return this.f40330q;
    }
}
