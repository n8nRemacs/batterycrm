package androidx.compose.material3;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/u3;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/node/F;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21898u3 extends AbstractC22425n implements androidx.compose.ui.node.P0, InterfaceC22415i, androidx.compose.ui.node.F {

    /* renamed from: r, reason: collision with root package name */
    public float f37399r;

    /* renamed from: s, reason: collision with root package name */
    public float f37400s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.pointer.b0 f37401t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.pointer.b0 f37402u;

    public C21898u3(boolean z12) {
        androidx.compose.ui.input.pointer.g0 g0VarA = androidx.compose.ui.input.pointer.Z.a(new C21853s3(this, null));
        k2(g0VarA);
        this.f37401t = g0VarA;
        androidx.compose.ui.input.pointer.g0 g0VarA2 = androidx.compose.ui.input.pointer.Z.a(new C21808q3(this, null));
        k2(g0VarA2);
        this.f37402u = g0VarA2;
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        throw null;
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        this.f37401t.p1();
        this.f37402u.p1();
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        this.f37401t.r0(c22340s, pointerEventPass, j12);
        this.f37402u.r0(c22340s, pointerEventPass, j12);
    }
}
