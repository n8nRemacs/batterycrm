package Pl;

import Nl.InterfaceC14584a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendDraftToAutoC2CTRXInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Pl.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14802c implements h<C14801b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14584a> f13266a;

    public C14802c(Provider<InterfaceC14584a> provider) {
        this.f13266a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14801b(this.f13266a.get());
    }
}
