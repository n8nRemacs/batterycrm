package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

/* renamed from: com.yandex.metrica.impl.ob.g9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38824g9 extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object defaultValue() {
        return new C39221wf();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    @j.N
    public Object toState(@j.N byte[] bArr) {
        return (C39221wf) MessageNano.mergeFrom(new C39221wf(), bArr);
    }
}
