package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataTextAreaFieldView;

/* compiled from: TextView.kt */
@s0
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011¸\u0006\u0000"}, d2 = {"androidx/core/widget/r", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/G0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: ru.cyberity.cbr.core.presentation.form.viewutils.TextAreaViewKt$createView$lambda-1$$inlined$addTextChangedListener$default$1, reason: invalid class name */
/* loaded from: classes9.dex */
public final class TextAreaViewKt$createView$lambda1$$inlined$addTextChangedListener$default$1 implements TextWatcher {
    final /* synthetic */ FormFieldCallback $callback$inlined;
    final /* synthetic */ FormItem.TextArea $this_createView$inlined;
    final /* synthetic */ CBRApplicantDataTextAreaFieldView $view$inlined;

    @Override // android.text.TextWatcher
    public void afterTextChanged(@l Editable s5) {
        FormFieldCallback formFieldCallback;
        FormFieldCallback formFieldCallback2 = this.$callback$inlined;
        if (formFieldCallback2 != null) {
            FormItem.TextArea textArea = this.$this_createView$inlined;
            formFieldCallback2.onValueChanged(textArea, FormItemViewUtilsKt.getValueForItem(this.$view$inlined, textArea));
        }
        EditText editText = this.$view$inlined.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        if (text == null || text.length() == 0 || (formFieldCallback = this.$callback$inlined) == null) {
            return;
        }
        formFieldCallback.check(this.$this_createView$inlined);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@l CharSequence text, int start, int before, int count) {
    }
}
