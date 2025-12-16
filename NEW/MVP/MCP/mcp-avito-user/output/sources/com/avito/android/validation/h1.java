package com.avito.android.validation;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ParametersValidatorResourceProvider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/h1;", "Lcom/avito/android/validation/g1;", "_avito_validation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h1 implements g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f319382a;

    @Inject
    public h1(@Y61.k Resources resources) {
        this.f319382a = resources;
    }

    @Override // com.avito.android.validation.g1
    @Y61.k
    public final String a(@Y61.k EditableParameter<?> editableParameter) {
        ObjectsParameter.Widget.Config config;
        String errorText;
        SelectParameter.Widget.Config config2;
        String errorText2;
        boolean z12 = editableParameter instanceof SelectParameter.Flat;
        Resources resources = this.f319382a;
        if (z12) {
            SelectParameter.Widget widget = ((SelectParameter.Flat) editableParameter).getWidget();
            return (widget == null || (config2 = widget.getConfig()) == null || (errorText2 = config2.getErrorText()) == null) ? resources.getString(R.string.empty_required_select_error) : errorText2;
        }
        if (editableParameter instanceof SelectParameter ? true : editableParameter instanceof MultiselectParameter) {
            return resources.getString(R.string.empty_required_select_error);
        }
        if (!(editableParameter instanceof ObjectsParameter)) {
            return editableParameter instanceof MetroParameter ? true : editableParameter instanceof DistrictParameter ? "" : resources.getString(R.string.empty_required_parameter_error);
        }
        ObjectsParameter.Widget widget2 = ((ObjectsParameter) editableParameter).getWidget();
        return (widget2 == null || (config = widget2.getConfig()) == null || (errorText = config.getErrorText()) == null) ? resources.getString(R.string.empty_required_parameter_error) : errorText;
    }
}
