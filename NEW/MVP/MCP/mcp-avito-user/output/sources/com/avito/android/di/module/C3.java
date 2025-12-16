package com.avito.android.di.module;

import com.avito.android.remote.parse.adapter.stream_gson.LocationTypeAdapterFactory;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CoreOptimalJsonModule_ProvideLocationTypeAdapterFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/C3;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class C3 implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C3 f143870a = new C3();

    @Override // javax.inject.Provider
    public final Object get() {
        C30200u3.f144612a.getClass();
        return Collections.singleton(new LocationTypeAdapterFactory());
    }
}
