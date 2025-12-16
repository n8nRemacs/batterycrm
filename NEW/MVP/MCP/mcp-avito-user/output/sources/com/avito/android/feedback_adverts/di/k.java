package com.avito.android.feedback_adverts.di;

import com.avito.android.feedback_adverts.di.b;
import com.avito.android.feedback_adverts.o;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.mvi.rx3.with_monolithic_state.t;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FeedbackAdvertsModule_ProvidePresenterReducerQueue$_avito_feedback_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<t<o.b>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f157812a;

    public k(Provider<InterfaceC35745a5> provider) {
        this.f157812a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((b.c.d) this.f157812a).get();
        e.f157805a.getClass();
        return new F(interfaceC35745a5.a(), null, 2, null);
    }
}
