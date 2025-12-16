package com.avito.android.short_term_rent.bookingform.mvi;

import cw0.C39425b;
import cw0.C39429f;
import cw0.InterfaceC39426c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/I;", "Lcom/avito/android/short_term_rent/bookingform/mvi/H;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class I implements H {
    @Inject
    public I() {
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.H
    @Y61.k
    public final C39425b a(@Y61.k C39425b c39425b) {
        C39425b.InterfaceC11001b.C11002b c11002b = C39425b.InterfaceC11001b.C11002b.f393073a;
        C39425b.InterfaceC11001b interfaceC11001b = c39425b.f393067c;
        if (L.f(interfaceC11001b, c11002b)) {
            return C39425b.a(c39425b, null, null, 0L, false, InterfaceC39426c.C11003c.f393081a, null, 47);
        }
        if (L.f(interfaceC11001b, C39425b.InterfaceC11001b.a.f393072a)) {
            return C39425b.a(c39425b, null, null, 0L, false, new InterfaceC39426c.b(c39425b.f393069e), null, 47);
        }
        if (!(interfaceC11001b instanceof C39425b.InterfaceC11001b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        List<C39429f> list = ((C39425b.InterfaceC11001b.c) interfaceC11001b).f393074a;
        Iterator<C39429f> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().f393088a == c39425b.f393068d) {
                break;
            }
            i12++;
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 < 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return c39425b;
        }
        int iIntValue = numValueOf.intValue();
        List<C39429f> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C39429f c39429f : list2) {
            arrayList.add(new com.avito.android.short_term_rent.bookingform.page.c(c39429f.f393088a, c39429f.f393089b));
        }
        C39429f c39429f2 = list.get(iIntValue);
        return C39425b.a(c39425b, null, null, 0L, false, new InterfaceC39426c.a(c39425b.f393069e, iIntValue, arrayList, c39429f2.f393090c, c39429f2.f393091d), null, 47);
    }
}
