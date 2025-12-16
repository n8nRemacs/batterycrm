package com.avito.android.authorization.auth.di;

import com.avito.android.authorization.auth.di.l;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35014f;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.X;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: AuthModule_ProvideSocialManagersMapFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<Map<String, D>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35029v> f92934a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X> f92935b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S> f92936c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35017i> f92937d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35009a> f92938e;

    /* renamed from: f, reason: collision with root package name */
    public final u f92939f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35013e> f92940g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C40806a> f92941h;

    public g(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f92934a = provider;
        this.f92935b = provider2;
        this.f92936c = provider3;
        this.f92937d = provider4;
        this.f92938e = provider5;
        this.f92939f = uVar;
        this.f92940g = provider6;
        this.f92941h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35029v interfaceC35029v = this.f92934a.get();
        X x12 = this.f92935b.get();
        S s5 = this.f92936c.get();
        InterfaceC35017i interfaceC35017i = this.f92937d.get();
        InterfaceC35009a interfaceC35009a = this.f92938e.get();
        InterfaceC35014f interfaceC35014f = (InterfaceC35014f) this.f92939f.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f92940g));
        C40806a c40806aR = ((l.b.e) this.f92941h).f92989a.R();
        d.f92931a.getClass();
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("apple", interfaceC35009a);
        dVar.put("ok", interfaceC35029v);
        dVar.put("vk-id", s5);
        dVar.put("vk", x12);
        dVar.put("esia-id", interfaceC35014f);
        if (interfaceC35017i.b()) {
            dVar.put("gp", interfaceC35017i);
        }
        if (c40806aR.v().invoke().booleanValue()) {
            dVar.put("avitofake", eVarA.get());
        }
        return dVar.b();
    }
}
