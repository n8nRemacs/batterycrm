package com.avito.android.messenger_icebreakers_dialog.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessengerIcebreakerDialogFeaturesModule_ProvideMessengerIcebreakerDialogFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f197663a;

    public c(Provider<C34161r> provider) {
        this.f197663a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f197663a.get();
        b.f197662a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
