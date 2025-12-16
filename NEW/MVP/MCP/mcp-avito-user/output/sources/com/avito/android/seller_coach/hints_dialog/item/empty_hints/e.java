package com.avito.android.seller_coach.hints_dialog.item.empty_hints;

import Y61.k;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EmptyHintItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/empty_hints/e;", "Lcom/avito/android/seller_coach/hints_dialog/item/empty_hints/d;", "<init>", "()V", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public d.a f267469b;

    @Inject
    public e() {
    }

    @Override // com.avito.android.seller_coach.hints_dialog.item.empty_hints.d
    public final void D0(@k d.a aVar) {
        this.f267469b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        d.a aVar2 = this.f267469b;
        if (aVar2 == null) {
            aVar2 = null;
        }
        gVar.JZ(aVar2);
    }
}
