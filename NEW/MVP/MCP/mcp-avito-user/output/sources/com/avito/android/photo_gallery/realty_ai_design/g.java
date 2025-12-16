package com.avito.android.photo_gallery.realty_ai_design;

import androidx.compose.foundation.H;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComparisonSlider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f217615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC22196w1 interfaceC22196w1) {
        super(1);
        this.f217615l = interfaceC22196w1;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        float fE2 = this.f217615l.e();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.i() & 4294967295L));
        S.f39317b.getClass();
        int i12 = S.f39318c;
        a.b f39478c = dVar2.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            f39478c.f39485a.b(0.0f, 0.0f, fE2, fIntBitsToFloat, i12);
            dVar2.y1();
            H.C(f39478c, jE2);
            return G0.f406611a;
        } catch (Throwable th2) {
            H.C(f39478c, jE2);
            throw th2;
        }
    }
}
