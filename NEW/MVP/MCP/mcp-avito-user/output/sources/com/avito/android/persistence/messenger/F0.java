package com.avito.android.persistence.messenger;

import io.reactivex.rxjava3.internal.operators.completable.C41826q;

/* compiled from: DbPurgeDao_Impl.java */
/* loaded from: classes15.dex */
public final class F0 implements InterfaceC33130w0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215168a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.O0 f215169b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.O0 f215170c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.O0 f215171d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.O0 f215172e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.O0 f215173f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.room.O0 f215174g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.room.O0 f215175h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.room.O0 f215176i;

    public F0(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215168a = messengerDatabase_Impl;
        this.f215169b = new C33134x0(messengerDatabase_Impl);
        this.f215170c = new C33138y0(messengerDatabase_Impl);
        this.f215171d = new C33142z0(messengerDatabase_Impl);
        this.f215172e = new A0(messengerDatabase_Impl);
        this.f215173f = new B0(messengerDatabase_Impl);
        this.f215174g = new C0(messengerDatabase_Impl);
        this.f215175h = new D0(messengerDatabase_Impl);
        this.f215176i = new E0(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33130w0
    public final C41826q a(String str) {
        return new C41826q(new GL.a(16, this, str));
    }
}
