package com.avito.android.navigation.compose;

import Cd.r;
import Y41.l;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import androidx.view.T0;
import androidx.view.viewmodel.compose.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DaggerComponentHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_navigation-compose_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h {
    @InterfaceC22132o
    @k
    public static final Ac.b a(@k l lVar, @Y61.l A a12) {
        a12.C(-580742599);
        g gVar = new g((Context) a12.o(AndroidCompositionLocals_androidKt.f41069b), lVar);
        a12.I(867952201);
        androidx.view.viewmodel.compose.a.f46897a.getClass();
        T0 t0A = androidx.view.viewmodel.compose.a.a(a12);
        if (t0A == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        r rVar = new r((InterfaceC23487e) a12.o(AndroidCompositionLocals_androidKt.f41072e), new f(gVar));
        a12.I(-171344648);
        a12.I(-1080049490);
        a12.O();
        M0 m0A = j.a(e.class, t0A, null, rVar, null, a12, 16);
        a12.O();
        a12.O();
        a12.h();
        return ((e) m0A).f207198E;
    }
}
