package Lg0;

import Mg0.InterfaceC14487a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingPublishInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: Lg0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14396c implements h<C14395b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f10083a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f10084b;

    public C14396c(Provider<InterfaceC14487a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f10083a = provider;
        this.f10084b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C14395b(this.f10083a.get(), this.f10084b.get());
    }
}
