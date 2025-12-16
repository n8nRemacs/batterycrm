package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.Q;
import androidx.compose.ui.node.AbstractC22400a0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/S;", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S implements InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<AbstractC22348a, Integer> f40396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q.c f40397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f40398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.l<K0.a, kotlin.G0> f40399f;

    public S(int i12, int i13, Map map, Q.c cVar, Q q12, Y41.l lVar) {
        this.f40394a = i12;
        this.f40395b = i13;
        this.f40396c = map;
        this.f40397d = cVar;
        this.f40398e = q12;
        this.f40399f = lVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight, reason: from getter */
    public final int getF40585c() {
        return this.f40395b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth, reason: from getter */
    public final int getF40584b() {
        return this.f40394a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Map<AbstractC22348a, Integer> t() {
        return this.f40396c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        AbstractC22400a0 abstractC22400a0;
        boolean zI1 = this.f40397d.I1();
        Y41.l<K0.a, kotlin.G0> lVar = this.f40399f;
        Q q12 = this.f40398e;
        if (!zI1 || (abstractC22400a0 = q12.f40364b.f40615I.f40875b.f40958U) == null) {
            lVar.invoke(q12.f40364b.f40615I.f40875b.f40706j);
        } else {
            lVar.invoke(abstractC22400a0.f40706j);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Y41.l<R0, kotlin.G0> v() {
        return null;
    }
}
