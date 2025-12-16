package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22371l0 implements InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40483b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<AbstractC22348a, Integer> f40484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22369k0 f40486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.l<K0.a, kotlin.G0> f40487f;

    public C22371l0(int i12, int i13, Map map, InterfaceC22369k0 interfaceC22369k0, Y41.l lVar) {
        this.f40485d = i12;
        this.f40486e = interfaceC22369k0;
        this.f40487f = lVar;
        this.f40482a = i12;
        this.f40483b = i13;
        this.f40484c = map;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight, reason: from getter */
    public final int getF40585c() {
        return this.f40483b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth, reason: from getter */
    public final int getF40584b() {
        return this.f40482a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Map<AbstractC22348a, Integer> t() {
        return this.f40484c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        InterfaceC22369k0 interfaceC22369k0 = this.f40486e;
        boolean z12 = interfaceC22369k0 instanceof androidx.compose.ui.node.X;
        Y41.l<K0.a, kotlin.G0> lVar = this.f40487f;
        if (z12) {
            lVar.invoke(((androidx.compose.ui.node.X) interfaceC22369k0).f40706j);
        } else {
            lVar.invoke(new U0(this.f40485d, interfaceC22369k0.getF40524b()));
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Y41.l<R0, kotlin.G0> v() {
        return null;
    }
}
