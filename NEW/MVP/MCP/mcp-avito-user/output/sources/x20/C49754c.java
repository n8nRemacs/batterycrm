package x20;

import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import com.avito.android.multi_message_send.di.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import z20.C50359a;

/* compiled from: MultiMessageSendAbTestProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: x20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49754c implements h<C49753b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f442135a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27642e> f442136b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f442137c;

    public C49754c(l lVar, Provider provider, e0 e0Var) {
        this.f442135a = lVar;
        this.f442136b = provider;
        this.f442137c = e0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49753b((C50359a) this.f442135a.get(), this.f442136b.get(), (c0) this.f442137c.get());
    }
}
