package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ApproachMeasureScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/i;", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22364i implements InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40464a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40465b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<AbstractC22348a, Integer> f40466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<K0.a, kotlin.G0> f40467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C22366j f40468e;

    public C22364i(int i12, int i13, Map map, Y41.l lVar, C22366j c22366j) {
        this.f40467d = lVar;
        this.f40468e = c22366j;
        this.f40464a = i12;
        this.f40465b = i13;
        this.f40466c = map;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight, reason: from getter */
    public final int getF40585c() {
        return this.f40465b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth, reason: from getter */
    public final int getF40584b() {
        return this.f40464a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Map<AbstractC22348a, Integer> t() {
        return this.f40466c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        this.f40467d.invoke(this.f40468e.f40469b.f40706j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Y41.l<R0, kotlin.G0> v() {
        return null;
    }
}
