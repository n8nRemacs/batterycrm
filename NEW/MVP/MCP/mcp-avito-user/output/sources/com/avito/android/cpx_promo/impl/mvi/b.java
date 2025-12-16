package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.cpx_promo.impl.mvi.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "action", "", "invoke", "(Lcom/avito/android/cpx_promo/impl/mvi/entity/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.l<com.avito.android.cpx_promo.impl.mvi.entity.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f127061l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.android.cpx_promo.impl.mvi.entity.a aVar) {
        com.avito.android.cpx_promo.impl.mvi.entity.a aVar2 = aVar;
        return Boolean.valueOf(aVar2.equals(a.c.f127159a) ? true : aVar2.equals(a.h.f127163a) ? true : aVar2.equals(a.f.f127161a) ? true : aVar2 instanceof a.d);
    }
}
