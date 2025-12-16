package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;

/* renamed from: com.yandex.metrica.impl.ob.i9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38874i9 extends AbstractC38849h9 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    public Object defaultValue() {
        return new C39269yf();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38849h9, com.yandex.metrica.core.api.StateSerializer
    public Object toState(byte[] bArr) {
        return (C39269yf) MessageNano.mergeFrom(new C39269yf(), bArr);
    }
}
