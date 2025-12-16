package com.avito.android.cart_bundles.feature;

import Om.c;
import Om.e;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CartBundlesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cart_bundles/feature/h;", "Lcom/avito/android/arch/mvi/t;", "LOm/b;", "LOm/c;", "<init>", "()V", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements t<Om.b, Om.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Om.c b(Om.b bVar) {
        Om.b bVar2 = bVar;
        Om.e eVar = bVar2 instanceof Om.e ? (Om.e) bVar2 : null;
        if (eVar instanceof e.b) {
            return new c.a(((e.b) eVar).f12511a);
        }
        boolean z12 = true;
        if (!(eVar instanceof e.a ? true : eVar instanceof e.c) && eVar != null) {
            z12 = false;
        }
        if (z12) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
