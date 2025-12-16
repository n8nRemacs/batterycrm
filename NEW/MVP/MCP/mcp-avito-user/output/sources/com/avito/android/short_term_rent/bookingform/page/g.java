package com.avito.android.short_term_rent.bookingform.page;

import com.avito.android.short_term_rent.bookingform.page.d;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: FormPagePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/page/g;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/page/i;", "Lcom/avito/android/short_term_rent/bookingform/page/c;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements TV0.f<i, c> {
    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((i) eVar).B(((c) aVar).f282037c);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<d> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            iVar.B(cVar.f282037c);
            return;
        }
        for (d dVar : list2) {
            if (dVar instanceof d.a) {
                iVar.B(((d.a) dVar).f282038a);
            }
        }
    }
}
