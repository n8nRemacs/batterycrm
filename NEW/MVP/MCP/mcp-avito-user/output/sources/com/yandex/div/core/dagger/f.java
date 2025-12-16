package com.yandex.div.core.dagger;

import com.yandex.div.core.D;

/* compiled from: Div2Module_ProvideTabTextStyleProviderFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class f implements dagger.internal.h<com.yandex.div.internal.widget.tabs.s> {

    /* renamed from: a, reason: collision with root package name */
    public final D f367404a;

    public f(D d12) {
        this.f367404a = d12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.yandex.div.internal.widget.tabs.s((com.yandex.div.core.font.a) this.f367404a.get());
    }
}
