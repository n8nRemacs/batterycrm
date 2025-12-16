package com.avito.android.social_management.di;

import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.X;
import com.avito.android.social_management.di.b;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: SocialManagementModule_ProvideConnectableSocialManagers$_avito_social_network_editor_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<List<D>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35029v> f284649a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X> f284650b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S> f284651c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35013e> f284652d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C40806a> f284653e;

    public i(Provider<InterfaceC35029v> provider, Provider<X> provider2, Provider<S> provider3, Provider<InterfaceC35013e> provider4, Provider<C40806a> provider5) {
        this.f284649a = provider;
        this.f284650b = provider2;
        this.f284651c = provider3;
        this.f284652d = provider4;
        this.f284653e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35029v interfaceC35029v = this.f284649a.get();
        h31.e eVarB = dagger.internal.g.b(this.f284650b);
        h31.e eVarB2 = dagger.internal.g.b(this.f284651c);
        h31.e eVarB3 = dagger.internal.g.b(this.f284652d);
        C40806a c40806aR = ((b.c.C8509c) this.f284653e).f284636a.R();
        g.f284647a.getClass();
        D d12 = (D) (c40806aR.w().invoke().booleanValue() ? eVarB2.get() : eVarB.get());
        if (!c40806aR.v().invoke().booleanValue()) {
            eVarB3 = null;
        }
        return new ArrayList(C42756l.B(new D[]{d12, interfaceC35029v, eVarB3 != null ? (InterfaceC35013e) eVarB3.get() : null}));
    }
}
