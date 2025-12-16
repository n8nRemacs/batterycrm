package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

/* renamed from: com.yandex.metrica.impl.ob.zm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39300zm implements RequestBodyEncrypter {

    /* renamed from: a, reason: collision with root package name */
    private C39276ym f382335a;

    public C39300zm() {
        this(new C39276ym());
    }

    @Override // com.yandex.metrica.networktasks.api.RequestBodyEncrypter
    @j.P
    public byte[] encrypt(@j.P byte[] bArr) {
        return this.f382335a.a(bArr);
    }

    @Override // com.yandex.metrica.networktasks.api.RequestBodyEncrypter
    @j.N
    public RequestBodyEncryptionMode getEncryptionMode() {
        return RequestBodyEncryptionMode.f382428b;
    }

    @j.k0
    public C39300zm(C39276ym c39276ym) {
        this.f382335a = c39276ym;
    }
}
