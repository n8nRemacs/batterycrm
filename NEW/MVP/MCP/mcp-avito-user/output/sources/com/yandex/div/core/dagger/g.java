package com.yandex.div.core.dagger;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.L;

/* compiled from: Div2Module_ProvideThemedContextFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class g implements dagger.internal.h<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f367405a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f367406b;

    /* renamed from: c, reason: collision with root package name */
    public final L f367407c;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, L l12) {
        this.f367405a = lVar;
        this.f367406b = lVar2;
        this.f367407c = l12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.f367405a.f393949a;
        int iIntValue = ((Integer) this.f367406b.f393949a).intValue();
        return ((Boolean) this.f367407c.get()).booleanValue() ? new com.yandex.div.core.resources.b(contextThemeWrapper, iIntValue) : new ContextThemeWrapper(contextThemeWrapper, iIntValue);
    }
}
