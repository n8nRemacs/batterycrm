package com.avito.beduin.v2.render.compose;

import androidx.compose.foundation.text.selection.C21030p;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecompositionModifiers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class C extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long[] f338033l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Long> f338034m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Long[] lArr, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f338033l = lArr;
        this.f338034m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        dVar.y1();
        long jLongValue = this.f338033l[0].longValue() - this.f338034m.getF42167b().longValue();
        if (jLongValue > 0) {
            System.out.println((Object) C21030p.a(jLongValue, "recompositionCounter: null - "));
        }
        return G0.f406611a;
    }
}
