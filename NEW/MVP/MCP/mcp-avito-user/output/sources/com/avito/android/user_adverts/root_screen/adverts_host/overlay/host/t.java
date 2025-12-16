package com.avito.android.user_adverts.root_screen.adverts_host.overlay.host;

import II0.d;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: PanelConfigOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-adverts_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t {
    @Y61.l
    public static final Object a(@Y61.k n2 n2Var, @Y61.k n2 n2Var2, @Y61.k InterfaceC43172j interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = C43175k.H(n2Var, n2Var2, new r(4, null)).collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    public static final d.a b(d.a aVar) {
        d.a.b bVarA = II0.e.a(aVar);
        return bVarA == null ? aVar : d.a.b.a(bVarA, null, 1535);
    }

    public static final d.a c(d.a aVar) {
        d.a.b bVarA = II0.e.a(aVar);
        if (bVarA == null) {
            return aVar;
        }
        PanelConfigItem.a aVar2 = bVarA.f8108c;
        return d.a.b.a(bVarA, aVar2 != null ? PanelConfigItem.a.a(aVar2) : null, 2043);
    }

    public static final d.a d(d.a aVar) {
        d.a.b bVarA = II0.e.a(aVar);
        return bVarA == null ? aVar : d.a.b.a(bVarA, null, 1023);
    }

    @Y61.k
    public static final InterfaceC43160i e(@Y61.k n2 n2Var, @Y61.k InterfaceC43160i interfaceC43160i) {
        return C43175k.r(com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.a.a(n2Var, interfaceC43160i, new s(3, null)));
    }
}
