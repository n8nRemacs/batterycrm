package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kz0;
import java.io.UnsupportedEncodingException;

/* loaded from: classes8.dex */
public final class k71 extends qy0<String> {

    /* renamed from: p, reason: collision with root package name */
    private final Object f387068p;

    /* renamed from: q, reason: collision with root package name */
    @j.B
    @j.P
    private kz0.b<String> f387069q;

    public k71(String str, kz0.b bVar, @j.P kz0.a aVar) {
        super(0, str, aVar);
        this.f387068p = new Object();
        this.f387069q = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final void a(String str) {
        kz0.b<String> bVar;
        String str2 = str;
        synchronized (this.f387068p) {
            bVar = this.f387069q;
        }
        if (bVar != null) {
            bVar.a(str2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final void a() {
        super.a();
        synchronized (this.f387068p) {
            this.f387069q = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qy0
    public final kz0<String> a(zo0 zo0Var) {
        String str;
        try {
            str = new String(zo0Var.f392316b, j10.a(zo0Var.f392317c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(zo0Var.f392316b);
        }
        return kz0.a(str, j10.a(zo0Var));
    }
}
