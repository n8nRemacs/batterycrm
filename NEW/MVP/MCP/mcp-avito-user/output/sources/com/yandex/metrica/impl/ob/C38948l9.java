package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.core.api.ProtobufStateStorage;

/* renamed from: com.yandex.metrica.impl.ob.l9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38948l9 implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f380956a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final R7 f380957b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ProtobufStateSerializer f380958c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ProtobufConverter f380959d;

    public C38948l9(@j.N String str, @j.N R7 r72, @j.N ProtobufStateSerializer protobufStateSerializer, @j.N ProtobufConverter protobufConverter) {
        this.f380956a = str;
        this.f380957b = r72;
        this.f380958c = protobufStateSerializer;
        this.f380959d = protobufConverter;
    }

    @Override // com.yandex.metrica.core.api.ProtobufStateStorage
    public void delete() {
        this.f380957b.b(this.f380956a);
    }

    @Override // com.yandex.metrica.core.api.ProtobufStateStorage
    @j.N
    public Object read() {
        try {
            byte[] bArrA = this.f380957b.a(this.f380956a);
            return A2.a(bArrA) ? this.f380959d.toModel(this.f380958c.defaultValue()) : this.f380959d.toModel(this.f380958c.toState(bArrA));
        } catch (Throwable unused) {
            return this.f380959d.toModel(this.f380958c.defaultValue());
        }
    }

    @Override // com.yandex.metrica.core.api.ProtobufStateStorage
    public void save(@j.N Object obj) {
        this.f380957b.a(this.f380956a, this.f380958c.toByteArray(this.f380959d.fromModel(obj)));
    }
}
