package com.avito.android.mnz_common.compose;

import androidx.compose.ui.semantics.F;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzSegmentedControl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.l<F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f197965l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f197966m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i12, Integer num) {
        super(1);
        this.f197965l = num;
        this.f197966m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(F f12) {
        F f13 = f12;
        Integer num = this.f197965l;
        androidx.compose.ui.semantics.C.t(f13, num != null && num.intValue() == this.f197966m);
        return G0.f406611a;
    }
}
