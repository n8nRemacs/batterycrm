package Ir;

import com.avito.android.H0;
import com.avito.android.cookie_provider.f;
import com.avito.android.remote.interceptor.F0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.InterfaceC34273b0;
import com.avito.android.remote.interceptor.InterfaceC34319z;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.remote.l1;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: CookieProviderModule_ProvideCookieProvider$_avito_cookie_provider_implFactory.java */
@e
@y
@x
/* renamed from: Ir.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14150b implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f8564a;

    /* renamed from: b, reason: collision with root package name */
    public final u f8565b;

    /* renamed from: c, reason: collision with root package name */
    public final u f8566c;

    /* renamed from: d, reason: collision with root package name */
    public final u f8567d;

    /* renamed from: e, reason: collision with root package name */
    public final u f8568e;

    /* renamed from: f, reason: collision with root package name */
    public final u f8569f;

    /* renamed from: g, reason: collision with root package name */
    public final u f8570g;

    /* renamed from: h, reason: collision with root package name */
    public final u f8571h;

    /* renamed from: i, reason: collision with root package name */
    public final u f8572i;

    /* renamed from: j, reason: collision with root package name */
    public final u f8573j;

    public C14150b(u uVar, u uVar2, u uVar3, u uVar4, u uVar5, u uVar6, u uVar7, u uVar8, u uVar9, u uVar10) {
        this.f8564a = uVar;
        this.f8565b = uVar2;
        this.f8566c = uVar3;
        this.f8567d = uVar4;
        this.f8568e = uVar5;
        this.f8569f = uVar6;
        this.f8570g = uVar7;
        this.f8571h = uVar8;
        this.f8572i = uVar9;
        this.f8573j = uVar10;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34273b0 interfaceC34273b0 = (InterfaceC34273b0) this.f8564a.get();
        F0 f02 = (F0) this.f8565b.get();
        InterfaceC34319z interfaceC34319z = (InterfaceC34319z) this.f8566c.get();
        I i12 = (I) this.f8567d.get();
        l1 l1Var = (l1) this.f8568e.get();
        U0 u02 = (U0) this.f8569f.get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) this.f8570g.get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f8571h.get();
        C c12 = (C) this.f8572i.get();
        H0 h02 = (H0) this.f8573j.get();
        int i13 = C14149a.f8563a;
        return new f(C42745f0.U(interfaceC34273b0, f02, interfaceC34319z, i12, l1Var, u02, interfaceC47681a), bVar, c12, h02);
    }
}
