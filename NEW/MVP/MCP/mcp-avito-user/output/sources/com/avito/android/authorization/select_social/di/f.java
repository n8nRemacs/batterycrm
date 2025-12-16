package com.avito.android.authorization.select_social.di;

import com.avito.android.authorization.select_social.adapter.SelectSocialField;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectSocialModule_ProvideFieldClickStreamFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class f implements h<com.jakewharton.rxrelay3.c<SelectSocialField>> {

    /* compiled from: SelectSocialModule_ProvideFieldClickStreamFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f94528a = new f();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = d.f94526a;
        return new com.jakewharton.rxrelay3.c();
    }
}
