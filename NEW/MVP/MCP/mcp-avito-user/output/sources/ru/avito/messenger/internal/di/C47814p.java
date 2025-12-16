package ru.avito.messenger.internal.di;

import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import javax.inject.Provider;
import ru.avito.messenger.C0;
import ru.avito.messenger.InterfaceC47728a0;
import ru.avito.messenger.internal.C47745a;
import ru.avito.messenger.internal.C47747c;

/* compiled from: ImageUploadModule_ProvideImageUploadApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47814p implements dagger.internal.h<InterfaceC47728a0> {

    /* renamed from: a, reason: collision with root package name */
    public final C47813o f431657a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431658b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C47745a> f431659c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Gson> f431660d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f431661e;

    public C47814p(C47813o c47813o, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f431657a = c47813o;
        this.f431658b = uVar;
        this.f431659c = provider;
        this.f431660d = provider2;
        this.f431661e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f431658b));
        C47745a c47745a = this.f431659c.get();
        Gson gson = this.f431660d.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f431661e.get();
        C47813o c47813o = this.f431657a;
        c47813o.getClass();
        C47747c c47747c = c47813o.f431656a;
        C0 c02 = c47745a.f431221n;
        String str = c47747c.f431237c;
        return new ru.avito.messenger.internal.I(eVarA, c47747c.f431235a, c47747c.f431238d, c02, c47747c.f431236b, str, gson, interfaceC35745a5);
    }
}
