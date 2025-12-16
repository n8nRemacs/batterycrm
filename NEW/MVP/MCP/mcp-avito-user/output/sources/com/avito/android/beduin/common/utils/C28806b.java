package com.avito.android.beduin.common.utils;

import Ui.InterfaceC15523b;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinActions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.utils.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28806b {
    public static final void a(@Y61.k InterfaceC15523b interfaceC15523b, @Y61.k List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            interfaceC15523b.o((BeduinAction) it.next());
        }
    }
}
