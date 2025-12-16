package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

/* loaded from: classes7.dex */
public class Z2 extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return new C39245xf();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (C39245xf) MessageNano.mergeFrom(new C39245xf(), bArr);
    }
}
