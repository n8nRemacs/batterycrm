package com.avito.android.extended_profile_selection_create.select.di;

import com.avito.android.remote.model.ExtendedProfileSearchPageResult;
import com.avito.android.remote.model.ExtendedProfileSearchPageSuccessResult;
import com.avito.android.remote.model.ExtendedProfileSearchPageUserNotFoundResult;
import com.avito.android.util.C35873q0;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileSelectionCreateJsonModule_ProvideTypedResultEntriesFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<Set<C35873q0>> {

    /* compiled from: ExtendedProfileSelectionCreateJsonModule_ProvideTypedResultEntriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f152260a = new e();
    }

    public static e a() {
        return a.f152260a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d.f152259a.getClass();
        return Collections.singleton(new C35873q0(ExtendedProfileSearchPageResult.class, P0.g(new Q("success", ExtendedProfileSearchPageSuccessResult.class), new Q("user-not-exist", ExtendedProfileSearchPageUserNotFoundResult.class))));
    }
}
