package com.avito.android.short_term_rent.bookingform;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_short-term-rent_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    @Y61.l
    public static final Integer a(@Y61.k Y41.l lVar, @Y61.k List list) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return null;
        }
        return Integer.valueOf(i12);
    }
}
