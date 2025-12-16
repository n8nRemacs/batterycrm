package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateSerializer;

/* renamed from: com.yandex.metrica.impl.ob.ea, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38775ea {

    /* renamed from: a, reason: collision with root package name */
    private C39204vm f380467a;

    @j.k0
    public C38775ea(C39204vm c39204vm) {
        this.f380467a = c39204vm;
    }

    @j.N
    public ProtobufStateSerializer a() {
        return new C38898j9(new C38824g9(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    @j.N
    public ProtobufStateSerializer b() {
        return new C38898j9(new Z2(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    @j.N
    public ProtobufStateSerializer c() {
        return new C38898j9(new C38874i9(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    @j.N
    public ProtobufStateSerializer d() {
        return new C38898j9(new C38923k9(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    @j.N
    public ProtobufStateSerializer e() {
        return new C38898j9(new Zd(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    @j.N
    @Deprecated
    public ProtobufStateSerializer f() {
        return new C38898j9(new C38854he(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    public ProtobufStateSerializer g() {
        return new C38898j9(new C38973m9(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    @j.N
    public ProtobufStateSerializer h() {
        return new C38898j9(new C39023o9(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }

    public ProtobufStateSerializer i() {
        return new C38898j9(new C39048p9(), new C39228wm("AES/CBC/PKCS5Padding", this.f380467a.b(), this.f380467a.a()));
    }
}
