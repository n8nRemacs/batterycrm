package com.avito.android.serp.adapter.retry;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RetryPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/retry/g;", "Lcom/avito/android/serp/adapter/retry/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f270768b;

    @Inject
    public g(@k a aVar) {
        this.f270768b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.dU(((RetryItem) aVar).f270757c);
        iVar.Pz(new f(this));
    }
}
