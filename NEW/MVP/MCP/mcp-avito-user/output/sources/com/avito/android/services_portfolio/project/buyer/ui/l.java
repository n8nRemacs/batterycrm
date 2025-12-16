package com.avito.android.services_portfolio.project.buyer.ui;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20620t;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.runtime.A;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.unit.h;
import com.avito.android.remote.model.Image;
import iv0.AbstractC42117c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyGridDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/X;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/grid/p", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class l extends N implements Y41.r<X, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f280093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l f280094m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f280095n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC42117c.b f280096o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, Y41.l lVar, List list2, AbstractC42117c.b bVar) {
        super(4);
        this.f280093l = list;
        this.f280094m = lVar;
        this.f280095n = list2;
        this.f280096o = bVar;
    }

    @Override // Y41.r
    public final G0 invoke(X x12, Integer num, A a12, Integer num2) {
        int i12;
        X x13 = x12;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(x13) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            Image image = (Image) this.f280093l.get(iIntValue);
            a13.C(-851976801);
            Object objF = C42745f0.F(image.getVariants().values());
            androidx.compose.ui.v vVarA = C20620t.a(androidx.compose.ui.v.f42878y1, 1.0f, false);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarC = C21086w0.c(C20588k2.o(androidx.compose.ui.draw.k.a(vVarA, androidx.compose.foundation.shape.o.a(16)), 175), false, null, null, new g(this.f280094m, this.f280095n, image, this.f280096o), 7);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            androidx.compose.ui.graphics.painter.d dVar = new androidx.compose.ui.graphics.painter.d(com.akita.compose.theme.re23.b.f63984b.f63909b0.c(a13), null);
            InterfaceC22374n.f40491a.getClass();
            coil.compose.v.a(objF, null, vVarC, dVar, null, null, null, null, null, null, InterfaceC22374n.a.f40493b, null, a13, 4152, 6, 64496);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
