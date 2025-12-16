package kg;

import Y61.k;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import java.util.Collections;
import java.util.Set;
import jg.g;
import kotlin.Metadata;

/* compiled from: AvitoFinanceUserProfileJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkg/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kg.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42689b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C42689b f406535a = new C42689b();

    @Override // javax.inject.Provider
    public final Object get() {
        C42688a.f406534a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, g.class);
        optimalRuntimeTypeAdapterFactoryA.b(g.a.class, "openDeeplink");
        optimalRuntimeTypeAdapterFactoryA.b(g.b.class, "sendEvent");
        return Collections.singleton(optimalRuntimeTypeAdapterFactoryA);
    }
}
