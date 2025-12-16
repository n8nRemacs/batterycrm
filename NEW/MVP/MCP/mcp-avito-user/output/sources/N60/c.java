package n60;

import Y61.k;
import com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a;
import com.avito.android.passport_lib.generated.api.profile_switch_api_v_3.a;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import m60.InterfaceC43891a;

/* compiled from: PassportLibJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln60/c;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f414904a = new c();

    @Override // javax.inject.Provider
    public final Object get() {
        C44202a.f414902a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, InterfaceC43891a.class);
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC43891a.C11815a.class, "content");
        optimalRuntimeTypeAdapterFactoryA.b(InterfaceC43891a.b.class, "noActiveSession");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = D8.k(com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a.class, a.C6414a.class, "nextStepLink", a.b.class, "noActiveSession");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = D8.k(com.avito.android.passport_lib.generated.api.profile_switch_api_v_3.a.class, a.C6415a.class, "draft", a.b.class, "isNoOp");
        optimalRuntimeTypeAdapterFactoryK2.b(a.c.class, "profile");
        optimalRuntimeTypeAdapterFactoryK2.b(a.d.class, "profileBlocked");
        optimalRuntimeTypeAdapterFactoryK2.b(a.e.class, "profileRemoved");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
