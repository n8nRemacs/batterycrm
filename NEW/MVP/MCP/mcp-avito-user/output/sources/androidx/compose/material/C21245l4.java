package androidx.compose.material;

import androidx.compose.material.internal.p;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21245l4 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        p.a.f33687a.getClass();
        if (p.a.f33688b == null) {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            C22293d.a aVar2 = new C22293d.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            C42784z0 c42784z0 = androidx.compose.ui.graphics.vector.U.f39811a;
            androidx.compose.ui.graphics.T.f39320b.getClass();
            androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(androidx.compose.ui.graphics.T.f39321c, null);
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            androidx.compose.ui.graphics.n1.f39707b.getClass();
            int i12 = androidx.compose.ui.graphics.n1.f39709d;
            C22295f c22295f = new C22295f();
            c22295f.j(7.0f, 10.0f);
            c22295f.i(5.0f, 5.0f);
            c22295f.i(5.0f, -5.0f);
            c22295f.c();
            C22293d.a.c(aVar2, c22295f.f39885a, 0, k1Var, 1.0f, null, 1.0f, 1.0f, 0, i12, 1.0f, 14336);
            p.a.f33688b = aVar2.d();
        }
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        throw null;
    }
}
