package com.avito.android.iac_outgoing_call_ability.impl_module.utils;

import Y61.k;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import java.io.Serializable;
import kotlin.Metadata;
import zL.InterfaceC50481a;

/* compiled from: ShowBusyToastIfNeeded.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-outgoing-call-ability_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {
    public static final boolean a(@k InterfaceC50481a interfaceC50481a, @k PK.a aVar, @k a.i iVar) {
        if (!interfaceC50481a.a().getValue().booleanValue() && !aVar.c()) {
            return false;
        }
        a.i.C4057a.d(iVar, com.avito.android.printable_text.b.c(R.string.iac_outgoing_call_ability_impl_iac_is_busy, new Serializable[0]), null, null, new f.c(new IacOrGsmIsBusyException()), 0, null, null, null, 2030);
        return true;
    }
}
