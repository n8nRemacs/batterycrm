package com.avito.android.authorization.deep_linking;

import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.parse.adapter.AuthResultTypeAdapter;
import com.avito.android.util.X5;

/* compiled from: AuthorizationDeeplinkTypeAdaptersModule_ProvideAuthResulTypeAdapterFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.authorization.deep_linking.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28668w implements dagger.internal.h<X5> {

    /* compiled from: AuthorizationDeeplinkTypeAdaptersModule_ProvideAuthResulTypeAdapterFactory.java */
    /* renamed from: com.avito.android.authorization.deep_linking.w$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C28668w f93805a = new C28668w();
    }

    public static C28668w a() {
        return a.f93805a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C28667v.f93804a.getClass();
        return new X5(AuthResult.class, new AuthResultTypeAdapter());
    }
}
