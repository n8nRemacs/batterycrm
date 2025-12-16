package com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIWaitBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f167463l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i12) {
        super(2);
        this.f167463l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167463l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1192189754);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C43108m c43108mA = kotlinx.coroutines.channels.A.a(0, null, null, 7);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-172719809, new w(c43108mA, new z((T) objT, c43108mA)), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new x(iA2);
        }
        return G0.f406611a;
    }
}
