package com.avito.android.beduin_items.item;

import Y61.k;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.beduin_shared.model.utils.m;
import gj.InterfaceC40691b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: BeduinItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-items_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {
    @k
    public static final a a(@k InterfaceC40691b interfaceC40691b, @k BeduinForm beduinForm) {
        InterfaceC43779a interfaceC43779aJ = interfaceC40691b.getF103565k().get(beduinForm.getF105312b());
        if (interfaceC43779aJ == null) {
            interfaceC43779aJ = interfaceC40691b.j();
            m.b(interfaceC43779aJ, beduinForm);
        }
        return new a(beduinForm.getF105312b(), interfaceC43779aJ.getF103348p(), interfaceC40691b.B0());
    }
}
