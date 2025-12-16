package com.avito.android.remote.di;

import com.avito.android.remote.parse.adapter.AbTestsAdapterFactory;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: AbTestJsonModule_ProvideAbTestTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/di/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f253361a = new b();

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = a.f253360a;
        return Collections.singleton(new AbTestsAdapterFactory());
    }
}
