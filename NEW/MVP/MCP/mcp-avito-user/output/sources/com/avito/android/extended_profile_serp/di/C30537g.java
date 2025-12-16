package com.avito.android.extended_profile_serp.di;

import com.avito.android.remote.model.ExtendedProfileSearchPageResult;
import com.avito.android.remote.model.ExtendedProfileSearchPageSuccessResult;
import com.avito.android.remote.model.ExtendedProfileSearchPageUserNotFoundResult;
import com.avito.android.util.C35873q0;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileSerpJsonModule_ProvideTypedResultEntriesFactory.java */
@dagger.internal.e
@dagger.internal.x
@dagger.internal.y
/* renamed from: com.avito.android.extended_profile_serp.di.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30537g implements dagger.internal.h<Set<C35873q0>> {

    /* compiled from: ExtendedProfileSerpJsonModule_ProvideTypedResultEntriesFactory.java */
    /* renamed from: com.avito.android.extended_profile_serp.di.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C30537g f152852a = new C30537g();
    }

    public static C30537g a() {
        return a.f152852a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30536f.f152851a.getClass();
        return Collections.singleton(new C35873q0(ExtendedProfileSearchPageResult.class, P0.g(new Q("success", ExtendedProfileSearchPageSuccessResult.class), new Q("user-not-exist", ExtendedProfileSearchPageUserNotFoundResult.class))));
    }
}
