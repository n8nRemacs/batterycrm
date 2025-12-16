package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout;
import ru.cyberity.cbr.core.widget.PhoneKit;
import ru.cyberity.cbr.core.widget.autocompletePhone.Constants;

/* compiled from: CBRApplicantDataPhoneFieldView.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R?\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b)\u0010*R(\u00101\u001a\u0004\u0018\u00010,2\b\u0010\u001c\u001a\u0004\u0018\u00010,8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataPhoneFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "country", "Lkotlin/G0;", "setCountry", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "Lkotlin/Function0;", "", "phoneNumberValidator", "LY41/a;", "getPhoneNumberValidator", "()LY41/a;", "setPhoneNumberValidator", "(LY41/a;)V", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "value", "phoneNumberPurifier", "LY41/l;", "getPhoneNumberPurifier", "()LY41/l;", "setPhoneNumberPurifier", "(LY41/l;)V", "Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "getPhoneInputLayout", "()Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "phoneInputLayout", "isValid", "()Z", "getPurePhoneNumber", "()Ljava/lang/String;", "purePhoneNumber", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataPhoneFieldView extends CBRApplicantDataBaseFieldView {

    @l
    private Y41.l<? super String, String> phoneNumberPurifier;

    @l
    private a<Boolean> phoneNumberValidator;

    public /* synthetic */ CBRApplicantDataPhoneFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataPhoneFieldLayout : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataFieldView_Phone : i13);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        return (tvLabel$cyberity_mobile_sdk_ui_release == null || (text = tvLabel$cyberity_mobile_sdk_ui_release.getText()) == null) ? "" : text;
    }

    @k
    public final CBRFlaggedInputLayout getPhoneInputLayout() {
        return (CBRFlaggedInputLayout) getInputLayout();
    }

    @l
    public final Y41.l<String, String> getPhoneNumberPurifier() {
        return this.phoneNumberPurifier;
    }

    @l
    public final a<Boolean> getPhoneNumberValidator() {
        return this.phoneNumberValidator;
    }

    @k
    public final String getPurePhoneNumber() {
        String strInvoke;
        Y41.l<? super String, String> lVar = this.phoneNumberPurifier;
        return (lVar == null || (strInvoke = lVar.invoke(getValue())) == null) ? getValue() : strInvoke;
    }

    public final boolean isValid() {
        a<Boolean> aVar = this.phoneNumberValidator;
        return aVar != null ? aVar.invoke().booleanValue() : !C43066x.K(getPurePhoneNumber());
    }

    public final void setCountry(@k CBRCountryPicker.CountryItem country) {
        Object tag = getPhoneInputLayout().getTag(Constants.INSTANCE.getTOOLKIT_TAG());
        PhoneKit phoneKit = tag instanceof PhoneKit ? (PhoneKit) tag : null;
        if (phoneKit != null) {
            phoneKit.setCountry(country, true);
        }
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            s.a(tvLabel$cyberity_mobile_sdk_ui_release, charSequence);
        }
    }

    public final void setPhoneNumberPurifier(@l Y41.l<? super String, String> lVar) {
        this.phoneNumberPurifier = lVar;
    }

    public final void setPhoneNumberValidator(@l a<Boolean> aVar) {
        this.phoneNumberValidator = aVar;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView$2] */
    @j
    public CBRApplicantDataPhoneFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        EditText editText;
        super(context, attributeSet, i12, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataPhoneFieldView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataPhoneFieldView_cbr_applicantDataPhoneFieldLayout, R.layout.cbr_layout_applicant_data_phone_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setInputType(3);
        }
        EditText editText3 = getEditText();
        if (editText3 != null) {
            editText3.setFilters(new AnonymousClass2[]{new InputFilter() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView.2
                @Override // android.text.InputFilter
                @k
                public CharSequence filter(@k CharSequence source, int start, int end, @l Spanned dest, int dstart, int dend) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = source.length();
                    for (int i14 = 0; i14 < length; i14++) {
                        char cCharAt = source.charAt(i14);
                        if (Character.isDigit(cCharAt) || cCharAt == '+') {
                            sb2.append(cCharAt);
                        }
                    }
                    return sb2;
                }
            }});
        }
        setInputLayout$cyberity_mobile_sdk_ui_release((TextInputLayout) findViewById(R.id.cbr_phone));
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView$special$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@l Editable s5) {
                    TextInputLayout inputLayout2 = this.this$0.getInputLayout();
                    if (inputLayout2 != null) {
                        inputLayout2.setError(null);
                    }
                    TextInputLayout inputLayout3 = this.this$0.getInputLayout();
                    if (inputLayout3 == null) {
                        return;
                    }
                    inputLayout3.setErrorEnabled(false);
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
