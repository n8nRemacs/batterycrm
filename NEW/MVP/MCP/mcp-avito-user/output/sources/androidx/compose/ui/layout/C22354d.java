package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/d;", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22354d implements InterfaceC22367j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map<AbstractC22348a, Integer> f40447c;

    public C22354d(int i12, int i13, Map map) {
        this.f40445a = i12;
        this.f40446b = i13;
        this.f40447c = map;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getHeight, reason: from getter */
    public final int getF40446b() {
        return this.f40446b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    /* renamed from: getWidth, reason: from getter */
    public final int getF40445a() {
        return this.f40445a;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Map<AbstractC22348a, Integer> t() {
        return this.f40447c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final Y41.l<R0, kotlin.G0> v() {
        return null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22367j0
    public final void u() {
    }
}
