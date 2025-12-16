package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInsetsPadding.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/t1;", "Landroidx/compose/ui/modifier/d;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/foundation/layout/x2;", "<init>", "()V", "Landroidx/compose/foundation/layout/U1;", "Landroidx/compose/foundation/layout/t2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC20622t1 implements androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.m<InterfaceC20639x2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28740b;

    public /* synthetic */ AbstractC20622t1(C42822w c42822w) {
        this();
    }

    @Override // androidx.compose.ui.modifier.d
    public final void Q1(@Y61.k androidx.compose.ui.modifier.q qVar) {
        ((C22082i3) this.f28740b).setValue(a((InterfaceC20639x2) qVar.G(N2.f28440a)));
    }

    @Y61.k
    public abstract InterfaceC20639x2 a(@Y61.k InterfaceC20639x2 interfaceC20639x2);

    @Override // androidx.compose.ui.modifier.m
    @Y61.k
    public final androidx.compose.ui.modifier.s<InterfaceC20639x2> getKey() {
        return N2.f28440a;
    }

    @Override // androidx.compose.ui.modifier.m
    public final InterfaceC20639x2 getValue() {
        return (InterfaceC20639x2) ((C22082i3) this.f28740b).getF42167b();
    }

    public AbstractC20622t1() {
        this.f28740b = C22126m3.g(new C20641y0());
    }
}
