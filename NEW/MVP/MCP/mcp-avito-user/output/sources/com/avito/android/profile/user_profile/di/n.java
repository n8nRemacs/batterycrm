package com.avito.android.profile.user_profile.di;

import com.avito.android.profile.user_profile.di.C33370a;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35025q;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.X;
import hD.C40806a;
import java.util.Arrays;
import javax.inject.Provider;
import kotlin.collections.b1;

/* compiled from: UserProfileModule_ProvideLogoutable$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<InterfaceC35025q> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226109a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35017i> f226110b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35029v> f226111c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<X> f226112d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f226113e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C40806a> f226114f;

    public n(f fVar, Provider provider, Provider provider2, Provider provider3, dagger.internal.u uVar, Provider provider4) {
        this.f226109a = fVar;
        this.f226110b = provider;
        this.f226111c = provider2;
        this.f226112d = provider3;
        this.f226113e = uVar;
        this.f226114f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35017i interfaceC35017i = this.f226110b.get();
        InterfaceC35029v interfaceC35029v = this.f226111c.get();
        X x12 = this.f226112d.get();
        S s5 = (S) this.f226113e.get();
        C40806a c40806aR = ((C33370a.c.C33378j) this.f226114f).f226070a.R();
        this.f226109a.getClass();
        if (!c40806aR.w().invoke().booleanValue()) {
            s5 = null;
        }
        D[] dArr = (D[]) b1.l(interfaceC35017i, interfaceC35029v, x12, s5).toArray(new D[0]);
        return new com.avito.android.social.r((D[]) Arrays.copyOf(dArr, dArr.length));
    }
}
