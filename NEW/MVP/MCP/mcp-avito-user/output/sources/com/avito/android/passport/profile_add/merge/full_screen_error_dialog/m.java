package com.avito.android.passport.profile_add.merge.full_screen_error_dialog;

import com.avito.android.passport.profile_add.merge.full_screen_error_dialog.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FullScreenUserDialogViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f213077a;

    public m(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f213077a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C6377a) this.f213077a).get());
    }
}
