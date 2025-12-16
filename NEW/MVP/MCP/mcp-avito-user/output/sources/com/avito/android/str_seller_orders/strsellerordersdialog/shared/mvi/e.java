package com.avito.android.str_seller_orders.strsellerordersdialog.shared.mvi;

import Dz0.b;
import Dz0.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SharedViewModelEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersdialog/shared/mvi/e;", "Lcom/avito/android/arch/mvi/t;", "LDz0/b;", "LDz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements t<Dz0.b, Dz0.c> {
    @Inject
    public e() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Dz0.c b(Dz0.b bVar) {
        Dz0.b bVar2 = bVar;
        if (bVar2 instanceof b.c) {
            return new c.b(((b.c) bVar2).f3600a);
        }
        if (bVar2 instanceof b.C0206b) {
            return new c.a(((b.C0206b) bVar2).f3599a);
        }
        return null;
    }
}
