package com.avito.android.di;

import com.avito.android.remote.model.adverts.RestoreAdvertResult;
import com.avito.android.util.C35866p0;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: UserAdvertJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/di/Z;", "Ldagger/internal/h;", "Lcom/avito/android/util/p0;", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Z implements dagger.internal.h<C35866p0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Z f139267a = new Z();

    @Override // javax.inject.Provider
    public final Object get() {
        Y.f139266a.getClass();
        return new C35866p0(RestoreAdvertResult.class, P0.g(new kotlin.Q("ok", RestoreAdvertResult.Ok.class), new kotlin.Q("forbidden", RestoreAdvertResult.Forbidden.class)));
    }
}
