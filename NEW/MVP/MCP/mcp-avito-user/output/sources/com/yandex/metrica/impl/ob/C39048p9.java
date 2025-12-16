package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.p9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39048p9 extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        If r02 = new If();
        r02.f378321k = new If.i();
        return r02;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (If) MessageNano.mergeFrom(new If(), bArr);
    }
}
