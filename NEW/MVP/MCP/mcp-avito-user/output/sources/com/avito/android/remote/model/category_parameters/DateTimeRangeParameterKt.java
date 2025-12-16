package com.avito.android.remote.model.category_parameters;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: DateTimeRangeParameter.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a6\u0010\t\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\n*\"\u0010\u000e\"\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "selectionType", "scaleToLocalTimeZone", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;Lcom/avito/android/remote/model/category_parameters/SelectionType;)Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "scaleToUtcTimeZone", "Lkotlin/Function1;", "", "map", "mapHourTimestampValue", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;Lcom/avito/android/remote/model/category_parameters/SelectionType;LY41/l;)Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "", "", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeWheel;", "DateTimeRangeWheelsContainer", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class DateTimeRangeParameterKt {
    private static final DateTimeParameter.Value mapHourTimestampValue(DateTimeParameter.Value value, SelectionType selectionType, l<? super Long, Long> lVar) {
        Long timestamp;
        if (value == null || (timestamp = DateTimeParameterKt.toTimestamp(value)) == null) {
            return value;
        }
        long jLongValue = timestamp.longValue();
        if (selectionType != null && selectionType.hasHour()) {
            long j12 = 1000;
            jLongValue = lVar.invoke(Long.valueOf(jLongValue / j12)).longValue() * j12;
        }
        return new DateTimeParameter.Value.Timestamp(jLongValue);
    }

    @Y61.l
    public static final DateTimeParameter.Value scaleToLocalTimeZone(@k DateTimeParameter.Value value, @Y61.l SelectionType selectionType) {
        DateTimeRangeParameterKt$scaleToLocalTimeZone$convertToLocalTime$1 dateTimeRangeParameterKt$scaleToLocalTimeZone$convertToLocalTime$1 = DateTimeRangeParameterKt$scaleToLocalTimeZone$convertToLocalTime$1.INSTANCE;
        Long timestamp = DateTimeParameterKt.toTimestamp(value);
        if (timestamp == null) {
            return value;
        }
        long jLongValue = timestamp.longValue();
        if (selectionType != null && selectionType.hasHour()) {
            long j12 = 1000;
            jLongValue = dateTimeRangeParameterKt$scaleToLocalTimeZone$convertToLocalTime$1.invoke((DateTimeRangeParameterKt$scaleToLocalTimeZone$convertToLocalTime$1) Long.valueOf(jLongValue / j12)).longValue() * j12;
        }
        return new DateTimeParameter.Value.Timestamp(jLongValue);
    }

    @Y61.l
    public static final DateTimeParameter.Value scaleToUtcTimeZone(@k DateTimeParameter.Value value, @Y61.l SelectionType selectionType) {
        DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1 dateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1 = DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1.INSTANCE;
        Long timestamp = DateTimeParameterKt.toTimestamp(value);
        if (timestamp == null) {
            return value;
        }
        long jLongValue = timestamp.longValue();
        if (selectionType != null && selectionType.hasHour()) {
            long j12 = 1000;
            jLongValue = dateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1.invoke((DateTimeRangeParameterKt$scaleToUtcTimeZone$convertToUtcTime$1) Long.valueOf(jLongValue / j12)).longValue() * j12;
        }
        return new DateTimeParameter.Value.Timestamp(jLongValue);
    }
}
