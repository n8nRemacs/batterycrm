package com.avito.android.login_suggests_impl.adapter.common_login;

import Y61.k;
import kotlin.Metadata;

/* compiled from: CommonLoginItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/adapter/common_login/e;", "Lcom/avito/android/login_suggests_impl/adapter/common_login/b;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f182871b;

    public e(@k com.jakewharton.rxrelay3.c cVar) {
        this.f182871b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.d(new c(fVar, cVar));
        cVar.b(fVar.A().t0(new d(this, (CommonLoginItem) aVar)));
    }
}
