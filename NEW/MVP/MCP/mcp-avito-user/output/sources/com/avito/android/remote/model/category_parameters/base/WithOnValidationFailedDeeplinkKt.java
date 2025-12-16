package com.avito.android.remote.model.category_parameters.base;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: WithOnValidationFailedDeeplink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"onValidationFailedDeeplink", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "getOnValidationFailedDeeplink", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class WithOnValidationFailedDeeplinkKt {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final DeepLink getOnValidationFailedDeeplink(@k EditableParameter<?> editableParameter) {
        WithOnValidationFailedDeeplink withOnValidationFailedDeeplink = editableParameter instanceof WithOnValidationFailedDeeplink ? (WithOnValidationFailedDeeplink) editableParameter : null;
        if (withOnValidationFailedDeeplink != null) {
            return withOnValidationFailedDeeplink.getOnValidationFailedDeeplink();
        }
        return null;
    }
}
