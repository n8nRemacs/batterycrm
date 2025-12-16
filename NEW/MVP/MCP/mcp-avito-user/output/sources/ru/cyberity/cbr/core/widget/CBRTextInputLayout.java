package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;

/* compiled from: CBRTextInputLayout.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102¨\u00065"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lru/cyberity/cbr/core/widget/CBRStepStateProvider;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "icon", "Lkotlin/G0;", "setStartIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setEndIconDrawable", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "", "errorText", "setError", "(Ljava/lang/CharSequence;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getCBRStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "setCBRStepState", "(Lru/cyberity/cbr/core/widget/CBRStepState;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "stepState", "Lru/cyberity/cbr/core/widget/CBRStepState;", "Landroid/content/res/ColorStateList;", "editorBackgroundColor", "Landroid/content/res/ColorStateList;", "errorColor", "backgroundColorNormal", "Ljava/lang/Integer;", "backgroundColorError", "hintColor", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRTextInputLayout extends TextInputLayout implements CBRStepStateProvider {

    @l
    private Integer backgroundColorError;

    @l
    private Integer backgroundColorNormal;

    @k
    private final ColorStateList editorBackgroundColor;

    @k
    private final ColorStateList errorColor;

    @l
    private Integer hintColor;

    @l
    private CBRStepState stepState;

    @j
    public CBRTextInputLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@k View child, int index, @k ViewGroup.LayoutParams params) {
        Integer color;
        EditText editText;
        Drawable textCursorDrawable;
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText2 = getEditText();
            if (editText2 != null) {
                ThemeHelper.INSTANCE.applyTheme(editText2, CBRTypographyElement.SUBTITLE2, CBRColorElement.FIELD_CONTENT);
            }
            ThemeHelper themeHelper = ThemeHelper.INSTANCE;
            CBRColorElement cBRColorElement = CBRColorElement.FIELD_TINT;
            ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
            if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
                return;
            }
            int iIntValue = color.intValue();
            if (Build.VERSION.SDK_INT >= 29 && (editText = getEditText()) != null && (textCursorDrawable = editText.getTextCursorDrawable()) != null) {
                textCursorDrawable.setTint(iIntValue);
            }
            EditText editText3 = getEditText();
            if (editText3 == null) {
                return;
            }
            editText3.setHighlightColor(iIntValue);
        }
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    @k
    public CBRStepState getCBRStepState() {
        CBRStepState cBRStepState = this.stepState;
        return cBRStepState == null ? CBRStepState.INIT : cBRStepState;
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? CBRStepStateKt.getCBRStepStateDrawable(this) : new int[]{R.attr.cbr_stateInit});
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        Float metricDimension = customTheme != null ? themeHelper.getMetricDimension(customTheme, CBRMetricElement.FIELD_HEIGHT) : null;
        if (metricDimension == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        EditText editText = getEditText();
        if (editText != null) {
            editText.setHeight((int) metricDimension.floatValue());
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) metricDimension.floatValue(), 0));
    }

    @Override // ru.cyberity.cbr.core.widget.CBRStepStateProvider
    public void setCBRStepState(@k CBRStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            setBoxBackgroundColor(this.editorBackgroundColor.getColorForState(CBRStepStateKt.getCBRStepStateDrawable(this), getBoxBackgroundColor()));
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setEndIconDrawable(@l Drawable icon) {
        Integer color;
        super.setEndIconDrawable(icon);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        int iIntValue = color.intValue();
        setEndIconTintList(null);
        setEndIconTintList(ColorStateList.valueOf(iIntValue));
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(@l CharSequence errorText) {
        super.setError(errorText);
        setCBRStepState((errorText == null || C43066x.K(errorText)) ? CBRStepState.INIT : CBRStepState.REJECTED);
        Integer num = (errorText == null || errorText.length() <= 0) ? this.backgroundColorNormal : this.backgroundColorError;
        if (num != null) {
            setBoxBackgroundColor(num.intValue());
        }
        setErrorTextColor(this.errorColor);
        Integer num2 = this.hintColor;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            EditText editText = getEditText();
            if (editText != null) {
                editText.setHintTextColor(iIntValue);
            }
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setStartIconDrawable(@l Drawable icon) {
        Integer color;
        super.setStartIconDrawable(icon);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) == null) {
            return;
        }
        int iIntValue = color.intValue();
        setStartIconTintList(null);
        setStartIconTintList(ColorStateList.valueOf(iIntValue));
    }

    public /* synthetic */ CBRTextInputLayout(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_TextInputLayoutStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRTextInputLayout : i13);
    }

    @j
    public CBRTextInputLayout(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        ColorStateList colorStateListValueOf;
        Float metricDimension;
        Integer color;
        Integer color2;
        Integer color3;
        super(context, attributeSet, i12);
        this.stepState = CBRStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRTextInputLayout, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextInputLayout_cbr_editorBackgroundColor)) {
            colorStateListValueOf = s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRTextInputLayout_cbr_editorBackgroundColor);
        } else {
            colorStateListValueOf = ColorStateList.valueOf(getBoxBackgroundColor());
        }
        this.editorBackgroundColor = colorStateListValueOf;
        typedArrayObtainStyledAttributes.recycle();
        this.errorColor = ColorStateList.valueOf(s.a(context, R.attr.colorOnError));
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WEAK;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color3 = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(this))) != null) {
            int iIntValue = color3.intValue();
            setEndIconTintList(ColorStateList.valueOf(iIntValue));
            setStartIconTintList(ColorStateList.valueOf(iIntValue));
        }
        CBRColorElement cBRColorElement2 = CBRColorElement.FIELD_BACKGROUND;
        ru.cyberity.cbr.core.theme.d customTheme2 = themeHelper.getCustomTheme();
        if (customTheme2 != null && (color2 = themeHelper.getColor(customTheme2, cBRColorElement2, themeHelper.isDarkTheme(this))) != null) {
            int iIntValue2 = color2.intValue();
            this.backgroundColorNormal = Integer.valueOf(iIntValue2);
            setBoxBackgroundColor(iIntValue2);
        }
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BACKGROUND_INVALID);
        themeColor = themeColor == null ? themeHelper.getThemeColor(this, CBRColorElement.BACKGROUND_CRITICAL) : themeColor;
        if (themeColor != null) {
            this.backgroundColorError = Integer.valueOf(themeColor.intValue());
        }
        Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BORDER);
        Float themeMetricDimension = themeHelper.getThemeMetricDimension(CBRMetricElement.FIELD_BORDER_WIDTH);
        int iFloatValue = themeMetricDimension != null ? (int) themeMetricDimension.floatValue() : 0;
        if (themeColor2 != null && iFloatValue > 0) {
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BORDER_FOCUSED);
            int iIntValue3 = themeColor3 != null ? themeColor3.intValue() : themeColor2.intValue();
            Integer themeColor4 = themeHelper.getThemeColor(this, CBRColorElement.FIELD_BORDER_DISABLED);
            setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{android.R.attr.state_focused}, new int[0]}, new int[]{themeColor4 != null ? themeColor4.intValue() : themeColor2.intValue(), iIntValue3, themeColor2.intValue()}));
            setBoxStrokeWidth(iFloatValue);
            setBoxStrokeWidthFocused(iFloatValue);
        }
        CBRColorElement cBRColorElement3 = CBRColorElement.FIELD_PLACEHOLDER;
        ru.cyberity.cbr.core.theme.d customTheme3 = themeHelper.getCustomTheme();
        if (customTheme3 != null && (color = themeHelper.getColor(customTheme3, cBRColorElement3, themeHelper.isDarkTheme(this))) != null) {
            this.hintColor = Integer.valueOf(color.intValue());
        }
        CBRMetricElement cBRMetricElement = CBRMetricElement.FIELD_CORNER_RADIUS;
        ru.cyberity.cbr.core.theme.d customTheme4 = themeHelper.getCustomTheme();
        if (customTheme4 == null || (metricDimension = themeHelper.getMetricDimension(customTheme4, cBRMetricElement)) == null) {
            return;
        }
        float fFloatValue = metricDimension.floatValue();
        setBoxCornerRadii(fFloatValue, fFloatValue, fFloatValue, fFloatValue);
    }
}
