package com.avito.android.replace_main.onboarding.view;

import Cm0.C13324a;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.modal.ModalButtonsOrientation;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;

/* compiled from: ReplaceMainOnboardingContent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isLoading", "_avito_replace-main_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k p pVar, @Y61.k n2 n2Var, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-943611872);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        C13324a c13324a = (C13324a) C22126m3.b(n2Var, bE2).getF42167b();
        if (c13324a != null) {
            C22187u0.d(new g(pVar, null), bE2, c13324a);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            T t12 = (T) objT;
            bE2.C(1664419336);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22126m3.g(Boolean.FALSE);
                bE2.H(objT2);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
            bE2.X(false);
            androidx.compose.ui.v vVarA = C22501m2.a(aVar3, "replace_main_modal");
            ModalButtonsOrientation modalButtonsOrientation = ModalButtonsOrientation.f62005b;
            com.akita.compose.component.modal.B.d(aVar, vVarA, null, null, null, null, androidx.compose.runtime.internal.r.c(-454284822, new k(c13324a, aVar2, aVar, lVar, interfaceC22204y1, pVar, t12), bE2), null, null, true, false, null, bE2, ((i12 >> 6) & 14) | 12607488);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(pVar, n2Var, aVar, aVar2, lVar, aVar3, i12);
        }
    }
}
