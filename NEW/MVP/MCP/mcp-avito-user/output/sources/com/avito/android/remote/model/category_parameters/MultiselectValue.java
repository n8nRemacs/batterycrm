package com.avito.android.remote.model.category_parameters;

import Y61.l;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import kotlin.Metadata;

/* compiled from: MultiselectParameter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/MultiselectValue;", "", "display", "Lcom/avito/android/remote/model/category_parameters/MultiselectDisplay;", "getDisplay", "()Lcom/avito/android/remote/model/category_parameters/MultiselectDisplay;", "isDisabled", "", "()Z", "widget", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "getWidget", "()Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Value$Widget;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MultiselectValue {
    @l
    MultiselectDisplay getDisplay();

    @l
    MultiselectParameter.Value.Widget getWidget();

    boolean isDisabled();
}
