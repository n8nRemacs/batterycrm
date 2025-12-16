package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: SelectionManager.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/l;", "size", "Lkotlin/G0;", "invoke-EaSLcWc", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class S0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.unit.l, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f31866l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f31867m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(androidx.compose.ui.unit.d dVar, InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1) {
        super(1);
        this.f31866l = dVar;
        this.f31867m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.unit.l lVar) {
        float fD2 = androidx.compose.ui.unit.l.d(lVar.f42861a);
        androidx.compose.ui.unit.d dVar = this.f31866l;
        this.f31867m.setValue(androidx.compose.ui.unit.u.a((dVar.y0(fD2) << 32) | (dVar.y0(androidx.compose.ui.unit.l.c(r0)) & 4294967295L)));
        return kotlin.G0.f406611a;
    }
}
