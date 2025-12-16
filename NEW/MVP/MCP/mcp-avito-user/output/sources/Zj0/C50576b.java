package zj0;

import Bj0.c;
import Cj0.g;
import Fj0.InterfaceC13808a;
import Y61.k;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.h;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: AutotekaJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzj0/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zj0.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C50576b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C50576b f444195a = new C50576b();

    @Override // javax.inject.Provider
    public final Object get() {
        C50575a.f444194a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, c.class);
        optimalRuntimeTypeAdapterFactoryA.b(c.a.class, "error");
        optimalRuntimeTypeAdapterFactoryA.b(c.b.class, "result");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, D8.k(g.class, g.b.class, "error", g.a.class, "result"), D8.k(InterfaceC13808a.class, InterfaceC13808a.C0301a.class, "error", InterfaceC13808a.b.class, "result")});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
