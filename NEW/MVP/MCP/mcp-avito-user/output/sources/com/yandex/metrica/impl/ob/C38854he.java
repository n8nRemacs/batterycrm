package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.Cf;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.he, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38854he extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return new Cf.a();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (Cf.a) MessageNano.mergeFrom(new Cf.a(), bArr);
    }
}
