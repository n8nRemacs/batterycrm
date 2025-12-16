package com.avito.android.seller_coach.hints_dialog.item.hint;

import Y61.k;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HintItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/hint/e;", "Lcom/avito/android/seller_coach/hints_dialog/item/hint/d;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public d.a f267497b;

    @Inject
    public e() {
    }

    @Override // com.avito.android.seller_coach.hints_dialog.item.hint.d
    public final void D0(@k d.a aVar) {
        this.f267497b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        d.a aVar3 = this.f267497b;
        if (aVar3 == null) {
            aVar3 = null;
        }
        gVar.XE(aVar2, aVar3);
    }
}
