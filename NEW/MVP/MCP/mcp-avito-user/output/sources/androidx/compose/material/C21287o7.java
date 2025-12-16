package androidx.compose.material;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/h0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/k0;Landroidx/compose/ui/layout/h0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.o7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21287o7 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33863l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21287o7(float f12) {
        super(3);
        this.f33863l = f12;
    }

    @Override // Y41.q
    public final InterfaceC22367j0 invoke(InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
        InterfaceC22369k0 interfaceC22369k02 = interfaceC22369k0;
        long j12 = c22712b.f42843a;
        int iY02 = interfaceC22369k02.y0(this.f33863l);
        int i12 = iY02 * 2;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.i(0, i12, j12));
        return interfaceC22369k02.L0(k0I.f40345b, k0I.f40346c - i12, kotlin.collections.P0.c(), new C21274n7(k0I, iY02));
    }
}
