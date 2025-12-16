package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.n9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38998n9 extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return new Ef();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (Ef) MessageNano.mergeFrom(new Ef(), bArr);
    }
}
