package com.avito.android.service_booking_calendar.domain;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimeSlotItemConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class e extends N implements l<Long, Long> {

    /* renamed from: l, reason: collision with root package name */
    public static final e f275554l = new e();

    public e() {
        super(1);
    }

    @Override // Y41.l
    public final Long invoke(Long l12) {
        return Long.valueOf(l12.longValue() + 900);
    }
}
