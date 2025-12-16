package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/Y;", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y implements InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<AbstractC22348a, Integer> f40717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<K0.a, kotlin.G0> f40718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f40719e;

    public Y(int i12, int i13, Map map, Y41.l lVar, X x12) {
        this.f40715a = i12;
        this.f40716b = i13;
        this.f40717c = map;
        this.f40718d = lVar;
        this.f40719e = x12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight, reason: from getter */
    public final int getF40522b() {
        return this.f40716b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth, reason: from getter */
    public final int getF40521a() {
        return this.f40715a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Map<AbstractC22348a, Integer> t() {
        return this.f40717c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
        this.f40718d.invoke(this.f40719e.f40706j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Y41.l<androidx.compose.ui.layout.R0, kotlin.G0> v() {
        return null;
    }
}
