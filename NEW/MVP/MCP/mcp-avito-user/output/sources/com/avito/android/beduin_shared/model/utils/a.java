package com.avito.android.beduin_shared.model.utils;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinActionHandlers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    public static final void a(@Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.l List<? extends BeduinAction> list) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                interfaceC15523b.o((BeduinAction) it.next());
            }
        }
    }
}
