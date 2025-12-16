package ru.cyberity.cbr.core.presentation.form.viewutils;

import kotlin.Metadata;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener;

/* compiled from: PhoneView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/cyberity/cbr/core/presentation/form/viewutils/PhoneViewKt$createView$1$phoneNumberKit$1", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "", "isValid", "isBlank", "Lkotlin/G0;", "onValidate", "(ZZ)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class PhoneViewKt$createView$1$phoneNumberKit$1 implements ValidationListener {
    final /* synthetic */ FormFieldCallback $callback;
    final /* synthetic */ FormItem.Phone $this_createView;

    @Override // ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener
    public void onValidate(boolean isValid, boolean isBlank) {
        FormFieldCallback formFieldCallback = this.$callback;
        if (formFieldCallback != null) {
            formFieldCallback.onValidatePhone(this.$this_createView, isValid, isBlank);
        }
    }
}
