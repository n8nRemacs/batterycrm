package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DateTimeRangeParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "value", "invoke", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1 extends N implements l<Long, Long> {
    public static final DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1 INSTANCE = new DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1();

    public DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1() {
        super(1);
    }

    @Override // Y41.l
    public /* bridge */ /* synthetic */ Long invoke(Long l12) {
        return invoke(l12.longValue());
    }

    @k
    public final Long invoke(long j12) {
        LocalDateTime localDateTimeOfEpochSecond = LocalDateTime.ofEpochSecond(j12, 0, ZoneOffset.UTC);
        return Long.valueOf(localDateTimeOfEpochSecond.toInstant(ZoneId.systemDefault().getRules().getOffset(localDateTimeOfEpochSecond)).getEpochSecond());
    }
}
