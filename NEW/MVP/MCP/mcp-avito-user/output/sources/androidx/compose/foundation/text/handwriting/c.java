package androidx.compose.foundation.text.handwriting;

import Y61.k;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.P0;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: HandwritingDetector.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/c;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/P0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends AbstractC22425n implements P0 {

    /* renamed from: r, reason: collision with root package name */
    @k
    public final Object f30725r = C42727D.b(LazyThreadSafetyMode.f406616d, new a(this));

    /* renamed from: s, reason: collision with root package name */
    @k
    public final i f30726s;

    public c() {
        i iVar = new i(new b(this));
        k2(iVar);
        this.f30726s = iVar;
    }

    @Override // androidx.compose.ui.node.P0
    public final long m1() {
        return this.f30726s.m1();
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        this.f30726s.p1();
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@k C22340s c22340s, @k PointerEventPass pointerEventPass, long j12) {
        this.f30726s.r0(c22340s, pointerEventPass, j12);
    }
}
