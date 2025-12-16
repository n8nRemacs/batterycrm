package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.n2;

/* compiled from: HostOverlayEnabler.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-adverts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {
    @Y61.l
    public static final Object a(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar, @Y61.k n2 n2Var, @Y61.k n2 n2Var2, @Y61.k n2 n2Var3, @Y61.k Continuation continuation) {
        Object objCollect = C43175k.r(new X(new k(C43175k.k(n2Var, n2Var2, n2Var3, new l(4, null))), new m(bVar, null))).collect(bVar, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
