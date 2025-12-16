package com.avito.android.social.di;

import android.os.Bundle;
import com.avito.android.social.D;
import com.avito.android.social.H;
import com.avito.android.social.I;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35014f;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.SocialType;
import com.avito.android.social.X;
import com.avito.android.social.di.f;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: SocialActivityModule_ProvideSocialActivityPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35029v> f284359a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<X> f284360b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<S> f284361c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35017i> f284362d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35009a> f284363e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35014f> f284364f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35013e> f284365g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f284366h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f284367i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<C40806a> f284368j;

    public k(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider8) {
        this.f284359a = provider;
        this.f284360b = provider2;
        this.f284361c = provider3;
        this.f284362d = provider4;
        this.f284363e = provider5;
        this.f284364f = provider6;
        this.f284365g = provider7;
        this.f284366h = lVar;
        this.f284367i = lVar2;
        this.f284368j = provider8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        D d12;
        h31.e eVarB = dagger.internal.g.b(this.f284359a);
        h31.e eVarB2 = dagger.internal.g.b(this.f284360b);
        h31.e eVarB3 = dagger.internal.g.b(this.f284361c);
        h31.e eVarB4 = dagger.internal.g.b(this.f284362d);
        h31.e eVarB5 = dagger.internal.g.b(this.f284363e);
        h31.e eVarB6 = dagger.internal.g.b(this.f284364f);
        h31.e eVarB7 = dagger.internal.g.b(this.f284365g);
        SocialType socialType = (SocialType) this.f284366h.f393949a;
        Bundle bundle = (Bundle) this.f284367i.f393949a;
        C40806a c40806aR = ((f.c.b) this.f284368j).f284355a.R();
        j.f284358a.getClass();
        int iOrdinal = socialType.ordinal();
        if (iOrdinal == 0) {
            d12 = (D) eVarB4.get();
        } else if (iOrdinal != 3) {
            switch (iOrdinal) {
                case 5:
                    d12 = (D) eVarB2.get();
                    break;
                case 6:
                    if (!c40806aR.w().invoke().booleanValue()) {
                        d12 = (D) eVarB2.get();
                        break;
                    } else {
                        d12 = (D) eVarB3.get();
                        break;
                    }
                case 7:
                    d12 = (D) eVarB6.get();
                    break;
                case 8:
                    d12 = (D) eVarB5.get();
                    break;
                case 9:
                    d12 = (D) eVarB7.get();
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            d12 = (D) eVarB.get();
        }
        return new I(d12, bundle);
    }
}
