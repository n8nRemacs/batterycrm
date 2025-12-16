package com.avito.android.wallet.page.topup.form.items.input;

import Y41.p;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TopUpInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/input/f;", "Lcom/avito/android/wallet/page/topup/form/items/input/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<a, String, G0> f328324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f328325c;

    @Inject
    public f(@k Y41.a aVar, @k p pVar) {
        this.f328324b = pVar;
        this.f328325c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.c70(new e(this, aVar2));
        hVar.Q(this.f328325c);
        StringBuilder sbCC = hVar.cC();
        String str = aVar2.f328316c;
        if (L.f(str, sbCC)) {
            return;
        }
        hVar.MZ(str);
    }
}
