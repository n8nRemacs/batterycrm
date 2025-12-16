package fJ;

import Y61.k;
import aJ.g;
import bJ.InterfaceC25517a;
import cJ.j;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.yandex.div2.D8;
import dagger.internal.h;
import dagger.internal.t;
import eJ.n;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: HotelJsonModule_ProvideVariantsTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LfJ/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "<init>", "()V", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fJ.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40300b implements h<Set<r>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C40300b f395811a = new C40300b();

    @Override // javax.inject.Provider
    public final Object get() {
        C40299a.f395810a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, g.class);
        optimalRuntimeTypeAdapterFactoryA.b(g.a.class, "moreButton");
        optimalRuntimeTypeAdapterFactoryA.b(g.b.class, "offer");
        Set setL0 = C42756l.l0(new OptimalRuntimeTypeAdapterFactory[]{optimalRuntimeTypeAdapterFactoryA, D8.k(InterfaceC25517a.class, InterfaceC25517a.C1997a.class, "offer", InterfaceC25517a.b.class, "toast"), D8.k(j.class, j.a.class, "item", j.b.class, "widget"), D8.k(n.class, n.a.class, "item", n.b.class, "widget")});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
