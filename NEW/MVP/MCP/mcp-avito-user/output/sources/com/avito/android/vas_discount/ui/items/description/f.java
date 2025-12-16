package com.avito.android.vas_discount.ui.items.description;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_discount/ui/items/description/f;", "LTV0/d;", "Lcom/avito/android/vas_discount/ui/items/description/d;", "Lcom/avito/android/vas_discount/ui/items/description/a;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements TV0.d<d, a> {
    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        d dVar = (d) eVar;
        a aVar2 = (a) aVar;
        Long l12 = aVar2.f319732d;
        if (l12 != null) {
            dVar.VP(l12.longValue());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            dVar.bV();
        }
        dVar.setTitle(aVar2.f319730b);
        dVar.h(aVar2.f319731c);
    }
}
