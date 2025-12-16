package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.T0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SemanticsModifier.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/d;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/T0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.semantics.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22556d extends v.d implements T0 {

    /* renamed from: p, reason: collision with root package name */
    public boolean f41731p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f41732q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super F, G0> f41733r;

    public C22556d(boolean z12, boolean z13, @Y61.k Y41.l<? super F, G0> lVar) {
        this.f41731p = z12;
        this.f41732q = z13;
        this.f41733r = lVar;
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k F f12) {
        this.f41733r.invoke(f12);
    }

    @Override // androidx.compose.ui.node.T0
    /* renamed from: t0, reason: from getter */
    public final boolean getF41732q() {
        return this.f41732q;
    }

    @Override // androidx.compose.ui.node.T0
    /* renamed from: x1, reason: from getter */
    public final boolean getF41731p() {
        return this.f41731p;
    }
}
