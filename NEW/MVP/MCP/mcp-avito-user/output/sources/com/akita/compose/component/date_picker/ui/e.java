package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.I3;
import androidx.compose.ui.graphics.E0;
import androidx.compose.ui.graphics.T;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DayItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.shape.n f61314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f61315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I3<T> f61316n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.compose.foundation.shape.n nVar, float f12, I3<T> i32) {
        super(1);
        this.f61314l = nVar;
        this.f61315m = f12;
        this.f61316n = i32;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        dVar2.y1();
        E0.b(dVar2, this.f61314l.a(dVar2.i(), dVar2.getLayoutDirection(), dVar2), this.f61316n.getF42167b().f39331a, new androidx.compose.ui.graphics.drawscope.o(dVar2.M0(this.f61315m), 0.0f, 0, 0, null, 30, null), 52);
        return G0.f406611a;
    }
}
