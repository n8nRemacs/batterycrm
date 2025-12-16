package com.avito.android.validation;

import com.avito.android.remote.model.IterableParameters;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParametersValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/d1;", "", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d1 {

    /* compiled from: ParametersValidator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    n1 a(@Y61.k EditableParameter<?> editableParameter, @Y61.k IterableParameters iterableParameters, boolean z12);

    @Y61.k
    List b(@Y61.k EditableParameter editableParameter, @Y61.k ParametersTree parametersTree);
}
