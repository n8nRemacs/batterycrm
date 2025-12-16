package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.cpx_promo.v2.mvi.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoV2Actor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "action", "", "invoke", "(Lcom/avito/android/cpx_promo/v2/mvi/entity/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements Y41.l<com.avito.android.cpx_promo.v2.mvi.entity.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f127576l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.android.cpx_promo.v2.mvi.entity.a aVar) {
        com.avito.android.cpx_promo.v2.mvi.entity.a aVar2 = aVar;
        return Boolean.valueOf(aVar2.equals(a.e.f127693a) ? true : aVar2 instanceof a.c ? true : aVar2 instanceof a.f);
    }
}
