package ru.rustore.sdk.reactive.core;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: TrampolineDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/core/l;", "Lru/rustore/sdk/reactive/core/a;", "<init>", "()V", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class l implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42754k<Y41.a<G0>> f436878a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f436879b;

    static {
        new l();
        f436878a = new C42754k<>();
    }

    @Override // ru.rustore.sdk.reactive.core.a
    public final void a(@Y61.k Y41.a<G0> aVar) {
        Y41.a<G0> aVarV;
        synchronized (this) {
            f436878a.addLast(aVar);
            G0 g02 = G0.f406611a;
        }
        synchronized (this) {
            if (f436879b) {
                return;
            }
            f436879b = true;
            while (true) {
                synchronized (this) {
                    aVarV = f436878a.v();
                    if (aVarV == null) {
                        f436879b = false;
                        return;
                    }
                }
                aVarV.invoke();
            }
        }
    }
}
