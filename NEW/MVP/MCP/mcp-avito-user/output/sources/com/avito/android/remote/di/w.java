package com.avito.android.remote.di;

import com.avito.android.remote.model.CharityDialogResponse;
import com.avito.android.util.C35866p0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: UserAdvertsCommonApiModule_ProvideCustomTypeAdapterFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/di/w;", "Ldagger/internal/h;", "Lcom/avito/android/util/p0;", "<init>", "()V", "_avito-discouraged_avito-api_user-adverts-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class w implements dagger.internal.h<C35866p0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final w f253379a = new w();

    @Override // javax.inject.Provider
    public final Object get() {
        v.f253378a.getClass();
        return new C35866p0(CharityDialogResponse.class, P0.g(new Q("ok", CharityDialogResponse.Ok.class), new Q("not-required", CharityDialogResponse.NotRequired.class)));
    }
}
