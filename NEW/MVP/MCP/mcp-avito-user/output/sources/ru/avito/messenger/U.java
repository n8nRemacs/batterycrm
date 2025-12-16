package ru.avito.messenger;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.ab_tests.configs.MessengerApicoCreateItemChannelTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetChannelByIdTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoGetUsersTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoHistoryTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoReadChatsTestGroup;
import com.avito.android.ab_tests.configs.MessengerApicoSendTextMessageTestGroup;
import h91.C40785a;
import h91.C40788d;
import h91.C40790f;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: MessengerClientFacadeImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class U implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f430707a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Z81.a> f430708b;

    /* renamed from: c, reason: collision with root package name */
    public final C30713g1 f430709c;

    /* renamed from: d, reason: collision with root package name */
    public final ur.e f430710d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C40788d> f430711e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<h91.h> f430712f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<h91.j> f430713g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C40785a> f430714h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<h91.n> f430715i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<C40790f> f430716j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<u3.g<MessengerApicoGetChannelByIdTestGroup>> f430717k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<u3.g<MessengerApicoCreateItemChannelTestGroup>> f430718l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<u3.g<MessengerApicoHistoryTestGroup>> f430719m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<u3.g<MessengerApicoGetUsersTestGroup>> f430720n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<u3.g<MessengerApicoSendTextMessageTestGroup>> f430721o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<u3.g<MessengerApicoReadChatsTestGroup>> f430722p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.u f430723q;

    public U(dagger.internal.f fVar, Provider provider, C30713g1 c30713g1, ur.e eVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, dagger.internal.u uVar) {
        this.f430707a = fVar;
        this.f430708b = provider;
        this.f430709c = c30713g1;
        this.f430710d = eVar;
        this.f430711e = provider2;
        this.f430712f = provider3;
        this.f430713g = provider4;
        this.f430714h = provider5;
        this.f430715i = provider6;
        this.f430716j = provider7;
        this.f430717k = provider8;
        this.f430718l = provider9;
        this.f430719m = provider10;
        this.f430720n = provider11;
        this.f430721o = provider12;
        this.f430722p = provider13;
        this.f430723q = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D((InterfaceC47842z) this.f430707a.get(), dagger.internal.g.b(this.f430708b), (C30277e1) this.f430709c.get(), (InterfaceC49101b) this.f430710d.get(), dagger.internal.g.b(this.f430711e), dagger.internal.g.b(this.f430712f), dagger.internal.g.b(this.f430713g), dagger.internal.g.b(this.f430714h), dagger.internal.g.b(this.f430715i), dagger.internal.g.b(this.f430716j), this.f430717k.get(), this.f430718l.get(), this.f430719m.get(), this.f430720n.get(), this.f430721o.get(), this.f430722p.get(), (u3.g) this.f430723q.get());
    }
}
