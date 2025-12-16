package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

/* loaded from: classes7.dex */
public class P5 extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return new Af();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (Af) MessageNano.mergeFrom(new Af(), bArr);
    }
}
