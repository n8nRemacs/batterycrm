package com.avito.android.serp.adapter.retry;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.delivery_suggests.l;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.E;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppendingRetryListenerImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/retry/b;", "Lcom/avito/android/serp/adapter/retry/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f270760b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f270761c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AppendingState f270762d = AppendingState.f270750b;

    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.adapter.retry.a
    public final void W1() {
        this.f270761c.accept(G0.f406611a);
    }

    @Override // com.avito.android.ui.adapter.f
    public final boolean gk() {
        return this.f270762d != AppendingState.f270750b;
    }

    @Override // com.avito.android.serp.adapter.retry.a
    @k
    public final C41981q0 iT() {
        com.jakewharton.rxrelay3.c<G0> cVar = this.f270761c;
        return l.l(cVar, cVar);
    }

    @Override // com.avito.android.serp.adapter.retry.a
    @k
    public final E pS() {
        com.jakewharton.rxrelay3.c<G0> cVar = this.f270760b;
        return l.l(cVar, cVar).y(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }

    @Override // com.avito.android.ui.adapter.f
    public final void rp() {
        this.f270760b.accept(G0.f406611a);
    }
}
