package com.avito.android.wallet.page.topup.form.items.submit_button_item;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SubmitButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/submit_button_item/e;", "LTV0/d;", "Lcom/avito/android/wallet/page/topup/form/items/submit_button_item/f;", "Lcom/avito/android/wallet/page/topup/form/items/submit_button_item/c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<f, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f328345b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super String, G0> lVar) {
        this.f328345b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        c cVar = (c) aVar;
        fVar.c(new d(this, cVar));
        fVar.setEnabled(cVar.f328341b);
        fVar.setText(cVar.f328342c);
    }
}
