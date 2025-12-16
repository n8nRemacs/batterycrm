package com.avito.android.user_advert.soa_with_price.blueprint;

import Y61.k;
import com.avito.android.user_advert.soa_with_price.C35547a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CloseReasonItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/blueprint/f;", "Lcom/avito/android/user_advert/soa_with_price/blueprint/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<C35547a> f311876b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f311877c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<C35547a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f311876b = cVar;
        this.f311877c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        C35547a c35547a = (C35547a) aVar;
        hVar.g0(c35547a.f311868c);
        hVar.setChecked(c35547a.f311869d);
        hVar.c(new e(this, c35547a));
    }

    @Override // com.avito.android.user_advert.soa_with_price.blueprint.d
    @k
    public final z<C35547a> h() {
        return this.f311877c;
    }
}
