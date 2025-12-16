package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIActiveFallbackModal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f166963l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i12) {
        super(2);
        this.f166963l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f166963l | 1);
        B bE2 = a12.E(-808951008);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C43108m c43108mA = kotlinx.coroutines.channels.A.a(0, null, null, 7);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(92385317, new o(c43108mA, new r((T) objT, c43108mA)), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(iA2);
        }
        return G0.f406611a;
    }
}
