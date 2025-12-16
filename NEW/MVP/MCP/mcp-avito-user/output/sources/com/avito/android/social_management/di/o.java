package com.avito.android.social_management.di;

import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.X;
import com.avito.android.social_management.di.b;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: SocialManagementModule_ProvideRemovableSocialManagers$_avito_social_network_editor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<List<D>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35029v> f284663a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X> f284664b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35017i> f284665c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35009a> f284666d;

    /* renamed from: e, reason: collision with root package name */
    public final u f284667e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35013e> f284668f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<C40806a> f284669g;

    public o(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f284663a = provider;
        this.f284664b = provider2;
        this.f284665c = provider3;
        this.f284666d = provider4;
        this.f284667e = uVar;
        this.f284668f = provider5;
        this.f284669g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35029v interfaceC35029v = this.f284663a.get();
        X x12 = this.f284664b.get();
        InterfaceC35017i interfaceC35017i = this.f284665c.get();
        InterfaceC35009a interfaceC35009a = this.f284666d.get();
        S s5 = (S) this.f284667e.get();
        h31.e eVarA = dagger.internal.g.a(w.a(this.f284668f));
        C40806a c40806aR = ((b.c.C8509c) this.f284669g).f284636a.R();
        g.f284647a.getClass();
        if (!interfaceC35017i.b()) {
            interfaceC35017i = null;
        }
        if (!c40806aR.v().invoke().booleanValue()) {
            eVarA = null;
        }
        return new ArrayList(C42756l.B(new D[]{x12, s5, interfaceC35029v, interfaceC35009a, interfaceC35017i, eVarA != null ? (InterfaceC35013e) eVarA.get() : null}));
    }
}
