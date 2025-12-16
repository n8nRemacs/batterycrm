package com.avito.android.preloading.coroutines.mvi;

import androidx.view.S0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.preloading.coroutines.o;
import com.avito.android.util.C;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.U;

/* compiled from: BootstrapPreloadable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_preloading-promise"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    public static com.avito.android.arch.mvi.b a(Y41.a aVar, C c12, boolean z12, S0 s02, InterfaceC28373a interfaceC28373a, String str, int i12) {
        return new d(o.a((i12 & 64) != 0 ? "SingleBootstrap" : "MapBootstrapKey", s02, new b(aVar, U.a(EmptyCoroutineContext.INSTANCE), c12, z12, interfaceC28373a, str)));
    }
}
