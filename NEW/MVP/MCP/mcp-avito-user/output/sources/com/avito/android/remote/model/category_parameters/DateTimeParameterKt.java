package com.avito.android.remote.model.category_parameters;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import q50.InterfaceC47203a;

/* compiled from: DateTimeParameter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0003\u001a\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DATE_TIME_PARAMETER_PRESENT_TIME", "", "toFormValue", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "toTimestamp", "", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;)Ljava/lang/Long;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class DateTimeParameterKt {

    @k
    public static final String DATE_TIME_PARAMETER_PRESENT_TIME = "-1";

    @k
    public static final String toFormValue(@k DateTimeParameter.Value value) {
        if (value instanceof DateTimeParameter.Value.PresentTime) {
            return DATE_TIME_PARAMETER_PRESENT_TIME;
        }
        if (value instanceof DateTimeParameter.Value.Timestamp) {
            return String.valueOf(((DateTimeParameter.Value.Timestamp) value).toSeconds());
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final Long toTimestamp(@k DateTimeParameter.Value value) {
        if (value instanceof DateTimeParameter.Value.PresentTime) {
            return null;
        }
        if (value instanceof DateTimeParameter.Value.Timestamp) {
            return Long.valueOf(((DateTimeParameter.Value.Timestamp) value).getTimestamp());
        }
        throw new NoWhenBranchMatchedException();
    }
}
