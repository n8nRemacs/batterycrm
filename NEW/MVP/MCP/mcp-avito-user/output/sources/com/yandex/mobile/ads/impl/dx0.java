package com.yandex.mobile.ads.impl;

import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes8.dex */
final class dx0 extends kotlin.jvm.internal.N implements Y41.a<List<? extends Certificate>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ki f384709a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cz f384710b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r7 f384711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(ki kiVar, cz czVar, r7 r7Var) {
        super(0);
        this.f384709a = kiVar;
        this.f384710b = czVar;
        this.f384711c = r7Var;
    }

    @Override // Y41.a
    public final List<? extends Certificate> invoke() {
        return this.f384709a.a().a(this.f384711c.k().g(), this.f384710b.c());
    }
}
