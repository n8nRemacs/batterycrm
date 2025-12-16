package androidx.compose.ui.layout;

import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: Layout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/p;", "Landroidx/compose/ui/layout/h0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22378p implements InterfaceC22363h0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22391w f40512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final IntrinsicMinMax f40513c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final IntrinsicWidthHeight f40514d;

    public C22378p(@Y61.k InterfaceC22391w interfaceC22391w, @Y61.k IntrinsicMinMax intrinsicMinMax, @Y61.k IntrinsicWidthHeight intrinsicWidthHeight) {
        this.f40512b = interfaceC22391w;
        this.f40513c = intrinsicMinMax;
        this.f40514d = intrinsicWidthHeight;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int G(int i12) {
        return this.f40512b.G(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22363h0
    @Y61.k
    public final K0 I(long j12) {
        IntrinsicWidthHeight intrinsicWidthHeight = IntrinsicWidthHeight.f40337b;
        IntrinsicMinMax intrinsicMinMax = this.f40513c;
        InterfaceC22391w interfaceC22391w = this.f40512b;
        if (this.f40514d == intrinsicWidthHeight) {
            return new C22383s(intrinsicMinMax == IntrinsicMinMax.f40334c ? interfaceC22391w.b0(C22712b.i(j12)) : interfaceC22391w.G(C22712b.i(j12)), C22712b.e(j12) ? C22712b.i(j12) : 32767);
        }
        return new C22383s(C22712b.f(j12) ? C22712b.j(j12) : 32767, intrinsicMinMax == IntrinsicMinMax.f40334c ? interfaceC22391w.R(C22712b.j(j12)) : interfaceC22391w.X(C22712b.j(j12)));
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int R(int i12) {
        return this.f40512b.R(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int X(int i12) {
        return this.f40512b.X(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int b0(int i12) {
        return this.f40512b.b0(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    @Y61.l
    /* renamed from: f */
    public final Object getF40847t() {
        return this.f40512b.getF40847t();
    }
}
