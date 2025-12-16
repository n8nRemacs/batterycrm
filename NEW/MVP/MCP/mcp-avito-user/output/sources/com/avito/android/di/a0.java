package com.avito.android.di;

import com.avito.android.remote.model.adverts.multi_item.MultiItemParamTypeAdapterFactory;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: UserAdvertJsonModule_ProvideTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/a0;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a0 implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a0 f139268a = new a0();

    @Override // javax.inject.Provider
    public final Object get() {
        Y.f139266a.getClass();
        return Collections.singleton(MultiItemParamTypeAdapterFactory.INSTANCE.create());
    }
}
