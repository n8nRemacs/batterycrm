package com.avito.android.feedback_adverts;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: FeedbackAdvertsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f157840a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f157841b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f157842c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f157843d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f157844e;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f157840a = provider;
        this.f157841b = provider2;
        this.f157842c = lVar;
        this.f157843d = lVar2;
        this.f157844e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f157840a.get(), this.f157841b.get(), (String) this.f157842c.f393949a, (String) this.f157843d.f393949a, (com.avito.android.mvi.rx3.with_monolithic_state.t) this.f157844e.get());
    }
}
