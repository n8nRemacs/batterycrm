package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;

/* compiled from: CBRApplicantDataTextAreaFieldView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataTextAreaFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "enabled", "Lkotlin/G0;", "setEnabled", "(Z)V", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataTextAreaFieldView extends CBRApplicantDataBaseFieldView {
    public /* synthetic */ CBRApplicantDataTextAreaFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataTextAreaFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataTextAreaFieldView : i13);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        return (tvLabel$cyberity_mobile_sdk_ui_release == null || (text = tvLabel$cyberity_mobile_sdk_ui_release.getText()) == null) ? "" : text;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout == null) {
            return;
        }
        inputLayout.setEnabled(enabled);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            s.a(tvLabel$cyberity_mobile_sdk_ui_release, charSequence);
        }
    }

    @j
    public CBRApplicantDataTextAreaFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        EditText editText;
        super(context, attributeSet, i12, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataTextAreaFieldView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataTextAreaFieldView_cbr_applicantDataTextAreaFieldLayout, R.layout.cbr_layout_applicant_data_text_area_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(R.id.cbr_editor);
        if (textInputEditText != null) {
            textInputEditText.setInputType(131073);
        }
        setInputLayout$cyberity_mobile_sdk_ui_release((TextInputLayout) findViewById(R.id.cbr_editor_layout));
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setHintEnabled(false);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataTextAreaFieldView$special$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@l Editable s5) {
                    TextInputLayout inputLayout3 = this.this$0.getInputLayout();
                    if (inputLayout3 != null) {
                        inputLayout3.setError(null);
                    }
                    TextInputLayout inputLayout4 = this.this$0.getInputLayout();
                    if (inputLayout4 == null) {
                        return;
                    }
                    inputLayout4.setErrorEnabled(false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@l CharSequence text, int start, int before, int count) {
                }
            });
        }
        onInitializationFinished();
    }
}
