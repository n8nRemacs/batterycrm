package ru.avito.messenger.internal.di;

import m91.C43934a;
import m91.C43935b;
import m91.InterfaceC43936c;

/* compiled from: LoggerModule_ProvideLoggerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47816s implements dagger.internal.h<InterfaceC43936c> {

    /* renamed from: a, reason: collision with root package name */
    public final r f431666a;

    public C47816s(r rVar) {
        this.f431666a = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        r rVar = this.f431666a;
        InterfaceC43936c interfaceC43936c = rVar.f431665b;
        if (interfaceC43936c != null) {
            return interfaceC43936c;
        }
        new C43934a();
        int i12 = rVar.f431664a;
        return new C43935b();
    }
}
