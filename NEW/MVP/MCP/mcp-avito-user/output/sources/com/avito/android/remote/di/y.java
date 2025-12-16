package com.avito.android.remote.di;

import com.avito.android.remote.model.universal_promo_banner.HorizontalAlignment;
import com.avito.android.remote.model.universal_promo_banner.VerticalAlignment;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: UserAdvertsJsonModule_ProvideTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/di/y;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class y implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final y f253381a = new y();

    @Override // javax.inject.Provider
    public final Object get() {
        x.f253380a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(VerticalAlignment.class);
        runtimeTypeAdapterFactory.b(VerticalAlignment.Top.class, "top", null);
        runtimeTypeAdapterFactory.b(VerticalAlignment.Bottom.class, "bottom", null);
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory2 = new RuntimeTypeAdapterFactory(HorizontalAlignment.class);
        runtimeTypeAdapterFactory2.b(HorizontalAlignment.Right.class, "right", null);
        Set setL0 = C42756l.l0(new RuntimeTypeAdapterFactory[]{runtimeTypeAdapterFactory, runtimeTypeAdapterFactory2});
        dagger.internal.t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
