package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38875ia implements R7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final R7 f380773a;

    public C38875ia(@j.N Context context, @j.N W7 w72, @j.N R7 r72) {
        this.f380773a = r72;
    }

    @Override // com.yandex.metrica.impl.ob.R7
    public void a(@j.N String str, @j.N byte[] bArr) {
        this.f380773a.a(str, bArr);
    }

    @Override // com.yandex.metrica.impl.ob.R7
    public void b(@j.N String str) {
        this.f380773a.b(str);
    }

    @Override // com.yandex.metrica.impl.ob.R7
    public byte[] a(@j.N String str) {
        return this.f380773a.a(str);
    }
}
