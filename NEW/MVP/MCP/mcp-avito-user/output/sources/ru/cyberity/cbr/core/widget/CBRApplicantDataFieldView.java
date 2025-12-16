package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import ca1.C27140f;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;

/* compiled from: CBRApplicantDataFieldView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/widget/CBRApplicantDataFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "", "list", "Lkotlin/G0;", "setMasks", "(Ljava/util/List;)V", "", "enabled", "setEnabled", "(Z)V", "disableInput", "()V", "enableInput", "Landroid/text/method/KeyListener;", "saveKeyListener", "Landroid/text/method/KeyListener;", "", "value", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRApplicantDataFieldView extends CBRApplicantDataBaseFieldView {

    @l
    private KeyListener saveKeyListener;

    @j
    public CBRApplicantDataFieldView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda-3$lambda-2, reason: not valid java name */
    public static final boolean m283lambda3$lambda2(CBRApplicantDataFieldView cBRApplicantDataFieldView, TextView textView, int i12, KeyEvent keyEvent) {
        if (i12 == 5) {
            View viewFocusSearch = textView.focusSearch(130);
            if (viewFocusSearch instanceof CBRApplicantDataBaseFieldView.Selectable) {
                ((CBRApplicantDataBaseFieldView.Selectable) viewFocusSearch).openSelector();
            } else if (viewFocusSearch instanceof TextInputLayout) {
                EditText editText = ((TextInputLayout) viewFocusSearch).getEditText();
                if (editText != null) {
                    editText.requestFocus();
                }
            } else if (viewFocusSearch != 0) {
                viewFocusSearch.requestFocus();
            }
        } else {
            if (i12 != 6) {
                return false;
            }
            Runnable onSubmitForm = cBRApplicantDataFieldView.getOnSubmitForm();
            if (onSubmitForm != null) {
                onSubmitForm.run();
            }
        }
        return true;
    }

    public final void disableInput() {
        EditText editText = getEditText();
        if ((editText != null ? editText.getKeyListener() : null) != null) {
            EditText editText2 = getEditText();
            this.saveKeyListener = editText2 != null ? editText2.getKeyListener() : null;
        }
        EditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setKeyListener(null);
        }
        TextInputLayout inputLayout = getInputLayout();
        EditText editText4 = inputLayout != null ? inputLayout.getEditText() : null;
        if (editText4 == null) {
            return;
        }
        editText4.setKeyListener(null);
    }

    public final void enableInput() {
        EditText editText;
        EditText editText2 = getEditText();
        if ((editText2 != null ? editText2.getKeyListener() : null) != null || (editText = getEditText()) == null) {
            return;
        }
        editText.setKeyListener(this.saveKeyListener);
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

    public final void setMasks(@k List<String> list) {
        CBRTextInputEditText cBRTextInputEditText = (CBRTextInputEditText) findViewById(R.id.cbr_editor);
        if (cBRTextInputEditText != null) {
            cBRTextInputEditText.setMasksString(list);
        }
    }

    public /* synthetic */ CBRApplicantDataFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataFieldView : i13);
    }

    @j
    public CBRApplicantDataFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        EditText editText;
        super(context, attributeSet, i12, i13);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataFieldView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataFieldView_cbr_applicantDataFieldLayout, R.layout.cbr_layout_applicant_data_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        CBRTextInputEditText cBRTextInputEditText = (CBRTextInputEditText) findViewById(R.id.cbr_editor);
        if (cBRTextInputEditText != null) {
            cBRTextInputEditText.setInputType(1);
            cBRTextInputEditText.setMaxLines(1);
            cBRTextInputEditText.setImeOptions(5);
            cBRTextInputEditText.setOnEditorActionListener(new C27140f(this, 15));
        }
        setInputLayout$cyberity_mobile_sdk_ui_release((TextInputLayout) findViewById(R.id.cbr_editor_layout));
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setHintEnabled(false);
        }
        TextInputLayout inputLayout2 = getInputLayout();
        if (inputLayout2 != null && (editText = inputLayout2.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView$special$$inlined$doAfterTextChanged$1
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
