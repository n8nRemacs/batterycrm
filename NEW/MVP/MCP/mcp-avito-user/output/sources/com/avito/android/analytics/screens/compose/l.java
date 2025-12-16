package com.avito.android.analytics.screens.compose;

import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import androidx.view.T0;
import androidx.view.compose.C23005G;
import com.avito.android.categories_global.CategoriesScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenMetadata.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics-screens-compose_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {
    @InterfaceC22132o
    @Y61.k
    public static final g a(@Y61.k CategoriesScreen categoriesScreen, @Y61.l A a12) {
        a12.C(-2110140630);
        k kVar = new k((Context) a12.o(AndroidCompositionLocals_androidKt.f41069b), categoriesScreen, (InterfaceC22983P) a12.o(C23005G.f46734a));
        a12.I(867952201);
        androidx.view.viewmodel.compose.a.f46897a.getClass();
        T0 t0A = androidx.view.viewmodel.compose.a.a(a12);
        if (t0A == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        Cd.r rVar = new Cd.r((InterfaceC23487e) a12.o(AndroidCompositionLocals_androidKt.f41072e), new i(kVar));
        a12.I(-171344648);
        a12.I(-1080049490);
        a12.O();
        M0 m0A = androidx.view.viewmodel.compose.j.a(h.class, t0A, null, rVar, null, a12, 16);
        a12.O();
        a12.O();
        a12.h();
        return ((h) m0A).f90580E;
    }
}
