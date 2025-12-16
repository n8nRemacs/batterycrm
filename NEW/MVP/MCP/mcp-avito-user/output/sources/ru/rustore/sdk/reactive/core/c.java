package ru.rustore.sdk.reactive.core;

import Oa1.B;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Dispatchers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/core/c;", "Lru/rustore/sdk/reactive/core/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c implements a {
    @Override // ru.rustore.sdk.reactive.core.a
    public final void a(Y41.a<G0> aVar) {
        d.f436864a.getClass();
        ((ThreadPoolExecutor) d.f436866c.getValue()).execute(new B(8, aVar));
    }
}
