package androidx.compose.ui.layout;

import androidx.compose.ui.node.C22426n0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiContentMeasurePolicy.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/r0;", "Landroidx/compose/ui/layout/i0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C22382r0 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22381q0 f40518a;

    public C22382r0(@Y61.k InterfaceC22381q0 interfaceC22381q0) {
        this.f40518a = interfaceC22381q0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        return this.f40518a.b(interfaceC22369k0, C22426n0.a(interfaceC22369k0), j12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int c(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return this.f40518a.c(interfaceC22393x, C22426n0.a(interfaceC22393x), i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int e(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return this.f40518a.e(interfaceC22393x, C22426n0.a(interfaceC22393x), i12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22382r0) && kotlin.jvm.internal.L.f(this.f40518a, ((C22382r0) obj).f40518a);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int f(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return this.f40518a.f(interfaceC22393x, C22426n0.a(interfaceC22393x), i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(@Y61.k InterfaceC22393x interfaceC22393x, @Y61.k List<? extends InterfaceC22391w> list, int i12) {
        return this.f40518a.h(interfaceC22393x, C22426n0.a(interfaceC22393x), i12);
    }

    public final int hashCode() {
        return this.f40518a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f40518a + ')';
    }
}
