package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.theme.b;

/* compiled from: CBRTextButton.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRTextButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "Lkotlin/G0;", "onMeasure", "(II)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRTextButton extends MaterialButton {
    @j
    public CBRTextButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        Float metricDimension = customTheme != null ? themeHelper.getMetricDimension(customTheme, CBRMetricElement.BUTTON_HEIGHT) : null;
        if (metricDimension != null) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) metricDimension.floatValue(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ CBRTextButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.cbr_TextButtonStyle : i12, (i14 & 8) != 0 ? R.style.Widget_CBRTextView_TextButton : i13);
    }

    @j
    public CBRTextButton(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        b.g gVar;
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CBRTextButton, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_android_textAppearance)) {
            setTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R.styleable.CBRTextButton_android_textAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_android_gravity)) {
            setGravity(typedArrayObtainStyledAttributes.getInteger(R.styleable.CBRTextButton_android_gravity, 17));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_android_minHeight)) {
            setMinHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRTextButton_android_minHeight, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_backgroundTint)) {
            setBackgroundTintList(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRTextButton_backgroundTint));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_rippleColor)) {
            setRippleColor(s.a(typedArrayObtainStyledAttributes, context, R.styleable.CBRTextButton_rippleColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_android_paddingLeft)) {
            setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRTextButton_android_paddingLeft, getPaddingLeft()), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_android_paddingRight)) {
            setPadding(getPaddingLeft(), getPaddingTop(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CBRTextButton_android_paddingRight, getPaddingRight()), getPaddingBottom());
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.CBRTextButton_android_textColor)) {
            setTextColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CBRTextButton_android_textColor, androidx.core.content.d.getColor(context, android.R.color.white)));
        }
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            Map<String, b.g> mapD = customTheme.d();
            if (mapD != null && (gVar = mapD.get(CBRTypographyElement.SUBTITLE2.getValue())) != null) {
                Typeface typeface = gVar.getTypeface();
                if (typeface != null) {
                    setTypeface(typeface);
                }
                setTextSize(gVar.getSize());
            }
            int[][] iArr = {new int[]{-16842910}, new int[]{android.R.attr.state_pressed}, new int[0]};
            Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT);
            Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            if (themeColor != null || themeColor2 != null || themeColor3 != null) {
                setTextColor(new ColorStateList(iArr, new int[]{themeColor2 != null ? themeColor2.intValue() : 0, themeColor3 != null ? themeColor3.intValue() : 0, themeColor != null ? themeColor.intValue() : 0}));
            }
            setElevation(0.0f);
            setStateListAnimator(null);
            Integer themeColor4 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_BACKGROUND);
            Integer themeColor5 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_BACKGROUND_DISABLED);
            Integer themeColor6 = themeHelper.getThemeColor(this, CBRColorElement.SECONDARY_BUTTON_BACKGROUND_HIGHLIGHTED);
            if (themeColor4 != null || themeColor5 != null || themeColor6 != null) {
                setBackgroundTintList(new ColorStateList(iArr, new int[]{themeColor5 != null ? themeColor5.intValue() : 0, themeColor6 != null ? themeColor6.intValue() : 0, themeColor4 != null ? themeColor4.intValue() : 0}));
            }
            Float metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.BUTTON_CORNER_RADIUS);
            if (metricDimension != null) {
                setCornerRadius((int) metricDimension.floatValue());
            }
        }
    }
}
