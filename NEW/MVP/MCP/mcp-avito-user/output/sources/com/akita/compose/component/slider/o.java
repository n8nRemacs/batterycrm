package com.akita.compose.component.slider;

import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.F;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.l<F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f62732l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f62733m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z12, q qVar) {
        super(1);
        this.f62732l = z12;
        this.f62733m = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(F f12) {
        F f13 = f12;
        if (!this.f62732l) {
            C.c(f13);
        }
        C.q(f13, new n(this.f62733m));
        return G0.f406611a;
    }
}
