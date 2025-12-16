package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufConverter;

/* loaded from: classes7.dex */
public class O6<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ProtobufConverter f379030a;

    public O6(@j.N ProtobufConverter protobufConverter) {
        this.f379030a = protobufConverter;
    }

    @j.N
    public byte[] a(@j.N T t12) {
        return MessageNano.toByteArray((MessageNano) this.f379030a.fromModel(t12));
    }
}
