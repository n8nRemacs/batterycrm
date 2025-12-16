package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import Y61.l;
import android.text.InputFilter;
import android.widget.EditText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.QuestionnaireResponseExtensionsKt;
import ru.cyberity.cbr.core.widget.CBRTextInputEditText;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;

/* compiled from: DefaultFormItemViewHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/DefaultFormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "itemView", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "callback", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "view", "item", "", "itemCount", "Lkotlin/G0;", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem;I)V", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "setCallback", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "boundItem", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultFormItemViewHolder extends FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView> {

    @l
    private FormItem boundItem;

    @l
    private FormFieldCallback callback;

    /* compiled from: DefaultFormItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.DefaultFormItemViewHolder$onBind$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<String, G0> {
        final /* synthetic */ FormItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FormItem formItem) {
            super(1);
            this.$item = formItem;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l String str) {
            FormFieldCallback callback;
            FormFieldCallback callback2 = DefaultFormItemViewHolder.this.getCallback();
            if (callback2 != null) {
                callback2.onValueChanged(this.$item, FormItemViewUtilsKt.getValueForItem(DefaultFormItemViewHolder.this.getFormItemView(), this.$item));
            }
            if (str == null || str.length() == 0 || (callback = DefaultFormItemViewHolder.this.getCallback()) == null) {
                return;
            }
            callback.check(this.$item);
        }
    }

    public DefaultFormItemViewHolder(@k CBRApplicantDataBaseFieldView cBRApplicantDataBaseFieldView, @l FormFieldCallback formFieldCallback) {
        super(cBRApplicantDataBaseFieldView);
        this.callback = formFieldCallback;
    }

    @l
    public final FormFieldCallback getCallback() {
        return this.callback;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onBind(@k CBRApplicantDataBaseFieldView view, @k FormItem item, int itemCount) {
        this.boundItem = item;
        h item2 = item.getItem();
        q fieldFormat = QuestionnaireResponseExtensionsKt.getFieldFormat(item2);
        if (fieldFormat instanceof q.g) {
            InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(((q.g) fieldFormat).getValue())};
            EditText editText = view.getEditText();
            if (editText != null) {
                editText.setFilters(inputFilterArr);
            }
        }
        EditText editText2 = view.getEditText();
        if (editText2 != null) {
            editText2.setInputType(QuestionnaireResponseExtensionsKt.getInputType(item2));
        }
        view.setTextChangedCallback(new AnonymousClass1(item));
        if (item instanceof FormItem.Text) {
            EditText editText3 = view.getEditText();
            CBRTextInputEditText cBRTextInputEditText = editText3 instanceof CBRTextInputEditText ? (CBRTextInputEditText) editText3 : null;
            if (cBRTextInputEditText != null) {
                cBRTextInputEditText.setMasksString(((FormItem.Text) item).getMasks());
            }
        }
    }
}
