package ru.cyberity.cbr.core.widget.applicantData;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.avito.android.lib.deprecated_design.radio_button.c;
import com.google.android.material.checkbox.MaterialCheckBox;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.widget.CBRCheckGroup;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;

/* compiled from: CBRApplicantDataBoolFieldView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010RF\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010*\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBoolFieldView;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "checkBox", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "", "isUpdating", "Z", "Lkotlin/Function1;", "Lkotlin/G0;", "value", "onCheckedChanged", "LY41/l;", "getOnCheckedChanged", "()LY41/l;", "setOnCheckedChanged", "(LY41/l;)V", "Lru/cyberity/cbr/core/widget/CBRCheckGroup;", "getCheckGroup", "()Lru/cyberity/cbr/core/widget/CBRCheckGroup;", "checkGroup", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "isChecked", "()Z", "setChecked", "(Z)V", "getError", "setError", "error", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRApplicantDataBoolFieldView extends CBRApplicantDataBaseFieldView {

    @l
    private MaterialCheckBox checkBox;
    private boolean isUpdating;

    @l
    private Y41.l<? super Boolean, G0> onCheckedChanged;

    public /* synthetic */ CBRApplicantDataBoolFieldView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_applicantDataBoolFieldViewStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRApplicantDataBoolFieldView : i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_onCheckedChanged_$lambda-0, reason: not valid java name */
    public static final void m302_set_onCheckedChanged_$lambda0(CBRApplicantDataBoolFieldView cBRApplicantDataBoolFieldView, Y41.l lVar, CompoundButton compoundButton, boolean z12) {
        cBRApplicantDataBoolFieldView.setError(null);
        if (cBRApplicantDataBoolFieldView.isUpdating || lVar == null) {
            return;
        }
        lVar.invoke(Boolean.valueOf(z12));
    }

    private final CBRCheckGroup getCheckGroup() {
        return (CBRCheckGroup) findViewById(R.id.cbr_data_bool);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    @l
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        return (tvLabel$cyberity_mobile_sdk_ui_release == null || (text = tvLabel$cyberity_mobile_sdk_ui_release.getText()) == null) ? "" : text;
    }

    @l
    public final Y41.l<Boolean, G0> getOnCheckedChanged() {
        return this.onCheckedChanged;
    }

    public final boolean isChecked() {
        MaterialCheckBox materialCheckBox = this.checkBox;
        return materialCheckBox != null && materialCheckBox.isChecked();
    }

    public final void setChecked(boolean z12) {
        this.isUpdating = true;
        MaterialCheckBox materialCheckBox = this.checkBox;
        if (materialCheckBox != null) {
            materialCheckBox.setChecked(z12);
        }
        this.isUpdating = false;
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setError(@l CharSequence charSequence) {
        TextView tvError = getTvError();
        if (tvError != null) {
            s.a(tvError, charSequence);
        }
        CBRCheckGroup checkGroup = getCheckGroup();
        if (checkGroup == null) {
            return;
        }
        CBRStepStateKt.setStepState(checkGroup, (charSequence == null || charSequence.length() == 0) ? CBRStepState.INIT : CBRStepState.REJECTED);
    }

    @Override // ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView
    public void setLabel(@l CharSequence charSequence) {
        TextView tvLabel$cyberity_mobile_sdk_ui_release = getTvLabel$cyberity_mobile_sdk_ui_release();
        if (tvLabel$cyberity_mobile_sdk_ui_release != null) {
            s.a(tvLabel$cyberity_mobile_sdk_ui_release, charSequence);
        }
    }

    public final void setOnCheckedChanged(@l Y41.l<? super Boolean, G0> lVar) {
        MaterialCheckBox materialCheckBox = this.checkBox;
        if (materialCheckBox != null) {
            materialCheckBox.setOnCheckedChangeListener(new c(8, this, lVar));
        }
        this.onCheckedChanged = lVar;
    }

    @j
    public CBRApplicantDataBoolFieldView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRApplicantDataBoolFieldView, i12, i13);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRApplicantDataBoolFieldView_cbr_applicantDataBoolFieldLayout, R.layout.cbr_layout_applicant_data_bool_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        this.checkBox = new MaterialCheckBox(context, null);
        CBRCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.addView(this.checkBox);
        }
        onInitializationFinished();
    }
}
