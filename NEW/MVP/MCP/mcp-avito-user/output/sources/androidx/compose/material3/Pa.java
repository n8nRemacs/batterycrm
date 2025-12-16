package androidx.compose.material3;

import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.layout.C20632w;
import kotlin.Metadata;

/* compiled from: NavigationBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Pa extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarB = androidx.compose.ui.layout.C.b(androidx.compose.ui.v.f42878y1, "indicatorRipple");
            d0.H.f393179a.getClass();
            C20632w.a(C20839s1.a(androidx.compose.ui.draw.k.a(vVarB, He.a(d0.H.f393181c, a13)), null, androidx.compose.material.ripple.w.a(false, 0.0f, 0L, a13, 0, 7)), a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
