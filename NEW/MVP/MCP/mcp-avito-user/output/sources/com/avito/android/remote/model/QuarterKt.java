package com.avito.android.remote.model;

import Y61.l;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: Quarter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"toQuartersParameterValue", "Lcom/avito/android/remote/model/category_parameters/QuartersParameter$Value;", "Lcom/avito/android/remote/model/Quarter;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class QuarterKt {
    @l
    public static final QuartersParameter.Value toQuartersParameterValue(@l Quarter quarter) {
        if (quarter == null) {
            return null;
        }
        return new QuartersParameter.Value(quarter.getToInt(), quarter.getFromInt());
    }
}
