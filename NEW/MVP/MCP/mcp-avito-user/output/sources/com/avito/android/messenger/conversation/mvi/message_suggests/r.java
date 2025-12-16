package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31700h;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessageSuggestsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<C32120b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<String> f191991a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31987a> f191992b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f191993c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC31700h> f191994d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C30277e1> f191995e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<u3.g<AssistantUxImprovementsBuyerTestGroup>> f191996f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f191997g;

    public r(Provider<String> provider, Provider<InterfaceC31987a> provider2, Provider<InterfaceC47842z> provider3, Provider<InterfaceC31700h> provider4, Provider<C30277e1> provider5, Provider<u3.g<AssistantUxImprovementsBuyerTestGroup>> provider6, Provider<InterfaceC35745a5> provider7) {
        this.f191991a = provider;
        this.f191992b = provider2;
        this.f191993c = provider3;
        this.f191994d = provider4;
        this.f191995e = provider5;
        this.f191996f = provider6;
        this.f191997g = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32120b(this.f191991a.get(), this.f191992b.get(), this.f191993c.get(), this.f191994d.get(), this.f191995e.get(), this.f191996f.get(), this.f191997g.get());
    }
}
