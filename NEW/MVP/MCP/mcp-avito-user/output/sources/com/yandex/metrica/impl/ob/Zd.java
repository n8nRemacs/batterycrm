package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

/* loaded from: classes7.dex */
public class Zd extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return new Cf();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (Cf) MessageNano.mergeFrom(new Cf(), bArr);
    }
}
