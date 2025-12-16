package com.avito.android.publish.free_delivery.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.style.C27547l0;
import com.akita.compose.theme.re23.style.InterfaceC27532i0;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f235873l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a<G0> aVar) {
        super(3);
        this.f235873l = aVar;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        T1 t13 = t12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            v vVarH = R1.h(fillElement, t13);
            String strC = u0.i.c(a13, R.string.error_layout_unknown_error);
            String strC2 = u0.i.c(a13, R.string.error_layout_try_refresh_or_return_later);
            String strC3 = u0.i.c(a13, R.string.error_layout_refresh);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.content_placeholder.b.c(R.drawable.placeholders_ic_unknown_error_cat, strC, strC2, strC3, this.f235873l, vVarH, com.akita.compose.component.content_placeholder.d.a(((InterfaceC27532i0) a13.o(C27547l0.f66667b)).getF66097a(), null, 0.0f, null, com.akita.compose.theme.re23.b.c(a13).M(), 16127), 0L, null, null, false, false, a13, com.akita.compose.component.content_placeholder.d.f61096o << 18, 0, 3968);
        }
        return G0.f406611a;
    }
}
