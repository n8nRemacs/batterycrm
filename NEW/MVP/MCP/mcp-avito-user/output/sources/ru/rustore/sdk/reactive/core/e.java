package ru.rustore.sdk.reactive.core;

import Oa1.B;
import android.os.Handler;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Dispatchers.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/core/e;", "Lru/rustore/sdk/reactive/core/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f436873a;

    public e(Handler handler) {
        this.f436873a = handler;
    }

    @Override // ru.rustore.sdk.reactive.core.a
    public final void a(Y41.a<G0> aVar) {
        this.f436873a.post(new B(9, aVar));
    }
}
