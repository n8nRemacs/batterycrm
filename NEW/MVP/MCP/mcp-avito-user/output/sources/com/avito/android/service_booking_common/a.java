package com.avito.android.service_booking_common;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlocksUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_service-booking-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    public static final int a(@Y61.k Ht0.j jVar) {
        Boolean isBold = jVar.getIsBold();
        int iHashCode = isBold != null ? isBold.hashCode() : 0;
        return jVar.getTitle().hashCode() + ((jVar.getPrice().hashCode() + (iHashCode * 31)) * 31);
    }
}
