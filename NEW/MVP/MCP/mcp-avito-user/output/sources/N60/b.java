package n60;

import Y61.k;
import com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory;
import com.avito.android.passport_lib.generated.api.profile_switch_api_v_3.ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: PassportLibJsonModule_ProvideEnumPrimitivesTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln60/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f414903a = new b();

    @Override // javax.inject.Provider
    public final Object get() {
        C44202a.f414902a.getClass();
        Set setL0 = C42756l.l0(new r[]{new CheckAccountsMergeabilityApiV3ResponseNextStepLinkTypeAdapterFactory(), new ProfileSwitchApiV3ResponseIsNoOpTypeAdapterFactory()});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
